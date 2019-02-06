/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Armaan
 */
public class patternstar {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int k=5;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
//j<=2*i-1 to print different pattern