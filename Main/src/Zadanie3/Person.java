import java.time.LocalDate;

public abstract class Person {
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