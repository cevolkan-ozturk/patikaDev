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
public class UçakBileti {
    public static void main(String[] args) {
        int age,vary;
        double distance,normalTutar,yasİndirimi,gidişDönüşİndirimi,indirimliTutar,toplamTutar ;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        distance= input.nextDouble();
        
        System.out.print("Yaşınızı giriniz: ");
        age= input.nextInt();
        
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        vary= input.nextInt();
        
        if ((distance>0 && age > 0) && (vary==1)){
        normalTutar = distance*0.10;
        if (age<12){
        yasİndirimi=normalTutar*0.50;
        indirimliTutar=normalTutar-yasİndirimi;
        System.out.println("İndirimli Tutar: " + indirimliTutar);       
        }
        else if (age>=12 && age<=24){
        yasİndirimi=normalTutar*0.10;
        indirimliTutar=normalTutar-yasİndirimi;
        System.out.println("İndirimli Tutar: " + indirimliTutar);
        }
        else if (age>65){
        yasİndirimi=normalTutar*0.30;
        indirimliTutar=normalTutar-yasİndirimi;
        System.out.println("İndirimli Tutar: " + indirimliTutar);
        }
        else {
        normalTutar=distance*0.10;
        System.out.println("Normal Tutar: " + normalTutar);
        }
        }
        else if ((distance>0 && age > 0) && (vary==2)){
            normalTutar=distance*0.10;
            gidişDönüşİndirimi=normalTutar*0.20;
            indirimliTutar=normalTutar-gidişDönüşİndirimi;
            toplamTutar=indirimliTutar*2;
         
        if (age<12){
        yasİndirimi=toplamTutar*0.50;
        indirimliTutar=toplamTutar-yasİndirimi;
        System.out.println("Toplam Tutar: " + indirimliTutar );       
        }
        else if (age>=12 && age<=24){
        yasİndirimi=normalTutar*0.10;
        indirimliTutar=normalTutar-yasİndirimi;
        System.out.println("İndirimli Tutar: " + indirimliTutar);
        }
        else if (age>65){
        yasİndirimi=normalTutar*0.30;
        indirimliTutar=normalTutar-yasİndirimi;
        System.out.println("İndirimli Tutar: " + indirimliTutar);
        }
        else {
        normalTutar=distance*0.10;
        System.out.println("Normal Tutar: " + normalTutar);
        }
        }
        
        else {
        System.out.println("Hatalı veri girdiniz");
        }
    
}
}