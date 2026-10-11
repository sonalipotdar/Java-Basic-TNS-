
class Employee {
    double salary = 600000;
}

class Manager extends Employee {
    double salary = 400000;

    void display_salary() {
        System.out.println("Managers salary: " + this.salary);
        System.out.println("Employee salary: " + super.salary);
    }
}
