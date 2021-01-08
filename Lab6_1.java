package Lab6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author 1
 */
public class Lab6_1 {
    public static void main(String[] args)
    {
        int[] A = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int imax = 0, imin = 0, swap;
        Random random = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt() % 100;
            System.out.print(A[i] + " ");
            if (A[i] < min) {
                min = A[i];
                imin = i;
            }
            if (A[i] > max) {
                max = A[i];
                imax = i;
            }
        }
        System.out.println("\nмаксимальное число A[" + (imax + 1) + "] = " + A[imax]);
        System.out.println("минимальное число A[" + (imin + 1) + "] = " + A[imin]);
        swap = A[imin];
        A[imin] = A[imax];
        A[imax] = swap;
        System.out.println("Массив после обмена:");
        for (int i = 0; i < A.length; i++) System.out.print(A[i] + " ");
    }
}