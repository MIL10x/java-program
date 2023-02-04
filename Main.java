import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        System.out.println("Report_details");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your time in 24hrs formate(hh:mm): ");
        int time = sc.nextInt();
        System.out.println(time);
    }
}