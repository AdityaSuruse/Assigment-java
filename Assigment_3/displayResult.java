
// Write a program, which accepts two integers and an operator as a character (+ - * /), performs the corresponding operation and displays the result.
import java.util.Scanner;

public class displayResult {
    public static void main(String[] args) {
        int a;
        int b;
        char m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number :=>");
        a = sc.nextInt();
        System.out.println("Enter Operator :=>");
        m = sc.next().charAt(0);
        System.out.println("Enter B Number :=>");
        b = sc.nextInt();
        switch (m) {
            case '+' -> System.out.println("Addition Is :=> " + (a + b));
            case '-' -> System.out.println("Division Is :=> " + (a - b));
            case '*' -> System.out.println("Multiply :=> " + (a * b));
            case '/' -> System.out.println("Divide :=> " + (a / b));
            default -> System.out.println("Invaled :");

        }
    }
}
