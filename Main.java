package com.metanit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.println(i + " x " + a + " = " + i * a);
            }
            System.out.println();
        }
    }
}