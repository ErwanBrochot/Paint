package fr.ensea.project2A.Paint;

import javax.management.StandardEmitterMBean;
import java.awt.*;

public class Ellipse extends Figure {
    protected int semiAxisX;
    protected int semiAxisY;

    public Ellipse(Point origin,int px, int py, Color c) {
        super();
        this.origin=origin;
        this.c=c;
        setBoundingBox(px,py);
    }

    @Override
    protected void setBoundingBox(int heightBB, int widthBB) {
        semiAxisX=heightBB/2;
        semiAxisY=widthBB/2;
    }

    @Override
    protected void draw(Graphics g) {

    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "semiAxisX=" + semiAxisX +
                ", semiAxisY=" + semiAxisY +
                ", c=" + c +
                ", origin=" + origin +
                '}';
    }
}
