package day30_practices.sportTask;

public class Baseball extends Sport{

    private int numberOfInnings;

    public Baseball(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        super(name, rules, numberOfPlayers, numberOfReferee);
    }

    public int getNumberOfInnings() {
        return numberOfInnings;
    }

    public void setNumberOfInnings(int numberOfInnings) {
        this.numberOfInnings = numberOfInnings;
    }
}
