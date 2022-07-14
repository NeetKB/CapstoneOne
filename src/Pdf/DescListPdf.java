package Pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Collections;

import static List.NumDes.getNumDes;

public class DescListPdf {

    public static void pdfDesc() {

        try {
            // Create Document instance.
            Document document = new Document();

            // Create OutputStream instance.
            OutputStream outputStream = new FileOutputStream(
                    new File("/Users/patrick/Documents/GitHub/CapstoneOne/src/desc.pdf"));

            // Create PDFWriter instance.
            PdfWriter.getInstance(document, outputStream);

            // Open the document.
            document.open();

            // Create reverseOrder list.
            List descList = new List(List.ORDERED);
            descList.add(new ListItem(String.valueOf((getNumDes()))));
            Collections.reverseOrder();

            // Add descList.
            document.add(descList);
            // document.add(unorderedList);

            // Close document and outputStream.
            document.close();
            outputStream.close();

            System.out.println("\n" + "\n" + "PDF created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
