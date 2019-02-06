/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Armaan
 */
public class trioseries {
    public static void main(String args[])
    {
        int a=0,b=1,c=2,d,i,count=12;
        System.out.println(""+a);
        System.out.println(""+b);
        System.out.println(""+c);
            
        for(i=2;i<count;i++)
        {
            d=a+b+c;
            System.out.println(""+d);
            a=b;
            b=c;
            c=d;
        }
 
    }
    
}
