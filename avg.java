//package com.java;
import java.util.Scanner;

public class avg {
     public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a =sc.nextInt();
         System.out.println("Enter number 2:");
         int b =sc.nextInt();
         System.out.println("Enter number 3:");
         int c =sc.nextInt();
         System.out.println("Enter number 4:");
         int d =sc.nextInt();
         System.out.println("Enter number 5:");
         int e =sc.nextInt();
         System.out.println("average of 5 number is:");
         int avg= (b+c+d+e+a)/5;
         System.out.println(avg);
     }
}



