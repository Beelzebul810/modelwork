package FactoryDemo;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    //从配置文件中提取具体类名，并返回一个对应实例对象
    public static Object getBean(){
        try{
            //创建文档对象
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("FactoryDemo/config.xml"));

            //获取文本节点
            NodeList nodeList= doc.getElementsByTagName("className");
            Node classNode=nodeList.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            //通过类名生成实例对象返回  反射
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
