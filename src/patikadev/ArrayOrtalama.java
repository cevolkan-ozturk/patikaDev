/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikadev;

/**
 *
 * @author volkan
 */
public class ArrayOrtalama {
    public static void main (String[] args){
        int[] numbers ={1,2,3,4,5};
        int sum = 0;
        double harmonicAvarage=0;
        
        for (int i=0;i<numbers.length;i++){
        
            sum = sum+numbers[i];
            harmonicAvarage = harmonicAvarage + 1.0/numbers[i];
        }
        
        double avarageNumber= sum/numbers.length;
        double result = numbers.length/harmonicAvarage;
        System.out.println("Dizinin Ortalaması: " + avarageNumber);
        System.out.println("Harmonik Ortalaması: " + result);
            
    
    }
    
}
