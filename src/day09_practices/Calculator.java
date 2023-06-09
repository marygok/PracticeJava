package day09_practices;

import java.util.Scanner;

    public class Calculator {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your first number");

            double number = input.nextDouble();

            System.out.println("Enter your math operator");

            char operator =  input.next().charAt(0);

            System.out.println("enter your second number");

            int number2 = input.nextInt();

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/'){

                if(operator == '+'){
                    System.out.println(number + number2);
                }else if(operator == '-'){
                    System.out.println(number - number2);
                }else if(operator == '*'){
                    System.out.println(number * number2);
                }else if(operator == '/'){
                    System.out.println(number / number2);
                }

            }else{

                System.out.println("wrong operator");

            }


        }
    }
