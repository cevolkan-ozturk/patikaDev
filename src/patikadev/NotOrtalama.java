/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patikadev;

/**
 *
 * @author volkan
 */
import java.util.Scanner;
public class NotOrtalama {

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
        String sonucMesaj=ortalama>=60? "Sınıfı Geçti" : "Sınıfta Kaldı"; 
        System.out.println(sonucMesaj);
        
    }
    
}
