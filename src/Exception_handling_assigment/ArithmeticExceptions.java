package Exception_handling_assigment;

public class ArithmeticExceptions {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b;
            System.out.println("the value of c is "+c);
        }catch(ArithmeticException e){
            System.out.println("Cant't divide by zero");
        }
    }
}
