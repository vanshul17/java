package assignment8_000924316;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This is the class header. Put a brief description of your
 * program here, and the date it was created. 2 / 04 / 2024
 *
 * @author vanshul Vanshul
 **/

public class SquarePiece extends Piece{

    //to set color of piece
    private Color color;
    /**
     * Constructor Piece
     *
     * @param x  cell coordinate on the grid
     * @param y  cell coordinate on the grid
     * @param color of the piece
     */
    public SquarePiece(int x,int y,Color color){
        super(x,y);
        this.color=color;
    }

    /**
     * TO draw square piece
     */
    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.setLineWidth(3);
        gc.fillRect((x*200)+75,(y*200)+75, 48, 48);
        gc.setStroke(Color.BLACK);
        //to draw red border if piece is selected
        if(super.isSelected){
            gc.setStroke(Color.RED);
        }
        gc.strokeRect((x*200)+75,(y*200)+75, 48, 48);
    }


}
