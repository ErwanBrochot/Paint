package fr.ensea.project2A.Paint;

import java.awt.*;

public class Circle extends Ellipse{
    public Circle( int px, int py, Color c) {
        super(px,py,c);
        setBoundingBox(0,0);
    }

    @Override
    public String toString() {
        return "Circle{semiAxisX="+semiAxisX+ " semiAxisY= "+ semiAxisY + " Color:"+ c + "origin"+ origin+ "}";
    }

    @Override
    protected void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);

        if (heightBB<widthBB){
            semiAxisX=heightBB/2;
            semiAxisY=heightBB/2;
        }
        else{
            semiAxisX=widthBB/2;
            semiAxisY=widthBB/2;
        }
    }
}
