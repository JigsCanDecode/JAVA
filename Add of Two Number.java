import java.util.Scanner;
import java.io.*;
class my
	{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number");
		a=sc.nextInt();
		
		System.out.println("Enter The Second Number");
		b=sc.nextInt();

		c=a+b;

		System.out.println("The Add is"+c);
	}
	}