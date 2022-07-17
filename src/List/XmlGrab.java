package List;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class XmlGrab {

    /*
     * Reads data from an XML file and copies the data to a List (List<User>
     * userList).
     */
    public static List<User> getUsers() {
        List<User> userList = new LinkedList<>();
        try {
            // File path to the XML file.
            Path filePath = Paths.get("/Users/patrick/Documents/GitHub/CapstoneOne/src/dataset.xml");
            File file = new File(String.valueOf(filePath.toAbsolutePath()));

            if (file.exists()) {
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document document = documentBuilder.parse(String.valueOf(filePath.toAbsolutePath()));
                /*
                 * Elements with tagName of full_name and id is used to create the variables for
                 * user is stored in NodeList user.
                 */
                NodeList[] user = { document.getElementsByTagName("full_name"), document.getElementsByTagName("id") };
                /*
                 * Loop to read and add new users to the userList by reading elements with
                 * tagnames fullname and ID.
                 */
                for (int i = 0; i < user[0].getLength(); i++) {
                    // Adding elements to the specified index.
                    String fullName = user[0].item(i).getTextContent();
                    int id = Integer.parseInt(user[1].item(i).getTextContent());
                    User newUser = new User(fullName, id);
                    userList.add(newUser);
                }
            } else {
                System.out.println("File not found");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Returns the userList with data from the XML file.
        return userList;

    }

}
