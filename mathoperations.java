package pack1;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}


package pack2;

public class StringOperations {
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}


package pack3;

public class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public String divide(int a, int b) {
        if (b == 0) {
            return "Cannot divide by zero!";
        } else {
            return String.valueOf((double) a / b);
        }
    }
}


package javaapplication11;
import java.util.*;
import pack1.MathOperations;
import pack2.StringOperations;
import pack3.Calculator;

public class TestApp {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        StringOperations stringOps = new StringOperations();
        Calculator calculator = new Calculator();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Numbers for calculations ");
        System.out.println("Enter 1st number: ");
        int x=obj.nextInt();
        System.out.println("Enter 2nd number: ");
        int y=obj.nextInt();
        System.out.println("Enter words for Concatination");
        System.out.println("Enter 1st word: ");
        String l=obj.next();
        System.out.println("Enter 2nd word ");
        String m=obj.next();
        System.out.println("Enter word for reversing");
        System.out.println("Enter a word ");
        String n=obj.next();
        int sum = mathOps.add(x, y);
        int difference = mathOps.subtract(x, y);
        String concatResult = stringOps.concatenate(l, m);
        String reverseResult = stringOps.reverse(n);
        int product = calculator.multiply(x,y);
        String divisionResult = calculator.divide(x,y);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Concatenation: " + concatResult);
        System.out.println("Reversed String: " + reverseResult);
        System.out.println("Product: " + product);
        System.out.println("Division: " + divisionResult);
    }
}