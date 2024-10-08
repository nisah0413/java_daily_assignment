import java.util.*;
class program2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mass of oject:");
			double m=sc.nextDouble();
		System.out.println("Enter velocity of oject:");
			Double v=sc.nextDouble();
		System.out.println("kinetic energy of given object is:"+0.5*m*v*v);
	}
}