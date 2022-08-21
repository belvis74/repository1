class Info1{

   public static String studentinfo(String name,int age,String sub){

return "Name:-"+name+",Age:-"+age+"Subject:-"+sub;

}

public static double add(double d1,double d2){

return d1+d2;

}

public static int add(int i,int j,int k){

return i+j+k;
}
public static int add(int i,int j){

return i+j;

//Method overloading in java

}
public static boolean M1(boolean status){
return status;

}

public static void main(String[] args)

   {
   System.out.println("start main");
   String s=studentinfo("Elvis",47,"Science");
   System.out.println(M1(true));
   System.out.println(s);
   System.out.println(add(45.53,65.76));
   System.out.println(add(3,5));
   System.out.println(add(20,43,15));
   System.out.println("start ends");   
  


}

}