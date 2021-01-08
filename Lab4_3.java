package Lab4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1
 */
public class Lab4_3 {
    public static void main(String[] args) { 
        double s=0; 
        for ( double x=1; x<10; x++) { 
            while ( x%2==1 ) {
                s=s+1/x; 
                break;} 
        } 
        for ( double n=1; n<10; n++) {
            while ( n%2==0 ) { 
                s=s-1/n; 
                break;} 
        } 
        System.out.println(s); } 
}
