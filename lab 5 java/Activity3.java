import java.util.Scanner;
	public class Activity3{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	static final int SENTINEL=-999;
	int number;
	int count=0;
	int sum=0;
	System.out.println("enter POSITIVE integers "+"ENDING WITH"+ SENTINEL);
	number=sc.nextInt();
	while(number!=SENTINEL){
	sum=sum+number;
	counter++;
	number=sc.nextInt();
	}
	System.out.println("the sum of the numbers="+sum);
	if (counter!=0)
	System.out.println("the average of the numbers="+sum/counter);
	else
	System.out.println("no input =");}}
	