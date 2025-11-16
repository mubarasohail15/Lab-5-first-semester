import java.util.Scanner;
	public class Activity2{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	int limit;
	int number;
	int counter;
	int sum;
	System.out.println("enter the no of integers in the list");
	limit=sc.nextInt();
	System.out.println(limit);
	sum=0;
	counter=0;
	System.out.println("enter "+ limit+"integers");
	while(counter<limit){
	number=sc.nextInt();
	sum=sum+number;
	counter++;
	}
	System.out.println("the sum of the numbers="+sum);
	if (counter!=0)
	System.out.println("the average of the numbers="+sum/counter);
	else
	System.out.println("no input =");}}
	