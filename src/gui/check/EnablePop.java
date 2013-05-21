package gui.check;

import gui.frame.MainFrame;
import javax.swing.JCheckBox;


public class EnablePop extends JCheckBox {
    
    // Singleton
    private static final EnablePop instance = new EnablePop();
    
    // Properties
    
    // Constructor
    private EnablePop() {
        super("Enable pop up images?", true);
        this.setBounds(MainFrame.getInstance().getPaneInsets().left + 175, MainFrame.getInstance().getPaneInsets().top + 10, this.getPreferredSize().width, this.getPreferredSize().height);
    }
    
    // Static factory
    public static EnablePop getInstance() {
        return instance;
    }
    
    public boolean getState() {
        return instance.isSelected();
    }
}
