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
public class Sugar extends Foods { 
   private String suagrType;

    public Sugar() {
    }

    public Sugar(String suagrType) {
        this.suagrType = suagrType;
    }

    public Sugar(String SugarType,int quantity,String expirationDate, double price) {
        super(quantity, expirationDate, price);
    }

    public String getSugarType() {
        return suagrType;
    }

    public void setSugarType(String suagrType) {
        this.suagrType = suagrType;
    }

    @Override
    public String toString() {
        return "The Sugar Type is: " + suagrType + "\n"
        + "The Sugar quantity is: " + quantity + "\n" 
        + "The sugar expiration date is: " + expirationDate + "\n"
          + "The Sugar Price is: " + price ; 
    }
 
}
