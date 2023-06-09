package day12_practices;

public class EmailDomain {


    public static void main(String[] args) {

        emailDomain("mary@gmail.com");


    }


    public static void emailDomain(String email) {

            String domain = email.substring(email.indexOf("@" +1), email.lastIndexOf("."));
            System.out.println(domain);
        }

    }

