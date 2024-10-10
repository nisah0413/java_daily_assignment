import java.util.*;
class program3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hrs:");
			int hr=sc.nextInt();
			int sec=hr*60*60;
			System.out.println(hr>=0?sec:"Enter valid data");	

	}
}