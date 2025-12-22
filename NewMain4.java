/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lap01;

import java.util.Scanner;
public class NewMain4 {

  public static void DisplayShippingInformation (String name , String ID){
        System.out.println("Your name is: " + name);
        System.out.println("Package Tracking Number is: " + (int)(Math.random()*100) + "-" + ID);
        
    }
   
    public static double CalculateCost (String shippingType, double packageWeight, boolean isFragile, boolean isAbroad){
       final double FRAGILE_COST = 0.15;
       final double ABROAD_COST = 200;
       double cost = 0;
       double totalcost = cost;
      
        
        if (packageWeight < 500){
            if (shippingType.equals("Normal"))
            cost += 100;
        }   
        if (packageWeight < 500){
            if (shippingType.equals("Express"))
            cost += 150;
        }   
        if (packageWeight >= 500){
            if (shippingType.equals("Normal"))
            cost += 200;
        }   
        if (packageWeight >= 500){
            if (shippingType.equals("Express"))
            cost += 300; 
        }   
      
        
        if (isFragile)
            totalcost += cost * FRAGILE_COST ;
        if (isAbroad)
            totalcost += ABROAD_COST;
           
        
        return totalcost;
       
         }

    
    
    public static void main(String[] args) {
     Scanner in = new Scanner(System .in) ;
     
     
     boolean booleanans = true;
     while(booleanans){
         System.out.println("------------------------------------------------------------------");
         System.out.println("");
         System.out.println("******************** Packages Shipping System ********************");
         System.out.println("");
         
         System.out.print("Enter your first name: ");
         String name = in.next();
         
         System.out.print("Enter your National ID:");
         String ID = in.next();
         
         System.out.print("Enter package weight: ");
         double weight = in.nextDouble();
          
         
         System.out.print("Enter the shipping type (Normal or Express):");
         String type = in.next();
         
         System.out.print("Is the package fragile? (enter true or false as an answer): ");
         boolean isFragile = in.nextBoolean();
          
         
         System.out.print("Is the shipping destination abroad? (enter true or false as an answer):");
         boolean isAbroad = in.nextBoolean();
          
         
         System.out.println("");
         System.out.println("------------------------------------------------------------------");
         System.out.println("");
         
         
         DisplayShippingInformation(name, ID);
         
         System.out.println("Your shipping type is " + type + ", and your package weighs " + weight + "grams");
         System.out.print("The total cost to be paid is: " + CalculateCost(type , weight , isFragile , isAbroad) );
         System.out.println("");
         System.out.println("------------------------------------------------------------------");
         System.out.println("");
         System.out.print("Do you want to ship another package? (Yes/no): ");
           String ans = in.next();
           
          if (ans.equals("No")){
              booleanans = false;
              System.out.println("");
              System.out.println("------------------------------------------------------------------");
              System.out.println("");
              System.out.println("…Exiting the system…");
              System.out.println("");
              System.out.println("------------------------------------------------------------------");
           }
        }
    }
}
    

