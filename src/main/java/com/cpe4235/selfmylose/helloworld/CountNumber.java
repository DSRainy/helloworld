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
public class CountNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number = ");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
