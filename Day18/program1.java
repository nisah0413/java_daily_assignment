import java.util.*;
class program1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num1: ");
			int a=sc.nextInt();
		System.out.print("Enter the num2: ");
			int b=sc.nextInt();
		b=a+b-(a=b);
		System.out.println("num1:"+a+" num2:"+b);
	} 
}