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
public class TemperatureActivity {
    public static void main (String[] args){
        int heat ;
        
        Scanner input = new Scanner(System.in);
        System.out.print("hava sıcaklığı değerini giriniz: ");
        heat = input.nextInt();
        
        if(heat<5){
        System.out.println("Kayak yapabilirsiniz. ");
        }
        else if (heat>=5 && heat <=15 ) {
        System.out.println("Sinemaya gidebilirsiniz. ");
        }
        else if (heat>=15 && heat <=25 ) {
        System.out.println("Pikniğe gidebilirsiniz. ");
        }
        
        else {
        System.out.println("Yüzmeye gidebilirsiniz. ");
        }
    
    }
    
}
