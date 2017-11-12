/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix3x3x3;

/**
 *
 * @author DAYWALKER
 */
import java.util.Arrays;

public class Matrix3x3x3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Variable declaration and  initialization. Matrix instantiation
        
        int i, j, k = 0;
        
        int sum = 0;
                      
        int [] [] [] counts  = new int [3] [3] [3];
        
        //The following code was written in class for the creation of the 
        // 3x3x3 array
        /*
        for (i = 0; i < counts.length; i++)
        {
            
            for (j = 0; j <  counts[i].length; j++)
            {
                
                for (k = 0; k < counts[i][j].length; k++)
                {
                
                counts[i] [j] [k] = i+j+k;
                
                
                System.out.println("[" + i + "][" + j + "][" +k+ "]" +"=" + counts[i][j][k]);
                
                }
           
            }
        }
        */
        
        // The sligthly modified code below constructs the same array and 
        // and also depicts the corresponding 3x3 array for each element of 
        // the 3 dimensional  array and sums it's elements 
        
        for ( i= 0; i < counts.length; i++ )
        {
            System.out.println("Element " + (i+1) + " of the 3x3x3 array");
            System.out.println("Contains the 3x3 array:");
            sum = 0;
            
            for( j = 0; j < counts[i].length; j++ )
            {
                
               for ( k = 0; k < counts[i][j].length; k++)
                {
                        counts[i][j][k] = i+j+k;
                        sum += counts[i][j][k];
                }
               
                System.out.println(Arrays.toString(counts[i][j]));
            }
            
            System.out.println("The sum of the elements is: " + sum + "\n\n");
           
        }
        
        
        }
    }
    

// Task ga to spiti selida 236