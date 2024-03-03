/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeemanagementsystem;

import static com.mycompany.coffeemanagementsystem.CoffeeManagementSystemTEST.counter;

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

public class Receipt implements Pricing {
 protected static int numberOfReceipt=0;
 protected static double totalPrice;
 Receipt [] receipt;
 protected String coffeeOwnersName;
 protected String coffeeName;
 protected long coffeePhoneNumber;
 protected Suppliers supplier ;
 protected Supplies supplies ;
 protected Supplies food;
 protected Supplies machine;
 protected PaymentMethod paymentMethod;
 protected long creditCard ;
 protected double cashOnDelivery;



    public Receipt() {
         receipt =new Receipt[100]; 
    }
    

    public Receipt(String coffeeName, long coffeePhoneNumber, PaymentMethod paymentMethod) {
        this.coffeeName = coffeeName;
        this.coffeePhoneNumber = coffeePhoneNumber;
        this.paymentMethod = paymentMethod;
    }

    public Receipt(PaymentMethod paymentMethod, long creditCard, double cashOnDelivery) {
        this.paymentMethod = paymentMethod;
        this.creditCard = creditCard;
        this.cashOnDelivery = cashOnDelivery;
    }
    
    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public long getCoffeePhoneNumber() {
        return coffeePhoneNumber;
    }

    public void setCoffeePhoneNumber(long coffeePhoneNumber) {
        this.coffeePhoneNumber = coffeePhoneNumber;
    }

    public Supplies getMachine() {
        return machine;
    }

    public void setMachine(Supplies machine) {
        this.machine = machine;
    }
    

    public String getCoffeeOwnersName() {
        return coffeeOwnersName;
    }

    public Suppliers getSupplier() {
        return supplier;
    }

    public void setSupplier(Suppliers supplier) {
        this.supplier = supplier;
    }

    public Supplies getSupplies() {
        return supplies;
    }

    public void setSupplies(Supplies supplies) {
        this.supplies = supplies;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public double getCashOnDelivery() {
        return cashOnDelivery;
    }

    public void setCashOnDelivery(double cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }


    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    
    public void addReceipt  (Receipt r){
      receipt[numberOfReceipt] = r;
       numberOfReceipt++;
    }
 
  public static double getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(double totalPrice) {
        Receipt.totalPrice = totalPrice;
    }

    public Supplies getFood() {
        return food;
    }

    public void setFood(Supplies food) {
        this.food = food;
    }

    public static int getNumberOfReceipt() {
        return numberOfReceipt;
    }

    public static void setNumberOfReceipt(int numberOfReceipt) {
        Receipt.numberOfReceipt = numberOfReceipt;
    }
    
    @Override
    public double calculatePrice(double p) {
        
    return supplies.calculatePrice(p); 
}
    
    
     @Override
    public String toString() {
        return "*************************************" + "\n" 
               +"(THANK YOU FOR YOUR ORDER) " + "\n" 
                + "COFFEE SHOP NAME: " +coffeeName+ "\n" 
                + "COFFEE SHOP PHONE NUMBER: " + coffeePhoneNumber +"\n"
                + "THE CHOOSEN SUPPLIER: " + supplier.toString() + "\n" 
                + "THE CHOOSEN SUPPLIES: \n" + supplies.toString() +"\n"
                + "TOTAL PRICE: " + supplies.calculatePrice(totalPrice) + "\n" + "PAYMENT METHOD: "+ paymentMethod.toString() + "\n" 
                +"ALL PRICES INCLUDE VAT" + "\n"
                +"*************************************" ;
    }
    
    }


