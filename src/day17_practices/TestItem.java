package day17_practices;

public class TestItem {

    public static void main(String[] args) {

        Item item = new Item("Pencil",1.5,10);
        Item item1 = new Item("Eraser",2,15);

        System.out.println(item.toString());
        System.out.println(item1.toString());
    }
}
