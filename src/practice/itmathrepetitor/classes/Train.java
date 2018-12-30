package practice.itmathrepetitor.classes;

public class Train implements Comparable<Train>{

    private String nameStartStation;

    private int numberOfTrain;

    private String departureTime;

    public String getNameStartStation() {
        return nameStartStation;
    }

    public void setNameStartStation(String nameStartStation) {
        this.nameStartStation = nameStartStation;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public int compareTo(Train o) {
        return String.valueOf(numberOfTrain).compareTo(String.valueOf(o.numberOfTrain));
    }
}
