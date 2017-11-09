/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addnumberstring;

/**
 *
 * @author DAYWALKER
 */

import java.util.Scanner;

public class AddNumberString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a;
        String b;
        
        System.out.println("Please enter a String and a Number");
        
        a = input.nextInt();
        b = input.next();
        
        System.out.println(a+" "+b);
    }
    
}
