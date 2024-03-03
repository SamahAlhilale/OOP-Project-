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
public class PaymentMethod {
protected String paymentMethod;
protected CashOnDelivery cashOnDelivery;
protected CreditCard creditCard;

public PaymentMethod(){	
}

public PaymentMethod(CashOnDelivery cashOnDelivery, CreditCard creditCard) {
    this.cashOnDelivery = cashOnDelivery;
    this.creditCard = creditCard;
}
public CashOnDelivery getCashOnDelivery() {
    return cashOnDelivery;
}

public void setCashOnDelivery(CashOnDelivery cashOnDelivery) {
    this.cashOnDelivery = cashOnDelivery;
}

public CreditCard getCreditCard() {
    return creditCard;
}

public void setCreditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
}

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return getPaymentMethod();
    }
    
}
