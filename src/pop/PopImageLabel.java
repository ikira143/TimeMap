package pop;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PopImageLabel extends JLabel {
    
    // Singleton
    private static final PopImageLabel instance = new PopImageLabel();
    
    // Properties
    private final int INIT_WIDTH = 300;
    private final int INIT_HEIGHT = 300;
    private ImageIcon popIcon;
    
    // Constructor
    private PopImageLabel() {
        this.setBounds(PopMainFrame.getInstance().getPopPaneInsets().left + 10, PopMainFrame.getInstance().getPopPaneInsets().top + 40, INIT_WIDTH, INIT_HEIGHT);
        popIcon = new ImageIcon(getClass().getResource("/img/GWC-test.jpg"));
        setNewIcon(popIcon.getImage());
    }
    
    // Static factory
    public static PopImageLabel getInstance() {
        return instance;
    }
    
    public void setNewIcon(Image img) {
        Image newImg = img.getScaledInstance(PopMainFrame.getInstance().getWidth() - 20, PopMainFrame.getInstance().getHeight() - 40, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(newImg));
        PopMainFrame.getInstance().repaint();
    }
    
}
