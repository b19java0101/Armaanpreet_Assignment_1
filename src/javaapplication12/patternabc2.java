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
public class patternabc2 {
    public static void main(String[] args) {
        //have x=97; better method
     for(int i=97;i<=101;i+=2)
     {
         for(int k=99;k>=i;k-=2)//k=5;k<=i;k--
             
         {
             System.out.print(" "); 
    }
       
         for(int j=97;j<=i;j++)//j=1;j=2*i-1;j++
             
         {
             System.out.print((char)j+" "); //print x then x++
    }
         System.out.println( );
}
    }
}
