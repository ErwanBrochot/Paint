package fr.ensea.project2A.Paint;

import java.awt.*;

public class Circle extends Ellipse {
    public Circle(int px, int py, Color c) {
        super(px, py, c);
        setBoundingBox(0, 0);
    }

    @Override
    public String toString() {
        return "Circle{semiAxisX=" + semiAxisX + " semiAxisY= " + semiAxisY + " Color:" + c + "origin" + origin + "}";
    }

    @Override
    protected void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);

        if (heightBB < widthBB) {
            semiAxisX = heightBB / 2;
            semiAxisY = heightBB / 2;
        } else {
            semiAxisX = widthBB / 2;
            semiAxisY = widthBB / 2;
        }
    }

    @Override
    protected void setBoundingBox(Point origin, Point second) {
        super.setBoundingBox(origin, second);
        if (semiAxisX < semiAxisY) {
            semiAxisY = semiAxisX;

            if (origin.getX() < second.getX() & second.getY() < origin.getY()) { // tire en haut à droite
                super.origin.setY(origin.getY() - semiAxisY * 2);

            } else if (second.getX() < origin.getX() & second.getY() < origin.getY()) { // tire en haut à gauche
                super.origin.setY(origin.getY() - semiAxisY * 2);
            }
        } else {
            semiAxisX = semiAxisY;

            if (second.getX() < origin.getX() & origin.getY() < second.getY()) { // Tire en bas a à gauche
                super.origin.setX(origin.getX() - semiAxisX * 2);
            } else if (second.getX() < origin.getX() & second.getY() < origin.getY()) { // tire en haut à gauche
                super.origin.setX(origin.getX() - semiAxisX * 2);
            }
        }
    }
}
