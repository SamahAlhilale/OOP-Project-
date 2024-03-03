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
public class CoffeeBeans extends Foods {
 protected String CoffeeBeansCountry="";
           
    public CoffeeBeans() {
    }

    public CoffeeBeans(String CoffeeBeansCountry) {
        this.CoffeeBeansCountry = CoffeeBeansCountry;
    }

    public CoffeeBeans(String CoffeeBeansCountry, String type, int quantity, String expirationDate, double price) {
        super(type, quantity, expirationDate,price);
        this.CoffeeBeansCountry = CoffeeBeansCountry;
    }
    

    public String getCoffeeBeansCountry() {
        return CoffeeBeansCountry;
    }

    public void setCoffeeBeansCountry(String CoffeeBeansCountry) {
        this.CoffeeBeansCountry = CoffeeBeansCountry;
    }
    @Override
    public String toString() {
    return "The Coffee Beans type is: " + type + "\n" 
    + "The Coffee Beans Country is: " + CoffeeBeansCountry + "\n"
    + "The Coffee Beans quantity is: " + quantity  + "\n" 
    + "The COffee Beans expiration Date is: " + expirationDate + "\n"
    +"The Coffe Beans Price is: " + price;
    }

  
}
