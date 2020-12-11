package com.demo;
// need a help from mentor
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int num, first, last, middle;
         int array [] = {8, 9, 10, 11, 12, 13, 14, 15, 16, 19};


        System.out.println("Enter the search value from array:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        first = 8;
        last =19;
        middle = (first + last)/2;

        while( first <= last )
        {
            if ( array[middle] < num )
                first = middle + 1;
            else if ( array[middle] == num )
            {
                System.out.println(num + " found at location " + (middle + 1) + ".");
                break;
            }
            else
            {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if ( first > last )
            System.out.println(num + " is not found.\n");
    }
}

