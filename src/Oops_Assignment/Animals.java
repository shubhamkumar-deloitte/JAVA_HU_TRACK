class Animal{
    private String name;
    private  int age;
    private  String color;

    public void  setName(String name)
    {
        this.name=name;
    }
    public void getName()
    {
        System.out.println(this.name);
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void getAge()
    {
        System.out.println(this.age);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void getColor()
    {
        System.out.println(this.color);
    }
}
public class Animals {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.setName("Mayawati");
        a.getName();
        a.setAge(22);
        a.getAge();
        a.setColor("Black");
        a.getColor();
    }
}
