package MainAssignment;
import java.io.Serializable;
public class Employee implements  Serializable{

    private int id;
    private String name;
    private int age;
    private String CompanyName;
    private String designation;
    private double salary;
    private String address;
    private int phone;

    //setter and getters for all private members

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", CompanyName='" + CompanyName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }

    public Employee(int id, String name, int age, String companyName, String designation, double salary, String address, int phone) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.CompanyName = companyName;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
        this.phone = phone;
    }
}
