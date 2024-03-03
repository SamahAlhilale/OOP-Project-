/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeemanagementsystem;

import java.util.Objects;

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
public class Suppliers {
private String supplierName;


public Suppliers() {
	super();
}
public Suppliers(String supplierName) {
	super();
	this.supplierName = supplierName;

}

public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}


    @Override
    public boolean equals(Object obj) { 
        if (this.supplierName == "Food Supplier") {
            return true;
        }
        if (this.supplierName == "Machines Supplier") {
            return true;
        }
        return true;
    }

    @Override
    public String toString() {
        return supplierName;
        }
    }
    
   
