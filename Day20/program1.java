import java.util.*;
class program1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int a=sc.nextInt();
				for(int i=a;i>=0;i--){
					if(i%2==1){
					System.out.print(i+" ");
				}						
			}
		}
}