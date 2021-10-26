package fr.ensea.project2A.Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener {
    private Color c;
    private final ArrayList<Figure> list;
    private String nameFigure;
    private  int x;
    private  int y;

    public Drawing() {
        super();
        this.setBackground(Color.white);
        list=new ArrayList<Figure>();
        nameFigure=null;
        x=0;
        y=0;
        c= Color.white;
        addMouseListener(this);
        addMouseMotionListener(this);


    }

    public void setC(Color c) {
        this.c = c;
    }

    public ArrayList<Figure> getList() {
        return list;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    Figure figure;
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if(c!=Color.white){
            switch (nameFigure) {
                case "Rectangle":
                    list.add(figure=new Rectangle(x, y, c));
                    figure.origin=(new Point(e.getX(),e.getY()));
                    break;
                case "Ellipse":
                    list.add(figure=new Ellipse(x, y, c));
                    figure.origin=(new Point(e.getX(),e.getY()));
                    break;
                case "Square":
                    list.add(figure=new Square(x, y, c));
                    figure.origin=(new Point(e.getX(),e.getY()));

                    break;
                case "Circle":
                    list.add(figure=new Circle(x, y, c));
                    figure.origin=(new Point(e.getX(),e.getY()));
                    break;
            }

        }
        System.out.println(list);
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        x=e.getX()-figure.origin.getX();
        y=e.getY()-figure.origin.getY();
        figure.setBoundingBox(y,x);
        System.out.println("x= "+x +" ,y="+y);
        System.out.println(list);
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x=e.getX()-figure.origin.getX();
        y=e.getY()-figure.origin.getY();
        figure.setBoundingBox(y,x);
        System.out.println("x= "+x +" ,y="+y);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


    @Override
    public String toString() {
        return "Drawing{" +
                "list=" + list +
                "}";
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);
        for (Figure f:list){
            f.draw(g);
            this.repaint();
        }

        }
    }

