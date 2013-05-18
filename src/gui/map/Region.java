package gui.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import util.RectArea;

public class Region {
    
    // Properties
    private ArrayList <RectArea> rectAL;
    
    public static final Region AFRICA = new Region(new RectArea [] {
        new RectArea(270, 175, 350, 175, 270, 220, 350, 220),
        new RectArea(310, 210, 385, 210, 310, 290, 385, 290)
    });
    
    public static final Region ASIA = new Region(new RectArea [] {
        new RectArea(360, 40, 600, 40, 360, 110, 600, 110),
        new RectArea(360, 110, 545, 110, 360, 175, 545, 175),
        new RectArea(375, 175, 505, 175, 375, 200, 505, 200),
        new RectArea(450, 200, 510, 200, 450, 240, 510, 240)
    });
    
    public static final Region EUROPE = new Region(new RectArea [] {
       new RectArea(285, 110, 345, 110, 285, 160, 345, 160),
       new RectArea(310, 60, 355, 60, 310, 120, 355, 120)
    });
    
    public static final Region NORTH_AMERICA = new Region(new RectArea [] {
        new RectArea(20, 60, 200, 60, 20, 110, 200, 110),
        new RectArea(90, 0, 250, 0, 90, 105, 250, 105),
        new RectArea(90, 100, 200, 100, 90, 205, 200, 205)
    });
    
    public static final Region OCEANIA = new Region(new RectArea [] {
        new RectArea(485, 250, 600, 250, 485, 330, 600, 330),
    });
    
    public static final Region SOUTH_AMERICA = new Region(new RectArea [] {
       new RectArea(170, 210, 230, 210, 170, 270, 230, 270),
       new RectArea(175, 270, 210, 270, 175, 340, 210, 340)
    });
    
    // Constructor
    public Region(RectArea ... ra) {
        rectAL = new ArrayList(Arrays.asList(ra));
    }
    
    public boolean mouseWithin(int x, int y) {
        //System.out.println(rectAL.size());
        for(int i = 0; i < rectAL.size(); i++) {
            // the "highness" of y is inversed due to top being considered y = 0
            if(x > rectAL.get(i).getULX() & x < rectAL.get(i).getURX() & y < rectAL.get(i).getDLY() & y > rectAL.get(i).getULY()) {
                return true;
            }
        }
        return false;
    }
    
}
