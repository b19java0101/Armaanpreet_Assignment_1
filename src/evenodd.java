/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Armaan
 */import java.util.Scanner;
public class evenodd {
    public static void main(String args[])
            
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a number");
    
int num=s.nextInt();
if(num%2==0)
{
        System.out.println("Number is even");

}
else
        System.out.println("Number is odd");

    
}
}