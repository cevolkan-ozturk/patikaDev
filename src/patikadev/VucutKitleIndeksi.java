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

public class VucutKitleIndeksi {

    public static void main(String[] args) {
        double boy;
        double kilo;
        Scanner oku = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz: ");
        boy = oku.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = oku.nextDouble();

        double bedenKitleEndeksi;
        bedenKitleEndeksi = kilo / (boy * boy);
        System.out.println("Beden Kitle Endeksiniz:" + bedenKitleEndeksi);
        if (bedenKitleEndeksi < 18.5) {
            System.out.println("İdeal Kilonun Altındasınız");
        } else if (bedenKitleEndeksi < 25) {
            System.out.println("İdeal Kilodasınız. Maşallahın Var ");
        } else if (bedenKitleEndeksi < 30) {
            System.out.println("İdeal Kilonun Üzerindesiniz");
        } else {
            System.out.println("İdeal Kilonun Çok Üzerindesiniz");
        }

    }
}
