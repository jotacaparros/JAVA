package automation.data;

public class Heating extends AutomationElement implements Switcher {

    int temperature;
    String status;

    public Heating(String name, int temperature, String status){
        super(name);
        this.status = status;
        this.temperature = temperature;

    }

    public String getStatus() {
        return status;
    }

    public int getTemperature() {
        return temperature;

    }

    public int setTemperature(int temperature) {

        return temperature;


    }

    @Override
    public void switchOn() {
        status = "Is currently switched on";

    }

    @Override
    public void switchOff() {
        status = "Is currently switched off";
    }

    @Override
    public String toString() {
        return super.toString() + " " + status;
    }
}
