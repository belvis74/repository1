class Methodoverload1
{

public static double add(int i,int j){

return i+j;

}



public static int add(int i,int j){

return i+j;

}

public static void main(String[] args){

System.out.println("Start Main");
System.out.println(add(34.54,23.66));
System.out.println(add(45,22));
System.out.println("End Main");
}
}
