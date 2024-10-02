import java.util.*;
class program2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the two numbers:");
				int a=sc.nextInt();
				int b=sc.nextInt();
			System.out.println("before swap:"+a+" "+b);
				int temp;
				temp=a;
				a=b;
				b=temp;
			System.out.println("after swap:"+a+" "+b);
		}
}