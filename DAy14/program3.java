import java.util.*;
class program3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				for(int i=a;i<=b;i++){
					if(i%2==0){
				System.out.println("cube of"+i+": "+i*i*i+"  Square of "+i+" :"+i*i);
			}
		}
	}
}
