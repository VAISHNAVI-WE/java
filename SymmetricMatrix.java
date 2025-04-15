import java.util.Scanner;
public class SymmetricMatrix
    {
        public static void main(String[]args)
            {
                boolean Symmetric=true;
                Scanner s=new Scanner(System.in);
                System.out.println("Enter the number of Rows:");
                int rows=s.nextInt();
                System.out.println("Enter the number of Coloumns:");
                int cols=s.nextInt();
                int[][]matrix=new int[rows][cols];
                System.out.println("Enter the elements of Matrix:");
                for(int i=0;i<rows;i++)
                    {
                        for(int j=0;j<cols;j++)
                            {
                                matrix[i][j]=s.nextInt();
                            }
                    }
                if(rows!=cols)
                    {
                        System.out.println("The matrix is  not symmetric");
                    }
                else
                  {
                    for(int i=0;i<rows;i++)
                        {
                            for(int j=0;j<cols;j++)
                                {
                                    if(matrix[i][j]!=matrix[i][j])
                                        {
                                            Symmetric=false;
                                            break;
                                        }
                                }
                        }
                   if(Symmetric)
                    {
                        System.out.println("The matrix is symmetric");
                    }  
                    else
                      {
                        System.out.println("The matrix is not symmetric.");
                      }
                  }

                

                    
            }
    }