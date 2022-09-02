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
public class FibonnaciSeries {
    public static void main (String[] args) {
        
        int number, n1=0, n2=1,n3 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonnaci serisinin eleman sayısını giriniz: ");
        number = scan.nextInt();
        
        for (int i=1;i<number;i++){
            n3= n1+n2;
            System.out.println(n1 + "+" + n2 + "=" + n3);
            n1=n2;
            n2=n3;
            System.out.println("");
        
        }
    
    }
    
}
