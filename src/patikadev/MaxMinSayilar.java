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
public class MaxMinSayilar {
    public static void main (String[] args) {
    
        int counter,number,maxNumber=0,minNumber=0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        counter = input.nextInt();
        
        for (int i=1; i<=counter;i++) {
            System.out.print(i + ". Sayıyı giriniz:");
            number = input.nextInt();
            
            if (i==1){
            maxNumber=number;
            minNumber=number;
                
            }
            else {
                if (number>maxNumber) {
                maxNumber=number;}
                else if (number<minNumber){
                minNumber=number;        
                }
                }
                
            }
        System.out.println("Maximum Sayı:" + maxNumber);
        System.out.println("Minimum Sayı:" + minNumber);
        }
        
    }
    

