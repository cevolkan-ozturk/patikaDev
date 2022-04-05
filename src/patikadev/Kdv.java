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
public class Kdv {
    
    public static void main (String[] args){
    double kdvliTutar, kdvTutar;
    Scanner oku = new Scanner(System.in);
    System.out.println("Lütfen Tutarı Giriniz: ");
        
    double tutar = oku.nextDouble();
   
    if (tutar > 0 && tutar <1000 ){
    kdvliTutar = 1.18*tutar;
    kdvTutar = 0.18*tutar;
    }
    else{ 
    kdvliTutar = 1.08*tutar;
    kdvTutar = 0.08*tutar;
    }
        
        System.out.println("Kdvli Tutar: " + kdvliTutar);
        System.out.println("Kdv Tutarı: " + kdvTutar);
   
    }
    
}
