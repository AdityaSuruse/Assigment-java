import java.util.Scanner;
class chakePositive{
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number :");
        a=sc.nextInt();
 if (a>0) {
     System.out.println("Positive Number : " +a);
 } else {
     System.out.println("Negative Number : " +a);
 }
    }
}