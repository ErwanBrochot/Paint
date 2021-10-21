package fr.ensea.project2A.Paint;

import java.awt.*;

public class Rectangle extends Figure {

   protected int length;
   protected  int width;
//Constructeurs


    public Rectangle(Point origin,int px, int py, Color color){
        super();
        this.origin=origin;
        c=color;
        setBoundingBox(px,py);


    }



    @Override
    protected void setBoundingBox(int heightBB, int widthBB) {
        width=widthBB;
        length=heightBB;
    }



    @Override
    protected void draw(Graphics g) {

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + c +
                ", origin= "+ origin+
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    //Getter

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    //Setter

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
