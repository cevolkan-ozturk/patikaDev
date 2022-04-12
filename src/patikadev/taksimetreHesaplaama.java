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

public class taksimetreHesaplaama {

    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total = 10;
        Scanner oku = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = oku.nextInt();

        total += (km * perKm);

        if (total > 20) {

        } else {
            total = 20;
        }

        System.out.println("Toplam tutar: " + total + " TL");
    }

}
