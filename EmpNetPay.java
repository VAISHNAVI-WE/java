import java.util.Scanner;
public class EmpNetPay
    {
        int empid,TA,DA,HRA,Tax,netsal,basic;
        String empname;
        void getData()
            {
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter Employee Name,ID,Basic Pay,TA,DA,HRA and Tax");
                empname=scan.nextLine();
                empid=scan.nextInt();
                basic=scan.nextInt();
                TA=scan.nextInt();
                DA=scan.nextInt();
                HRA=scan.nextInt();
                Tax=scan.nextInt();    
            }
        void calc()
            {
                netsal=(basic+TA+DA+HRA)-Tax;
                System.out.println("Netsalary:"+netsal);
            }
        public static void main(String args[])
            {
                EmpNetPay e1=new EmpNetPay();
                e1.getData();
                System.out.println("\nEmployee Details");
                System.out.println(".........................");
                System.out.println("\nEmployee ID:"+e1.empid);
                System.out.println("\nEmployee Name"+e1.empname);
                e1.calc();
            }        
    }