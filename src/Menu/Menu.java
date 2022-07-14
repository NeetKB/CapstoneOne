package Menu;

import java.util.Scanner;

import List.NumAsc;
import List.NumDes;
import Pdf.AscListPDF;
import Pdf.DescListPdf;

public class Menu {

    public static void runMenu() {

        System.out.println("\n" + "*************************" + "\n" + "**TROOP TRACKER DATA**" + "\n"
                + "*************************" + "\n");
        System.out.println("\n");
        System.out.println("Please enter the corresponding number to choose one of the following options:" + "\n"
                + "1 Show ID data in ascending order" + "\n" + "2 Show ID data in descending order " + "\n"
                + "3 Export data to PDF in ID ascending order " + "\n" + "4 Export data to PDF in ID descending order"
                + "\n" + "5 Exit");

        Scanner input = new Scanner(System.in);

        String menuchoice = input.nextLine();

        switch (menuchoice) {

        case "1":
            System.out.println(NumAsc.getNumAsc());
            System.out.println("\n");
            System.out.println("\n");
            runMenu();
            break;

        case "2":
            System.out.println(NumDes.getNumDes());
            System.out.println("\n");
            System.out.println("\n");
            runMenu();
            break;

        case "3":
            AscListPDF.pdfAsc();
            System.out.println("\n");
            System.out.println("\n");
            runMenu();
            break;

        case "4":
            DescListPdf.pdfDesc();
            System.out.println("\n");
            System.out.println("\n");
            runMenu();
            break;

        case "5":
            System.out.println("GoodBye!");
            System.exit(0);

        default:
            System.out.println("Invalid Option! Please enter again");
        }

    }
}
