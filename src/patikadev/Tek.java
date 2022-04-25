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
public class Tek {
    public static void main (String[] args){
    int n, total=0;
    Scanner tara = new Scanner(System.in);
    
    do {
        System.out.print("Sayı Giriniz: ");
        n = tara.nextInt();
        if (n%2==0 && n%4==0){
            total += n;
        }
    }
    while(n%2==0);
    
        System.out.println("Toplam: "+total);
    }
    
}
