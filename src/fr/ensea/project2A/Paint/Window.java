package fr.ensea.project2A.Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Window extends JFrame implements ActionListener {

         public Window(String title,int x,int y){
                 this.setTitle(title);
                 this.setSize(x,y);
                 this.setVisible(true);
                 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 Container contentPanel= this.getContentPane();
                 //Boutons
                 JButton darkButton=new JButton ("dark");
                 darkButton.setBackground(Color.BLACK);
                 darkButton.setForeground(Color.white);
                 darkButton.addActionListener(this);
                 JButton redButton=new JButton ("red");
                 redButton.setBackground(Color.red);
                 redButton.addActionListener(this);
                 JButton greenButton=new JButton ("green");
                 greenButton.setBackground(Color.green);
                 greenButton.addActionListener(this);
                 JButton blueButton=new JButton ("blue");
                 blueButton.setBackground(Color.blue);
                 blueButton.setForeground(Color.white);
                 blueButton.addActionListener(this);
                 JButton yellowButton=new JButton ("yellow");
                 yellowButton.setBackground(Color.yellow);
                 yellowButton.addActionListener(this);
                 JButton pinkButton=new JButton ("pink");
                 pinkButton.setBackground(Color.pink);
                 pinkButton.addActionListener(this);
                 JButton magentaButton=new JButton ("magenta");
                 magentaButton.setBackground(Color.magenta);
                 magentaButton.addActionListener(this);
                 JButton orangeButton=new JButton ("orange");
                 orangeButton.setBackground(Color.orange);
                 orangeButton.addActionListener(this);
                 JButton ellipseButton=new JButton ("Ellipse");
                 ellipseButton.addActionListener(this);
                 JButton circleButton=new JButton ("Circle");
                 circleButton.addActionListener(this);
                 JButton rectangleButton=new JButton ("Rectangle");
                 rectangleButton.addActionListener(this);
                 JButton squareButton=new JButton ("Square");
                 squareButton.addActionListener(this);
                 // menu
                 JMenuBar menuBar=new JMenuBar();
                 JMenu file= new JMenu("File");
                 JMenu aPropos= new JMenu("A propos");
                 JMenuItem newMenuItem= new JMenuItem("New");
                 newMenuItem.addActionListener(this);
                 JMenuItem openMenuItem= new JMenuItem("Open");
                 JMenuItem saveMenuItem= new JMenuItem("Save");
                 saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
                 JMenuItem quitMenuItem= new JMenuItem("Quit");
                 file.add(newMenuItem);
                 file.add(openMenuItem);
                 file.add(saveMenuItem);
                 file.add(quitMenuItem);
                 menuBar.add(file);
                 menuBar.add(aPropos);
                 //Jpanel
                 JPanel southPanel=new JPanel();
                 southPanel.setLayout(new GridLayout(2,6));
                 southPanel.add(darkButton);
                 southPanel.add(redButton);
                 southPanel.add(greenButton);
                 southPanel.add(blueButton);
                 southPanel.add(ellipseButton);
                 southPanel.add(circleButton);
                 southPanel.add(yellowButton);
                 southPanel.add(pinkButton);
                 southPanel.add(magentaButton);
                 southPanel.add(orangeButton);
                 southPanel.add(rectangleButton);
                 southPanel.add(squareButton);
                 contentPanel.add(southPanel, BorderLayout.SOUTH);
                 contentPanel.add(new Drawing());
                 this.setJMenuBar(menuBar);
                 this.setVisible(true);
         }

         public static void main (String[] args){
         Window win = new Window("Paint",800,600);
         }

        @Override
        public void actionPerformed(ActionEvent e) {
                String cmd= e.getActionCommand();

                //Interaction avec les boutons
                switch (cmd)
                {
                        case "dark":
                                System.out.println("dark has been selected");
                                break;
                        case "red":
                                System.out.println("red has been selected");
                                break;
                        case "blue":
                                System.out.println("blue has been selected");
                                break;
                        case "green":
                                System.out.println("green has been selected");
                                break;
                        case "yellow":
                                System.out.println("yellow has been selected");
                                break;
                        case "pink":
                                System.out.println("pink has been selected");
                                break;
                        case "magenta":
                                System.out.println("magenta has been selected");
                                break;
                        case "orange":
                                System.out.println("Orange has been selected");
                                break;
                        case "Ellipse":
                                System.out.println("Ellipse has been selected");
                                break;
                        case "Circle":
                                System.out.println ("Circle has been selected");
                                break;
                        case "Rectangle":
                                System.out.println ("Rectangle has been selected");
                                break;
                        case "Square":
                                System.out.println("Square has been selected");
                                break;
                        case "New":
                                System.out.println("New has been selected");
                }
        }
}



