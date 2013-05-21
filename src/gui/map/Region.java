package gui.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import util.RectArea;

public class Region {
    
    // Properties
    private ArrayList <RectArea> rectAL;
    
    /*
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
        new RectArea(285, 105, 355, 105, 285, 165, 355, 165)
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
    */
    
    
    public static Region NORTH_AMERICA;
    
    public static Region MESO_AMERICA;
    
    public static Region SOUTH_AMERICA;
    
    public static Region EUROPE;
    
    public static Region MIDDLE_EAST;
    
    public static Region NORTH_ASIA;
    
    public static Region EAST_ASIA;
    
    public static Region SOUTH_ASIA;
    
    public static Region NORTH_AFRICA;
    
    public static Region SUB_SAHARAN_AFRICA;
    
    public static Region WEST_AFRICA;
    
    public static Region OCEANIA;
    
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
