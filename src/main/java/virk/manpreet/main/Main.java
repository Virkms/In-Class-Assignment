/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package virk.manpreet.main;

/**
 *
 * @author sukhm
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter a five digit number:");
        int num = input.nextInt();
        int num1 = num / 10000;
        int num2 = (num / 1000)%10;
        int num3 = (num / 100)%10;
        int num4 = (num % 100)/10;
        int num5 = (num % 10);
         System.out.printf("%3s", num1);
                  System.out.printf("%3s",num2);
                  System.out.printf("%3s",num3);
                  System.out.printf("%3s",num4);
                  System.out.printf("%3s",num5);
                  
  /*
        System.out.printf("%s%n%s%n", "Hello World","Whats up");
        double PI = 3.14159;
        
        System.out.printf("Number PI is %.3f\n",PI);
        */
        
        /*
        System.out.print("Enter first integer:");
        int number1 = input.nextInt();
        System.out.print("Enter second integer:");
        int number2 = input.nextInt();
        System.out.print("Enter third integer:");
        int number3 = input.nextInt();
        System.out.print("Enter fourth integer:");
        int number4 = input.nextInt();
        System.out.print("Enter fifth integer:");
        int number5 = input.nextInt();
        System.out.print("These are the 5 number the user input\n" +  number1 + number2 + number3 + number4 + number5);
*/
  
       
     } 
}

