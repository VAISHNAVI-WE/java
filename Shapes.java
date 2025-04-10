import java.util.Scanner;
public class Shapes
{
    void area(int r1)
{
    System.out.println("\n Area of circle with radius "+r1+"="+3.14*r1*r1);
}
void area(int l1,int b1)
{
   System.out.println ("\n Area of cuboid is with dimensions "+l2+"x"+b2+"x"+h2+"="+l2*b2*h2);
   System.out.println ("\n Area of cuboid is with dimensions "+l1+"X"+b1+"="+l1*b1);
}

    System.out.println ("\n Area of cuboid is with dimensions "+l2+"x"+b2+"x"+h2+"="+l2*b2* h2)
public static void main (string []args)
{
    Scanner s=new Scanner (system.in);
    system.out.println("\n Enter the length");
    int l=s.nextInt();
    system.out.println("\n Enter the breadth");
    int b=s.nextInt();
    system.out.println("\n Enter the height");
    int h=s.nextInt();
    system.out.println("\n Enter the radius");
    int r=s.nextInt();
    Shapes ob=new Shapes();
    ob.area(r);
    ob.area(l,b);
    ob.area(l,b,h);
}
}