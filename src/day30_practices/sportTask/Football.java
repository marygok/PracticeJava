package day30_practices.sportTask;

public class Football extends Sport {

    private int numberOfGoals;

    public Football(String name, String rules, int numberOfPlayers, int numberOfReferee, int numberOfGoals) {
        super(name, rules, numberOfPlayers, numberOfReferee);
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }
}
