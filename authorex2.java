import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        String name,email;
        char gend;    
        author obj[]=new author[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name :");
            name=sc.next();
            System.out.println("Enter mail");
            email=sc.next();
            System.out.println("Enter gender-m or f:");
            gend=sc.next().charAt(0);
            obj[i]=new author(name,email,gend);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(obj[i]);
        }
    }
     static class author
    {
         String name,email;
         char gend;
        author(String n,String e,char g)
        {
          name=n;
          email=e;
          gend=g;
        }
        String getname()
        {
            return name;
        }
        String getEmail()
        {
            return email;
        }
        char getgender()
        {
            return gend;
        }
        public String toString()
        {
            return "Author:"+name+"Email:"+email+"Gender:"+gend;
        }
    }
   

}
