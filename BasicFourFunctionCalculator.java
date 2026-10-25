import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("=== Using positive numbers ===");
        
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        
        System.out.println("=== Results ===");
        
        System.out.println("Numbers: " + num1 + ", " + num2);
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + (num1 % num2));
       
    }
}
