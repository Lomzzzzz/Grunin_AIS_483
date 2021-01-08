package Lab6;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1
 */
public class Lab6_6 {       
        static int[] A = new int[10];
        static int max = Integer.MIN_VALUE;
        static int min = Integer.MAX_VALUE;
        static int imax = 0, imin = 0, swap = 0;
    public static void minA (int value, int aMin, int i) {
        if (value < aMin) {
            min = value;
            imin = i;
        }
    }
    public static void maxA (int value, int aMax, int i) {
        if (value < aMax) {
            max = value;
            imax = i;
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt() % 100;
            System.out.print(A[i] + " ");
            minA(A[i], min, i);
            maxA(A[i], max, i);
        }
        System.out.println("\nmax = " + max + "\n");
        swap = A[imax];
        A[imax] = A[imin];
        A[imin] = swap;
        for (var j = 0; j <A.length; j++) {
            System.out.println(A[j] + " ");
        }
    }
}
