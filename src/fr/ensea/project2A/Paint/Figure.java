package fr.ensea.project2A.Paint;

import java.awt.*;
import java.io.Serializable;

public abstract class Figure implements Serializable {

    protected Color c;
    protected Point origin;

    //Constructeur
    public Figure(Color color, Point point) {
        c = color;
        origin = point;
    }

    public Figure() {
        c = new Color(255, 255, 255);
        origin = new Point(0, 0);
    }


    //Methods
    protected abstract void setBoundingBox(int heightBB, int widthBB);

    protected abstract void setBoundingBox(Point a, Point b);

    protected abstract void draw(Graphics g);

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "Color=" + c +
                '}';
    }
}
