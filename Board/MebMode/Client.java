package MebMode;

public class Client {
    public static void main(String[] args) {
        AbstractChatroom noHappyChat=new ChatGroup();
        Member member1,member2,member3,member4,member5;
        member1=new DiamondMember("熊大");
        member2=new DiamondMember("熊二");
        member3=new CommonMember ("张三");
        member4=new CommonMember ("李四");
        member5=new CommonMember ("王五");

        noHappyChat.register(member1);
        noHappyChat.register(member2);
        noHappyChat.register(member3);
        noHappyChat.register(member4);
        noHappyChat.register(member5);

        member1.sendText("张三","How are you?");
        member3.sendText("熊大","I am fine,think you and you?");
        member2.sendImage("李四","GIF表情");
        member5.sendImage("熊二","表情包");
    }
}
