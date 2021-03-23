package automation.main;

import automation.data.Awning;
import automation.data.Blind;
import automation.data.Window;
import automation.data.Door;
import automation.data.Heating;
import automation.data.Oven;
import automation.data.GarageDoor;
import automation.data.Light;



public class Main {

    public static void main(String[] args){


        Window kitchenWindow =   new Window("Kitchen Window", "Lock", new Blind("Kitchen Blind", 60));
        Awning kitchenAwning = new Awning("Kitchen Awning", 100);
        Door kitchenDoor = new Door("Kitchen Door", "Open");
        GarageDoor redDoor = new GarageDoor("Red Garage Door", "Open",0);
        Heating hallHeating = new Heating("Hall heating", 22, "Is currently switched on");
        Oven principalOven = new Oven("Principal Oven", 110, "Is currently switched on");
        Light hallLight = new Light("Hall light", "Is currently switched off");

        //Testing Window

        System.out.println("---Window & Blind---");
        System.out.println(kitchenWindow);

        //Testing Awning
        System.out.println("---Awning---");

        System.out.println(kitchenAwning);

        kitchenAwning.lower(30);

        System.out.println(kitchenAwning);


        //Testing Door

        System.out.println("---Door---");

        System.out.println(kitchenDoor);

        kitchenDoor.unLock();

        System.out.println(kitchenDoor);

        kitchenDoor.lock();

        System.out.println(kitchenDoor);


        //Testing Garage Door
        System.out.println("---Garage Door---");

        System.out.println(redDoor);

        redDoor.raise(40);

        redDoor.getStatus();

        System.out.println(redDoor);

        redDoor.getStatus();

        //Testing heating

        System.out.println("---Heating---");

        System.out.println(hallHeating);

        hallLight.getStatus();

        //Testing Oven

        System.out.println("---Oven---");

        //Testing Light
        System.out.println("---Light---");

        System.out.println(hallLight);

        hallLight.switchOff();

        System.out.println(hallLight);

        hallLight.switchOn();

        System.out.println(hallLight);

        hallLight.getStatus();







    }
}
