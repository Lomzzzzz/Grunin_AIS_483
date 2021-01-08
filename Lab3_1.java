/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author 1
 */
public class Lab3_1 {
    static double b=2; 
    static void s (double n) { 
        double r = 1; 
        if (n < 0) { for (int i=0; i>n; i--) {
            r*=b;} 
        System.out.print("1/" + r);} else {
            for (int i=0; i<n; i++) { 
            r*=b;} 
        System.out.println(r); } 
    }
    public static void main (String[] args) { 
        s (4); } 
}
  