import java.util.*;
class program3{
	public static void main(String[]args){
		double velocity;
		System.out.println("Enter the travelled distance :");
		Scanner sc=new Scanner(System.in);
			double dis=sc.nextDouble();
		System.out.println("Enter the time:");
			double time=sc.nextDouble();
				if(dis>=0 && time>=0){
					System.out.println("velocity ="+(dis/time)+"m/s");						}else{
					System.out.println("enter valid details");					}
		}

	}