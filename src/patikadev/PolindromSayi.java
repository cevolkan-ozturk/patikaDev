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
public class PolindromSayi {
    
    
  public static void main(String[] args) {
    
    int num, reversedNum = 0, remainder;
    
    // store the number to originalNum
    
    Scanner input = new Scanner(System.in);
      System.out.print("Lütfen sayıyı giriniz: ");
      
      num = input.nextInt();
      
      int orginalNumber=num;
    
    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    if (orginalNumber == reversedNum) {
      System.out.println(orginalNumber + " bir polidrom sayıdır. ");
    }
    else {
      System.out.println(orginalNumber + " bir polidrom sayı değildir.");
    }
  }
}
    

