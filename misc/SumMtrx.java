/** Author: Erwin Lara
  This code will use two matrices 
  display the elements of each matrix
  and add them together
  then output/display the result to the screen.
    */

import java.util.*;
import java.util.Scanner;

public class SumMtrx {
    public static void main(String[] args) {
    int row = 5, col = 5;
    int[][] oneMatrix = {{1,2,3,4,5},{6,7,8,9,10},{1,2,3,4,5},{6,7,8,9,10},{1,2,3,4,5}};
    int[][] twoMatrix = {{-1,-2,-3,-4,-5},{-6,-7,-8,-9,-10},{-1,-2,-3,-4,-5},{-6,-7,-8,-9,-10},{-1,-2,-3,-4,-5}};
      
 

// Show the result on screen
    System.out.println("The elements of the first Matrix is ");
      for (int i=0; i < row; i++)
      {     
        for (int j=0; j < col; j++)
        {
      System.out.print(oneMatrix[i][j]+"  ");    
        }
      System.out.println();  
      }

    System.out.println();
    System.out.println("The elements of the second Matrix is ");
      for (int i=0; i < row; i++)
      {     
        for (int j=0; j < col; j++)
        {
      System.out.print(twoMatrix[i][j]+"  ");    
        }
      System.out.println();  
      }


      
    // Combine Matrices by Addition
    System.out.println();
    int[][] sumofmatrix = new int[5][5]; // create a new matrix 5x5
      
      // add all the elements on a row x column until i=5 and j=5 using a           for..loop
      for (int i=0; i < row; i++)
      {     
        for (int j=0; j < col; j++)
        {
        sumofmatrix[i][j]= oneMatrix[i][j] + twoMatrix[i][j];
        }
      }

    // Show the result on screen
      System.out.println("The sum of the two matrices is: ");
      for(int[] rows:sumofmatrix)
      {
        for(int cols:rows ) 
        {
      System.out.print(cols + "   ");    
        }
        System.out.println();
        }
      }
      }

  