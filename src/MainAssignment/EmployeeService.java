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
    public void updateEmployee() throws Exception {
        System.out.println("Enter the name");
        name=sc.next();

        int j=0;
        for(Employee emp:empset){

            if(emp.getName().equals(name)){

                System.out.println("employee found");
                j++;
                do{
                    int choice;
                    System.out.println("\n Edit employee details:\n"
                            +"\n1.name"
                            +"\n2. Age"
                            +"\n3. Comapany Name"
                            +"\n4.Designation"
                            +"\n5.Salary"
                            +"\n6. Address"
                            +"\n7. Phone"
                            +"\n8. Go back");
                    System.out.println("Enter the choice");
                    choice= sc.nextInt();
                    switch(choice){
                        case 1:
                            System.out.println("Enter new name");
                            name=sc.next();
                            emp.setName(name);
                            break;

                        case 2:
                            System.out.println("Enter new age");
                            age=sc.nextInt();
                            Validate.validateAge(age);
                            emp.setAge(age);
                            break;
                        case 3:
                            System.out.println("Enter new Company name");
                            CompanyName=sc.next();
                            emp.setCompanyName(CompanyName);
                            break;

                        case 4:
                            System.out.println("Enter new Designation");
                            designation=sc.next();
                            emp.setDesignation(designation);
                            break;
                        case 5:
                            System.out.println("Enter new salary");
                            salary=sc.nextDouble();
                            Validate.validateSalary(salary);
                            emp.setSalary(salary);
                            break;
                        case 6:
                            System.out.println("Enter new address");
                            address=sc.next();
                            emp.setAddress(address);
                            break;

                        case 7:
                            System.out.println("Enter new Phone Number");
                            phone=sc.nextInt();
                            Validate.validatePhone(phone);
                            emp.setPhone(phone);
                            break;

                        case 8: j++;
                                break;

                        default:
                            System.out.println("choose a correct choice");
                            break;
                    }
                }while (j==1);

                if(j==0)
                {
                    System.out.println("Details didnot match, Enter a valid detail");
                }else{
                    System.out.println("New updated details are");
                    System.out.println(emp);
                }

                //found=true;

            }
        }
    }
    //adding data to text file
    public void addData() throws Exception{
         File f=null;
         FileInputStream fis=null;
         ObjectInputStream ois=null;
         FileOutputStream fos=null;
         ObjectOutputStream oos=null;

         try{
             f= new File("C:/Users/shubhamkumar32/IdeaProjects/Oops_Assignment/src/MainAssignment/UserData.txt");
             if(f.exists()){
                 System.out.println("entered here");
//                 fis= new FileInputStream(f);
//                 fos = new FileOutputStream(f);
//                 //ois=new ObjectInputStream(fis);
//                 oos=new ObjectOutputStream(fos);
//                 //empset=(HashSet<Employee>)ois.readObject();
//                 oos.writeObject(empset);
//                 fos.close();
//                 oos.close();
                 FileWriter writer = new FileWriter(f);
                 for(Employee emp:empset)
                 {
                     writer.write(emp.toString());
                 }
                 writer.flush();
                 writer.close();
//
             }

         }catch(Exception e){
             e.printStackTrace();
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
    public void addEmp() throws Exception{
        //System.out.println("Enter id");
        id=UUID.randomUUID().toString();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        Validate.validateAge(age);
        System.out.println("Enter company");
        CompanyName=sc.next();
        System.out.println("Enter designation");
        designation=sc.next();
        System.out.println("ENter salary");
        salary=sc.nextDouble();
        Validate.validateSalary(salary);
        System.out.println("ENter address");
        address=sc.next();
        System.out.println("ENter phone");
        phone=sc.nextInt();
        Validate.validatePhone(phone);

        Employee emp=new Employee(id,name,age,CompanyName,designation,salary,address,phone);
        empset.add(emp);
        System.out.println("Newly added employee details are");

        //

    }
}
