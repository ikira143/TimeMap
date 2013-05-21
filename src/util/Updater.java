package util;

import gui.frame.MainFrame;
import gui.map.Region;
import gui.map.WorldMap;
import gui.output.OutTextAreaWrapper;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;


public class Updater implements Runnable {
    
    // Singleton
    private static final Updater instance = new Updater();
    private Thread updateThread;
    
    // Properties
    
    
    // Constructor
    private Updater() {
        
    }
    
    // Static factory
    public static Updater getInstance() {
        return instance;
    }
    
    public void startUpdate() {
        if(updateThread == null) {
            updateThread = new Thread(instance);
            updateThread.start();
        } else if(!updateThread.isAlive()) {
            updateThread.start();
        }
    }

    @Override
    public void run() {
        while(true) {
            // Map
            WorldMap.getInstance().setBounds(MainFrame.getInstance().getPaneInsets().left + 10, MainFrame.getInstance().getPaneInsets().top + 42, MainFrame.getInstance().getWidth() - 10, MainFrame.getInstance().getHeight() - 42 - OutTextAreaWrapper.getInstance().getHeight() - 10 - 10);
            Image img = WorldMap.getInstance().getMapIcon().getImage();
            Image newImg = img.getScaledInstance(MainFrame.getInstance().getWidth() - 20, WorldMap.getInstance().getHeight(), Image.SCALE_SMOOTH);
            WorldMap.getInstance().setIcon(new ImageIcon(newImg));
            
            
            // Text area
            OutTextAreaWrapper.getInstance().setBounds(MainFrame.getInstance().getPaneInsets().left + 10, MainFrame.getInstance().getPaneInsets().top + 52 + WorldMap.getInstance().getHeight(), MainFrame.getInstance().getWidth()-20, OutTextAreaWrapper.getInstance().getHeight());
            
            // Region Oh god someone make a backup of this I'm not doing this again
            int mh = WorldMap.getInstance().getHeight();
            int mw = WorldMap.getInstance().getWidth();
            
            Region.NORTH_AMERICA = new Region(new RectArea [] {
                new RectArea(mw*0.0333, mh*0.1676, mw*0.3833, mh*0.1676, mw*0.0333, mh*0.2932, mw*0.3833, mh*0.2932),
                new RectArea(mw*0.15, mh*0, mw*0.45, mh*0, mw*0.15, mh*0.1955, mw*0.45, mh*0.1955),
                new RectArea(mw*0.15, mh*0.2793, mw*0.3333, mh*0.2793, mw*0.15, mh*0.5028, mw*0.3333, mh*0.5028)
             });
    
            Region.MESO_AMERICA = new Region(new RectArea [] {
                new RectArea(mw*0.1917, mh*0.5028, mw*0.3333, mh*0.5028, mw*0.1917, mh*0.5866, mw*0.3333, mh*0.5866) 
             });
    
            Region.SOUTH_AMERICA = new Region(new RectArea [] {
                new RectArea(mw*0.275, mh*0.5866, mw*0.3417, mh*0.5866, mw*0.275, mh*0.9497, mw*0.3417, mh*0.9497),
                new RectArea(mw*0.3417, mh*0.6145, mw*0.3917, mh*0.6145, mw*0.3417, mh*0.7961, mw*0.3917, mh*0.7961)
             });
    
            Region.EUROPE = new Region(new RectArea [] {
                new RectArea(mw*0.5333, mh*0.1676, mw*0.5917, mh*0.1676, mw*0.5333, mh*0.2932, mw*0.5917, mh*0.2932),
                new RectArea(mw*0.475, mh*0.2932, mw*0.5917, mh*0.2932, mw*0.475, mh*0.4609, mw*0.5917, mh*0.4509)
            });
    
            Region.MIDDLE_EAST = new Region(new RectArea [] {
               new RectArea(mw*0.5667, mh*0.3631, mw*0.6833, mh*0.3631, mw*0.5667, mh*0.5726, mw*0.6833, mh*0.5726) 
            });
    
            Region.NORTH_ASIA = new Region(new RectArea [] {
               new RectArea(mw*0.5917, mh*0.1536, mw*1, mh*0.1536, mw*0.5917, mh*0.3631, mw*1, mh*0.3631) 
            });
    
            Region.EAST_ASIA = new Region(new RectArea [] {
               new RectArea(mw*0.6833, mh*0.3631, mw*0.8917, mh*0.3631, mw*0.6833, mh*0.5307, mw*0.8917, mh*0.5307) 
            });
    
            Region.SOUTH_ASIA = new Region(new RectArea [] {
               new RectArea(mw*0.6833, mh*0.5307, mw*0.875, mh*0.5307, mw*0.6833, mh*0.6704, mw*0.875, mh*0.6704) 
            });
    
            Region.NORTH_AFRICA = new Region(new RectArea [] {
               new RectArea(mw*0.4583, mh*0.4749, mw*0.5667, mh*0.4749, mw*0.4583, mh*0.5587, mw*0.5667, mh*0.5587) 
            });
    
            Region.SUB_SAHARAN_AFRICA = new Region(new RectArea [] {
               new RectArea(mw*0.5333, mh*0.5587, mw*0.5667, mh*0.5587, mw*0.5333, mh*0.8101, mw*0.5667, mh*0.8101),
               new RectArea(mw*0.5667, mh*0.5726, mw*0.6833, mh*0.5726, mw*0.5667, mh*0.7682, mw*0.6833, mh*0.7682)
            });
    
            Region.WEST_AFRICA = new Region(new RectArea [] {
               new RectArea(mw*0.45, mh*0.5587, mw*0.5333, mh*0.5587, mw*0.45, mh*0.6145, mw*0.5333, mh*0.6145) 
            });

            Region.OCEANIA = new Region(new RectArea [] {
                new RectArea(mw*0.875, mh*0.6425, mw*1, mh*0.6425, mw*0.875, mh*0.8938, mw*1, mh*0.8938),
                new RectArea(mw*0.8167, mh*0.6983, mw*0.8833, mh*0.6983, mw*0.8167, mh*0.8101, mw*0.8833, mh*0.8101)
            });
    
            
            // Finalize
            MainFrame.getInstance().repaint();
        }
    }
    
}
