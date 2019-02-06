/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Armaan
 */import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k,r=1;
        int c=0,sum=0;
        int num=n;
        while(n>0)
        {
        n=n/10;
        c++;
        }
          n=num;//
          //System.out.println(c);
          while(n>0)
          { k=1;
              r=n%10;
              n=n/10;
        for (int i=1;i<=c;i++)
        {
           // System.out.println(c);
           
            k=k*r;
         }
        sum=sum+k;
        System.out.println(sum);
          }
       // System.out.println(r);
        
        if(sum==num)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        
        
    }
}
