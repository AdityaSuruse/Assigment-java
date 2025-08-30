import java.util.Scanner;
class sumOfN{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("Enter A N Number :");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++)
	sum=sum+i;
	System.out.println("Sum Of N Is : "+sum);
	}}