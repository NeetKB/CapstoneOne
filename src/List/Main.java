package List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println(" Please enter the corresponding number to choose one of the following options:"
                + "\n" + "1 Show data in ascending order"
                + "\n" + "2 Show data in descending order "
                + "\n" + "3 Export data to PDF in ascending order "
                + "\n" + "4 Export data to PDF in ascending order");

           Scanner input = new Scanner(System.in);

            String menuchoice = input.nextLine();

            switch (menuchoice) {
                case "1":

                case "2":

                case "3":

                case "4":

            }


    }
}







