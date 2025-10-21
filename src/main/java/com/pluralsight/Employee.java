package com.pluralsight;

import java.security.PrivateKey;

public class Employee {
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public long getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * 1.5 * payRate);
    }

    public float getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public float getOvertimeHours(){
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    public void punchIn(double time){

    }

    public void punchOut(double time){

    }

    @Override
    public String toString(){
        return "Employees{" +
                "employeeId = " + employeeId +
                ", name = " + name + '\'' +
                ", department = " + department + '\'' +
                ", payRate = " + payRate +
                ", hoursWorked = " + hoursWorked +
                ", getTotalPay()=" + getTotalPay() +
                ". getRegularHours()=" + getRegularHours() +
                ", getOvertimeHours()=" + getOvertimeHours() +
                '}';
    }
}
