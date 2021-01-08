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
public class Lab6_5 {
    public static void main(String[] args) {
        Random random = new Random();
        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 5; j++) {
                System.out.print(random.nextInt (10) + " ");
            }
            System.out.println();
        }
    }
}