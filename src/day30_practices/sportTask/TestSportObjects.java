package day30_practices.sportTask;

public class TestSportObjects {

    public static void main(String[] args) {

        AmericanFootball americanFootball = new AmericanFootball("American Football","Each team has 4 downs to gain 10 or more yards",11,4,5);
        System.out.println(americanFootball);

        Basketball basketball = new Basketball("Basketball","Only 5 players per team on the court",5,1,2);
        System.out.println(basketball);

        Baseball baseball = new Baseball("Baseball","Ball and strikes",9,2);
        System.out.println(baseball);

        Football football = new Football("Football","Corner Kicks & Goal Kicks",11,2,1);
        System.out.println(football);

        System.out.println("-----------------------------------------------------");

        americanFootball.play();
        basketball.play();
        baseball.play();
        football.play();






    }

}
