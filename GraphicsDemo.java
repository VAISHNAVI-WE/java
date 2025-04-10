import graphics.*;
import java.util.Scanner;
public class GraphicsDemo
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        Circle obj1=new Circle();
        Rectangle obj2=new Rectangle();
        Square obj3=new Square();
        Triangle obj4=new Triangle();
        while (true)
    {
        System.out.println("\n1)Circle\n2)Rectangle\n3)Sqaure\n4)Triangle");
        System.out.print("Enter your choice(1-5):");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                obj1.area();
                break;
            case 2:
                obj2.area();
            case 3:
                obj3.area();
            case 4:
                obj4.area();
            case 5:
                 System.out.println("Exiting!!");
                 System.exit(0);
                 default:
                    break;
        }
    }
    }
}