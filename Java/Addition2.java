class Addition2{

   public static void Addition(int a,int b){

int sum=a+b;
System.out.println("Sum="+sum);


}


public static void main(String[] args)

   {
   System.out.println("start main");
   java.util.Scanner scn=new java.util.Scanner(System.in);
        System.out.println("Enter 1st number");
       int a=scn.nextInt();
   System.out.println("Enter 2nd number");
       int b=scn.nextInt();
   Addition(a,b);
   System.out.println("start ends");   
  


}

}