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
public class CreditCard  extends PaymentMethod {
	private String creditCardOwnerName = "";
	private long creditCardNumber = 0;
	private int creditCardExpirationMonth = 0;
	private int creditCardExpirationYear = 0;
	private int creditCardCVC = 0;
	
	public CreditCard() {
		super();
	}
	
	public CreditCard(String creditCardOwnerName, long creditCardNumber, int creditCardExpirationMonth,
			int creditCardExpirationYear, int creditCardCVC) {
		super();
		this.creditCardOwnerName = creditCardOwnerName;
		this.creditCardNumber = creditCardNumber;
		this.creditCardExpirationMonth = creditCardExpirationMonth;
		this.creditCardExpirationYear = creditCardExpirationYear;
		this.creditCardCVC = creditCardCVC;
	}

	public String getCreditCardOwnerName() {
		return creditCardOwnerName;
	}
	public void setCreditCardOwnerName(String creditCardOwnerName) {
		this.creditCardOwnerName = creditCardOwnerName;
	}
	public long getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public int getCreditCardExpirationMonth() {
		return creditCardExpirationMonth;
	}
	public void setCreditCardExpirationMonth(int creditCardExpirationMonth) {
		this.creditCardExpirationMonth = creditCardExpirationMonth;
	}
	public int getCreditCardExpirationYear() {
		return creditCardExpirationYear;
	}
	public void setCreditCardExpirationYear(int creditCardExpirationYear) {
		this.creditCardExpirationYear = creditCardExpirationYear;
	}
	public int getCreditCardCVC() {
		return creditCardCVC;
	}
	public void setCreditCardCVC(int creditCardCVC) {
		this.creditCardCVC = creditCardCVC;
	}
	
       public boolean equals (CreditCard obj1) { // Appficial youtube channel video: Overriding the Object equals Method - Java Override Example - Comparing Objects -
       CreditCard c = (CreditCard )obj1;
        if (! this.getCreditCardOwnerName().equals(c.getCreditCardOwnerName())) {
        return false;
        }
        if (this.getCreditCardNumber() != c.getCreditCardNumber()){
        return false;
        }
        if (this.getCreditCardExpirationMonth() != c.getCreditCardExpirationMonth()){
        return false;
        }
        if (this.getCreditCardExpirationYear() != c.getCreditCardExpirationYear()){
        return false;
        }
        if (this.getCreditCardCVC() != c.getCreditCardCVC()){
            return false;
        }
        return true;
       }
}
