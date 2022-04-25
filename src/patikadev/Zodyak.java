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
public class Zodyak {
    public static void main (String[] args){
    int birthyear;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Doğum yılınızı giriniz: ");
        birthyear= input.nextInt();
    
        if (birthyear%12==0){System.out.print("Çin zodyağı burcunuz: Maymun ");}
        else if (birthyear%12==1){System.out.print("Çin zodyağı burcunuz: Horoz ");}
        else if (birthyear%12==2){System.out.print("Çin zodyağı burcunuz: Köpek ");}
        else if (birthyear%12==3){System.out.print("Çin zodyağı burcunuz: Domuz ");}
        else if (birthyear%12==4){System.out.print("Çin zodyağı burcunuz: Fare ");}
        else if (birthyear%12==5){System.out.print("Çin zodyağı burcunuz: Öküz ");}
        else if (birthyear%12==6){System.out.print("Çin zodyağı burcunuz: Kaplan ");}
        else if (birthyear%12==7){System.out.print("Çin zodyağı burcunuz: Tavşan ");}
        else if (birthyear%12==8){System.out.print("Çin zodyağı burcunuz: Ejderha ");}
        else if (birthyear%12==9){System.out.print("Çin zodyağı burcunuz: Yılan ");}
        else if (birthyear%12==10){System.out.print("Çin zodyağı burcunuz: At ");}
        else {System.out.print("Çin zodyağı burcunuz: Koyun ");}
        
}
}
