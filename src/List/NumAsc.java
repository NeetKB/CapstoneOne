package List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

import static List.XmlGrab.getUsers;

// The method creates a new list (ascList)and sorts the list in ascending order using Comparator and Lambda Expresiion

public class NumAsc {

    public static List<User> getNumAsc() {
        List<User> ascList = new LinkedList<User>();
        ascList.addAll(getUsers());
        ascList.sort((u1, u2) -> u1.getId() - u2.getId());
        return ascList;



    }
}