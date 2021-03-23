package automation.data;

public class Light extends AutomationElement implements Switcher {
    String status;

    public Light(String name, String status){

        super (name);
        this.status = status;

    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return super.toString() + " " + status;
    }

    @Override
    public void switchOn() {

        status = "Light is currently switched on";

    }

    @Override
    public void switchOff() {

        status = "Light is currently switched off";
    }
}
