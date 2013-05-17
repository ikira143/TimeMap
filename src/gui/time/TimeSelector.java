package gui.time;

import gui.frame.MainFrame;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JComboBox;

public class TimeSelector extends JComboBox {
    
    // Singleton
    private static TimeSelector instance;
    
    // Properties
    private static final Vector <String> timeVec = new Vector(Arrays.asList(new String [] {"8000 BCE - 600 BCE", "600 BCE - 600 CE", "600 CE - 1450 CE", "1450 CE - 1750 CE", "1750 CE - Present"}));
    private final int INIT_X = 10;
    private final int INIT_Y = 10;
    
    // Constructor
    private TimeSelector() {
        super(timeVec);
        this.setBounds(MainFrame.getInstance().getPaneInsets().left + INIT_X, MainFrame.getInstance().getPaneInsets().top + INIT_Y, this.getPreferredSize().width, this.getPreferredSize().height);
    }
    
    // Static factory
    public static TimeSelector getInstance() {
        if(instance == null) {
            instance = new TimeSelector();
        }
        return instance;
    }
}
