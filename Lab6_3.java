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
public class Lab6_3 {
    public static void main(String[] args)
    {
        int[] A = new int[10];
        Random random = new Random();
        int Sum = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt() % 100;
            Sum += A[i];
            System.out.print(A[i] + " ");
        }    
        float z = (float) Sum/ A.length;
        System.out.print("\nСумма = " + Sum);
        System.out.print("\nДлина массива = " + A.length);
        System.out.print("\nСреднее значение = " + z);
    }
}
