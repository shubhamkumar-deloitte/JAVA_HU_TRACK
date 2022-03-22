package MainAssignment;



public class Validate {
    static void validatePhone(int phone) throws Exception{
        if(phone<0) throw new Exception("Not valid number");

        int num=phone;
        int countOfDigits=0;

        while(num!=0)
        {
            num/=10;
            countOfDigits++;
        }
        if(countOfDigits!=10) throw new Exception("Phone number does not contains 10 digits");
        //Main.menu();


    }
    static void validateSalary(double salary) throws  Exception{
        if(salary<=0) throw  new Exception("Salary must be greater than zero");

    }
    static void validateAge(int age) throws Exception{
        if( age<18 || age>90)
        {
            //Main.menu();
            throw  new Exception("Age cannot be less than 18 or greater than 90");
        }



    }
    static void validatePassword(String password,String repassword)throws  Exception
    {

        //checking both are same or not
        if(password.equals(repassword)==false) throw new Exception("password did not match");
        int lengthOfPassword=password.length();
        if(lengthOfPassword<5 || lengthOfPassword>10) throw new Exception("password length should be greater than 5 and smaller than 10");
        //checking for uppercase
        boolean uppercase=false;
        for(int i=65;i<=90;i++)
        {
            char c=(char)i;
            String str1=Character.toString(c);
            if(password.contains(str1))
            {
                uppercase=true;
            }
        }
        if(uppercase==false) throw new Exception("password must contain at least one capital letter");

        //checking for lower case
        boolean lowerCase=false;
        for(int i=90;i<=122;i++)
        {
            char c=(char)i;
            String str1=Character.toString(c);
            if(password.contains(str1)){
                lowerCase=true;
            }
        }
        if(lowerCase==false) throw new Exception("Password must contain at least one lower case letter");

        //checking for digit
        boolean digit=false;
        for(int i=0;i<=9;i++)
        {
            String str1=Integer.toString(i);
            if(password.contains(str1)){
                digit=true;
            }
        }
        if(digit==false) throw new Exception("password must contains a digit");
        //checking for specila characters
        if (!(password.contains("@") || password.contains("#") || password.contains("&") || password.contains("%") || password.contains("*") || password.contains("!"))) {
            throw new Exception("password must contain at least one special charcters");
        }

    }
}
