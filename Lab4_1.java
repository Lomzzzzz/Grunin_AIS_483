/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author 1
 */
public class Lab4_1 {
    public static String fromdectobin(int x){
        String res="";
        short q = 0;
        while(x>0){
            q=(short)(x%2);
            x/=2;
            res=q+res;
        }
        return res;
    }
    public static String fromdectohex(float x){
        String res="";
        short q = 0;
        int c = 2;
        while(c>0){
            q=(short)(16*(x/16-Math.floor(x/16)));
            c=(int) Math.floor(x/16);
            x=c;
            if(q<10){
                res=q+res;
            }
            else{
                switch(q){
                    case 10:
                    res="A"+res;
                    break;
                    case 11:
                    res="B"+res;
                    break;
                    case 12:
                    res="C"+res;
                    break;
                    case 13:
                    res="D"+res;
                    break;
                    case 14:
                    res="E"+res;
                    break;
                    case 15:
                    res="F"+res;
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(fromdectobin(90));
        System.out.println(fromdectohex(90));
    }
}
