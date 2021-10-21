package fr.ensea.project2A.Paint;

import java.awt.*;

public class Circle extends Ellipse{
    public Circle(Point origin, int px, int py, Color c) {
        super(origin, px, py, c);
        if (px<py){
            setBoundingBox(px,px);
        }
        else{
            setBoundingBox(py,py);
        }
    }

    @Override
    public String toString() {
        return "Circle{semiAxisX="+semiAxisX+ " semiAxisY= "+ semiAxisY + " Color:"+ c + "origin"+ origin+ "}";
    }
}
