/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeemanagementsystem;


/**
 *
 * @author samah
 */
/*
Students: 
G6-1
LEADER : Samah humood alhilale (441008110)
Amnah zuhair alshaibi (442003404)
Rehab khairallah almujeirishi (443002513)
Jana Ismail Alsaeidi (443000278)
Shaima abdulrahman alsufyani (443004657)
Aisha Omar Ibrahim (442018688)
*/
public class Supplies implements Pricing {
public static int numberOfSupplies= 0 ;
Foods [] allFood; 
Machines[] allMachine;
public static int machineQuantity = 0;
public static int foodQuantity =0;
double foodTotal;
double machineTotal;

    public Supplies() {
        allFood=new Foods[100]; 
        allMachine=new Machines[100];
        
    }
    
    public Supplies(Foods[] food, Machines[] machine) {
        this.allFood = food;
        this.allMachine = machine;
    }

    public Foods[] getFood() {
        return allFood;
    }

    public void setFood(Foods[] food) {
        this.allFood = food;
    }

    public Machines[] getMachine() {
        return allMachine;
    }

    public void setMachine(Machines[] machine) {
        this.allMachine = machine;
    }
    
    public void addFood (Foods f){
    allFood[foodQuantity] = f;
   foodQuantity++;
}
    
    public void addMachines(Machines m){
     allMachine[machineQuantity] = m;
     machineQuantity++;  
 } 
   
     public void printFood(){
      for (int i=0;i<foodQuantity;i++)
          System.out.println(allFood[i]);
   }
     
   public void printMachine(){
       for (int i=0;i<machineQuantity;i++)
         System.out.println(allMachine[i]);
   }
   
   public void printSupplies(){
       printFood();
       printMachine();
   }

  
   public double machinePrice (double m){
       machineTotal =0;
        for (int i=0;i<machineQuantity;i++){
          machineTotal = machineTotal+allMachine[i].getPrice();
        }     
          return machineTotal;
   }

   public double foodPrice (double f){ 
       foodTotal=0;
       for (int i=0;i<foodQuantity;i++){
           foodTotal = foodTotal+allFood[i].getPrice();
       }
       return foodTotal;   
   }
     
    @Override
   public double calculatePrice(double p) {
     double totalPrice= foodPrice(p)+machinePrice(p);
       return totalPrice;
        
   }

    @Override
    public String toString() {
        String food = "";
        String machine = "";
        for (int i=0 ; i<allFood.length;i++){
            if (allFood[i] != null){
          food += allFood[i].getType() +"\n"
         + "QTY: " + "\n"+ allFood[i].getQuantity() + "\n"
         + "Price: " + "\n"+ allFood[i].getPrice()+"\n";
             }
            
               } 
           for (int i=0 ; i<allMachine.length;i++){
           if (allMachine[i] != null){
           machine += allMachine[i].getMachineType() +"\n"
          +"QTY: " + "\n" + allMachine[i].getQuantity() + "\n"
          +"PRICE: " + "\n" + allMachine[i].getPrice(); 
        }
       }    
       return food + machine;
    }
}
  
   
