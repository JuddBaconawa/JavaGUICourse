import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class lessonOneFrames {

	public static void firstFrame() {

			//JFrame = a GUI window to add components to

			JFrame frame = new JFrame();    //creates a frame
			frame.setTitle("JFrame title goes here"); //sets title of frame
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //allows the program to close when clicked
			frame.setResizable(false);  //prevents any modification to the window size 
			frame.setSize(420, 420);    //first sets x, then y dimension
			frame.setVisible(true); //to maje the frame visible

			ImageIcon image = new ImageIcon("logo.png");    //creates an ImageIcon for the window
			frame.setIconImage(image.getImage());   //change the icon of the frame - pictures need added
			frame.getContentPane().setBackground(Color.green);  //change the color of the background
	}
	
}
