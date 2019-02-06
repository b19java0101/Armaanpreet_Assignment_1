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
public class diamondabc {
     public static void main(String[] args) {
       
        int x;
     for(int i=1;i<=5;i++)
     {
         x=97;
         for(int k=2;k>=i; k--)
             
         {
             System.out.print(" "); 
    }
         for(int k=4;k<=i;k--)
         {
             System.out.println("");
         }
       
         for(int j=1;j<=2*i-1;j++)
             
         {
             System.out.print((char)x+" ");
             x++;
    }
         System.out.println( );
}
    }
}
 

