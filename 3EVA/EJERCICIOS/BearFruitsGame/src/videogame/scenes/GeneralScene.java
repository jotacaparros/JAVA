package videogame.scenes;

import javafx.scene.Scene;
import javafx.scene.canvas;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;

public abstract class GeneralScene extends Scene {

    public static final int GAME_WIDTH = 816;
    public static final int GAME_HEIGHT = 480;

    private StackPane root = new StackPane;
    protected GraphicsContext gc;

    public GeneralScene(){

        super(new StackPane(), GAME_WIDTH, GAME_HEIGHT);

        root = new StackPane();
        this.setRoot(root);

        Canvas canvas = new Canvas(GAME_WIDTH, GAME_HEIGHT);
        root.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();

    }

    public abstract  void draw();


}
