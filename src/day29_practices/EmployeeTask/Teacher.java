package day29_practices.EmployeeTask;

public class Teacher extends Employee {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Mary","A123","teacher",'F',30,12000);

        System.out.println(teacher1.toString());
    }

    public void work(){
        System.out.println(getName()+" is teaching");
    }

}
