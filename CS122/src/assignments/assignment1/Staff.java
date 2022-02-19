package assignments.assignment1;

public class Staff extends Employee {
    public String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, String dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    public String toString() {
        return "Name: " + this.name + " Class: Staff";
    }

}