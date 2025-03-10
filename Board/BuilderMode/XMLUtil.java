package BuilderMode;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    //�������ļ�����ȡ����������������һ����Ӧʵ������
    public static Object getBean(){
        try{
            //�����ĵ�����
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("BuilderMode/config.xml"));

            //��ȡ�ı��ڵ�
            NodeList nodeList= doc.getElementsByTagName("className");
            Node classNode=nodeList.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            //ͨ����������ʵ�����󷵻� ����
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
