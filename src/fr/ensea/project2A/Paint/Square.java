package fr.ensea.project2A.Paint;

import java.awt.*;

public class Square extends Rectangle{


    public Square( int px, int py, Color color) {
        super( px, py, color);
        setBoundingBox(0,0);
    }

    @Override
    public String toString() {
        return "Carré: origine="+ origin + "couleur:" +c +"width= "+ width + "length= "+ length;
    }

    @Override
    protected void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);
        if (heightBB<widthBB){
            length=widthBB;
            width=widthBB;
        }
        else{
            length=heightBB;
            width=heightBB;
        }
    }
}

