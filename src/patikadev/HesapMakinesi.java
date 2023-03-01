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

public class HesapMakinesi {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner oku = new Scanner(System.in);
        System.out.println("Hesap Makineme Hosgeldiniz");

        System.out.print("İlk sayıyı giriniz: ");
        n1 = oku.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = oku.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = oku.nextInt();

        switch (select) {
            
            default:
                System.out.println("Yanlış bir seçim yaptınız tekrar deneyiniz ");
                break;
            
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;

            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;

            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme: " + (n1 / n2));
                    break;
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                }

           /* default:
                System.out.println("Yanlış bir seçim yaptınız tekrar deneyiniz ");
                break; */

        }

    }
}
