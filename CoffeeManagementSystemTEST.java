/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
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
/*
*/
import java.util.*;

public class CoffeeManagementSystemTEST { 
    static int counter=0;
    public static void main(String[] args) {
       int userchoice = 0 ;
       Scanner input= new Scanner (System.in);
       Supplies supplies = new Supplies (); 
       Supplies allSupplies [] = new Supplies[100];
       Foods foods [] = new Foods [100];
       Machines machines [] = new Machines [100];
       Suppliers suppliers = new Suppliers ();
       Machines machine = new Machines (); 
       Foods food = new Foods();
       JobsDetails jobDetails = new JobsDetails();
       CoffeeInfo coffeeInfo= new CoffeeInfo ();
       PaymentMethod paymentMethod = new PaymentMethod ();
       CreditCard creditCard= new CreditCard();
       CashOnDelivery cashOnDelivery = new CashOnDelivery();
       
       CreditCard creditCard2 = new CreditCard ("samah",471123456,2,2027,123); /*this setted values will be only for the lucky customer*/
       
       
       System.out.println("*** Welcome to Our Coffee Shops Management System ***");

           do { // IF USER IS A COFFEE OWNER 
            System.out.println
                       (" >> (1). Adding Coffee information \n"
                      + " >> (2). Hire employees\n"
                      + " >> (3). Order Supplies\n" 
                      + " >> (4). Print Receipt\n" // display the choosen supplies with price
                      + " >> (5). Update Receipt information\n"
                      + " >> (6). Rate The Service\n"
                      + " >> (7). Quit The Program");
                     userchoice=input.nextInt();
            
              switch (userchoice){  
                  case 1:
                  // Adding coffee information
                    System.out.println("kindly, Enter your name");
                    String coffeeOwnersName= input.next();
                    coffeeInfo.setCoffeeOwnersName(coffeeOwnersName);
                    
                    System.out.println("Welcome "+coffeeOwnersName+ " :)");
                    
                    System.out.println("Kindly, Enter you Coffee Shop name: ");
                    String coffeeName = input.next();
                    coffeeInfo.setCoffeeName(coffeeName);
                    
                    
                    try {
                    System.out.println("Kindly, Enter your phone number: ");
                    long coffeePhoneNumber = input.nextLong();
                    coffeeInfo.setCoffeePhoneNumber(coffeePhoneNumber);
                    }catch (Exception e){
                    System.out.println("YOU HAVE ENTERED A STRING INSTEAD OF NUMBERS");
                    main(args);
                    }
                    
                    System.out.println("Kindly, Pick from this list your coffee shop ((Working Hours)) and ((Working Days))\n "
                    + ">> (1). FROM Sunday TO Thursday (7:30AM) TILL (1AM) ,ON fridays FROM (11:30PM) TILL (3AM)\n "
                    + ">> (2). FROM Sunday TO Tuesday (10:30AM) TILL (11PM) ,ON weekends FROM (3:30PM) TILL (3AM)");
                    userchoice= input.nextInt();
                    String coffeeWorkingHours="";
                               
                    if (userchoice==1){
                   coffeeWorkingHours= "FROM Sunday TO Thursday (7:30AM) TILL (1AM) - ON fridays FROM (11:30PM) TILL (3AM)";
                    }
                    else if (userchoice==2){
                    coffeeWorkingHours= "FROM Sunday TO Tuesday (10:30AM) TILL (11PM) - ON weekends FROM (3:30PM) TILL (3AM)";
                    }
                    
                   coffeeInfo = new CoffeeInfo (coffeeOwnersName,coffeeName, coffeeInfo.getCoffeePhoneNumber(), coffeeWorkingHours);
                   System.out.println(coffeeInfo.toString());
                  
                      break; 
                      
                  case 2:
                   // Hire employees
                    do{
                System.out.println
                ("Kindly, Choose the job title you would like to hire \n"
                + " >> (1). Cashier \n"
                + " >> (2). Barista \n"
                + " >> (3). Waiter \n"
                + " >> (4). Delivery Employee\n"
                + " >> (5). Quit the list ");
                userchoice = input.nextInt();
                        
                if (userchoice==1){
                String jobName = "Cashier";
                jobDetails.setJobName(jobName);
                             
                System.out.println("Enter the salary: ");  
                double salary= input.nextDouble();
                jobDetails.setSalary(salary);
                         
                System.out.println("Kindly, Choose the suitable Working Hours\n"
                + " >> (1). (AM shift) FROM (7:30AM) TILL (12PM)\n"
                + " >> (2). (PM shift) FROM (12PM) TILL (1AM)\n "
                + " >> (3). (PM shift) FROM (12PM) TILL (11PM)\n ");   
                userchoice= input.nextInt();
                String workingHours="";
                
                if (userchoice==1) 
                jobDetails.setWorkingHours("(AM shift) FROM (7:30AM) TILL (12PM)");
                             
                if (userchoice==2)
                jobDetails.setWorkingHours("(PM shift) FROM (12PM) TILL (1AM)");
                                 
                if (userchoice==3)
                jobDetails.setWorkingHours("(PM shift) FROM (12PM) TILL (11PM)");
                                    
                System.out.println("Kindly, Choose the suitable Working days\n"
                + " >> (1). FROM Sunday TILL friday\n "
                + " >> (2). FROM monday TILL Saturday"); 
                userchoice= input.nextInt();
                String workingDays="";
                             
                if (userchoice ==1)
                jobDetails.setWorkingDays("FROM Sunday TILL friday");
                            
                if (userchoice ==2)
                jobDetails.setWorkingDays("FROM monday TILL Saturday");
                             
                System.out.println("Enter the required Working Experience\n "
                + " >> (1). NO REQUIRED EXPERIENCE\n"
                + " >> (2). 1 TO 2 years Working Experience\n"
                + " >> (3). 5 years Working Experience");
                userchoice= input.nextInt();
                String requiredWorkingExperience="";
                        
                if (userchoice==1)
                jobDetails.setRequiredWorkingExperience("NO REQUIRED EXPERIENCE ");
                        
                if (userchoice==2)
                jobDetails.setRequiredWorkingExperience("1 TO 2 years Working Experience");
                        
                if (userchoice==3)
                jobDetails.setRequiredWorkingExperience(" 5 years Working Experience");
                        
                JobsDetails jobsDetails= new JobsDetails (jobName,salary,workingHours,workingDays ,requiredWorkingExperience);
                 System.out.println(jobDetails.toString());
                }
                
                else if (userchoice==2){
                String jobName1 = "Barista";
                jobDetails.setJobName(jobName1);
                                 
                System.out.println("Enter the salary: ");
                double salary1= input.nextDouble();
                jobDetails.setSalary(salary1);
                             
                System.out.println("Kindly, Choose the suitable Working Hours\n"
                + " >> (1). (AM shift) FROM (7:30AM) TILL (12PM)\n"
                + " >> (2). (PM shift) FROM (12PM) TILL (1AM)\n "
                + " >> (3). (PM shift) FROM (12PM) TILL (11PM)\n ");  
                userchoice= input.nextInt();
                String workingHours1= ""; 
                
                if (userchoice==1) 
                jobDetails.setWorkingHours("(AM shift) FROM (7:30AM) TILL (12PM)");
                             
                if (userchoice==2)
                jobDetails.setWorkingHours("(PM shift) FROM (12PM) TILL (1AM)");
                              
                if (userchoice==3) 
                jobDetails.setWorkingHours("(PM shift) FROM (12PM) TILL (11PM)");
                              
                System.out.println("Kindly, Choose the suitable Working days\n"
                + " >> (1). FROM Sunday TILL friday \n "
                + " >> (2). FROM monday TILL Saturday");
                userchoice= input.nextInt();
                String workingDays1=""; 
                                   
                if (userchoice ==1)
                jobDetails.setWorkingDays("FROM Sunday TILL friday");
                                 
                if (userchoice ==2)
                jobDetails.setWorkingDays("FROM monday TILL Saturday");
                                 
                System.out.println("Enter the required Working Experience\n "
                + " >> (1). NO REQUIRED EXPERIENCE\n"
                + " >> (2). 1 TO 2 years Working Experience\n"
                + " >> (3). 5 years Working Experience");
                userchoice= input.nextInt();
                String requiredWorkingExperience1="";  
                
                if (userchoice==1)
                jobDetails.setRequiredWorkingExperience("NO REQUIRED EXPERIENCE ");
                             
                if (userchoice==2)
                jobDetails.setRequiredWorkingExperience("1 TO 2 years Working Experience");
                              
                if (userchoice==3)
                jobDetails.setRequiredWorkingExperience(" 5 years Working Experience");
                
                JobsDetails jobsDetails1= new JobsDetails (jobName1,salary1,workingHours1,workingDays1 ,requiredWorkingExperience1);
                 System.out.println(jobDetails.toString());
                }
                
                else if (userchoice==3){
                String jobName2 = "Waiter";
                jobDetails.setJobName(jobName2);
                                 
                System.out.println("Enter the salary: ");
                double salary2= input.nextDouble();
                jobDetails.setSalary(salary2);
                             
                System.out.println("Kindly, Choose the suitable Working Hours\n"
                + " >> (1). (AM shift) FROM (7:30AM) TILL (12PM)\n"
                + " >> (2). (PM shift) FROM (12PM) TILL (1AM)\n "
                + " >> (3). (PM shift) FROM (12PM) TILL (11PM)\n ");  
                userchoice= input.nextInt();
                String workingHours2= ""; 
                              
                if (userchoice==1) 
                jobDetails.setWorkingHours("(AM shift) FROM (7:30AM) TILL (12PM)");
                             
                if (userchoice==2)
                jobDetails.setWorkingHours("(PM shift) FROM (12PM) TILL (1AM)");
                                 
                if (userchoice==3)
                jobDetails.setWorkingHours("(PM shift) FROM (12PM) TILL (11PM)");
                System.out.println("Kindly, Choose the suitable Working days\n"
                + " >> (1). FROM Sunday TILL friday \n "
                + " >> (2). FROM monday TILL Saturday");
                userchoice= input.nextInt();
                
                String workingDays2=""; 
                
                if (userchoice ==1)
                jobDetails.setWorkingDays("FROM Sunday TILL friday");
                
                if (userchoice ==2)
                jobDetails.setWorkingDays("FROM monday TILL Saturday");
                
               
                System.out.println("Enter the required Working Experience\n "
                + " >> (1). NO REQUIRED EXPERIENCE\n"
                + " >> (2). 1 TO 2 years Working Experience\n"
                + " >> (3). 5 years Working Experience");
                userchoice= input.nextInt();
                String requiredWorkingExperience2=""; 
                
                if (userchoice==1)
                jobDetails.setRequiredWorkingExperience("NO REQUIRED EXPERIENCE ");
                
                if (userchoice==2)
                jobDetails.setRequiredWorkingExperience("1 TO 2 years Working Experience");
                
                if (userchoice==3)
                jobDetails.setRequiredWorkingExperience(" 5 years Working Experience");
          
                JobsDetails jobsDetails2= new JobsDetails (jobName2,salary2,workingHours2,workingDays2,requiredWorkingExperience2);
                 System.out.println(jobDetails.toString());
                }   
                    
                else if (userchoice==4) {
                String jobName3 = "Waiter";
                jobDetails.setJobName(jobName3);
                
                System.out.println("Enter the salary: ");
                 double salary3= input.nextDouble();
                jobDetails.setSalary(salary3);
                
                System.out.println("Kindly, Choose the suitable Working Hours\n"
                + " >> (1). (AM shift) FROM (7:30AM) TILL (12PM)\n"
                + " >> (2). (PM shift) FROM (12PM) TILL (1AM)\n "
                + " >> (3). (PM shift) FROM (12PM) TILL (11PM)\n ");  
                userchoice= input.nextInt();
                String workingHours3= ""; 
                
                if (userchoice==1) 
                jobDetails.setWorkingHours("(AM shift) FROM (7:30AM) TILL (12PM)");
                
                if (userchoice==2)
                jobDetails.setWorkingHours("(PM shift) FROM (12PM) TILL (1AM)");
                
                if (userchoice==3)
                jobDetails.setWorkingHours("(PM shift) FROM (12PM) TILL (11PM)");
                
                System.out.println("Kindly, Choose the suitable Working days\n"
                + " >> (1). FROM Sunday TILL friday \n "
                + " >> (2). FROM monday TILL Saturday");
                userchoice= input.nextInt();
                
                String workingDays3="";  
                if (userchoice ==1)
                    
                jobDetails.setWorkingDays("FROM Sunday TILL friday");
                if (userchoice ==2)
                    
                jobDetails.setWorkingDays("FROM monday TILL Saturday");
                userchoice= input.nextInt();
                
                System.out.println("Enter the required Working Experience\n "
                + " >> (1). NO REQUIRED EXPERIENCE\n"
                + " >> (2). 1 TO 2 years Working Experience\n"
                + " >> (3). 5 years Working Experience");
                userchoice= input.nextInt();
                    
                String requiredWorkingExperience3="";  
                if (userchoice==1)
                jobDetails.setRequiredWorkingExperience("NO REQUIRED EXPERIENCE ");
                
                if (userchoice==2)
                jobDetails.setRequiredWorkingExperience("1 TO 2 years Working Experience");
                
                if (userchoice==3)
                jobDetails.setRequiredWorkingExperience(" 5 years Working Experience");
          
                JobsDetails jobsDetails3= new JobsDetails (jobName3,salary3,workingHours3,workingDays3,requiredWorkingExperience3);
                 System.out.println(jobDetails.toString());
                }
                
                } while (userchoice<5);
                              break;
                              
                  case 3: 
                    // order supplies 
                   System.out.println("(TO MAKE AN ORDER)\nPlease Choose The Supplier you would like to order from:\n"
                    + " >> (1). Supplier [1] (food supplier)\n"
                    + " >> (2). Supplier [2] (machine supplier)"); 
                    userchoice= input.nextInt();
                    
                    Milk milk =new Milk (); 
                    Sugar sugar= new Sugar ();
                    CoffeeBeans coffeeBeans = new CoffeeBeans(); 
                    
                   if (userchoice==1){  
           
                    suppliers.setSupplierName("Food Supplier");
                    suppliers.equals("Food Supplier"); 

                    System.out.println ("FOOD LIST:\n"
                    + " >> (1). *MILK*\n"
                    + " >> (2). *SUGAR*\n"
                    + " >> (3). *COFFEE BEANS*\n");
                  int userchoiceC= input.nextInt();  
                    
                    if (userchoiceC==1){
                    food.setMilk(milk);         
                    System.out.println("Supply [MILK] is Avilable\n"
                    + " >> (1). Cow Milk\n"
                    + " >> (2). Coconut Milk\n"
                    + " >> (3). Soy Milk");
                    userchoice=input.nextInt();
                              
                    if (userchoice==1) {
                    System.out.println("Cow Milk Comes As\n"
                    + " >> (1). No-Fat milk\n"
                    + " >> (2). Low-Fat milk\n" 
                    + " >> (3). Full-fat milk");
                    int userchoice1=input.nextInt();  
                    
                    if (userchoice1 ==1 || userchoice1 ==2 || userchoice1 ==3) {
                        
                    System.out.println("Please Enter The Quantity IN ITS NUMBERS for (Cow Milk)\n"
                    + " >> (1). FOR (50) QUANTITY OF MILK (price : 547.5  SAR [VAT INCLUDED])\n"
                    + " >> (2). FOR (100) QUANTITY OF MILK (price : 1,095 SAR [VAT INCLUDED])");
                    int userchoice2= input.nextInt();
                    milk.setExpirationDate("01/04/2023"); 
                    
                    if (userchoice1==1 && userchoice2==1 ){
                    milk.setType("Cow milk");
                    milk.setMilkType("No-Fat milk");
                    milk.setPrice(547.5);
                    milk.setQuantity(50);
                    supplies.foodPrice(547.5);
                    }
                    else if (userchoice1 == 1 && userchoice2==2){
                    milk.setType("Cow milk");
                    milk.setMilkType("No-Fat milk");
                    milk.setPrice(1095);
                    milk.setQuantity(100);
                    supplies.foodPrice(1095);
                    }
                     
                    
                    else if (userchoice1==2  && userchoice2 == 1){
                    milk.setType("Cow milk"); 
                    milk.setMilkType("Low-Fat milk");
                    milk.setPrice(547.5);
                    milk.setQuantity(50);
                    supplies.foodPrice(547.5);
                    }
                    
                    else if (userchoice1==2 && userchoice2 == 2){
                    milk.setType("Cow milk"); 
                    milk.setMilkType("Low-Fat milk");
                    milk.setPrice(1095);
                    milk.setQuantity(100);
                    supplies.foodPrice(1095);
                    }
                    else if (userchoice1==3 && userchoice2==1){
                    milk.setType("Cow milk"); 
                    milk.setMilkType("Full-fat milk");
                    milk.setPrice(547.5);
                    milk.setQuantity(50);
                    supplies.foodPrice(547.5);
                    }
                    
                    else if (userchoice1==3 && userchoice2==2){
                    milk.setType("Cow milk"); 
                    milk.setMilkType("Full-fat milk");
                    milk.setPrice(1095);
                    milk.setQuantity(100);
                    supplies.foodPrice(1095);
                    }
                        } 
                         } // end cow milk
                    
                    else if (userchoice==2){
                     System.out.println("Coconut Milk comes as\n"
                      + " >> (1). No-Fat milk\n"
                      + " >> (2). Low-Fat milk\n"
                      + " >> (3). Full-fat milk");
                      int userchoice1 =input.nextInt(); 
                        
                        if (userchoice1==1 || userchoice1==2 || userchoice1==3){
                         System.out.println("Please Choose The Quantity IN ITS NUMBERS for (Coconut Milk)\n"
                         + " >> (1). FOR (50) QUANTITY OF MILK (price : 1,265  SAR [VAT INCLUDED])\n"
                         + " >> (2). FOR (100) QUANTITY OF MILK (price : 2,530 SAR [VAT INCLUDED])");
                        int userchoice2=  input.nextInt();
                        milk.setExpirationDate("01/04/2023");
                        
                    if (userchoice1==1 && userchoice2==1 ){
                    milk.setType("Coconut milk"); 
                    milk.setMilkType("Low-Fat milk");
                    milk.setPrice(1265);
                    milk.setQuantity(50);
                    supplies.foodPrice(1265);
                    }
                    else if (userchoice1 == 1 && userchoice2==2){
                    milk.setType("No-Fat milk");
                    milk.setPrice(2530);
                    milk.setQuantity(100);
                    supplies.foodPrice(2530);
                    }
                     
                    else if (userchoice1==2  && userchoice2 == 1){
                    milk.setType("Coconut milk");
                    milk.setMilkType("Low-Fat milk");
                    milk.setPrice(1265);
                    milk.setQuantity(50);
                    supplies.foodPrice(1265);
                    }
                    
                    else if (userchoice1==2 && userchoice2 == 2){
                    milk.setType("Coconut milk");
                    milk.setMilkType("Low-Fat milk");
                    milk.setPrice(2530);
                    milk.setQuantity(100);
                    supplies.foodPrice(2530);
                    }
                    else if (userchoice1==3 && userchoice2==1){
                    milk.setType("Coconut milk");
                    milk.setMilkType("Full-fat milk");
                    milk.setPrice(1265);
                    milk.setQuantity(50);
                    supplies.foodPrice(1265);
                    }
                    
                    else if (userchoice1==3 && userchoice2==2){
                    milk.setType("Coconut milk");
                    milk.setMilkType("Full-fat milk");
                    milk.setPrice(2530);
                    milk.setQuantity(100);
                    supplies.foodPrice(2530);
                    }
                                 }
                      }  // end coconut milk
                         
                      else if (userchoice==3){
                        System.out.println("Soy Milk comes as\n"
                        + " >> (1). Sweetened\n"
                        + " >> (2). Unsweetened\n");
                        int userchoice1 =input.nextInt();
                        
                        if (userchoice1== 1 || userchoice1==2) {
                        System.out.println("Please Choose The Quantity IN ITS NUMBERS for (Soy Milk)\n"
                        + " >> (1). FOR (50) QUANTITY OF MILK (price : 1,248  SAR [VAT INCLUDED])\n"
                        + " >> (2). FOR (100) QUANTITY OF MILK (price : 2,496 SAR [VAT INCLUDED])");
                        int userchoice2=  input.nextInt();
                        milk.setExpirationDate("01/04/2023");
                    
                        
                        if (userchoice1==1 && userchoice2==1){
                        milk.setType("Soy Milk");
                        milk.setMilkType("Sweetened");
                        milk.setPrice(1248);
                        milk.setQuantity(50);
                        supplies.foodPrice(1248);
                        }
                        if (userchoice1==1 && userchoice2 ==2){
                        milk.setType("Soy Milk");
                        milk.setMilkType("Sweetened");
                        milk.setPrice(2496);
                        milk.setQuantity(100);
                        supplies.foodPrice(2496);
                        }
                        else if (userchoice1==2 && userchoice2==1){
                       milk.setType("Soy Milk");
                       milk.setMilkType("Unsweetened");
                        milk.setPrice(1248);
                        milk.setQuantity(50);
                        supplies.foodPrice(1248);
                        }
                        
                          else if (userchoice1==2 && userchoice2==2){
                        milk.setType("Soy Milk");
                        milk.setType("Unsweetened");
                        milk.setPrice(2496);
                        milk.setQuantity(100);
                         supplies.foodPrice(2496);
                        }
                        }
                          }  // end soy milk     
                       foods [Foods.numberOfFood] = new Milk (milk.getType(),milk.getMilkType(),food.getQuantity()
                       ,food.getExpirationDate(),food.getPrice());  
                       supplies.addFood(milk);
                       Foods.numberOfFood++; 
                     
                

                    }  // end all milk
                           
                        else if (userchoiceC==2){
                        System.out.println("Please Choose the wanted Sugar Type\n"
                        + " >> (1). White-Sugar\n"
                        + " >> (2). Brown-Sugar");
                        int userchoice1=input.nextInt();
                        
                        if (userchoice1==1 || userchoice1==2){
                        System.out.println("Please Choose The Quantity IN ITS NUMBERS for (White-Sugar)\n"
                        + " >> (1). (5) KG OF SUGAR (price : 39.75 SAR [VAT INCLUDED])\n"
                        + " >> (2). (10) KG  OF SUGAR (price : 397.5 SAR [VAT INCLUDED])");
                        int userchoice2=input.nextInt();
                       sugar.setExpirationDate("01/04/2026");

                        if (userchoice1==1 && userchoice2==1){
                       sugar.setSugarType("White-Sugar");
                       sugar.setPrice(39.75);
                       sugar.setQuantity(5);
                       supplies.foodPrice(39.75);

                        }
                        
                        else if (userchoice1==1 && userchoice2==2){
                        sugar.setSugarType("White-Sugar");
                        sugar.setPrice(397.5);
                        sugar.setQuantity(10);
                        supplies.foodPrice(397.5);
                        }
                        else if (userchoice1==2 && userchoice2==1){
                        sugar.setSugarType("Brown-Sugar");
                        sugar.setPrice(39.75);
                        sugar.setQuantity(5);
                        supplies.foodPrice(39.75);
                        }       
                        else if (userchoice1==2 && userchoice2==2){
                        sugar.setSugarType("Brown-Sugar");
                        sugar.setPrice(397.5);
                        sugar.setQuantity(10); 
                        supplies.foodPrice(397.5);
                         }
                           } 
                       foods [Foods.numberOfFood] = new Sugar (sugar.getSugarType(),sugar.getQuantity(),sugar.getExpirationDate(),sugar.getPrice());
                       supplies.addFood(sugar);
                       Foods.numberOfFood++;

                        } // end all sugar          
                        
                        else if (userchoiceC==3){
                        System.out.println("Please Choose the wanted Coffee Beans Type:\n"
                        + " >> (1). Arabica (FROM Brazil)\n"
                        + " >> (2). Robusta (FROM Vietnam)\n");
                        int userchoice1=input.nextInt();
                        if (userchoice1==1 || userchoice1==2){    
                        System.out.println("Please Choose The Quantity IN ITS NUMBERS for (Arabica Coffee Beans)\n"
                        + " >> (1). (5) KG OF  Coffee Beans (price : 193.20 SAR [VAT INCLUDED])\n" 
                        + " >> (2). (10) KG OF Coffee Beans (price : 386.4 SAR [VAT INCLUDED])");
                        int userchoice2 =input.nextInt();
                        coffeeBeans.setExpirationDate("01/04/2026");
                        
                         if (userchoice1==1 && userchoice2==1){
                        coffeeBeans.setType("Arabica");
                        coffeeBeans.setCoffeeBeansCountry("Brazil");
                        coffeeBeans.setPrice(193.20);
                        coffeeBeans.setQuantity(5); 
                        supplies.foodPrice(193.20);
                         }
                         else if (userchoice1==1 && userchoice2 ==2){
                        coffeeBeans.setType("Arabica") ;
                        coffeeBeans.setCoffeeBeansCountry("Brazil");
                        coffeeBeans.setPrice(386.40);
                        coffeeBeans.setQuantity(10); 
                        supplies.foodPrice(386.40);
                        }
                         
                        if (userchoice1==2 && userchoice2==1){
                        coffeeBeans.setType("Robusta");
                        coffeeBeans.setCoffeeBeansCountry("Vietnam");
                        coffeeBeans.setPrice(193.20);
                        coffeeBeans.setQuantity(5); 
                        supplies.foodPrice(193.20);
                         }
                         else if (userchoice2==2 && userchoice2==2){
                        coffeeBeans.setType("Robusta") ;
                        coffeeBeans.setCoffeeBeansCountry("Vietnam");
                        coffeeBeans.setPrice(386.4);
                        coffeeBeans.setQuantity(10); 
                        supplies.foodPrice(386.4);
                        } 
                           } 
                    Suppliers supplier = new Suppliers ();
                    supplier.getSupplierName(); 
                    
                    foods[Foods.numberOfFood] = new CoffeeBeans (coffeeBeans.getCoffeeBeansCountry(),coffeeBeans.getType()
                    ,coffeeBeans.getQuantity(),coffeeBeans.getExpirationDate(),coffeeBeans.getPrice());
                    
                   supplies.addFood(coffeeBeans); 
                   Foods.numberOfFood++;   

                    } // end all coffee beans
                   } // end all food  
   
                    if (userchoice==2) { 
                    suppliers.setSupplierName("Machines Supplier");
                    suppliers.equals("Machines Supplier"); 
                 
                  System.out.println ("NOW, you are able your to get machine Supply\n"
                    +" >> (1). Coffee Grinders\n"
                    +" >> (2). Coffee Machines \n"
                    +" >> (3). Barista Tools");
                    userchoice=input.nextInt();
                    
                  if (userchoice==1){
                    System.out.println("Please Choose The Quantity IN ITS NUMBERS for (Coffee Grinders)\n" +
                    " >> (1). (4) SETS OF Coffee Grinders (price : 6,900.99 SAR [VAT INCLUDED])\n" +
                    " >> (2). (10) SETS OF Coffee Grinders (price : 17,250.99 SAR [VAT INCLUDED])");
                    userchoice=input.nextInt();
                    machine.setMachineType("Coffee Grinders");
                        
                    if (userchoice==1){
                    machine.setPrice(6900.99);
                    machine.setQuantity(4);
                    supplies.setMachine(machines);
                    supplies.machinePrice(6900.99);
                            }
                    else if (userchoice==2){
                    machine.setPrice(17250.99); 
                    machine.setQuantity(10);
                   supplies.machinePrice(17250.99);
                                } 
                        } // end coffee grinder
                         
                        else if (userchoice==2){ 
                         System.out.println ("Please Choose The Quantity IN ITS NUMBERS for (Coffee Machines)\n" +
                        " >> (1). (1) SET OF Coffee Machines (price : 17,710.99 SAR [VAT INCLUDED])\n" +
                        " >> (2). (2) SETS OF Coffee Machines (price : 34,501.91SAR [VAT INCLUDED])");
                            userchoice=input.nextInt();
                            machine.setMachineType("Coffee Machines");
                        
                            if (userchoice==1){
                            machine.setPrice(17710.99);
                            machine.setQuantity(1);
                           supplies.machinePrice(17710.99);
                            }
                            else if (userchoice==2){
                            machine.setPrice(34501.91);
                            machine.setQuantity(2);
                            supplies.machinePrice(34501.91);
                                }
                            
                        } // end coffee machines 
                  
                      else if (userchoice==3){
                       System.out.println ("Please Choose The Quantity IN ITS NUMBERS for (Barista Tools)\n" +
                        " >> (1). (4) SEST OF Barista Tools (price : 1,596.75 SAR [VAT INCLUDED])\n" +
                        " >> (2). (10) SETS OF Barista Tools (price : 3,997.5 SAR [VAT INCLUDED])");
                    userchoice=input.nextInt();
                    machine.setMachineType("Barista Tools");
                    if (userchoice==1){
                    machine.setPrice(1596.75);
                    machine.setQuantity(4);
                    supplies.machinePrice(1596.75);
                            }  
                        
                    else if (userchoice==2){
                    machine.setPrice(3997.5);
                    machine.setQuantity(10);
                   supplies.machinePrice(3997.5);
                                }
                        }  // end barista tools  
                  
                    Suppliers supplier = new Suppliers ();
                    supplier.getSupplierName();
                    machines [Machines.numberOfMachine] = new Machines (machine.getMachineType(),machine.getPrice(),machine.getQuantity());
                    Machines.numberOfMachine++;
                    supplies.addMachines(machine);
                    } // end machine supplier                
                   supplies.printSupplies();  
                    break;  
                      
                  case 4:                     
                    // print receipt
                   ; 
                      supplies.printFood();
                          supplies.printMachine();
                          System.out.println("Your total Price is: " + supplies.calculatePrice(counter));
                      
                       System.out.println("Kindly,Pick The Suitable Payment Method\n"
                               + "(1). Credit Card\n"
                               + "(2). Cash on delivery");
                                int userchoice2 = input.nextInt();
                               if (userchoice2==1){
                                 paymentMethod.setPaymentMethod ("Credit Card");
                                  System.out.println("Kindly, Enter The Name On your Card");
                                  String creditCardOwnerName= input.next();
                                  creditCard.setCreditCardOwnerName(creditCardOwnerName);
                                  
                                  System.out.println("Kindly, Enter your Credit Card Number");
                                  long creditCardNumber= input.nextLong();
                                  creditCard.setCreditCardNumber(creditCardNumber);
                                  
                                  System.out.println("Kindly, Enter The Card Expiration Month");
                                  int creditCardExpirationMonth= input.nextInt();
                                  creditCard.setCreditCardExpirationMonth(creditCardExpirationMonth);
                                  
                                  System.out.println("Kindly, Enter The Card Expiration Year");
                                  int creditCardExpirationYear= input.nextInt();
                                  creditCard.setCreditCardExpirationYear(creditCardExpirationYear);
                                  
                                  System.out.println("Kindly, Enter The 3 digits Number Behind Your Card");
                                  int creditCardCVC= input.nextInt();
                                  creditCard.setCreditCardCVC(creditCardCVC);
                               }
                               else if (userchoice2==2){
                                 paymentMethod.setPaymentMethod ("Cash On Delivery");
                                 System.out.println("Kindly, Enter Your Paid Price");
                                 double paidPrice= input.nextDouble(); 
                                 cashOnDelivery.setPaidPrice(paidPrice);
                               }
                               if (creditCard.equals(creditCard2)) { // Appficial youtube channel video: Overriding the Object equals Method - Java Override Example - Comparing Objects -
                                   System.out.println("YOU ARE THE LUCKY CUSTOMER, YOU WILL RECIVE GIFTS FROM OUR BEHALVE :) ");
                                   
                               }else {
                                   System.out.println("YOU ARE NOT THE LUCKY CUSTOMER :( ");
                               } 
                           
                               // print the supplies the user choosed 
                    Receipt receipt = new Receipt (coffeeInfo.coffeeName , coffeeInfo.coffeePhoneNumber , paymentMethod);
                    receipt.setSupplier(suppliers);
                    receipt.setSupplies(supplies);
                    receipt.setFood(supplies);
                    receipt.setMachine(supplies);
                    receipt.calculatePrice(counter);
                    System.out.println(receipt.toString());
                    
                     break;

                case 5:
                    // update receipt information
                    do{
                        System.out.println("which of the following information would you like to update?\n"
                                + " >> (1). Coffee Name\n"
                                + " >> (2). Coffee Phone Number\n"
                                + " >> (3). Change The Payment Method\n"
                                + " >> (4). Print the new receipt\n"
                                + " >> (5). QUIT THE LIST");
                            userchoice= input.nextInt();
                            double paidPrice=0;
                            long creditCardNumber=0;
                           if (userchoice==1){
                            String junk1 = input.nextLine();
                            System.out.println("Please Re-Enter the new name you would like to have on the receipt");
                            String coffeeName1= input.nextLine();
                            coffeeInfo.setCoffeeName(coffeeName1);
                        }
                        else if (userchoice==2){
                            System.out.println("Please Re-Enter The New Phone Number you would like to have on the receipt");
                            long CoffeeNumber1= input.nextLong();
                            coffeeInfo.setCoffeePhoneNumber(CoffeeNumber1);
                        }
                        else if (userchoice==3){
                            System.out.println("Please Re-Enter the new PaymentMethod you would like to have on the receipt\n"
                                    + " >> (1). Credit Card\n"
                                    + " >> (2). Cash on delivery");
                                 userchoice= input.nextInt();
                            if (userchoice==1){
                                paymentMethod.setPaymentMethod ("Credit Card");
                                System.out.println("Kindly, Enter The Name On your Card");
                                String junk1 = input.nextLine(); // to fix the next line problem
                                String creditCardOwnerName= input.nextLine();
                                creditCard.setCreditCardOwnerName(creditCardOwnerName);
                                System.out.println("Kindly, Enter your Credit Card Number");
                                creditCardNumber= input.nextLong();
                                creditCard.setCreditCardNumber(creditCardNumber);

                                System.out.println("Kindly, Enter The Card Expiration Month");
                                int creditCardExpirationMonth= input.nextInt();
                                creditCard.setCreditCardExpirationMonth(creditCardExpirationMonth);

                                System.out.println("Kindly, Enter The Card Expiration Year");
                                int creditCardExpirationYear= input.nextInt();
                                creditCard.setCreditCardExpirationYear(creditCardExpirationYear);

                                System.out.println("Kindly, Enter The 3 digits Number Behind Your Card");
                                int creditCardCVC= input.nextInt();
                                creditCard.setCreditCardCVC(creditCardCVC);
                            }

                            else if (userchoice==2){
                                paymentMethod.setPaymentMethod ("Cash On Delivery");
                                System.out.println("Kindly, Enter Your Paid Price");
                                paidPrice= input.nextDouble();
                                cashOnDelivery.setPaidPrice(paidPrice);
                            }

                        } else if (userchoice==4) {

                     receipt = new Receipt (coffeeInfo.coffeeName,coffeeInfo.coffeePhoneNumber,paymentMethod );
                     receipt.setSupplier(suppliers);
                     receipt.setSupplies(supplies);
                     receipt.setFood(supplies);
                     receipt.setMachine(supplies);
                     receipt.calculatePrice(counter);
                     System.out.println(receipt.toString());
                        }
                                               
                    }while (userchoice!=5);
                    
                    break;
                     
                case 6:
                    // Rate the serivce
                System.out.println ("We would appreciate your feedback on our services by choosing a number out of this list\n" 
                        + " >> (5) outstanding (*****)\n" 
                        + " >> (4) Strongly,satisfied (****)\n"
                        + " >> (3) satisfied (***)\n" 
                        + " >> (2) unsatisfied (**)\n"
                        + " >> (1) strongly unsatisfied (*)"); 
                       userchoice=input.nextInt(); 
                if(userchoice == 5 || userchoice ==4 || userchoice ==3){  
               System.out.println("We are very pleased to hear this, Thank you for your feedback :) "); 
        } 
      else if(userchoice==1 || userchoice==2) { 
            System.out.println("we apologize for not meeting your needs and we will try harder to improve our services!"); 
      }
           System.out.println("THANK YOU FOR YOUR TIME!");  
                    break;  // end case 6
                    
                case 7 :
                System.exit(0);
                    break;
                    
              default: 
                userchoice=8;
                System.out.println("You Have Entered a Wrong Number, Please Enter Again!");
                
                    break;
              } // end switch cases
           } while (userchoice<9); // end do-while
} // end main
      } // end class

// hope you liked our project :)

        
    
