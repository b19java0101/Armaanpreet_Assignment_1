/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

/**
 *
 * @author Armaan
 */
public class swap {
    public static void main (String args[]) throws IOException
            
    {
    InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            int a,b,c;
            System.out.println("enter first number");
            a=Integer.parseInt(br.readLine());
            System.out.println("enter second number");
            b=Integer.parseInt(br.readLine());
            c=a;
            a=b;
            b=c;
            System.out.println("after swap a is"+a);
            System.out.println("after swap b is"+b);

            
          
            
    }        
    
}
