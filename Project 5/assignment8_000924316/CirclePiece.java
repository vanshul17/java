package assignment8_000924316;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
 * This is the class header. Put a brief description of your
 * program here, and the date it was created. 2 / 04 / 2024
 *
 * @author vanshul Vanshul
 **/
public class CirclePiece extends Piece {
    private Color color;
    public CirclePiece(int x,int y,Color color){
        super(x,y);
        this.color=color;
    }

    /**
     * Constructor Peice
     *
     * @param x cell coordinate on the grid
     * @param y cell coordinate on the grid.
     */
    public CirclePiece(int x, int y) {
        super(x, y);
    }

    /**
     *To draw circle piece
     */
    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        gc.fillOval((x*200)+75,(y*200)+75, 48, 48);
        gc.setStroke(Color.BLACK);
        //to draw red border if piece is selected
        if(super.isSelected){
            gc.setStroke(Color.RED);
        }
        gc.strokeOval((x*200)+75,(y*200)+75, 48, 48);
    }

}
