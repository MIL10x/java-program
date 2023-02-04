import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the in hrs count:");
        int hr = sc.nextInt();
        if (hr >= 1 && hr < 6) {
            System.out.println("Good Night");
        } else if (hr >= 6 && hr < 12) {
            System.out.println("Good Morning");
        } else if (hr >= 12 && hr < 17) {
            System.out.println("Good Afternoon");
        } else if (hr >= 17 && hr < 22) {
            System.out.println("Good evening");
        } else if (hr >= 22 && hr < 24) {
            System.out.println("Good night");
        } else {
            System.out.println("Do it correctly");
        }

    }
}