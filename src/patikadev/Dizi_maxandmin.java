/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikadev;

/**
 *
 * @author volkan
 */
import java.util.Arrays;
import java.util.Scanner;

public class Dizi_maxandmin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int number = input.nextInt();

        int[] list = {15, 12, 788, 1, -1, -5, 0};
        int min = list[0];
        int max = list[0];

        Arrays.sort(list);

        for (int i : list) {
            if (i < number) {
                min = i;
            }

            if (i > number) {
                max = i;
                break;

            }

        }

        System.out.println("Girilen sayıdan küçük en büyük sayı : " + min);
        System.out.println("Girilen sayıdan büyük en küçük sayı : " + max);

    }

}
