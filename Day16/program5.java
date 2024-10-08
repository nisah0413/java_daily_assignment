import java.util.*;
class program5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter num1:");
				int a=sc.nextInt();
			System.out.println("Enter num2:");
				int b=sc.nextInt();
			System.out.println("Enter num3:");
				int c=sc.nextInt();
			if(a<=b && a<=c){
				System.out.println("min="+a);
			}else if(b<=c){
				System.out.println("min="+b);
			}else{
				System.out.println("min="+c);
			}	
		}
	}