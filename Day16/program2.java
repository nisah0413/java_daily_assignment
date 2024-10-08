import java.util.*;
class program2{
	public static void main(String[]args){
		System.out.println("Enter the number:");
			Scanner sc=new Scanner(System.in);
		int x;
				int a=sc.nextInt();
		System.out.println("Enter the number:");
				int b=sc.nextInt();
				for(int i=a;i<=b;i++){
				x=1;
					for(int j=1;j<=i;j++){
						x*=j;
					}	
				System.out.println("Factorial of"+i+"is: "+x);
			}
	}
}