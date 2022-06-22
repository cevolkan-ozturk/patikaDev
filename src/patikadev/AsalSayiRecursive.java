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

public class AsalSayiRecursive {

    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        sayi = input.nextInt();
        asal(sayi, 2);
    }

    static void asal(int sayi, int i) {

        if (i == sayi) {
            System.out.print(sayi + " bir asal sayıdır.");
            return;
        } else if (sayi % i == 0) {
            System.out.println(sayi + " bir asal sayı değildir.");
            return;
        }

        asal(sayi, i + 1);
    }

}
