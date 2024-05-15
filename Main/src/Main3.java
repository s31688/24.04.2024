import java.time.LocalDate;

public class Main3 {
    public static void main(String[] args) {
        Manager manager = new Manager("Jan", "Kowalski", 1990, 2010, "PJATK", 2000d, 100d);
        System.out.println(manager);
    }
}

abstract class Person {
    public String firstName;
    public String lastName;
    public int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.birthdayYear;
    }

    public String toString() {
        return this.getClass().getName() + ": " + this.firstName + " " + this.lastName + " " + this.birthdayYear;
    }
}

class Employee extends Person {
    public int hireDate;
    public String companyName;
    public double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        return LocalDate.now().getYear() - this.hireDate;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.hireDate + " " + this.companyName + " " + this.salary;
    }
}

class Manager extends Employee {
    public double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " with lastName " + this.lastName + " and age " + super.getAge() + " has salary " + this.getSalary();
    }
}