package assignments.assignment1;

public class Employee extends Person {
    public String office;
    public double salary;
    public String dateHired;

    public Employee(String name, String address, String phone, String email, String office, double salary,
            String dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String toString() {
        return "Name: " + this.name + " Class: Employee";
    }

}
