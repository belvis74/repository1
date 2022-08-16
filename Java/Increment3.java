class Increment3
{



public static void main(String[] args)
{

int x=1;
int y=1;
int z=1;

// 2  +  1  +  1
x=++x + y++ + z++;
//  6     3    1
y=x++ + ++y + z++;
// 7     8     4
z=++x + y++ + ++z;


System.out.println("x="+x);
System.out.println("y="+y);
System.out.println("z="+z);



}

}