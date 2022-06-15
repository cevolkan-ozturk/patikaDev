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
public class MukemmelSayi {
    public static void main (String[] args) {
        
       int sayi,carpanToplam=0;
       Scanner input = new Scanner(System.in);
       System.out.print("Sayıyı giriniz:");
       sayi = input.nextInt();
       
       for (int i=1;i<sayi;i++) {
       
           if (sayi%i==0) {
           carpanToplam +=i;
           }
           
           
       }
       
       if (sayi==carpanToplam) {
           System.out.println(sayi + " Mükemmel bir sayıdır");
       }
       else { System.out.println(sayi + " Mükemmel bir sayı değildir.");} 
    
    }
    
}
