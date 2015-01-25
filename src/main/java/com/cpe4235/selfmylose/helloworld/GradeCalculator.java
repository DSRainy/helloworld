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
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte score;
        System.out.print("Input your score : ");
        score = scanner.nextByte();
        byte group;
        group = (byte) (score / 10);
        switch(group){
            case 8 : System.out.println("Grade A");
                break;
            case 7 : System.out.println("Grade B");
                break;
            case 6 : System.out.println("Grade C");
                break;
            case 5 : System.out.println("Grade D");
                break;
            default: System.out.println("Grade F");
        }
    }
}
