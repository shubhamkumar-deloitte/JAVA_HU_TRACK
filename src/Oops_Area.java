//plymorphism
class Area{
    public void PrintArea(Double radius)
    {
        System.out.println("printing the area of circle ");
        System.out.println(3.14*radius*radius);
    }
    public void PrintArea(int length, int breadth){
        System.out.println("printing the area of rectangle ");
        System.out.println(length*breadth);
    }
    public void PrintArea(int sides){

        System.out.println("printing the area of square");
        System.out.println(sides*sides);
    }
    public void PrintArea(double height, double base)
    {
        System.out.println("printing the area of triangle");
        System.out.println(.5*height*base);
    }

}

public class Oops_Area {
    public static void main(String[] args) {

        Area a=new Area();

        a.PrintArea(5.0);
        a.PrintArea(10,5);
        a.PrintArea(5);
        a.PrintArea(10.0,11.0);

    }
}