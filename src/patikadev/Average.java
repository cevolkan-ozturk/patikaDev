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
public class Average {
    public static void main (String[] args){
    int k, sum=0, count=0;
    double average;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Sayıyı giriniz: ");
    k = input.nextInt();
    
    for(int i =1;i<=k;i++) {
        if (i%3==0 && i%4==0){
            sum= sum+i;
            count++;     
        }

    }
    average = sum/count;
    System.out.println("Ortalama: "+average);
        
    
        }
    
}
