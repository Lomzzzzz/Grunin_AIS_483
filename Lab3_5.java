package Lab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1
 */
public class Lab3_5 {
    public static double kat(double c, double a){ 
        double f= Math.sqrt(c*c-a*a); 
        return f; 
    } 
    public static void main(String[] args) { 
        System.out.println (kat(5,3)); 
    } 
}
