package day27_practices;

public class CydeoStudent {

    public String name, fieldOfStudy, programmingLanguage;

    public char gender;
    public int age,batchNumber,groupNumber;

    public static String schoolName;
    public static String secretCode;

    public CydeoStudent(String name, String fieldOfStudy, String programmingLanguage, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.programmingLanguage = programmingLanguage;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static{
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("SchoolName = " + schoolName);
    }

    public void printSecretCode(){
        System.out.println("SecretCode = " + secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public void setFieldOfStudy(){
        System.out.println(name + " 's field of study is" + fieldOfStudy);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}

/*
 create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */