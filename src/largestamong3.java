/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Armaan
 */import java.util.Scanner;
public class largestamong3 {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner s= new Scanner(System.in);
        System.out.println("enter three numbers");
        System.out.println("enter value of a");

        a=s.nextInt();
        System.out.println("enter value of b");

        b=s.nextInt();
        System.out.println("enter value of c");

        c=s.nextInt();
        if((a>b)&&(a>c))
        {
         System.out.println("a is largest");
        }
         else if((b>a)&&(b>c))
        {
         System.out.println("b is largest");
         
        }
        else
        System.out.println("c is largest");

}
}
