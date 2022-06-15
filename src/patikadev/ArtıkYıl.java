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

public class ArtikYil {

    public static void main(String[] args) {
        int t;

        Scanner oku = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        t = oku.nextInt();

        if ((t > 0 && t % 4 == 0) || (t % 100 == 0 && t % 400 == 0)) {
            System.out.println(t + " bir artık yıldır!");
        } else {
            System.out.println(t + " bir artık yıl değildir!");
        }
    }
}
