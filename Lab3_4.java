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
public class Lab3_4 {
    public static final Double g=9.8; 
    public static double vis(double h){ 
        double t=Math.sqrt(2*h/g); 
        return t; } 
    public static void main(String[] args) {
        System.out.println(vis(5)); }
}
