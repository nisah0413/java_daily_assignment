class program5 {
  public static void main(String[] args){
    for(int a=1;a<=3;a++){
      for(int b=1;b<=4;b++){
        if (b%2==1) {
          System.out.print("1 ");
        } else{
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }
}