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
public class JobsDetails {
     private String jobName ;
    private double salary ;
    private String workingHours ;
    private String workingDays ;
    private String requiredWorkingExperience ;

    public JobsDetails() {
    }

    public JobsDetails(String jobName, double salary, String workingHours,String workingDays ,String requiredWorkingExperience) {
        this.jobName = jobName;
        this.salary = salary;
        this.workingHours = workingHours;
        this.workingDays = workingDays;
        this.requiredWorkingExperience = requiredWorkingExperience;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public String getRequiredWorkingExperience() {
        return requiredWorkingExperience;
    }

    public void setRequiredWorkingExperience(String requiredWorkingExperience) {
        this.requiredWorkingExperience = requiredWorkingExperience;
    }

    @Override
    public String toString() {
        return "\nJob details : " +
                "\n you have chooed to hire a : " + jobName +
                "\n the selected Salary is:  " + salary +
                "\n the selected Working Hours is: " + workingHours +
                "\n the selected Working Days is: " + workingDays +
                "\n the selected Required Working Experience is: " + requiredWorkingExperience ;
    }   
}
