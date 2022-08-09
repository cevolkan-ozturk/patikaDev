/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empoyee;

/**
 *
 * @author volkan
 */
public class Employee {
    
    String name;
    double salary;
    int workHours;
    int hireYear;
  
    
    
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary= salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        
    }
    
    public double tax() {
    if (this.salary>1000){
         double tax = this.salary*0.03;
         return tax;         
    }
    else {
        return 0;
        }
    }
    public double bonus(){
        if (this.workHours>40) {
            double bonus = (this.workHours-40)*30;
            return bonus;
        }
        else return 0;
    }
    
    
    public double raiseSalary()  {
        double raise;
        int diffYear = 2021-this.hireYear;
        
        if (this.hireYear <=0 || this.hireYear >2021) {
            System.out.println("Başlangıç yılı geçersiz, lütfen tekrar girniz !");
        }
        else {
            if (diffYear<10) {
            raise = this.salary*0.05;
            return raise;
            }
            
            else if (diffYear>=10 && diffYear<20){ 
            raise = this.salary*0.10;
            return raise;
        }
            else if (diffYear>=19){
                raise = this.salary*0.15;
                return raise;
            }
            else {
                raise =0;
                    }
        }
        
        return 0;
    }
    

    
    public String toString () {
        
        double total = (salary+bonus())- (tax());
        double sumSalary = salary+raiseSalary();
        
        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma Saati: " + workHours);
        System.out.println("Başlangıç Yılı " +hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + total);
        System.out.println("Toplam Maaş: " +sumSalary);
        return null;
    
    
    
    }
}
      

        
    
    
  


    
            
       

