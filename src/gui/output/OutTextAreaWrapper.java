package gui.output;

import gui.frame.MainFrame;
import javax.swing.JScrollPane;

public class OutTextAreaWrapper extends JScrollPane {
    
    // Singleton
    private static final OutTextAreaWrapper instance = new OutTextAreaWrapper();
    
    // Properties
    private final int WIDTH = 152;
    private final int HEIGHT = 415;
    private final int INIT_X = 620;
    private final int INIT_Y = 10;
    private final boolean WHEEL_SCROLLABLE = true;
    
    // Constructor
    private OutTextAreaWrapper() {
        super(OutTextArea.getInstance());
        this.setWheelScrollingEnabled(WHEEL_SCROLLABLE);
        this.setBounds(MainFrame.getInstance().getPaneInsets().left + INIT_X, MainFrame.getInstance().getPaneInsets().top + INIT_Y, WIDTH, HEIGHT);
    }
    
    // Static factory
    public static OutTextAreaWrapper getInstance() {
        return instance;
    }
    
}
