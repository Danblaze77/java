/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigits;
import java.util.Scanner;
/**
 *
 * @author test02
 */
public class Sumofdigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        int rem,n,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=in.nextInt();
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
         System.out.println("Sum of digits:" +sum);
         
    }
    
}