package com.demo;

import java.util.Scanner;
//test
public class PrintNumberInWord {
    public static void main(String args[]) {
        System.out.println("Enter an Integer number from 1 to 6:");
        Scanner input = new Scanner(System.in);
        int PrintNumberInWord = input.nextInt();

        switch (PrintNumberInWord){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}

