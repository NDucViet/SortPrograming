package SortNSearch.controller;

import java.util.Random;
import java.util.Scanner;

public class Library {
    public int getInt(String condition, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(condition + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public int[] createArray(int sizeArray) {
        int[] array = new int[sizeArray];
        Random rd = new Random();
        for (int i = 0; i < sizeArray; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] +" ");
        }
        System.out.println("");
    }

}
