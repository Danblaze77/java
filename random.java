import java.util.*;
class random
{
    public static void main(String[] args)
    {
        int l,h,num=0;double d=0.0;
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter the lower limit :");
        l=sc.nextInt();
        System.out.println("Enter the upper limit: ");
        h=sc.nextInt();*/
        for(int i=0;i<100;i++)
        {
            d=Math.random()*100;
             num= (int)d;
        }
    System.out.println("Randomly generated number is:"+num);
    }
}