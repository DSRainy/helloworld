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
public class EvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("n = ");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
