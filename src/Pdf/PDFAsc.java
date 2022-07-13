package Pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.pdf.PdfWriter;

import static List.NumAsc.getNumAsc;

public class PDFList {
    public static void main(String args[]){
        try {
            //Create Document instance.
            Document document = new Document();

            //Create OutputStream instance.
            OutputStream outputStream =
                    new FileOutputStream(new File("/Users/patrick/Documents/GitHub/CapstoneOne/data.pdf"));

            //Create PDFWriter instance.
            PdfWriter.getInstance(document, outputStream);

            //Open the document.
            document.open();

            //Create ordered list object
            List ascList = new List(List.ORDERED);
            ascList.add(new ListItem(String.valueOf((getNumAsc()))));
//            ascList.add(new ListItem("Oredered List item2"));

            //Create unordered list object
//            List unorderedList = new List(List.UNORDERED);
//            unorderedList.add(new ListItem("Unoredered List item1"));
//            unorderedList.add(new ListItem("Unoredered List item2"));

            //Add content to the document using List objects.
            document.add(ascList);
//            document.add(unorderedList);

            //Close document and outputStream.
            document.close();
            outputStream.close();

            System.out.println("Pdf created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
