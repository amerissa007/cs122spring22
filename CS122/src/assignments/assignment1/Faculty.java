package assignments.assignment1;

public class Faculty extends Employee {
    public String officeHours;
    public String rank;

    public Faculty(String name, String address, String phone, String email, String office, double salary, String dateHired, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() {
        return "Name: " + this.name + " Class: Faculty";
    }
}
