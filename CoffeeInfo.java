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
public class CoffeeInfo {
    protected String coffeeOwnersName;
    protected String coffeeName ;
    protected long coffeePhoneNumber;
    private String coffeeWorkingHours ;

    public CoffeeInfo() {
    }

    public CoffeeInfo(String coffeeOwnersName,String coffeeName, long coffeePhoneNumber, String coffeeWorkingHours) {
        this.coffeeOwnersName= coffeeOwnersName;
        this.coffeeName = coffeeName;
        this.coffeePhoneNumber = coffeePhoneNumber;
        this.coffeeWorkingHours = coffeeWorkingHours;
    }

    public String getCoffeeOwnersName() {
        return coffeeOwnersName;
    }

    public void setCoffeeOwnersName(String coffeeOwnersName) {
        this.coffeeOwnersName = coffeeOwnersName;
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

    public String getCoffeeWorkingHours() {
        return coffeeWorkingHours;
    }

    public void setCoffeeWorkingHours(String coffeeWorkingHours) {
        this.coffeeWorkingHours = coffeeWorkingHours;
    }

    @Override
    public String toString() {
        return " The Coffee Name is: "+ coffeeName  + "\n"
             +  "\nThe Coffee Phone Number is: " + coffeePhoneNumber + "\n"
              + "\n The Coffee Working Hours are: " + coffeeWorkingHours ;
    }

}
