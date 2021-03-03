package automation.data;

public class Blind extends AutomationElement {

   private int totalPercent;


    public void raise(){
        totalPercent = 100;
    }

    public void lower(){
        totalPercent = 0;
    }

    public void raise(int totalPercent) {

        if (this.totalPercent + totalPercent <= 100) {
            this.totalPercent = this.totalPercent + totalPercent;
        }
    }

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
        return this.name + " " + totalPercent;
    }

    public Blind(String name, int totalPercent) {

        super(name);
        this.totalPercent = totalPercent;



    }

}
