package day27_practices;

public class TestDog {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Bulldog","Medium","Black",'F',3,true);

        System.out.println(dog1);

        dog1.eat("bone");
        dog1.sleep();

        System.out.println(Dog.numberOfLegs);

    }

}
