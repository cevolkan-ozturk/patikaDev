/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boks;

/**
 *
 * @author volkan
 */
public class Match {
    
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    
   public Match(Fighter f1, Fighter f2, int minWeight , int maxWeight) {
    
            this.f1 = f1;
            this.f2 = f2;
            this.minWeight=minWeight;
            this.maxWeight=maxWeight;
    }
    
   public void run() {
        if(checkWeight()) 
        {
            while (this.f1.health>0 && this.f2.health>0) {
                System.out.println("======== YENİ ROUND ===========");
                this.f2.health = this.f1.hit(this.f2);
                
                if (isWin()){
                    break;
                }
                
                this.f1.health = this.f2.hit(this.f1);
                
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
            }
            
        
        
        
        }
        else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        
        } 
    
    
    }
    
    boolean checkWeight(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    
    }
    
    public boolean isWin(){
    if(this.f1.health == 0){
        System.out.println(this.f2.name + " kazandı !");
        return true;
    
    }
    if(this.f2.health == 0){
        System.out.println(this.f1.name + " kazandı !");
        return true;
    
    }
        return false;
    
}
}
