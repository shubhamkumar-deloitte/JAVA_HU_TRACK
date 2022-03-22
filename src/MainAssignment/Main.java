package MainAssignment;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    EmployeeService service = new EmployeeService();
    Register register=new Register();
    static boolean ordering = true;

    public static  void registerMenu()
    {
        System.out.println("*******registration*******");
        System.out.println("1-Login" +
                            "\n2-register");
    }
    public static void menu() {
        System.out.println("******Welcome to user Database*********"

                + "\n1.Add user Data"
                + "\n2.List user Data"
                + "\n3.Update user Data"
                + "\n4.Delete user data"
                + "\n5.Exit");
    }

    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        EmployeeService service = new EmployeeService();
        Register register=new Register();
        boolean notregisterd=true;

        do{
            registerMenu();
            System.out.println("Enter the choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter username and password");


                    notregisterd=false;
                    break;

                case 2:
                    System.out.println("Registration");
                    register.registerUser();
                    register.viewRegisteredUser();

                    break;

            }
        }while(notregisterd==true);

        do{
            menu();
            System.out.println("Enter the choice");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Add user data");
                    service.addEmp();
                    break;

                case 2:
                    System.out.println("List user Data");
                    service.viewAllEmployee();
                    break;
                case 3:
                    System.out.println("update user data");
                    service.updateEmployee();
                    break;

                case 4:
                    System.out.println("Delete user Data");
                    service.deleteEmployee();
                    break;

                case 5:
                    System.out.println("Exited Successfully");

                    service.addData();
                    System.exit(0);

                default:
                    System.out.println("please enter a valid choice");
                    break;
            }
        }while(ordering);


    }
}
