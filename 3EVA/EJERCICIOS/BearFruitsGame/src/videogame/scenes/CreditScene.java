package videogame.scenes;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class CreditScene extends GeneralScene {

    public CreditScene(){

        super();
    }

    private void showCreditsMessage(){

        Font myFont = Font.font("Arial", FontWeight.NORMAL, 32);
        gc.setFont(myFont);
        gc.setFill(Color.GREEN);
        gc.fillText("Game Over", 325, 200);

        myFont = Font.font("Arial", FontWeight.NORMAL, 20);
        gc.setFont(myFont);
        gc.setFill(Color.GREEN);
        gc.fillText("Press spacebar to go back to wlcome scene", 200, 275);
    }

    @Override
    public void draw() {
        showCreditsMessage();
    }
}
