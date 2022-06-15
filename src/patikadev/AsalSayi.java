/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikadev;

/**
 *
 * @author volkan
 */
public class AsalSayi {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            int sayac = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }

            if (sayac == 1) {

                System.out.print(i + " ");
            }
        }
    }

}
