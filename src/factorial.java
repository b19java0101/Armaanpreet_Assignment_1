
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Armaan
 */
public class factorial {
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=s.nextInt();
       int i,fact=1;
//int number=5;
for(i=1;i<=num;i++){
fact=fact*i;
}
System.out.println("Factorial of "+num+" is: "+fact);

       
    }
   
}
