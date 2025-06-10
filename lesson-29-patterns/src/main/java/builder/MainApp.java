package builder;

public class MainApp {

    public static void main(String[] args) {

        Person.PersonBuilder personB= Person.builder()
                .withName("John")
                .withAge(20)
                .withAddress("Minsk");


        var person = personB
                .withPhone("12")
                .build();

        PersonService service = new PersonService();

        service.save(person);

    }

}
