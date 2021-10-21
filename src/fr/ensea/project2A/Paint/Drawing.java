package fr.ensea.project2A.Paint;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends JPanel {
    private Color c;
    private ArrayList<Figure> list;
    private String nameFigure;
    private int x;
    private int y;

    public Drawing(){
        this.setBackground(Color.white);
        list=null;
        nameFigure=null;
        x=0;
        y=0;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }
}
