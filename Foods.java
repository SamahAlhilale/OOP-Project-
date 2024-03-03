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
public class Foods {
   public static int numberOfFood= 0 ;
   protected double price=0;
   protected String type="" ;
   protected int quantity=0 ;
   protected String expirationDate="" ;
   protected Milk milk;
   protected CoffeeBeans coffeeBeans;
   protected Sugar sugar;

   

    public Foods() {         
      
    }
    public Foods(String type, int quantity, String expirationDate,double price) {
        this.type = type;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.price= price;
    }

    public Foods( int quantity,String expirationDate,double price) {
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Milk getMilk() {
        return milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    public CoffeeBeans getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(CoffeeBeans coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
