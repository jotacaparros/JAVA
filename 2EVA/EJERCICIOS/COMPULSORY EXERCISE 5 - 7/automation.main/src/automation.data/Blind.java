package automation.data;

public class Blind extends AutomationElement implements Raiser {

   private int totalPercent;

    public Blind(String name, int totalPercent) {

        super(name);
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

    public int getPercent() {
        return totalPercent;
    }

    @Override
    public String toString() {
        return super.toString() + " " + totalPercent;
    }


}
