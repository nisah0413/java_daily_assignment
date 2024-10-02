import java.util.*;
class program5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the two numbers:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a>b){
			System.out.println("The maximum number amongest "+a+" and "+b+" is "+a);
			}else{
			System.out.println("The maximum number amongest "+a+" and "+b+" is "+b);
		}
	}
}