package automation.main;


import automation.data.AutomationElement;
import automation.data.Blind;
import automation.data.Door;
import automation.data.Window;
import automation.data.GarageDoor;
import automation.data.Heating;

public class Management {
    AutomationElement[] elements;

    public Management(){
        elements = new AutomationElement[10];
        elements[0] = new Window("Room", "Loc", new Blind("Room", 2));
        elements[1] = new Door();
        elements[2] = new GarageDoor();
        elements[3] = new Heating();
        elements[3] = new Oven();
        elements[3] = new 
    }
}
