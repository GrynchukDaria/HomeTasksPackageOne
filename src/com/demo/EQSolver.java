package com.demo;

import java.util.Scanner;

public class EQSolver {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //declare variables and initialize  them
        double disc = 0; //stores a temporary value to check

        double a = 2;
        double b = -8;
        double c = -24;

        double x1;
        double x2;

        // take inputs
        System.out.println("Input the values a, b snd c for ax^2+bx+c = 0");
        System.out.print("Input a: ");
        a = s.nextDouble();
        System.out.print("Input b: ");
        b = s.nextDouble();
        System.out.print("Input c: ");
        c = s.nextDouble();


        disc = Math.pow(b, 2) - 4 * a * c;

        if (disc > 0) {
            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2); //
        }
        else if (disc == 0) {
            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("There is one real root at x = " + x1);
        }          // a=1;b=8;c=16;
        else {
            System.out.println("There are no real roots");
        } // a= -5;b=4;c=7;
    }
}


       //https://www.youtube.com/watch?v=YSvMBa_mAi0&app=desktop
       //https://www.youtube.com/watch?v=lQs38AipNd4&t=6s
       // https://www.youtube.com/watch?v=uXyO85IQD38