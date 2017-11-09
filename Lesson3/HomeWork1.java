/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author DAYWALKER
 */

import java.util.Scanner;
        
public class HomeWork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
       int a=0,b=0,c=0;
       boolean condition = true ;
       
       while (condition) {
       
       System.out.println("Give 3 number according to conditions");
       
       a = input.nextInt();
       b = input.nextInt();
       c = input.nextInt();
       
       if ((b>=3*a) && (c>a+b) ) {
           condition = !condition;
       }
       
       }
       System.out.println("Number satisfy the conditions");
    }
    
}
