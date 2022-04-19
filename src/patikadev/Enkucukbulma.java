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

public class Enkucukbulma {

    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("2.sayıyı giriniz: ");
        b = input.nextInt();

        System.out.print("3.sayıyı giriniz: ");
        c = input.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a < b < c ");
            } else {
                System.out.println("a < c < b ");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println("b < a < c ");
            } else {
                System.out.println("b < c < a ");
            }
        } else {
            if (a < b) {
                System.out.println("c < a < b ");
            } else {
                System.out.println("c < a < b ");
            }

        }

    }
}
