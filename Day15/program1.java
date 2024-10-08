import java.util.*;
class program1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter number a:");
				int a=sc.nextInt();
			System.out.print("Enter number b:");
			        int b=sc.nextInt();
				System.out.println("series of even number between "+a+"and "+b+" :");
					for(int i=a; i<=b;i++){
				if (i%2==0){
			System.out.print(i+" ");
			}
		}
	}
}
