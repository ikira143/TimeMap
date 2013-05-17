package gui.output;

import javax.swing.JTextArea;

public class OutTextArea extends JTextArea {
    
    // Singleton
    private static final OutTextArea instance = new OutTextArea();
    
    // Properties
    private final boolean EDITABLE = false;
    private final boolean LINE_WRAP = true;
    
    // Constructor
    private OutTextArea() {
        this.setEditable(EDITABLE);
        this.setLineWrap(LINE_WRAP);
    }
    
    // Static factory
    public static OutTextArea getInstance() {
        return instance;
    }
}
