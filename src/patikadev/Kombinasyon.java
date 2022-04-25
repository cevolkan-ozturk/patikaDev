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
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,comb=1;
        

        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        n = input.nextInt();
        
        System.out.print("r sayısını giriniz: ");
        r = input.nextInt();
        
        int p=n-r;
        
        comb= Faktoriyel(n)/(Faktoriyel(r)*Faktoriyel(p));
        System.out.println(comb);
        
    } 
        public static int Faktoriyel(int c){
            int a,Fact=1;
            
            for (a=1;a<=c;a++){
                Fact=Fact*a;
        }
            return Fact;
            
        }
        

       
        }
    

