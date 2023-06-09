package day08_practices;

    public class Loans {

        public static void main(String[] args) {

            int salary = 60000,
                    creditScore = 700;

            String result = (salary >= 60000 && creditScore >= 650) ? "Loan Approved"
                    : "Loan Denied";

            System.out.println(result);

        }

    }
