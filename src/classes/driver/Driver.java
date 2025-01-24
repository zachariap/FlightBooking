package classes.driver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import builder.TicketDirector;

public class Driver {
    /**
     * The driver main that will run the program
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many tickets are apart of your reservation");
        int tickets = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your source code (NOR EAS SOU WES)");
        String sourceCode = getCode(scan);
        System.out.println(sourceCode);
        System.out.println("Enter your destination code (NOR EAS SOU WES)");
        String destCode = getCode(scan);
        System.out.println(destCode);

        for (int i = 0; i < tickets; i++) {
            String name;
            System.out.println("Enter name");
            name = scan.nextLine();
            String DOB = getDOB(scan);
            String seatClass = getSeatClass(scan);
            int bag = getBag(scan);
            TicketDirector director = new TicketDirector(name, DOB);
            director.setSeatClass(seatClass);
            director.setSourceCode(sourceCode);
            director.setDestinationCode(destCode);
            director.setBags(bag);
            director.setNumofTickets(tickets);
            director.printNumofTickets(i + 1);
            System.out.println("My name is " + name + "\n");
            director.constructTicket();
        }
        scan.close();
    }

    public static String getDOB(Scanner scan) {
        String DOB = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Specify your desired date format
        System.out.print("Enter date of birth (DD/MM/YYYY) \n");
        String input = scan.nextLine();
        try {
            Date date = dateFormat.parse(input);
            String dateString = date.toString();
            String dateMonthDay = dateString.substring(3, 10);
            String dateYear = dateString.substring(24, 28);
            System.out.println("You entered: " + dateMonthDay + " " + dateYear);
            DOB = dateString;

        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD/MM/YYYY.");
            getDOB(scan);
        }
        return DOB;
    }

    public static String getSeatClass(Scanner scan) {
        String seatClass;
        while (true) {
            System.out.println("Enter a seat class: Comfort, Economy, or First Class");
            seatClass = scan.nextLine();
            if (seatClass.toLowerCase().equals("comfort") || seatClass.toLowerCase().equals("economy") || seatClass.toLowerCase().equals("first class")) {
                break;
            } else {
                System.out.println("Invalid seat class. Please use Comfort, Economy, or First Class");
                getSeatClass(scan);
            }
        }
        return seatClass;
    }

    public static int getBag(Scanner scan) {
        String bag;
        System.out.println("Will you have an additional bag? (Yes/No) This will incur an additonal fee.");
        bag = scan.nextLine();
        if (bag.toLowerCase().equals("yes")) {
            return 1;
        } else if (bag.toLowerCase().equals("no")) {
            return 0;
        } else {
            System.out.println("Invalid answer. Please say yes or no.");
            getBag(scan);
        }
        return 9;
    }

    public static String getCode(Scanner scan) {
        String code;
        while (true) {
            code = scan.nextLine();
            if (code.toUpperCase().equals("NOR") || code.toUpperCase().equals("SOU") || code.toUpperCase().equals("EAS") || code.toUpperCase().equals("WES")) {
                break;
            } else {
                System.out.println("Invalid source code.");
                getCode(scan);
            }
        }
        return code;

    }
}

