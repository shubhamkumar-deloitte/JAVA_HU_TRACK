package MainAssignment;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    EmployeeService service = new EmployeeService();
    static boolean ordering = true;

    public static void menu() {
        System.out.println("******Welcome to user Database*********"

                + "\n1.Add user Data"
                + "\n2.List user Data"
                + "\n3.Update user Data"
                + "\n4.Delete user data"
                + "\n5.Exit");
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        EmployeeService service = new EmployeeService();

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
                    System.exit(0);

                default:
                    System.out.println("please enter a valid choice");
                    break;
            }
        }while(ordering);


    }
}
