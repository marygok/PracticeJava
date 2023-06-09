package day29_practices.EmployeeTask;

public class Tester {

    private String name,id,jobTitle;
    private char gender;
    private int age;
    private double salary;

    public void setInfo(String name,String id,String jobTitle,char gender,int age, double salary){
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
        if (gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
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
        if (age > 18 || age < 65){
            System.err.println("age should be between 18 to 65: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.err.println("Invalid salary: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

/*
    Class named Tester
			Variables:
                    name, gender, age, id, jobTitle, salary

                    Encapsulate all the fields
                    Conditions:
                    1. gender can only be 'M' or 'F'
                    2. age can not be negative
                    3. age MUST be between 18 to 65
                    4. salary can not be negative

                    Methods:
                    setInfo(): sets all the fields
                    testing()
                    toString(): prints tester object info when the object is passed in the print statement


 */