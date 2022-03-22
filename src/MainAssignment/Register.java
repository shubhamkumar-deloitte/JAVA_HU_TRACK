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

public boolean validateUsername(String username)
{
    for(Employee emp:registeredUser)
    {
        if(emp.getUsername().equals(username))
        {

                System.out.println("username already exists");
                return false;

        }
    }
    return true;
}
    public void registerUser() throws Exception {
        System.out.println("Enter the username");
        username=sc.next();
        boolean flag=validateUsername(username);

            if(flag==false)
            {
                throw new Exception("username already exists");
            }

        System.out.println("enter the password");
        password=sc.next();
        //Validate.validatePassword(password);
        System.out.println("re-enter the password");
        repassword=sc.next();
        Validate.validatePassword(repassword,repassword);
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
        if(registeredUser.isEmpty()==true)
        {
            System.out.println("user not registered");
            Main.registerMenu();
        }
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



