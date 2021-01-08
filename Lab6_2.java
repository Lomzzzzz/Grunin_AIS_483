package Lab6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1
 */
public class Lab6_2 {
    
    public static void sort() {
        float temp;
        float[] A = new float[10];
        System.out.print("\nИсходный массив: ");
        for (int i = 0; i < 10; i++) {
            A[i] = (int) Math.round(25 * Math.random());
            System.out.print(A[i] + ", ");
        }
        System.out.print("\nМассив отсортированный: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 9; j > i; j--) {
                if (A[j - 1] > A[j]) {
                temp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = temp;
            }
        }
    System.out.print(A[i] + ", ");
    }
}
public static void main(String[] args) {
    sort();
    }
}