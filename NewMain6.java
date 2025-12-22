/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lap01;


public class NewMain6 {

  
    public static void main(String[] args) {
        String st1 = "Ahmad";
        String st2 = "Asaad";
        int n = st1.length();
        
        for(int i = 0 ; i < n ;i++){
           if(st1.charAt(i) == st2.charAt(i)) 
                System.out.print(st1.toLowerCase().charAt(i));
           else
                System.out.print("-");
            
        }
       
    }
    
}
