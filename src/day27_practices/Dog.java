package day27_practices;

public class Dog {

    public String breed,size,color;
    public char gender;
    public int age;
    public boolean isFriendly;

    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;

    public Dog(String breed, String size, String color, char gender, int age, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
    }

    public void eat(String food){
        System.out.println(breed + " is eating" + food);
    }

    public void drink(String drink){
        System.out.println(breed + " is drinking" + drink);
    }

    public void sleep(){
        System.out.println(breed + " is sleeping");
    }


    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                '}';
    }
}


/*
Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */