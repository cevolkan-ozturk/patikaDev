/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikadev;

/**
 *
 * @author volkan
 */
import java.util.Scanner;
public class Daıre {
    public static void main(String[] args) {
        int r;
        double a;
        Scanner oku= new Scanner (System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = oku.nextInt();
        
        System.out.print("Merkez açının değerini giriniz: ");
        a = oku.nextInt();
       
        double PI = 3.14;
        double alan = PI * r*r ;
        double cevre = 2 * PI * r;
        double daireDilimAlanı = (PI *(r*r)* a)/360;
        System.out.println("Çevre= " + cevre);
        System.out.println("Alan= " + alan);
        System.out.println("Daire Diliminin Alanı= " + daireDilimAlanı);
        
    
}
}
