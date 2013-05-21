package gui.frame;

import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainFrame {
    
    // Singleton
    private static final MainFrame instance = new MainFrame();
    
    // Components
    private JFrame frame;
    private Container pane;
    private Insets insets;
    
    // Properties
    private final int FRAME_WIDTH = 628;
    private final int FRAME_HEIGHT = 610;
    private final boolean RESIZABLE = true;
    
    // Constructor
    // Non-Resiable: 622 x 567. Resizable: 610 x 555; -12
    private MainFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // Unecessary exceptions, no need to handle
        }
        
        // Frame
        frame = new JFrame("World Map");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setResizable(RESIZABLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Contents
        pane = frame.getContentPane();
        pane.setLayout(null);
        
        // Insets
        insets = pane.getInsets();
    }
    
    // Static Factory
    public static MainFrame getInstance() {
        return instance;
    }
    
    // Member methods
    public void setVisible() {
        frame.setVisible(true);
    }
    
    public void add(Component c) {
        pane.add(c);
    }
    
    public Insets getPaneInsets() {
        return insets;
    }
    
    public int getWidth() {
        return pane.getWidth();
    }
    
    public int getHeight() {
        return pane.getHeight();
    }
    
    public void repaint() {
        pane.repaint();
    }
}
