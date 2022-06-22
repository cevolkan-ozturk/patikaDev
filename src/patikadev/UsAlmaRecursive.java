/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikadev;

import java.util.Scanner;

/**
 *
 * @author volkan
 */
public class UsAlmaRecursive {

    public static void main(String[] args) {
        int taban,Us;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz:");
        taban = input.nextInt();
        
        System.out.print("Üs değerini giriniz:");
        Us = input.nextInt();
        System.out.println(usalma(taban,Us));
    }

    static int usalma(int taban, int Us) {
        
        if (Us == 0) {
        return 1;
        }
        else if (taban==1) {
        return 1;
        }
        else 
        
        return taban*usalma(taban, Us-1);
                
    }   
    }



    

