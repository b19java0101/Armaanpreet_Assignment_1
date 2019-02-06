/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Armaan
 */
public class pallindrome {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=n;
        int sum=0;
        int c=0;
        while(n>0)
        {
            n=n/10;
            c++;
        }n=num;
       while(n>0)
        {
           int r=n%10;
           n=n/10;
         
            sum=sum+(int)Math.pow(10,c-1)*r;
            c--;
         
         //  int k=r+(int)Math.pow(10,c);
            //System.out.print(sum);
        }
                   System.out.println(sum);
if(num==sum)
{
    System.out.println("Pallindrome");
}
else
        System.out.println(" Not Pallindrome");

    
    }
}
