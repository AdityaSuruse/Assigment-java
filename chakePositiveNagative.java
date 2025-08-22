import java.util.Scanner;
public class chakePositiveNagative {
    public static void main(String [] args){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number : ");
        a=sc.nextInt();
        if (a > 0) {
             System.out.println("Positive Number :");
        } else {
             System.out.println("Negative Number :");
        }
    }
}
