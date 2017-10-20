/* Created by Jenny Trac
Created on Oct 16 2017
Modified to include "for" loop on Oct 20 2017
This program calculates the factorial of a positive integer */

import java.util.Scanner;

public class FactorialCalculator {
  
 public static void main(String[] args)
 {

 // variables
 int answer = 1;
 
 // instructions
 System.out.println("Enter a positive integer to calculate the factorial:");
 
 // input
 Scanner problem = new Scanner(System.in);
     int user_input = (problem.nextInt());
 
 // process
 if (user_input > 0)
     {
     for (int counter = 1; counter <= user_input; counter++)
         {
         answer = answer * counter;
         }
     System.out.println(answer);
     }
 
 else
     {
     System.out.println("Not an option.");
     }
 
 }

}
