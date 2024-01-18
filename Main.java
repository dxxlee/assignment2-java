package Assignment2;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    private static void PrintData(Iterable<Person> persons) {
        for (Person p : persons) {
            String message = p.toString() + " earns " + Double.toString(p.getPaymentAmount()) + " tenge";
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(
                new Employee("Biba", "Boba", "somePosition", 3005000.78F)
        );
        persons.add(
                new Employee("Ilon", "Mask", "somePosition", 200000.00F)
        );
        persons.add(
                new Student("Daniel", "Li", 3.1F)
        );
        persons.add(
                new Student("Rayan", "Gosling", 4.00F)
        );

        Collections.sort(persons);
        PrintData(persons);
    }
}