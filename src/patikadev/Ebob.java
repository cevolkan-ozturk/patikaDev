/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konsolgirdi;

/**
 *
 * @author volkan
 */
import java.util.Scanner;
public class Ebob {

    public static void main(String args[]) {
        Scanner oku = new Scanner(System.in);
        int m, n, ebob=1, i;

        // Tam sayıları oku
        System.out.print("Birinci tam sayıyı girin: ");
        m = oku.nextInt();
        System.out.print("İkinci tam sayıyı girin : ");
        n = oku.nextInt();  

        // i, 1 - min(m,n) aralığında birer birer artarak ilerlerken,
        // m'yi ve n'yi tam bölebiliyorsa, ebob değişkenine atanır.
        // Böylece hem m'yi hem n'yi tam bölebilen en büyük i değeri
        // ebob değişkeni içinde kalmış olur.

        for(i = 2; i <= m && i <= n; i++)
            if (m % i == 0 && n % i == 0)
                ebob = i;

        // Sonucu yaz
        System.out.println(m + " ve " + n + " sayılarının EBOB'u = " + ebob);
    }
}
    

