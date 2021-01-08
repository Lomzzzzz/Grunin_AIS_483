/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author 1
 */
public class Lab5_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 0 до 9");
        Double a = s.nextDouble();
        s.close();
        if (a == 0) {
            System.out.println("Ноль");
        } else {
            if (a == 1) {
            System.out.println("Один");
        } else {
                if (a == 2) {
            System.out.println("Два");
        } else {
                    if (a == 3) {
            System.out.println("Три");
        } else {
                        if (a == 4) {
            System.out.println("Четыри");
        } else {
                            if (a == 5) {
            System.out.println("Пять");
        } else {
                                if (a == 6) {
            System.out.println("Шесть");
        } else {
                                    if (a == 7) {
            System.out.println("Семь");
        } else {
                                        if (a == 8) {
            System.out.println("Восемь");
        } else {
                                            if (a == 9) {
            System.out.println("Девять");
        } else {
                                                System.out.println("Вы ввели неправильное число");
        }
    }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
