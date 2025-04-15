import java.util.Scanner;
public class Matrix
    {
        public static void main(String args[])
            {
                int row,col,k,m;
                Scanner s=new Scanner(System.in);
                System.out.println("Enter the number of rows");
                row=s.nextInt();
                System.out.println("Enter the number of columns");
                col=s.nextInt();
                int matA[][]=new int[row][col];
                System.out.println("Enter the element of Matrix:");
                for(k=0;k<row;k++)
                    {
                        for(m=0;m<col;m++)
                            {
                                matA[k][m]=s.nextInt();
                            }
                    }
                System.out.println("Matrix");
                System.out.println("-------------------");
                for(k=0;k<row;k++)
                    {
                        for(m=0;m<col;m++)
                            {
                                System.out.print(matA[k][m]+"\t");
                            }
                         System.out.println();   
                    }   
            }
    }