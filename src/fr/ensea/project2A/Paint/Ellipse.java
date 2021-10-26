package fr.ensea.project2A.Paint;

import javax.management.StandardEmitterMBean;
import java.awt.*;

public class Ellipse extends Figure {
    protected int semiAxisX;
    protected int semiAxisY;

    public Ellipse(int px, int py, Color color) {
        super(color,new Point(px,py));
        this.c=c;
        setBoundingBox(0,0);
    }

    @Override
    protected void setBoundingBox(int heightBB, int widthBB) {
        semiAxisX=widthBB/2;
        semiAxisY=heightBB/2;
    }

    @Override
    protected void draw(Graphics g) {
        g.setColor(c);
        g.drawOval(origin.getX(), origin.getY(), semiAxisX*2,semiAxisY*2);
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
