import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class alternate extends JFrame {
	
	private DisplayPanel panel = new DisplayPanel();
	
	public alternate(){
		add(panel,BorderLayout.CENTER);
	}
	
	public static void main(String[] args){
		JFrame frame = new alternate();
		frame.setTitle("alternate");
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

class DisplayPanel extends JPanel {
	private String m1 = "Java is fun";
	private String m2 = "Java is powerful";
	private String output = m1;
	
	public DisplayPanel(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(output.equals(m1)){
					output = m2;
				}
				else{
					output = m1;
				}
				repaint();
				}
		});
}
		protected void paintComponent(Graphics g){
		super.paintComponent(g);
		FontMetrics fm=g.getFontMetrics();
		int sw = fm.stringWidth(output);
		int sa = fm.getAscent();
		int x = getWidth()/2 - sw/2;
		int y = getHeight()/2 + sa/2;
		
		g.drawString(output , x , y);
		}
	}
}