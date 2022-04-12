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

public class UserName {

    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz: ");
        userName = inp.nextLine();

        System.out.print("Kullanıcı Şifrenizi Giriniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else if (!(userName.equals("patika")) && password.equals("java123")) {
            System.out.println("Kullanıcı Adınız Hatalı! ");
        } else if ((userName.equals("patika")) && !(password.equals("java123"))) {
            System.out.println("Şifreniz Yanlış! ");
            System.out.println("Şifrenizi Yenilemek için (1)\nÇikis için (2)");
            select = inp.nextInt();

            switch (select) {

                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    newPassword = input.nextLine();

                    if (newPassword.equals("java123")) {
                        System.out.print("Yeni şifreniz, eski şifrenizle aynı olamaz! ");
                        break;

                    } else {
                        System.out.print(" Şifreniz başarıyla değiştirildi. ");
                        break;
                    }

                case 2:
                    System.out.println("Cikis yapildi.");
                    break;

                default:
                    System.out.println("Hatali harf/sayı/karakter girdiniz !");
                    break;
            }

        } else {
            System.out.println("Bilgileriniz Yanlış !");

        }

    }

}
