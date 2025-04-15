import java.util.Scanner;
import pkgOperations.Add;
import pkgOperations.Substract;
import pkgOperations.Multiply;
import pkgOperations.Divide;
public class Arithmetic
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a=sc.nextInt();
        System.out.println("Enter the Second number:");
        int b=sc.nextInt();
        Add obj1=new Add();
        Substract obj2=new Substract();
        Multiply obj3=new Multiply();
        Divide obj4=new Divide();
        obj1.cal(a,b);
        obj2.cal(a,b);
        obj3.cal(a,b);
        obj4.cal(a,b);
    }
}