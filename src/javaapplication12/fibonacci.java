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
public class fibonacci {
    public static void main(String args[])
    {
        int a=0,b=1,c,i,count=12;
        for(i=2;i<count;i++)
        {
            c=a+b;
            System.out.println(""+c);
            a=b;
            b=c;
        }
    }
       
 }
