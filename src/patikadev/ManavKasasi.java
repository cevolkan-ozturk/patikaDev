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

public class ManavKasasi {

    public static void main(String[] args) {
        double armutKg, elmaKg, domatesKg, muzKg, patlıcanKg, totalTutar;

        double armutKgFiyatı = 2.14;
        double elmaKgFiyatı = 3.67;
        double domatesKgFiyatı = 1.11;
        double muzKgFiyatı = 0.95;
        double patlıcanKgFiyatı = 5;

        Scanner oku = new Scanner(System.in);
        System.out.print("Armut kilogram değerini giriniz: ");
        armutKg = oku.nextDouble();

        System.out.print("Elma kilogram değerini giriniz: ");
        elmaKg = oku.nextDouble();

        System.out.print("Domates kilogram değerini giriniz: ");
        domatesKg = oku.nextDouble();

        System.out.print("Muz kilogram değerini giriniz: ");
        muzKg = oku.nextDouble();

        System.out.print("Patlıcan kilogram değerini giriniz: ");
        patlıcanKg = oku.nextDouble();

        totalTutar = (armutKg * armutKgFiyatı) + (elmaKg * elmaKgFiyatı) + (domatesKg * domatesKgFiyatı) + (muzKg * muzKgFiyatı) + (patlıcanKg * patlıcanKgFiyatı);

        System.out.println("Toplam Tutar: " + totalTutar + " TL");

    }
}
