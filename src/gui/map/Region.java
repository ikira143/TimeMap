package gui.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import util.RectArea;

public class Region {
    
    // Properties
    private ArrayList <RectArea> rectAL;
    
    /*
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
    */
    
    public static final Region NORTH_AMERICA = new Region(new RectArea [] {
       new RectArea(20, 60, 230, 60, 20, 105, 230, 105),
       new RectArea(90, 0, 270, 0, 90, 70, 270, 70),
       new RectArea(90, 100, 200, 100, 90, 180, 200, 180)
    });
    
    public static final Region MESO_AMERICA = new Region(new RectArea [] {
       new RectArea(115, 180, 200, 180, 115, 210, 200, 210) 
    });
    
    public static final Region SOUTH_AMERICA = new Region(new RectArea [] {
       new RectArea(165, 210, 205, 210, 165, 340, 205, 340),
       new RectArea(205, 220, 235, 220, 205, 285, 235, 285)
    });
    
    public static final Region EUROPE = new Region(new RectArea [] {
        new RectArea(320, 60, 355, 60, 320, 105, 355, 105),
        new RectArea(285, 105, 340, 105, 285, 165, 340, 165)
    });
    
    public static final Region MIDDLE_EAST = new Region(new RectArea [] {
       new RectArea(340, 130, 410, 130, 340, 205, 410, 205) 
    });
    
    public static final Region NORTH_ASIA = new Region(new RectArea [] {
       new RectArea(355, 55, 600, 55, 355, 130, 600, 130) 
    });
    
    public static final Region EAST_ASIA = new Region(new RectArea [] {
       new RectArea(410, 130, 535, 130, 410, 190, 535, 190) 
    });
    
    public static final Region SOUTH_ASIA = new Region(new RectArea [] {
       new RectArea(410, 190, 525, 190, 410, 240, 525, 240) 
    });
    
    public static final Region NORTH_AFRICA = new Region(new RectArea [] {
       new RectArea(275, 170, 340, 170, 275, 200, 340, 200) 
    });
    
    public static final Region SUB_SAHARAN_AFRICA = new Region(new RectArea [] {
       new RectArea(320, 200, 340, 200, 320, 290, 340, 290),
       new RectArea(340, 205, 380, 205, 340, 275, 380, 275)
    });
    
    public static final Region WEST_AFRICA = new Region(new RectArea [] {
       new RectArea(270, 200, 320, 200, 270, 220, 320, 220) 
    });
    
    public static final Region OCEANIA = new Region(new RectArea [] {
        new RectArea(525, 230, 600, 230, 525, 320, 600, 320),
        new RectArea(490, 250, 530, 250, 490, 290, 530, 290)
    });
    
    // Constructor
    public Region(RectArea ... ra) {
        rectAL = new ArrayList(Arrays.asList(ra));
    }
    
    public boolean mouseWithin(int x, int y) {
        //System.out.println(rectAL.size());
        for(int i = 0; i < rectAL.size(); i++) {
            // the "highness" of y is inversed due to top being considered y = 0
            if(x >= rectAL.get(i).getULX() & x <= rectAL.get(i).getURX() & y <= rectAL.get(i).getDLY() & y >= rectAL.get(i).getULY()) {
                return true;
            }
        }
        return false;
    }
    
}
