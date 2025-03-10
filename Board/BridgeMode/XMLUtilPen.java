package BridgeMode;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtilPen {
    public XMLUtilPen() {
    }

    public static Object getBean(String kind) {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("BridgeMode/configPen.xml"));
            NodeList n1 = doc.getElementsByTagName("className");
            Node classNode = null;
            if (kind.equals("color")) {
                classNode = n1.item(0).getFirstChild();
            } else if (kind.equals("pen")) {
                classNode = n1.item(1).getFirstChild();
            }

            String cName = classNode.getNodeValue();
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }
}
