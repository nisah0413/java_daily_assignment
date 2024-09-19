class program4{
	public static void main(String[]args){
		char ch='A'; 
		for (int i=1;i<=4;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(ch+" ");
				ch++;
			    }			
		   System.out.println();
		   ch='A';
		}

     	}
}