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

public class hipotenusHesaplama {

    public static void main(String[] args) {
        double a, b, c, u, Alan;
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen a kenarını giriniz: ");
        a = oku.nextDouble();

        System.out.print("Lütfen b kenarını giriniz: ");
        b = oku.nextDouble();

        c = Math.sqrt((a * a) + (b * b));

        u = (a + b + c) / 2;
        Alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin hipotenüsü: " + c);
        System.out.println("Üçgenin alanı: " + Alan);

    }
}
