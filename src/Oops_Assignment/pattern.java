import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        System.out.println("Tpe the number the rows ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=i;j<=rows;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        int spaces=2;
        for(int i=rows-1;i>=1;i--)
        {
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            spaces++;
            System.out.println();
        }

    }
}
