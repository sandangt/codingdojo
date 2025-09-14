package dojo.designpattern.derekbanas.structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FlyweightTest extends JFrame {

    private JButton startDrawing;
    private int windowWidth = 1750;
    private int windowHeight = 150;
    private Color[] shapeColor = {
        Color.orange, Color.red, Color.yellow, Color.blue, Color.pink, Color.cyan,
        Color.magenta, Color.black, Color.gray
    };

    public FlyweightTest() {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        final JPanel drawingPanel = new JPanel();
        startDrawing = new JButton("Draw Stuff");
        contentPanel.add(drawingPanel, BorderLayout.CENTER);
        contentPanel.add(startDrawing, BorderLayout.SOUTH);
        startDrawing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();
                long startTime = System.currentTimeMillis();
                for (int i=0; i< 100_000; ++i) {
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
                }
                long endTime = System.currentTimeMillis();
                System.out.println("That took " + (endTime - startTime));
            }
        });
        this.add(contentPanel);
        this.setVisible(true);
    }

    private Color getRandColor() {
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(shapeColor.length);
        return shapeColor[randInt];
    }

    private int getRandX() {
        return (int) (Math.random() * windowWidth);
    }

    private int getRandY() {
        return (int) (Math.random() * windowHeight);
    }

    public static void main(String[] args) {
        new FlyweightTest();
    }

}
