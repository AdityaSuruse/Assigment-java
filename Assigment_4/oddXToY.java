	import java.util.Scanner;
	class oddXToY{
	public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter X Number :");
	int x=sc.nextInt(); 
	System.out.println("Enter y Number :");
	int y=sc.nextInt(); 
	for(int i=x;i<=y;i++)
	if(i % 2 != 0)
	System.out.println("Odd Number Is : "+i);
      }
  }