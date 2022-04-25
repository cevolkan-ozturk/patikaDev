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
public class ÜslüSayıHesabı {
public static void main (String[] args) {
    int n,k,total=1;
    
    Scanner tara = new Scanner(System.in);
    System.out.print("Üssü alınacak sayı: ");
    n = tara.nextInt();
    
    System.out.print("Üs alınacak sayı: ");
    k = tara.nextInt();
    
    for (int i=1;i<=k;i++){
    total*=n;
    }
    System.out.println("Sonuç: "+total);


}    
}
