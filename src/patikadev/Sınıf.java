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
import java.util.Scanner;
public class Sınıf {
    
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Degiskenleri tanımla
        int mat,fizik,kimya,turkce,tarih,muzik;
        
        // Scanner nesnesini yarat.
        Scanner oku= new Scanner(System.in);
        // Kullanıcıdan degerleri al
        System.out.print("Matematik Notunu Giriniz: ");
        mat = oku.nextInt();
        
        System.out.print("Fizik Notunu Giriniz: ");
        fizik = oku.nextInt();
        
        System.out.print("Kimya Notunu Giriniz: ");
        kimya = oku.nextInt();
        
        System.out.print("Tükçe Notunu Giriniz: ");
        turkce = oku.nextInt();
        
        System.out.print("Tarih Notunu Giriniz: ");
        tarih = oku.nextInt();
        
        System.out.print("Müzik Notunu Giriniz: ");
        muzik = oku.nextInt();
        
        double toplam = (mat+fizik+kimya+turkce+tarih+muzik) ;
        double ortalama = toplam/6.0;
        System.out.println("Notların Ortalaması: " + ortalama);
        
        if (ortalama<=55) {
        System.out.println("Sınıfa kaldınız, seneye tekrar görüşmek üzere ");
        System.out.println("Ortalamanız: " + ortalama);
        }
        else {
        System.out.println("Tebrikler, sınıfı geçtiniz !");
        System.out.println("Ortalamanız: " + ortalama);
        
        }
       
        
    }
    
}

    

