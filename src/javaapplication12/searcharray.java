package javaapplication12;

import java.util.Scanner;

public class searcharray {
  public static void main(String[] args) {
        int[] arr=new int[5];
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=s.nextInt();
        }
        System.out.println("Element to be searched");
        int n=s.nextInt();
       int pos=0;
       for(int i=0;i<arr.length;i++)
        {
        if(arr[i]==n)
        {
          pos=i+1; 
        }
        }
       if(pos>0)
        System.out.println("element's position is "+pos);

        else
         System.out.println("Element is not present");
        
}   
}
