package MainAssignment;

import java.util.HashSet;
import java.util.Scanner;

public class Register {

    HashSet<Employee> registeredUser= new HashSet<>();
    Employee reg1=new Employee("shubham","password");
    Scanner sc=new Scanner(System.in);
    String username;
    String password;
    String repassword;
    boolean loggedin=false;


    public void registerUser()
    {
        System.out.println("Enter the username");
        username=sc.next();
        System.out.println("enter the password");
        password=sc.next();
        System.out.println("re-enter the password");
        repassword=sc.next();
        Employee emp= new Employee(username,password);
        registeredUser.add(emp);
        System.out.println("successfully registerd");

    }
    public void viewRegisteredUser()
    {
        for(Employee emp:registeredUser)
        {
            System.out.println(emp.getUsername());
            System.out.println(emp.getPassword());
        }
    }
    public void login(String username, String password)
    {
        for(Employee emp:registeredUser)
        {
            if(emp.getUsername().equals(username) && emp.getPassword().equals(password))
            {
                System.out.println("logged in");
                loggedin=true;
                Main.menu();
            }
            else
            {
                System.out.println("invalid credentials");
                Main.registerMenu();
            }
        }

    }
    public boolean getLoggedIn(){
        return loggedin;
    }

    }



