import java.util.Scanner;
public class Faculty
    {
        String name;
        int age;
        void getData()
            {
                Scanner ob=new Scanner(System.in);
                System.out.println("\n\nEnter Faculty Name:");
                name=ob.nextLine();
                System.out.println("\n\nEnter age:");
                age=ob.nextInt();
            }
            void display()
                {
                    System.out.println("Faculty Name:"+name);
                    System.out.println("Faculty age:"+age);
                      
                }
            public static void main(String args[])
                {
                    Faculty f=new Faculty();
                    f.getData();
                    System.out.println("\n\nFaculty Details\n");
                    System.out.println("\n\n....................\n");
                    f.display();
                }

    }