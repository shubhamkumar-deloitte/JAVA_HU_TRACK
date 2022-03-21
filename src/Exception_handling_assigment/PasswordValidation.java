
package Exception_handling_assigment;

import java.util.Scanner;

class WrongPasswordException extends Exception {

    int conditionsUnsatisfied = 0;

    public WrongPasswordException(int conditions)
    {
        super("Invalid Password: ");
        conditionsUnsatisfied = conditions;
    }

    public String printMessage()
    {
        // Call constructor of parent Exception
        // according to the condition violated
        switch (conditionsUnsatisfied) {


            case 1:
                return ("Password length not correct");


            case 2:
                return ("password should contain atleast one digit");


            case 3:
                return ("password should contain at least one uppercase letter");


            case 4:
                return ("password should contaoin at least one lowercase letter");


            case 5:
                return ("password should contaoin at least one special character");


        }

        return ("");
    }
}

// Driver Class
public class PasswordValidation {

    // A utility function to check
    // whether a password is valid or not
    public static void isValid(String password)
            throws WrongPasswordException {


        if (!((password.length() >= 5)
                && (password.length() <= 10))) {
            throw new WrongPasswordException(1);
        }

        //digits
        boolean countOfDigits = false;
        for (int i = 0; i <= 9; i++) {
            String str = Integer.toString(i);
            if (password.contains(str)) {
                countOfDigits = true;
            }
        }
        if (countOfDigits == false) {
            throw new WrongPasswordException(2);
        }


        //uppercase
        boolean UpperCase = false;
        for (int i = 65; i <= 90; i++) {
            char ch = (char) i;
            String str = Character.toString(ch);
            if (password.contains(str)) {
                UpperCase = true;
            }
        }
        if (UpperCase == false) {
            throw new WrongPasswordException(3);
        }

        //lower case
        boolean LowerCase = false;
        for (int i = 90; i <= 122; i++) {
            char ch = (char) i;
            String str = Character.toString(ch);
            if (password.contains(str)) {
                LowerCase = true;
            }
        }
        if (LowerCase == false) {
            throw new WrongPasswordException(4);
        }

        //special characters
        if (!(password.contains("@") || password.contains("#") || password.contains("&") || password.contains("%") || password.contains("*") || password.contains("!"))) {
            throw new WrongPasswordException(5);
        }
    }


    // Driver code
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();
        try{
            isValid(password);
            System.out.println("valid password");
        }catch(WrongPasswordException e){
            System.out.println(e.printMessage());
        }
    }
}