package day27_practices;

public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person("Jack","english",35,'M');

        person1.eat(" egg");
        Person.numberOfWings = 0;
        Person.isHuman = true;

        System.out.println(person1);


    }
}
