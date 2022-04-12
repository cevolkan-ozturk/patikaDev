/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikadev;

/**
 *
 * @author volkan
 */
public class NewClass {
    public static void by(int m) { 
    if (m!=0) {
        by(m/10);
        System.out.print((m%10)+" ");
    }
}
    
}
