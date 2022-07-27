/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OgrenciBilgiSistemi;

/**
 *
 * @author volkan
 */
public class Teacher {
    
    String name ;
    String mpno ;
    String branch;
    
    public Teacher (String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }
    
    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.mpno);
        System.out.println("Bölümü : " + this.branch);
        
    }
    
    
}
