package day26_practices;

public class TestCydeoStudent {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("Mary",30,'F',"A123",'B',29,3);

        System.out.println(cydeoStudent1);

        CydeoStudent cydeoStudent2 = new CydeoStudent("Klara",29,'F',"B24",'B',28,2);

        System.out.println(cydeoStudent2);

        cydeoStudent1.printProgrammingLanguage();
        cydeoStudent2.printProgrammingLanguage();

        cydeoStudent1.printSchoolName();
        cydeoStudent2.printSchoolName();

    }
}
