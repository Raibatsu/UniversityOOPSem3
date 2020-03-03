/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;
import java.util.Scanner;

public class Question_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value, placement = 0;
        int[] integer = new int[30];
    for(int i=0; i<(integer.length);i++) {

            System.out.println("Enter an integer value:");
            value = input.nextInt();
            System.out.println("In an array of 0-30, where do you wish to place the element?");
            placement = input.nextInt();
                     if( placement > 30 && placement < 0)      
                break;
            integer[placement] = value;
           
            }
            System.out.println("What location do you wish to remove the element from?");
            placement = input.nextInt();
            integer[placement] = '\0';
            for(int i=0; i<=integer.length;i++)
            {
                System.out.println(i+"th variable: " + integer[i]);
            }
                                         
    
    }
    
}
