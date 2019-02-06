/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Armaan
 */import java.util.Scanner;
public class leapyear {
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
     int year=s.nextInt();
     if(year%4==0)
     {
         System.out.println("leap year");
     }
     else
     {
         System.out.println("non leap year");
     }
    }
    
}
