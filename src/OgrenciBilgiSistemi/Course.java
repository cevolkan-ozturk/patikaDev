/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OgrenciBilgiSistemi;

/**
 *
 * @author volkan
 */
public class Course {
    Teacher teacher;
    String name ;
    String code ;
    String prefix ;
    int note ;
    
    Course (String name, String code, String prefix){
    this.name = name ;
    this.code = code ;
    this.prefix = prefix;
    this.note = 0;
   
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
        this.teacher = teacher;
        printTeacherInfo();
        }
        
        else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");        
        }
        
    }
    
    void printTeacherInfo() {
        this.teacher.print();
    
    }
    
   
}
