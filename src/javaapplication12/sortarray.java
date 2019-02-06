package javaapplication12;

import java.util.Scanner;

public class sortarray {
 public static void main(String[] args) {
        int[] arr=new int[5];
        int temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=s.nextInt();
        }
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr.length;j++)
          {
             if(arr[i]<arr[j])
            {
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }
      }
      System.out.println("Sorted array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
       }    
}
