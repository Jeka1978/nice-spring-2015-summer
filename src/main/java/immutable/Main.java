package immutable;

/**
 * Created by Jeka on 10/07/2016.
 */
public class Main {
    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder();
        Person person = builder.bonus(100).debt(50).name("Shay").build();
        System.out.println(person);
    }
}
