package assignment8_000924316;

import javafx.scene.canvas.GraphicsContext;
/**
 * This is the class header. Put a brief description of your
 * program here, and the date it was created. 2 / 04 / 2024
 *
 * @author vanshul Vanshul
 **/

public abstract class Piece {

    //x y coordinate of the piece on grid
    protected int x,y;
    //to set true if piece is selected else false
    protected boolean isSelected;

    /**
     * Constructor Peice
     *
     * @param x  cell coordinate on the grid
     * @param y  cell coordinate on the grid.
     */
    public Piece(int x,int y){
        this.x=x;
        this.y=y;
    }
    public abstract void draw(GraphicsContext gc);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

}
