package day28_practices;

public class TestPizza {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small",2,3);

        System.out.println(pizza1);

        pizza1.setSize("medium");
        pizza1.setNumberOfPepperoniTopping(3);
        pizza1.setNumberOfCheeseTopping(3);

        System.out.println(pizza1.getSize());
        System.out.println(pizza1.getNumberOfPepperoniTopping());
        System.out.println(pizza1.getNumberOfCheeseTopping());

        System.out.println(pizza1);



    }
}
