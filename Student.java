package Assignment2;

public class Student extends Person {
    private double GPA;

    public void setGpa(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public Student() {
    }

    public Student(String name, String surname, double GPA) {
        super.setName(name);
        super.setSurname(surname);
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount(){
        if (this.GPA > 2.67) return 36660.00;
        else return 0;
    }
}