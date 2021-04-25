package videogame.scenes;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.awt.*;

public class WelcomeScene extends GeneralScene {

    public WelcomeScene(){

        super();
        showWelcomeMessage();
    }
    private void showWelcomeMessage(){

        Font myFont = Font.font("Arial", FontWeight.BLACK, 32);
        gc.setFont(myFont);
        gc.setFont(Color.RED);
        gc.fillText("Bear Fruit Challenge", 275, 200);

        myFont = Font.font("Arial", FontWeight.NORMAL, 20);
        gc.setFont(myFont);
        gc.setFill(Color.WHITE);
        gc.fillText("Press Spacebar to play", 325, 275);
    }

    @Override
    public void draw() {

        showWelcomeMessage();
    }
}
