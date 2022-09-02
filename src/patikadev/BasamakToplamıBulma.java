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

public class BasamakToplamıBulma {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");


        int num = sc.nextInt();

        int adet = 0,toplam=0;

        while(num != 0)
        {
            toplam +=  (num%10);
            num /= 10;
            ++adet;
        }
        System.out.println("basamak sayısı : " + adet);
        System.out.println("basamak toplamı: " + toplam);
    }


}
    
    

