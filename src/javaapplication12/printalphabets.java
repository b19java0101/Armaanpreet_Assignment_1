/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.Scanner;
import java.io.*;


/**
 *
 * @author Armaan*;
 */
public class printalphabets {
    public static void main(String args[]) throws IOException
    {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            
            
    
        int a;
        float b;
        String c;
        char ch;
        //String d;
        
        System.out.println("enter integer");
        a=Integer.parseInt(br.readLine());
        System.out.println("enter float");
        b=Float.parseFloat(br.readLine());
        System.out.println("enter string");
        c=br.readLine();
        //d=br.Integer.toString(br.readLine());
        System.out.println("enter character");
        ch=(char)(br.read());
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(ch);

        
        
        
    
        
   
   

}
}