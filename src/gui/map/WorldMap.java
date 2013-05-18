package gui.map;

import gui.frame.MainFrame;
import gui.output.OutTextArea;
import gui.time.TimeSelector;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class WorldMap extends JLabel {
    
    // Singleton
    private static WorldMap instance;
    
    // Properties
    private final int INIT_X = 10;
    private final int INIT_Y = 42;
    
    // Constructor
    private WorldMap() throws IOException {
        //super(new ImageIcon(ImageIO.read(new File("src/img/WorldMap.jpg"))));
        super();
        this.setIcon(new ImageIcon(getClass().getResource("/img/WorldMap.jpg")));
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
    public static WorldMap getInstance() throws IOException {
        if(instance == null) {
            instance = new WorldMap();
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
                if(Continent.AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Africa");
                }else if(Continent.ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Asia");
                }else if(Continent.EUROPE.mouseWithin(x, y)) {
                    update(timePeriod + " | Europe");
                }else if(Continent.NORTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North America");
                }else if(Continent.OCEANIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Oceania");
                }else if(Continent.SOUTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | South America");
                }
            } else if(timePeriod.equals("600 BCE - 600 CE")) {
                if(Continent.AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Africa");
                }else if(Continent.ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Asia");
                }else if(Continent.EUROPE.mouseWithin(x, y)) {
                    update(timePeriod + " | Europe");
                }else if(Continent.NORTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North America");
                }else if(Continent.OCEANIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Oceania");
                }else if(Continent.SOUTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | South America");
                }
            } else if(timePeriod.equals("600 CE - 1450 CE")) {
                if(Continent.AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Africa");
                }else if(Continent.ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Asia");
                }else if(Continent.EUROPE.mouseWithin(x, y)) {
                    update(timePeriod + " | Europe");
                }else if(Continent.NORTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North America");
                }else if(Continent.OCEANIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Oceania");
                }else if(Continent.SOUTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | South America");
                }
            } else if(timePeriod.equals("1450 CE - 1750 CE")) {
                if(Continent.AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Africa");
                }else if(Continent.ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Asia");
                }else if(Continent.EUROPE.mouseWithin(x, y)) {
                    update(timePeriod + " | Europe");
                }else if(Continent.NORTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North America");
                }else if(Continent.OCEANIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Oceania");
                }else if(Continent.SOUTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | South America");
                }
            } else if(timePeriod.equals("1750 CE - Present")) {
                if(Continent.AFRICA.mouseWithin(x, y)) {
                    update(timePeriod + " | Africa");
                }else if(Continent.ASIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Asia");
                }else if(Continent.EUROPE.mouseWithin(x, y)) {
                    update(timePeriod + " | Europe");
                }else if(Continent.NORTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | North America");
                }else if(Continent.OCEANIA.mouseWithin(x, y)) {
                    update(timePeriod + " | Oceania");
                }else if(Continent.SOUTH_AMERICA.mouseWithin(x, y)) {
                    update(timePeriod + " | South America");
                }
            }
            
            MainFrame.getInstance().repaint();
        }
        
        private void update(String str) {
            OutTextArea.getInstance().setText(str);
        }
    }
}
