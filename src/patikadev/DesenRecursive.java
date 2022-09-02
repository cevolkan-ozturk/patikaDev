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
public class DesenRecursive {
    static void function(int N){
        
        if(N>0) {
        System.out.print(N + " ");
        function(N - 5);
        }
        System.out.print(N + " ");
    }
    
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("N sayısını giriniz: ");
        int N = input.nextInt();
        System.out.println("Çıktısı: ");
        function(N);
        System.out.println();
        input.close();
       
    }
    
}
