import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hour :");
        int hour = sc.nextInt();
        System.out.println("Enter Minite :");
        int min = sc.nextInt();
        System.out.println("Enter Second :");
        int sec = sc.nextInt();
        if (hour >= 0 && hour < 24) {
            System.out.println("Haour IS Valid :"+hour);
            if (min >= 0 && min < 60) {
                System.out.println("Minit Is Valid :"+min);
                if (sec>=0 && hour<60) {
                    System.out.println("Second Is Valid :"+sec);
                }else
                System.out.println("Second Is Not Valed"+sec);
            } else
                System.out.println("Minit Is Not Valid :"+min);
        } else
            System.out.println("Hour Is Not Valid"+hour);

    }
}
