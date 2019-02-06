package javaapplication12;

import java.util.Scanner;

public class jaggedarray {
 public static void main(String[] args) {
        int[][] arr=new int[3][];
        int row,col;
        //arr[0]=new int[3];
        //arr[1]=new int[4];
       // arr[2]=new int[2];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of rows");
        row=s.nextInt();
        for(int i=0;i<row;i++)
        {
         System.out.println("Enter number of colums "+"th  row");
          col=s.nextInt();
               arr[i]=new int[col];
         }
        System.out.println("Enter array elements");
         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=s.nextInt();
             } 
           
        }
       //  int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12;
         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]);
             } 
            System.out.println();
        }

}   
}
