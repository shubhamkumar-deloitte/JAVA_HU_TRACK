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


    }
    static void validateSalary(double salary) throws  Exception{
        if(salary<=0) throw  new Exception("Salary must be greater than zero");
    }
    static void validateAge(int age) throws Exception{
        if( age<18 || age>90) throw  new Exception("Age cannot be less than 18 or greater than 90");
    }
}
