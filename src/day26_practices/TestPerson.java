package day26_practices;

public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person("Mary",30,'F');
        Person person2 = new Person("Klara",29,'F');

        System.out.println(person1);
        System.out.println(person2);

        person1.drink("water");
        person2.eat("icecream");

        person1.sleep();
        person2.sleep();

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);

        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);







    }
}
