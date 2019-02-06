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
public class highelementarr {
    public static void main(String[] args) {
        int[] arr=new int[5];
        
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=s.nextInt();
        }
        int big=arr[0];
        for(int i=0;i<arr.length;i++)
        {
        
          if(arr[i]>big)
          big=arr[i];
         }
        System.out.println("highest element is "+big);
}
}
