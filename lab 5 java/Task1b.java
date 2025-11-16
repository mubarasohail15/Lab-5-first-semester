import java.util.Scanner;
	public class Task1b{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter integer a");
	int A =sc.nextInt();
	System.out.println("enter integer b");
	int B =sc.nextInt();
	if(A<B){
	for(int i=A; i<=B; i++)
	{System.out.println(i+"  ");}}
	else{
	for(int i=A; i>=B; i--)
	{System.out.println(i+"  ");}}}}
	