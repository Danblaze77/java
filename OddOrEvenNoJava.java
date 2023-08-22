/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.or.even.no.java;

/**
 *
 * @author test03
 */
public class OddOrEvenNoJava {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
     int a[]={1,2,5,6,3,2};
     System.out.println("Odd numbers");
     for(int i=0;i<a.length;i++){
      if(a[i]%2!=0){
          System.out.println(a[i]);
      }
     }
     System.out.println("Even numbers");
     for(int i=0;i<a.length;i++){
         if(a[i]%2==0){
             System.out.println(a[i]);

         }
         }
      }}