import java.util.Scanner;
public class printHelloNTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write N Number :");
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        System.out.println("Hello ");
    }
}
