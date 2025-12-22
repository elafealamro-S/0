/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lap01;
import java.util.Scanner;
public class NewMain5 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a string:");
        String S = in.next();
        
        System.out.println("Total odd digits:" + countOddDigts(S , S.length()));
        
    }
    
    
    public static int countOddDigts(String st , int lingth){
       int count = 0 ;
       
        for(int i = 0 ; i < lingth ; i++){
            char Sch = st.charAt(i);
             
             if(Sch == '1' || Sch == '3' || Sch == '5' || Sch == '7' ||Sch == '9')
                 count++;                                
        }
        return count;
    }
    
}
