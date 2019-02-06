/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Armaan
 */
import java.util.Scanner;
public class gradingbtes {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the marks ");
        int marks=s.nextInt();
        if(marks>=85)
        {
            System.out.println("Excellent");
            
        }  
        else if((marks>=70) &&(marks<85))
        {
            System.out.println("Very Good");
            
        }  
        else if((marks>50)&&(marks<70))
        {
            System.out.println("Good");
            
        }  
       else
            System.out.println("fail");
        
        
    }
    
}
