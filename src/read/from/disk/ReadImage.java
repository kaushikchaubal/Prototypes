package read.from.disk;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ReadImage {
	public static void main(String[] args){
		Image image = null;
	    try {
	        // Read from a file
	        File sourceimage = new File("cameraman.jpg");
	        image = ImageIO.read(sourceimage);
	        
	        
	        
			PixelGrabber x = new PixelGrabber(image, 0, 0, 256, 256, true);
			
			System.out.println("data: ?" + x.getPixels());
	    } catch (IOException e) {}
	    
	    // Use a label to display the image
	    JFrame frame = new JFrame();
	    JLabel label = new JLabel(new ImageIcon(image));
	    frame.getContentPane().add(label, BorderLayout.CENTER);
	    frame.pack();
	    frame.setVisible(true);
	}

}
