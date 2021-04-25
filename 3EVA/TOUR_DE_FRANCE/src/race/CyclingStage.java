package race;



import java.text.SimpleDateFormat;
import java.util.Date;

public class CyclingStage implements Comparable<CyclingStage> {

        private String date;
        private float kilometres;
        private String winner;

    public CyclingStage(String date, float kilometres, String winner) {
        this.date = date;
        this.kilometres = kilometres;
        this.winner = winner;
    }

    public CyclingStage() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getKilometres() {
        return kilometres;
    }

    public void setKilometres(float kilometres) {
        this.kilometres = kilometres;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return date + " (" + kilometres + ") " + winner;
    }

    @Override
    public int compareTo(CyclingStage c) {
        return this.date.compareTo(c.getDate());
    }
}
