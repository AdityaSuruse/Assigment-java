	import java.util.Scanner;
	class sumOfItoN{
	 public static void main(String [] args){
	 Scanner sc=new Scanner(System.in);
	System.out.println("Enter X Number : ");
	int x=sc.nextInt();
	System.out.println("Enter Y Number : ");
	int y=sc.nextInt();
	int sum=0;
	for(int i=x;i<=y;i++)
	sum+=i;
	System.out.println("Sum Of X And Y : "+sum);
	 }}