package day30_practices.sportTask;

public class Basketball extends Sport {

    private int numberOfBaskets;

    public Basketball(String name, String rules, int numberOfPlayers, int numberOfReferee, int numberOfBaskets) {
        super(name, rules, numberOfPlayers, numberOfReferee);
        this.numberOfBaskets = numberOfBaskets;
    }

    public int getNumberOfBaskets() {
        return numberOfBaskets;
    }

    public void setNumberOfBaskets(int numberOfBaskets) {
        this.numberOfBaskets = numberOfBaskets;
    }
}
