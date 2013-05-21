package util;

// Custom data structure that forms the rectangular portions within the map
public class RectArea {
    
    // Properties
    private double ulx, uly, urx, ury, dlx, dly, drx, dry;
    
    // Constructor
    public RectArea(double ulx, double uly, double urx, double ury, double dlx, double dly, double drx, double dry) {
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
    public double getULX() {
        return ulx;
    }
    
    public double getULY() {
        return uly;
    }
    
    public double getURX() {
        return urx;
    }
    
    public double getURY() {
        return ury;
    }
    
    public double getDLX() {
        return dlx;
    }
    
    public double getDLY() {
        return dly;
    }
    
    public double getDRX() {
        return drx;
    }
    
    public double getDRY() {
        return dry;
    }    
}
