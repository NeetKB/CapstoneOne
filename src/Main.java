import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        try
        {
//creating a constructor of file class and parsing an XML file
            File file = new File("C:\\Users\\amani\\OneDrive\\WYWM\\Java\\Capstone 1\\dataset.xml");
//an instance of factory that gives a document builder
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//an instance of builder to parse the specified xml file
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("record");
// nodeList is not iterable, so we are using for loop
            for (int itr = 0; itr < nodeList.getLength(); itr++)
            {
                Node node = nodeList.item(itr);
         //       System.out.println("\nNode Name :" + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                  Element eElement = (Element) node;
                    //ArrayList<String> list  = new ArrayList<String>();


                    System.out.println("ID: " +eElement.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("Full Name: "+ eElement.getElementsByTagName("full_name").item(0).getTextContent());
                   //Collections.sort(aList, Collections.reverseOrder());

                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }





}
