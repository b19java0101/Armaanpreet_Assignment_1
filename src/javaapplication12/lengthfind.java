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
public class lengthfind {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        while(n>0)
        {
       // int l=n%10;
        n=n/10;
        c++;
        }
        System.out.println(c);
        
    }
}
