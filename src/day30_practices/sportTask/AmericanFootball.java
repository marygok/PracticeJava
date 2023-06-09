package day30_practices.sportTask;

public class AmericanFootball extends Sport{

    private int numberOfTouchdowns;

    public AmericanFootball(String name, String rules, int numberOfPlayers, int numberOfReferee, int numberOfTouchdowns) {
        super(name, rules, numberOfPlayers, numberOfReferee);
        this.numberOfTouchdowns = numberOfTouchdowns;
    }

    public int getNumberOfTouchdowns() {
        return numberOfTouchdowns;
    }

    public void setNumberOfTouchdowns(int numberOfTouchdowns) {
        this.numberOfTouchdowns = numberOfTouchdowns;
    }
}
