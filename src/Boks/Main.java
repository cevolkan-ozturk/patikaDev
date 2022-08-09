/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boks;

/**
 *
 * @author volkan
 */
public class Main {
    public static void main (String[] args) {
        Fighter marc = new Fighter ("Marc", 15, 100,90,0);
        Fighter alex = new Fighter ("Alex", 20, 85,85,0);
        
        
        Match match = new Match (marc, alex, 85, 100);
        match.run();           
    }   
}
