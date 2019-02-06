package javaapplication12;

import java.util.Scanner;

public class binarysearch {
     public static void main(String args[]){  
     int mid,first,last,n,search,arr[];
     Scanner s=new Scanner(System.in);

         System.out.println("Enter number of elements");
         n=s.nextInt();
         arr =new int[n];
         for(int i=0;i<arr.length;i++)
         {
             arr[i]=s.nextInt();
         }
         System.out.println("Enter element to be searched");
         search=s.nextInt();
         first=0;
         last=arr.length-1;
         mid = (first + last)/2;  
         
   while( first <= last ){  
        if ( arr[mid] < search ){  
        first = mid + 1;     
        }else if ( arr[mid] == search ){  
        System.out.println("Element is found at position: " + (mid+1));  
        break;  
        }else{  
         last = mid - 1;  
        }  
      mid = (first + last)/2;  
        }  
   
       if ( first > last ){  
       System.out.println("Element is not found!");  
   }  
 }  
 
  
}
