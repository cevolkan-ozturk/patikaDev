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
import java.util.Arrays;
public class Sıralama {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz: ");
        int n = input.nextInt();
        int[] list = new int[n];
        System.out.println("Dizi elemanlarını giriniz: ");
        
        for (int i=0;i<list.length;i++ ){
            System.out.print((i+1) + ".Eleman: ");
            list[i]=input.nextInt();
        }
        
        System.out.println("Dizinin İlk Hali: " + Arrays.toString(list));
    
        Arrays.sort(list);
    
        System.out.println("Dizinin Sıralanmış Hali: " + Arrays.toString(list));
   
    }
    
}
