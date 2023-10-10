package List;

import java.util.LinkedList;
import java.util.List;

import static List.XmlGrab.getUsers;

// The method creates a new list (desList)and sorts the list in descending order using Comparator and Lambda Expression
public class NumDes {

    public static List<User> getNumDes() {
        List<User> desList = new LinkedList<>();
        desList.addAll(getUsers());
        desList.sort((u1, u2) -> u2.getId() - u1.getId());

        return desList;
    }
}
