Linux内核中的创建型设计模式分析

### 1、工厂方法模式

在Linux内核中，工厂方法模式常用于设备驱动和文件系统的创建。

#### Ⅰ、部分代码

```
// 抽象产品
struct file_operations {
    int (*open)(struct inode *, struct file *);
    ssize_t (*read)(struct file *, char __user *, size_t, loff_t *);
    ssize_t (*write)(struct file *, const char __user *, size_t, loff_t *);
};

// 具体产品 (ext4实现)
const struct file_operations ext4_file_operations = {
    .open = ext4_file_open,
    .read = ext4_file_read,
    .write = ext4_file_write,
};

// 抽象工厂
struct file_system_type {
    const char *name;
    struct dentry *(*mount)(struct file_system_type *, int, const char *, void *);
};

// 具体工厂
static struct file_system_type ext4_fs_type = {
    .name = "ext4",
    .mount = ext4_mount,
};

// 使用示例
int vfs_open(const char *path, struct file *filp)
{
    struct inode *inode = path_lookup(path);
    filp->f_op = inode->i_fop;  // 绑定具体操作集
    return filp->f_op->open(inode, filp);
}
```

#### Ⅱ、类图



#### Ⅲ、顺序图



### 2、抽象工厂模式

#### Ⅰ、部分代码

```
// 抽象产品
struct device_driver {
    const char *name;
    int (*probe)(struct device *dev);
    const struct bus_type *bus;
};

// 具体产品 (USB驱动)
static struct usb_driver my_usb_driver = {
    .driver = {
        .name = "my_usb",
        .bus = &usb_bus_type,
    },
    .probe = my_usb_probe,
};

// 抽象工厂
struct bus_type {
    const char *name;
    int (*match)(struct device *dev, struct device_driver *drv);
};

// 具体工厂
struct bus_type usb_bus_type = {
    .name = "usb",
    .match = usb_device_match,
};

// 使用示例
int usb_register_driver(struct usb_driver *driver)
{
    driver->driver.bus = &usb_bus_type;
    return driver_register(&driver->driver);
}
```



#### Ⅱ、类图



#### Ⅲ、顺序图



### 3、单例模式

#### Ⅰ、部分代码

```
// 单例实例 (init_task)
struct task_struct init_task = {
    .pid = 0,
    .state = TASK_RUNNING,
    // ...其他初始化...
};

// 访问接口
#define current get_current()

static inline struct task_struct *get_current(void)
{
    return current_thread_info()->task;  // 通过线程信息获取单例
}

// 使用示例
void print_current_pid(void)
{
    printk("Current PID: %d\n", current->pid);
}
```



#### Ⅱ、类图



#### Ⅲ、顺序图



### 4、建造者模式

#### Ⅰ、部分代码

```
// 产品
struct sk_buff {
    unsigned char *head, *data, *tail;
    // ...其他字段...
};

// 抽象建造者
struct sk_buff *__alloc_skb(unsigned int size, gfp_t gfp_mask)
{
    struct sk_buff *skb = kmalloc(size + sizeof(struct sk_buff), gfp_mask);
    skb->head = (unsigned char *)(skb + 1);
    skb->data = skb->head;
    return skb;
}

// 具体建造者
struct sk_buff *netdev_alloc_skb(struct net_device *dev, unsigned int length)
{
    struct sk_buff *skb = __alloc_skb(length + NET_SKB_PAD, GFP_ATOMIC);
    skb_reserve(skb, NET_SKB_PAD);  // 预留头部空间
    return skb;
}

// 使用示例
struct sk_buff *build_tcp_packet(void)
{
    struct sk_buff *skb = netdev_alloc_skb(NULL, 1500);
    skb_push(skb, sizeof(struct tcphdr));  // 添加TCP头
    // ...填充数据...
    return skb;
}
```



#### Ⅱ、类图



#### Ⅲ、顺序图



### 5. 原型模式

#### Ⅰ、部分代码

```
// 原型接口
struct task_struct {
    pid_t pid;
    struct mm_struct *mm;
    struct task_struct *(*clone)(unsigned long flags);
};

// 克隆实现
struct task_struct *copy_process(unsigned long clone_flags)
{
    struct task_struct *p;
    p = dup_task_struct(current);  // 复制父进程结构
    
    // 深拷贝关键资源
    if (!(clone_flags & CLONE_VM)) {
        p->mm = copy_mm(clone_flags, current->mm);
    }
    
    // ...复制其他资源...
    return p;
}

// 使用示例
pid_t kernel_thread(int (*fn)(void *), void *arg, unsigned long flags)
{
    struct task_struct *p = copy_process(flags);
    // ...设置子进程上下文...
    wake_up_new_task(p);
    return p->pid;
}
```



#### Ⅱ、类图



#### Ⅲ、顺序图

