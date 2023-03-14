import java.awt.*;
import javax.swing.*;

class HelloComponent extends JComponent {
	public void paintComponent( Graphics g ) {
      JFrame frame = new JFrame("Hello Component");
		g.drawString( "Hello, Java!", 125, 95 );
      frame.add( new HelloComponent() );
      
	}
}