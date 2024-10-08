import java.util.*;
class program2{
	public static void main(String[]args){
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
				System.out.println(a<b?"min:"+a:a==b?"Equal":"min:"+b);
	}
}