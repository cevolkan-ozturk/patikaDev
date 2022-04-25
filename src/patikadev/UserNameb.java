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
public class UserNameb {
    public static void main (String[] args){
    int password;
    boolean isPasswordSuccess = true;
    Scanner input = new Scanner(System.in);
    
    while (isPasswordSuccess){
        
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextInt();
        
        if (password==123){
        System.out.println("Şifren Doğru");
        isPasswordSuccess=false;        
        }
        else {
        System.out.println("Şifren Yanlış!");
        }
    }
    }
    
}
