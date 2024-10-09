import java.util.*;
class program5{
	public static void main(String[]args){
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
			int a=sc.nextInt();
				for(int i=2;i<=a;i++){
					sum=0;
				for(int j=1;j<=i/2;j++){
					if(i%j==0)
						sum+=j;
					}
				if(sum==i)
					System.out.println(i+" ");
			}
		}
}