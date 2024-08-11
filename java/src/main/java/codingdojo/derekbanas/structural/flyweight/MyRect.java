package codingdojo.derekbanas.structural.flyweight;

import java.awt.*;

public class MyRect {

    private Color color;

    public MyRect(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {
        g.setColor(color);
        g.fillRect(upperX, upperY, lowerX, lowerY);
    }

}
