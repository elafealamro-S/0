/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lap01;

import java.util.Scanner;
public class NewMain7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of ketters;");
        int N = in.nextInt();
        int c1 = 0 ,c2 = 0;
        
        char[] L = new char [N];
        
        System.out.print("the letter are:");
        
        for(int i = 0 ; i < N ; i++){
            L[i] = (char)('a' + (Math.random()*26));
            System.out.print(L[i]+" ");
            
            if(L[i]=='a' || L[i]=='o' || L[i]=='i' || L[i]=='u' ||L[i]=='e')
                c1++;
            else
                c2++;   
        }
        System.out.println("");
        
        if(c1>c2)
            System.out.println("vowels");
        else
            System.out.println("con");
        
    }
    
}
