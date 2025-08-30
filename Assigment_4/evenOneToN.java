 	import java.util.Scanner;
	class evenOneToN{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N Number : ");
	int n=sc.nextInt();
	for(int i=1;i<n;i++)
	if(i % 2 == 0)
        System.out.println("Even Number  : "+i);
      }   
   }