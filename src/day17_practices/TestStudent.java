package day17_practices;

public class TestStudent{

    public static void main(String[] args) {

        Student student = new Student();
        student.setInfo("Melek",'F',30,12345,'A');
        Student student1 = new Student();
        student1.setInfo("Cemal",'M',30,23456,'B');

        System.out.println(student.toString());
        System.out.println(student1.toString());

        student1.code();
        student.sleep();

    }
}
