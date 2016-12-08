import javax.swing.*;
import java.awt.*;


public class BackgroundMain extends JPanel {

	private static final long serialVersionUID = 6128091327567916999L;

	public void paintComponent(Graphics g){
		Image icon = new ImageIcon("C:/Users/James/Desktop/Ownprojects/blackjack1.png").getImage();
		g.drawImage(icon, 220, 150, this);
	}
	
}
