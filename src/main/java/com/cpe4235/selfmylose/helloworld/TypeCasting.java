/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

        if (number == (int) number) {
            System.out.println((int) number);
        } else {
            System.out.println(number);
        }
    }
}
