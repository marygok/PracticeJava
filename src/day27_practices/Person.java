package day27_practices;

public class Person {

    public String name;
    public String language;
    public int age;
    public char gender;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;

    }
    
        static {

        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
        planet = "Earth";
        
        }

        public static void printPlanetName(){
            System.out.println("Planet name is = " + planet);
        }
        public void eat(String food){
            System.out.println(name + " is eating" + food);
        }
        public void drink(String drink){
            System.out.println(name + " is drinking" + drink);
        }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
    Create a class named Person:
        Variables:
        name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

        Add a constructor to initialize all the fields

        Add a static block to initialize all the statics

        Methods:
        printPlanetName()
        eat(String food)
        drink(String drink)
        toString()


 */





