public class Manager extends Employee {
    public double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary,
                   double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " with lastName " + this.lastName + " and age " + super.getAge() +
                " has salary " + this.getSalary();
    }
}