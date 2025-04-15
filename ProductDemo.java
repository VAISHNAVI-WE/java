class Product
    {
        int pcode;
        String pname;
        double price;
        Product(int c, String n,double p)
            {
                pcode=c;
                pname=n;
                price=p;
            }
        void display()
            {
                System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
            }
        void findLowest(double price1,double price2,double price3)
            {
                if(price1<price2 && price1<price3)
                    {
                        System.out.println("\n Product1 is of the lowest price!");
                    }
                  else if(price2<price1 && price2<price3)
                    {
                        System.out.println("\n Product1 is of the lowest price!");
                    }  
                   else if(price2<price1 && price2<price3)
                    {
                        System.out.println("\n product2 is of the lowest price! ");
                    } 
                    else
                        {
                            System.out.println("\n product3 is of the lowest price!");
                        }
            }        
    }
    public class ProductDemo
        {
            public static void main(String[]args)
                {
                    Product obj1=new Product(101,"Product1",100.00);
                    Product obj2=new Product(102,"Product2",128.40);
                    Product obj3=new Product(103,"Product3",790.00);
                    System.out.println("Product Information");
                    System.out.println("-----------------------------");
                    System.out.println("Product_code\t Product_Name\t Product_price");
                    obj1.display();
                    obj2.display();
                    obj3.display();
                    obj1.findLowest(obj1.price,obj2.price,obj3.price);
                }
        }