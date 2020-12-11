package com.demo;

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) { //вложенный цикл
                if (j <= i) {
                    System.out.print(j);
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}

/*
package com.demo;

public class Loops {
    public static void main(String[] args) {
      System.out.println("1******");
      System.out.println("12*****");
      System.out.println("123****");
      System.out.println("1234***");
      System.out.println("12345**");
      System.out.println("123456*");
      System.out.println("1234567");
    }
}
 */