/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Operator;

/**
 *
 * @author Sam Otnay
 */
public class Operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int a=7, b=11;
      
      int addition = a+b;
      int substraction = a-b;
      int multiplication = a*b;
      int division = a/b;
      int modulus = a%b;
      int increment = a++;
      int decrement = b--;
      
        System.out.println("====OPERATOR JAVA=====");
        System.out.println("======MASOK DEK======");
      
        System.out.println("a + b = "+addition);
        System.out.println("a - b = "+substraction);
        System.out.println("a * b = "+multiplication);
        System.out.println("a / b = "+division);
        System.out.println("a % b = "+modulus);
        System.out.println("a++ = "+increment);
        System.out.println("b-- = "+decrement);
    }
    
}
