package Pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.pdf.PdfWriter;

import static List.NumAsc.getNumAsc;

public class AscListPDF {

    public static void pdfAsc() {

        try {
            // Create Document instance.
            Document document = new Document();

            // Create OutputStream instance.
            OutputStream outputStream = new FileOutputStream(
                    new File("/Users/patrick/Documents/GitHub/CapstoneOne/src/asc.pdf"));

            // Create PDFWriter instance.
            PdfWriter.getInstance(document, outputStream);

            // Open the document.
            document.open();

            // Create asc List
            List ascList = new List(List.ORDERED);
            ascList.add(new ListItem(String.valueOf((getNumAsc()))));

            // Add casdList to the pdf.
            document.add(ascList);

            // Close document and outputStream.
            document.close();
            outputStream.close();

            System.out.println("\n" + "\n" + "PDF created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
