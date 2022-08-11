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
public class RcycleArray {
    
    static boolean isFind(int[] arr, int value){
        for (int i : arr) {
            if (i == value){
                return true;
            
            }
        }
        return false;

    }
    
    public static void main (String[] args) {
    
        int[] list = {3,7,3,5,2,8,10,21,1,33,8,1};
        
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        
        for (int i=0; i< list.length;i++){
            for (int j=0; j<list.length;j++) {
                if(!isFind(duplicate, list[i])) {
                if((i!=j) && (list[i]==list[j])&& (list[i]%2==0)) {
                duplicate[startIndex++]=list[j];
                break;
                }
                }
            }  
        }
        
        for (int value : duplicate){
            if(value !=0){
                System.out.println(value);
            
            }
        
        }
        
      
    
    }
}
