package automation.data;

public abstract class AutomationElement {
    protected String name;

    public AutomationElement(String name){

        this.name = name;

    }

    @Override
    public String toString() {
        return name;
    }
}
