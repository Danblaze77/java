import java.util.*;
class primenumbers
{
    public static void main(String[] args)
    {
        int p;
        int n;
        Scanner b=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=b.nextInt();
        for(int i=2;i<n;i++)
        {
            p=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    p=1;
            }
            if(p==0)
                System.out.println(i);
        }
    }
}

