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
public class Lab6_4 {
     public static void main(String[] args)
    {
        int[] A = new int[10];
        int B = 0;
        int C = 0;
        Random random = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt() % 100;
            System.out.print(A[i] + " ");
            if (A[i] % 2 == 0) {
                B += A[i];
            } else {
                C += A[i];
            }
        } 
        System.out.print("\nСумма чётных = " + B);
        System.out.print("\nСумма нечётных = " + C);
    }
}
