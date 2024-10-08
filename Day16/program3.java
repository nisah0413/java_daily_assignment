//ohms law: v=i*r

import java.util.*;
class program3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Current:");
			double i=sc.nextDouble();
			System.out.println("Resistance:");
			double r=sc.nextDouble();
			if(i>=0 && r>=0){
				System.out.println("voltage:"+i*r);
			}else{
				System.out.println("enter valid data");
			}
		}
	}