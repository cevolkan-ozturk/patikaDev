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
public class HarmonicNumber {
      public static void main(String[] args) {
        int n;
        double result=0.0;

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz: ");
        n = oku.nextInt();
        
        for(int i=1; i<=n;i++) {
             result += (1.0/i);
        }
          System.out.println(result);     
      }
}
