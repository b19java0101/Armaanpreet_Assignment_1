package javaapplication12;

import java.util.Scanner;
//still left
public class high2arr {
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
        int big1=arr[0];
         for(int i=0;i<arr.length;i++)
        {
        
          if((arr[i]>big1)&&(arr[i]<big))
          big1=arr[i];
         }
       
        System.out.println(" Second highest element is "+big1);
}  
}
