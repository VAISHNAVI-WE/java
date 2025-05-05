import java.util.Scanner;
class Publisher
{
    String pubName;
    Publisher(String pub)
    {
        pubName=pub;
    }
}
class Book extends Publisher
{
    String book;
    Book(String pub,String bk)
    {
        super(pub);
        book=bk;
    }
}
class Literature extends Book
{
    String Category;
    Literature(String pub,String bk,String ctgry)
    {
        super(pub,bk);
        Category=ctgry;
    }
    void display()
    {
        System.out.println("Publisher:"+Publisher);
        System.out.println("Book:"+book);
        System.out.println("Category:"+Category);
    }
}
class Fiction extends Book
{
    String Category;
    Fiction(String pub,String bk,String ctgry)
    {
        super(pub,bk);
        Category=ctgry;
    }
    void display()
    {
        System.out.println("Publisher:"+pubName);
        System.out.println("Book:"+book);
        System.out.println("Category:"+Category);
    }
}
public static BookDetails
{
    Public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter literature book details");
        System.out.println("Book Name:");
        String b=s.next();
        System.out.println("Publisher:");
        String b=s.next();
        System.out.println("Category:");
        String c=s.next();
        Literature ob1=new Literature(b,pub,c);
        System.out.println("Enter Fiction book Details");
        System.out.println("Book name");
        String b1=s.next();
        System.out.println("Publisher");
        String p1=s.next();
        System.out.println("Category");
        String c1=s.next();
        Fiction ob2=new Fiction(b1,p1,c1);
        System.out.println("\n**Literature Book**");
        System.out.println("..............................");
        ob1.display();
        System.out.println("\n**Fiction Book**");
        System.out.println("..............................");
        ob2.display();
        s.close();
    }
}