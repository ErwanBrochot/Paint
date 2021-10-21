package fr.ensea.project2A.Paint;

import java.awt.*;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello World!");
        Point b= new Point (2,3);
//        Point a= new Point (1,2);
        // On crée la distance entre 2 point
//        int px=b.getX()-a.getX();
//        int py=b.getY()-a.getY();
//        Rectangle rect= new Rectangle (px,py,Color.blue);
        Rectangle rect= new Rectangle (b,3,4,Color.blue);
        Ellipse elli= new Ellipse(b,10,16,Color.blue);
        Square carr= new Square (b,16,15,Color.red);
        Circle circ= new Circle(b,16,16,Color.green);
        System.out.println(b);
        System.out.println(rect);
        System.out.println(elli);
        System.out.println(carr);
        System.out.println(circ);
        Window fen= new Window("Paint",800,600);
    }
}
