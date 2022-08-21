class Info{

   public static String studentinfo(String name,int age,String sub){

return "Name:-"+name+",Age:-"+age+"Subject:-"+sub;

}

public static double adddouble(double d1,double d2){

return d1+d2;

}

public static int addint(int i,int j){

return i+j;



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
   System.out.println(adddouble(45.53,65.76));
   System.out.println(addint(3,5));
   System.out.println("start ends");   
  


}

}