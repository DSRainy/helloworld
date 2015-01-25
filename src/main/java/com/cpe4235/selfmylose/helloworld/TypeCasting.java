package com.cpe4235.selfmylose.helloworld;

import java.util.Scanner;

/**
 *
 * @author RainWhileLoop
 */
public class TypeCasting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number;

        System.out.print("Input a number : ");
        number = scanner.nextFloat();

        if (number - (int) number == 0) {
            System.out.println("output : " + (int) number);
        } else {
            System.out.println("output : " + number);
        }
    }
}
