package fr.ensea.project2A.Paint;

import java.awt.*;

public class Square extends Rectangle{


    public Square(Point origin, int px, int py, Color color) {
        super(origin, px, py, color);
        if (px<py){
            setBoundingBox(px,px);
        }
        else{
            setBoundingBox(py,py);
        }
    }

    @Override
    public String toString() {
        return "Carré: origine="+ origin + "couleur:" +c +"width= "+ width + "length= "+ length;
    }
}

