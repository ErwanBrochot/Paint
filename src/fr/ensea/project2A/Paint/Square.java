package fr.ensea.project2A.Paint;

import java.awt.*;

/* La classe Square hérite de Rectangle, elle récupère donc ses attributs et donc ceux de Figure aussi. Elle recupère
 * aussi ses constructeurs et ses méthodes.
 * J'ai ajouté des règles sur la construction de la BoundingBox afin d'obtenir deux longeures égales et interdire le glissement
 * de la figure  lorsque nous essayons de tracer dans les sens qui ne sont pas naturels pour la méthode draw. */

public class Square extends Rectangle {

    public Square(int px, int py, Color color) {
        super(px, py, color);
        setBoundingBox(0, 0);
    }

    @Override
    public String toString() {
        return "Carré: origine=" + origin + "couleur:" + c + "width= " + width + "length= " + length;
    }

    @Override
    protected void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);
        if (heightBB < widthBB) {
            length = heightBB;
            width = heightBB;
        } else {
            length = widthBB;
            width = widthBB;
        }
    }

    @Override
    protected void setBoundingBox(Point origin, Point second) {
        super.setBoundingBox(origin, second);
        if (width < length) {
            length = width;

            if (origin.getX() < second.getX() & second.getY() < origin.getY()) { // tire en haut à droite
                super.origin.setY(origin.getY() - length);

            } else if (second.getX() < origin.getX() & second.getY() < origin.getY()) { // tire en haut à gauche
                super.origin.setY(origin.getY() - length);
            }
        } else {
            width = length;

            if (second.getX() < origin.getX() & origin.getY() < second.getY()) { // Tire en bas a à gauche
                super.origin.setX(origin.getX() - width);
            } else if (second.getX() < origin.getX() & second.getY() < origin.getY()) { // tire en haut à gauche
                super.origin.setX(origin.getX() - width);
            }
        }
    }
}

