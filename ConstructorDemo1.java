class Employee
    {
        int empno;
        String empname;
        Employee(int no,String n)
            {
                empno=no;
                empname=n;
            }
        void display()
            {
                System.out.println("Employee Details");
                System.out.println("....................");
                System.out.println("Employee Name:"+empname);
                System.out.println("Employee Number:"+empno);
            }                     
    }
public class ConstructorDemo1
    {
        public static void main(String[] args)
            {
                Employee ob=new Employee(101,"jerry");
                ob.display();      
            }

               
    }        
