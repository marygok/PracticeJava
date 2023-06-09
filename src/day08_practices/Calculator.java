package day08_practices;

public class Calculator {

    public static void main(String[] args) {

        int n1 = 4, n2 = 4;
        char operator = '!';

        switch (operator) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;

            case '/':
                System.out.println(n1 / n2);
                break;

            default:
                System.out.println("Invalid Operator");
        }



    }
}
