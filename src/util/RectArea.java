package util;

// Custom data structure that forms the rectangular portions within the map
public class RectArea {
    
    // Properties
    private int ulx, uly, urx, ury, dlx, dly, drx, dry;
    
    // Constructor
    public RectArea(int ulx, int uly, int urx, int ury, int dlx, int dly, int drx, int dry) {
        this.ulx = ulx;
        this.uly = uly;
        this.urx = urx;
        this.ury = ury;
        this.dlx = dlx;
        this.dly = dly;
        this.drx = drx;
        this.dry = dry;
    }
    
    // Member methods
    public int getULX() {
        return ulx;
    }
    
    public int getULY() {
        return uly;
    }
    
    public int getURX() {
        return urx;
    }
    
    public int getURY() {
        return ury;
    }
    
    public int getDLX() {
        return dlx;
    }
    
    public int getDLY() {
        return dly;
    }
    
    public int getDRX() {
        return drx;
    }
    
    public int getDRY() {
        return dry;
    }    
}
