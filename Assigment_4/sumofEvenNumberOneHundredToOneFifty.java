	class sumofEvenNumberOneHundredToTwoHundred{
	public static void main (String[] args){
	int sum=0;
	for(int i=100;i<200;i++){
	if(i % 2 == 0)
	 System.out.println("Even Number is : "+i);
	 sum=sum+i;
	    }
	System.out.println("Sum Is : "+sum);
	}
}