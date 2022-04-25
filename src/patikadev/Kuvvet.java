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

public class Kuvvet {

    public static void main(String[] args) {
        int k;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        k = input.nextInt();

        for (int i = 1; i < k; i *= 4) {
            System.out.println("4'ün kuvveteri: " + i);
        }

        for (int i = 1; i < k; i *= 5) {
            System.out.println("5'in kuvveteri: " + i);

        }

    }
}
