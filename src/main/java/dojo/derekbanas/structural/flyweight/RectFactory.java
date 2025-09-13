package dojo.derekbanas.structural.flyweight;

import java.awt.*;
import java.util.HashMap;

public class RectFactory {

    private static final HashMap<Color, MyRect> reactsByColor = new HashMap<>();

    public static MyRect getRect(Color color) {
        MyRect rect = (MyRect) reactsByColor.get(color);

        if (rect == null) {
            rect = new MyRect(color);
            reactsByColor.put(color, rect);
        }
        return rect;
    }

}
