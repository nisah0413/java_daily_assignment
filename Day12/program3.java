import java.util.*;
class program3{
	public static void main(String[]args){
		Scanner SC=new Scanner(System.in);
			System.out.println("Enter the number: ");
				int a=SC.nextInt();
				int b=SC.nextInt();
			System.out.println("Addition of cubes: "+(a*a*a+b*b*b));
			System.out.println("Subtraction of Squares: "+(a*a-b*b));
	}
}