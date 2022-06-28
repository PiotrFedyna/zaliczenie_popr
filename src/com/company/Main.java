package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int x, y, a = 0;
        int w = 0;
        int[] tab = new int[10];
        for (int i = 0; i <= 9; i++) {
            System.out.println("Podaj liczbe");
            x = p.nextInt();
            tab[i] = x;

        }
        int z;
        for (z = 0; z <= 9; z++) ;

        if (tab[z] % 2 != 0) {

            w = w + tab[z];
        }
        System.out.println(w);

    }
}
