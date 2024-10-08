import java.util.*;
class program3{
	public static void main(String[]args){
		System.out.println("Enter the length:");
		int area;
		Scanner sc=new Scanner(System.in);
			int l=sc.nextInt();
		System.out.println("Enter the breadth:");
			int b=sc.nextInt();
		area=l*b;
		System.out.println("Area of rectangle:"+area);
	}
}