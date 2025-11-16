import java.util.Scanner;
	public class Activity4{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	int num;
	int guess;
	boolean done;
	num=(int)(Math.random()*100);
	done=false;
	while(!done){
	System.out.println("enter an integer greater than or equal to zero and less than 100");
	guess=sc.nextInt();
	System.out.println();
	if(guess==num){
	System.out.println("you guessed the correct number");
	done =true;}
	else if (guess<num)
	System.out.println("you guess is low");
	else 
	System.out.println("you guess is high ");
}
}}