package List;

import java.util.LinkedList;
import java.util.List;

import static List.XmlGrab.getUsers;

public class NumAsc {
    public static List<User> getNumAsc() {
        List<User> ascList = new LinkedList<User>();
        ascList.addAll(getUsers());
        ascList.sort((u1, u2) -> u1.getId() - u2.getId());
        return ascList;

    }
}