package automation.data;

public class GarageDoor extends Door implements Raiser {

    int totalPercent;

    public GarageDoor(String name, String status, int totalPercent) {
        super(name, status);
        this.totalPercent = totalPercent;
    }

    @Override
    public void raise(){
        totalPercent = 100;
    }

    @Override
    public void lower(){
        totalPercent = 0;
    }

    @Override
    public void raise(int totalPercent) {

        if (this.totalPercent + totalPercent <= 100) {
            this.totalPercent = this.totalPercent + totalPercent;
        }
    }

    @Override
    public void lower(int totalPercent) {

        if (this.totalPercent - totalPercent >= 0) {
            this.totalPercent = this.totalPercent - totalPercent;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + totalPercent;
    }

    public int getPercent() {
        return totalPercent;
    }


}
