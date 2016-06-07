/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staircase;

import java.util.Scanner;

/**
 *
 * @author Slava
 * 
 * Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?
 *
 * Input 
 * You are given an integer  depicting the height of the staircase.
 * 
 * Output 
 * Print a staircase of height  that consists of # symbols and spaces. For example for , here's a staircase of that height:
 *
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 * 
 * Note: The last line has 0 spaces before it.
 * 
 */
public class Staircase {

    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++)
            {
                System.out.print("#");
            }
            
            System.out.println();
        }
    }
}
