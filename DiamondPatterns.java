import java.util.Scanner;  
public class DiamondPatterns 
{  
public static void main(String args[])  
{  
        int i,j,n,m=1;
        Scanner b=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=b.nextInt(); 
        m= n - 1;  
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.print(" ");
            }
            m--;
            for(j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


