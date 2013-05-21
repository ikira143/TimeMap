package pop;

import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class PopMainFrame {
    
    // Singleton
    private static final PopMainFrame instance = new PopMainFrame();
    
    // Components
    private JFrame popFrame;
    private Container popPane;
    private Insets popInsets;
    
    
    // Properties
    private final int INIT_WIDTH = 400;
    private final int INIT_HEIGHT = 400;
    
    // Constructor
    private PopMainFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}
        
        popFrame = new JFrame("Image Gallery");
        popFrame.setSize(INIT_WIDTH, INIT_HEIGHT);
        
        popPane = popFrame.getContentPane();
        popPane.setLayout(null);
        
        popInsets = popPane.getInsets();
    }
    
    // Static factory
    public static PopMainFrame getInstance() {
        return instance;
    }
    
    public void repaint() {
        popPane.repaint();
    }
    
    public boolean isVisible() {
        return popFrame.isVisible();
    }
    
    public void setVisibity(boolean visible) {
        popFrame.setVisible(true);
    }
    
    public void add(Component c) {
        popPane.add(c);
    }
    
    public Insets getPopPaneInsets() {
        return popInsets;
    }
    
    public int getWidth() {
        return popPane.getWidth();
    }
    
    public int getHeight() {
        return popPane.getHeight();
    }
}
