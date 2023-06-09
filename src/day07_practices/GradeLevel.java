package day07_practices;

    public class GradeLevel {

        public static void main(String[] args) {

            byte number = 19;
            String gradeLevel = "";

            boolean validNumber = number >= 1 && number <= 18;

            if(validNumber){ // 1 ~ 18

                if(number >= 17){
                    gradeLevel = "Grad School";
                }else if(number >= 13 ){
                    gradeLevel = "College";
                }else if(number >= 9 ){
                    gradeLevel = "High School";
                }else if(number >= 6 ){
                    gradeLevel = "Middle School";
                }else if(number >= 1 ){
                    gradeLevel = "Elementary School";
                }

            }else{
                gradeLevel = "Invalid Grade Level";
            }


            System.out.println(gradeLevel);

        }

    }

/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Note: Assume that the given number is between 1 ~ 18
 */