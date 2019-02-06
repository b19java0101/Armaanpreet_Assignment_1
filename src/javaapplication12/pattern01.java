/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

public class pattern01 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=i;j++)
           {
           if(i==1)
               System.out.print("1");
           
            if(i==2)
           if(j%2==0)
                  System.out.print("1");
                  else
                      System.out.print("0");
              
            if(i==3)
                    if(j%2==0)
                    System.out.print("0");
                else
                    System.out.print("1");
           
            if(i==4)
               if(j%2==0)
                  System.out.print("1");
                  else
                      System.out.print("0");
              
             if(i==5)
              if(j%2==0)
                  System.out.print("0");
                  else
                      System.out.print("1");
           }
            System.out.println();
        }
           
           
}
}