package MainAssignment;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.UUID;

public class EmployeeService  {
    HashSet<Employee> empset=new HashSet<>();
    Employee emp1=new Employee("101","Shubham",22,"HashedIn","SDET",5000,"Bangalore",1234567899);

    Scanner sc=new Scanner(System.in);
    //adding to file







    boolean found=false;

     String id;
     String name;
     int age;
     String CompanyName;
     String designation;
     double salary;
     String address;
     int phone;

     public EmployeeService(){
         empset.add(emp1);
     }
     //view all
    public void viewAllEmployee(){
         for(Employee emp:empset){
             System.out.println(emp);
         }
    }
    //view on the based of ID

    public void viewEmployee(){
        System.out.println("enter id");
        id=sc.next();
        for(Employee emp:empset){
            if(emp.getId()==id){
                System.out.println(emp);
                found=true;
            }
        }
        if(found==false){
            System.out.println("No such Employee with this ID");
        }

    }
    //update
    //user-id cant be updated
    public void updateEmployee(){
        System.out.println("Enter the id");
        id=sc.next();
        boolean found=false;
        for(Employee emp:empset){
            if(emp.getId().equals(id)){
                System.out.println("Enter name");
                name=sc.next();
                System.out.println("Enter age");
                age=sc.nextInt();
                System.out.println("Enter Company");
                CompanyName=sc.next();
                System.out.println("Enter designation");
                designation=sc.next();
                System.out.println("Enter salary");
                salary=sc.nextDouble();
                System.out.println("enter address");
                address=sc.nextLine();
                System.out.println("Enter phone No");
                phone=sc.nextInt();

                emp.setName(name);
                emp.setAge(age);
                emp.setCompanyName(CompanyName);
                emp.setDesignation(designation);
                emp.setSalary(salary);
                emp.setAddress(address);
                emp.setPhone(phone);

                System.out.println("New updated details are");
                System.out.println(emp);
                found=true;

            }
        }
        if(found==false){
            System.out.println("Employee not found");

        }else{
            System.out.println("Details updated");
        }

    }
    //delete
    public void deleteEmployee(){
        System.out.println("Enter id");
        id=sc.next();
        boolean found=false;

        Employee empdel=null;

        for(Employee emp:empset){
            if(emp.getId()==id){
                empdel=emp;
                found=true;
            }
        }
        if(found==false){
            System.out.println("Employee not found");
        }else{
            empset.remove(empdel);
            System.out.println("Employee deeted");
        }
    }
    //add employee
    public void addEmp(){
        //System.out.println("Enter id");
        id=UUID.randomUUID().toString();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("Enter company");
        CompanyName=sc.next();
        System.out.println("Enter designation");
        designation=sc.next();
        System.out.println("ENter salary");
        salary=sc.nextDouble();
        System.out.println("ENter address");
        address=sc.next();
        System.out.println("ENter phone");
        phone=sc.nextInt();

        Employee emp=new Employee(id,name,age,CompanyName,designation,salary,address,phone);
        empset.add(emp);
        System.out.println("Newly added employee details are");
        System.out.println(emp);

    }
}
