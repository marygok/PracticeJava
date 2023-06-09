package day29_practices.EmployeeTask;

public class Employee {

    private String name, id, jobTitle;
    private char gender;
    private int age;
    private double salary;

    public void setInfo(String name, String id, String jobTitle, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
            this.gender = gender;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.err.println("negative age invalid: " + age);
            System.exit(1);
        }
        if (age < 18 || age > 65) {
            System.err.println("age should be between 18 to 65: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.err.println("Invalid salary: "+salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle +" "+name+" is working");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
