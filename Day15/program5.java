import java.util.*;
class program5{
	public static void main(String[]args){
		System.out.println("Enter number a:");
		Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
		System.out.println("Enter number b:");
			int b=sc.nextInt();
		System.out.println("Enter number c:");
			int c=sc.nextInt();
				if(a>=b && a>=c){
					System.out.println("maximun number is:"+a);
					}
				else if(b>=a && b>=c){
					System.out.println("maximum number is:"+b);
					}
				else{
					System.out.println("maximum number is:"+c);
					}
			}
		}
