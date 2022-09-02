/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikadev;

/**
 *
 * @author volkan
 */
public class palindrom {
    
    static boolean isPalindrome(String str){
    
    int i = 0;
    int j = str.length()-1;
    while (i<j) {
        if(str.charAt(i) != str.charAt(j)){
        return false;
        }
       i++;
       j--;
       
    }
            
        
    return true;
    }
    
    
     static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
     }
        
    public static void main (String[] args) {
        
        System.out.println (isPalindrome("kaymak"));
    }
    
}
