package gui.map;

import gui.check.EnablePop;
import gui.frame.MainFrame;
import gui.output.OutTextArea;
import gui.time.TimeSelector;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import pop.PopMainFrame;

public class WorldMap extends JLabel {
    
    // Singleton
    private static WorldMap instance;
    private ImageIcon mapIcon;
    
    // Properties
    private final int INIT_X = 10;
    private final int INIT_Y = 42;
    
    // Constructor
    private WorldMap() throws IOException {
        mapIcon = new ImageIcon(getClass().getResource("/img/WorldMap.jpg"));
        this.setIcon(mapIcon);
        this.setBounds(MainFrame.getInstance().getPaneInsets().left + INIT_X, MainFrame.getInstance().getPaneInsets().bottom + INIT_Y, this.getPreferredSize().width, this.getPreferredSize().height);
        
        
        // Add mouse listener this way because it was being a little annoying
        this.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                MapEventHandler.getInstance().processText(TimeSelector.getInstance().getSelectedItem().toString(), e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                MapEventHandler.getInstance().processText(TimeSelector.getInstance().getSelectedItem().toString(), e.getX(), e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
    }
    
    // Static factory
    public static WorldMap getInstance() {
        if(instance == null) {
            try {
                instance = new WorldMap();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return instance;
    }
    
    // Class for handling the updating of the output
    private static class MapEventHandler {
        
        // Singleton
        private static final MapEventHandler mapInstance = new MapEventHandler();
        
        // Constructor
        private MapEventHandler() {
            
        }
        
        // Static factory
        public static MapEventHandler getInstance() {
            return mapInstance;
        }
        
        // Member methods
        public void processText(String timePeriod, int x, int y) {
            update("Click anywhere! By that I mean land.");
            
            if(timePeriod.equals("8000 BCE - 600 BCE")) {
                if(Region.EAST_ASIA.mouseWithin(x, y)) {
                    if(EnablePop.getInstance().getState() && !PopMainFrame.getInstance().isVisible()) {
                        PopMainFrame.getInstance().setVisibity(true);
                    }
                    update(timePeriod + " | East Asia");
                } else if(Region.EUROPE.mouseWithin(x, y)) {
                    update(timePeriod + " | Europe");
                } else if(Region.MESO_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Meso America");
                } else if(Region.MIDDLE_EAST.mouseWithin(x, y)) {
                    update(timePeriod + " | Middle East");
                } else if(Region.NORTH_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North Africa");
                } else if(Region.NORTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North America");
                } else if(Region.NORTH_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | North Asia");
                } else if(Region.OCEANIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Oceania");
                } else if(Region.SOUTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | South America");
                } else if(Region.SOUTH_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | South Asia");
                } else if(Region.SUB_SAHARAN_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Sub-Saharan Africa");
                } else if(Region.WEST_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | West Africa");
                }
            } else if(timePeriod.equals("600 BCE - 600 CE")) {
                if(Region.EAST_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | East Asia");
                } else if(Region.EUROPE.mouseWithin(x, y)) {
                    update(timePeriod + " | Europe");
                } else if(Region.MESO_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Meso America");
                } else if(Region.MIDDLE_EAST.mouseWithin(x, y)) {
                    update(timePeriod + " | Middle East");
                } else if(Region.NORTH_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North Africa");
                } else if(Region.NORTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North America");
                } else if(Region.NORTH_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | North Asia");
                } else if(Region.OCEANIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Oceania");
                } else if(Region.SOUTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | South America");
                } else if(Region.SOUTH_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | South Asia");
                } else if(Region.SUB_SAHARAN_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Sub-Saharan Africa");
                } else if(Region.WEST_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | West Africa");
                }
            } else if(timePeriod.equals("600 CE - 1450 CE")) {
                if(Region.EAST_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | East Asia");
                } else if(Region.EUROPE.mouseWithin(x, y)) {
                    update(timePeriod + " | Europe");
                } else if(Region.MESO_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Meso America");
                } else if(Region.MIDDLE_EAST.mouseWithin(x, y)) {
                    update(timePeriod + " | Middle East");
                } else if(Region.NORTH_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North Africa");
                } else if(Region.NORTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North America");
                } else if(Region.NORTH_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | North Asia");
                } else if(Region.OCEANIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Oceania");
                } else if(Region.SOUTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | South America");
                } else if(Region.SOUTH_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | South Asia");
                } else if(Region.SUB_SAHARAN_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Sub-Saharan Africa");
                } else if(Region.WEST_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | West Africa");
                }
            } else if(timePeriod.equals("1450 CE - 1750 CE")) {
                if(Region.EAST_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | East Asia");
                } else if(Region.EUROPE.mouseWithin(x, y)) {
                    update(timePeriod + " | Europe");
                } else if(Region.MESO_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Meso America");
                } else if(Region.MIDDLE_EAST.mouseWithin(x, y)) {
                    update(timePeriod + " | Middle East");
                } else if(Region.NORTH_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North Africa");
                } else if(Region.NORTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North America");
                } else if(Region.NORTH_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | North Asia");
                } else if(Region.OCEANIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Oceania");
                } else if(Region.SOUTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | South America");
                } else if(Region.SOUTH_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | South Asia");
                } else if(Region.SUB_SAHARAN_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Sub-Saharan Africa");
                } else if(Region.WEST_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | West Africa");
                }
            } else if(timePeriod.equals("1750 CE - Present")) {
                if(Region.EAST_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | East Asia");
                } else if(Region.EUROPE.mouseWithin(x, y)) {
                    update(timePeriod + " | Europe");
                } else if(Region.MESO_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Meso America");
                } else if(Region.MIDDLE_EAST.mouseWithin(x, y)) {
                    update(timePeriod + " | Middle East");
                } else if(Region.NORTH_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North Africa");
                } else if(Region.NORTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North America");
                } else if(Region.NORTH_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | North Asia");
                } else if(Region.OCEANIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Oceania");
                } else if(Region.SOUTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | South America");
                } else if(Region.SOUTH_ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | South Asia");
                } else if(Region.SUB_SAHARAN_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Sub-Saharan Africa");
                } else if(Region.WEST_AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | West Africa");
                }
            }
            
            MainFrame.getInstance().repaint();
        }
        
        private void update(String str) {
            OutTextArea.getInstance().setText(str);
        }
    }
    
    public int getMapWidth() {
        return mapIcon.getIconWidth();
    }
    
    public int getMapHeight() {
        return mapIcon.getIconHeight();
    }
    
    public ImageIcon getMapIcon() {
        return mapIcon;
    }
    
    public void setMapIcon(ImageIcon newIcon) {
        this.setIcon(newIcon);
    }
}
