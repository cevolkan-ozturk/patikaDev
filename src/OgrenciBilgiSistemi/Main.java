/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OgrenciBilgiSistemi;

/**
 *
 * @author volkan
 */
public class Main {
    public static void main (String[] args) {
        
        Teacher t1 = new Teacher ("Mahmut Hoca","905565465463", "MAT" );
        Teacher t2 = new Teacher("Graham Bell" , "905467863421" , "FZK");
        Teacher t3 = new Teacher ("Külyutmaz", "905431353578", "BIO");
    
        Course matematik = new Course ("Matematik", "101","MAT");
        Course fizik = new Course ("Fizik", "102","FZK");
        Course biyo = new Course ("Biyoloji", "103", "BIO");
        
        matematik.addTeacher(t1);
        fizik.addTeacher(t2);
        biyo.addTeacher(t3);
        
        Student s1 = new Student ("İnek Şaban", "140144015", "4", matematik,fizik,biyo);
        s1.addBulExamNote(50, 20, 40);
        s1.isPass();
        
        Student s2 = new Student ("Güdük Necmi", "2211133", "4", matematik,fizik,biyo);
        s1.addBulExamNote(100, 50, 40);
        s1.isPass();
        
        Student s3 = new Student ("Hayta İsmail", "2211133", "4", matematik,fizik,biyo);
        s1.addBulExamNote(50, 20, 40);
        s1.isPass();
    
    }
    
}
