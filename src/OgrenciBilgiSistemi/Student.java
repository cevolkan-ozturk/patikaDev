/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OgrenciBilgiSistemi;

/**
 *
 * @author volkan
 */
public class Student {

    String name, stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, String classes, String stuNo, Course mat, Course fizik, Course kimya) {

        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = 0.0;
        calculateExamAvarage();
        this.isPass = false;

    }

    public void addBulExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiştir!");
        } else {
            this.isPass = isCheckPass();
            //printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }

        }

    }



public void calculateExamAvarage(){
        this.avarage=(this.fizik.note + this.kimya.note+this.mat.note)/3;
        
        }
        
        public boolean isCheckPass(){
        calculateExamAvarage();
        return (this.avarage > 55);
        }
        
        public void printNote(){
            System.out.println("==========================");
            System.out.println("Öğrenci: " + this.name);
            System.out.println("Matematik Notu: " + this.mat.note);
            System.out.println("Fizik Notu: " + this.fizik.note);
            System.out.println("Kimya Notu: " + this.kimya.note);
        
        }
}