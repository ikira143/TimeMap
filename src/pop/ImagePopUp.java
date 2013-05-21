package pop;

import java.awt.Container;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.UIManager;


public class ImagePopUp {

	// Singleton
	private static final ImagePopUp instance = new ImagePopUp();

	// Components
	private JFrame popFrame;
	private Container popPane;
	private Insets popInsets;
	
	// Properties
	private final int INIT_WIDTH = 200;
	private final int INIT_HEIGHT = 200;

	// Constructor
	private ImagePopUp() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// Do not handle because fanciness is unimportant
		}

		popFrame = new JFrame("Image Gallery");
		popFrame.setSize(INIT_WIDTH, INIT_HEIGHT);

		popPane = popFrame.getContentPane();
		popPane.setLayout(null);

		popInsets = popPane.getInsets();
	}

}