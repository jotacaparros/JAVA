package automation.data;

public class Window extends AutomationElement implements Locker {
 String status;
 Blind blinds;
    public Window(String name,String status, Blind blinds){

        super(name);

        this.status = status;

        this.blinds = blinds;

    }
//Get blind en Window para poder interactuar con los metodos de la clase
    public Blind getBlinds() {
        return blinds;
    }

    @Override
    public void lock() {

        status = "Locked";
    }

    @Override
    public void unLock() {

        status = "Unlocked";

    }

    @Override
    public String toString() {
        return super.toString() + " " + status + " " + blinds;
    }
}
