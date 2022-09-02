/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikadev;

/**
 *
 * @author volkan
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        //int number = (int) (Math.random()*100);
        Scanner input = new Scanner(System.in);

        int consumeRight = 0;
        int[] wrong = new int[5];
        System.out.println(number);
        boolean isWin = false;
        boolean isWrong = false;
        
        while (consumeRight < 5) {
            System.out.println("Lütfen Tahmin Ettiğiniz Bir Sayıyı Giriniz: ");
            int selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir sayı giriniz! ");
                if (isWrong){
                     System.out.println("Çok fazla hatalı güriş yaptınız. Kalan hak : " + (5-(++consumeRight)));
                }
                else {
                        isWrong=true;
                    System.out.println("Bir daha hatalı girşinizde hakkınızdan düşülecektir.");
                }
        
                continue;
                }
                
           
              


            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğin sayı : " + number);
                isWin=true;
                break;
            } else {
                wrong[consumeRight]=selected;
                consumeRight++;
                System.out.println("Hatalı bir sayı girdiniz tekrar deneyinz! ");
                
                if (selected < number) {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür! ");                   
                }
                else {System.out.println(selected + " sayısı, gizli sayıdan büyüktür! ");}
                System.out.println("Kalan hakkınız: " + (5-consumeRight));
                

            }

        }
        if (!isWin){
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        
        
        }

    }
}

