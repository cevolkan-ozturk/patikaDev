/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikadev;

import java.util.Scanner;

/**
 *
 * @author volkan
 */
public class ATMswitch {

    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;

        while (right>0){
            System.out.print("Kullanıcı Adını Giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz: ");
            password = input.nextLine();
            int balance = 1500;
            int select;
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz!");

                System.out.println("1-Para Yatırma\n"
                        + "2-Para Çekme\n"
                        + "3-Bakiye Sorgulama\n"
                        + "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Para miktarı:");
                        int price = input.nextInt();
                        balance += price;
                        break;

                    case 2:
                        System.out.print("Para miktarı:");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiyeniz yetersiz!");
                        } else {
                            balance -= price;
                        }
                        break;

                    case 3:
                        System.out.println("Bakiyeniz:" + balance);
                        break;

                    case 4:
                        System.out.println("İyi günler. Yine bekleriz...");
                        break;
                }
                        break;
            } else {
                --right;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişeme geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }

            }

        }
    }
}

