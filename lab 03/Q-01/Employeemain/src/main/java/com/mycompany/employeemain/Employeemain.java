/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeemain;

/**
 *
 * @author Piyumi
 */
public class Employeemain {

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("Oshani");
        employee.setAge(30);
        employee.setSalary(50000);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}
