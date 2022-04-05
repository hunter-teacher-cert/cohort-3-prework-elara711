import java.util.*;
import java.util.Scanner;

public class Celsius {
public static void main(String[] args){


System.out.println("Start");
  
// Exercise 2   Write a program that converts a temperature from Celsius to Fahrenheit.
    
//(1) prompt the user for input
    final double CON_MULTIPLE=2;
    final int CON_CONSTANT=32; // 
    double cels; // celsius variable 
    double fahr; // fahrenheit variable
    Scanner in = new Scanner(System.in);
  
    

  
    
    
  
        //System.out.print("Type something: ");
        //line = in.nextLine();
        //System.out.println("You said: " + line);

        //System.out.print("Type something else: ");
        //ine = in.nextLine();
        //System.out.println("You also said: " + line);
 
  
//(2) read a double value from the keyboard, 
  System.out.print("Enter a Celsius value ");
  cels = in.nextInt();



 
  System.out.println("Celsius="+cels);
  System.out.println("cels*CON_MULTIPLE="+cels*CON_MULTIPLE);
  fahr=CON_CONSTANT+(cels * CON_MULTIPLE);
  
  System.out.println(fahr);
  
  
// (3) calculate the result, and 
  
//(4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F"

// Formula for Celsius to Fahrenheit Conversion
// F=C * (9/5) + 32
// fahrenheit=CON_CONSTANT+(celsius * CON_MULTIPLE)


 System.out.println("Complete");
  
    }
}