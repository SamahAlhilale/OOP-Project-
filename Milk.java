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
public class Milk extends Foods {
      private String milkType;
      
    public Milk() {
    }

    public Milk(String type,String milkType, int quantity, String expirationDate, double price) {
        super(type,quantity, expirationDate, price);
        this.milkType= milkType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }
    
    @Override
    public String toString() {
        return "The Milk you choosed is: "+ type + "\n"
              + "The Type is: " + milkType + "\n"
               + "The Quantity is: " + quantity + "\n" 
               + "the Expiration date is: " + expirationDate + "\n" 
               + "The Price is: " + price; 
    }
  
    
}
