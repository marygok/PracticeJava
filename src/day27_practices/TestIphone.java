package day27_practices;

public class TestIphone {

    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("Apple","14Max","6.1 inch","Silver","USA","Canada","iOS",2.000,true);

        iPhone1.printOperatingSystem();
        iPhone1.call(1234567890l);
        iPhone1.text(1234567890L);
        iPhone1.faceTime(1234567890L);
        iPhone1.faceTime("marygok@gmail.com");

        System.out.println(iPhone1);





    }
}
