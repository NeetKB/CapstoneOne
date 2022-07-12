package List;

import java.util.LinkedList;
import java.util.List;

import static List.XmlGrab.getUsers;

public class DesAsc {

    public static List<User> getNumDesAsc() {
        List<User> desList = new LinkedList<User>();
        desList.addAll(getUsers());
        desList.sort((u1,u2) -> u2.getId() - u1.getId());


        return desList;
    }
}
