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

public class Ekok {

    public static void main(String args[]) {
        Scanner oku = new Scanner(System.in);
        int m, n, ekok = 1, i;

        // Tam sayıları oku
        System.out.print("Birinci tam sayıyı girin: ");
        m = oku.nextInt();
        System.out.print("İkinci tam sayıyı girin : ");
        n = oku.nextInt();

        // i, 1 - min(m,n) aralığında birer birer artarak ilerlerken,
        // m'yi ve n'yi tam bölebiliyorsa, ebob değişkenine atanır.
        // Böylece hem m'yi hem n'yi tam bölebilen en büyük i değeri
        // ebob değişkeni içinde kalmış olur.
        if (m >= n)
        i = n;
        else
        i = m;

        for ( ;i >= m || i >= n; i++) {
            if (i % m == 0 && i % n == 0) {
                ekok = i ;
                break;
            }
        }

        // Sonucu yaz
        System.out.println(m + " ve " + n + " sayılarının EKOK'u = " + ekok);

    }
}
