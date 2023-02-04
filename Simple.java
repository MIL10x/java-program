import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple {
    static int a = 10;

    public static void main(String args[]) {
        System.out.println("Report_details");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        Date date = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/y-hh:mm:ss");
        System.out.println("Report date and Time: " + dateForm.format(date));
        System.out.println("Thank You:) " + name);
    }
}