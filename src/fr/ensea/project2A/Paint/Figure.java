package fr.ensea.project2A.Paint;
import java.awt.*;

public abstract class Figure {

    protected Color c;
    protected Point origin;

    //Constructeur
    public Figure (Color color, Point point){
            c=color;
            origin=point;
    }
    public Figure (){
        c=null;
        origin=null;
    }


    //Methods
    protected abstract void setBoundingBox(int heightBB, int widthBB);
    protected abstract void draw (Graphics g);

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }


    @Override
    public String toString() {
        return "Figure{" +
                "Color=" + c +
                '}';
    }
}
