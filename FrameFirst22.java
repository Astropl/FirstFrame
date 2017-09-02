import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameFirst22 extends JFrame implements ActionListener

{
	JButton bExit, bFirstButton;
	
	public FrameFirst22 ()
	{
		setSize (500,700);
		setTitle("Okienko2");
		setLayout(null);
		bFirstButton = new JButton("Nacinij");
		bFirstButton.setBounds(100, 100, 100, 50);
		add(bFirstButton);
		bFirstButton.addActionListener(this);
		
		bExit = new JButton("Wyjscie");
		bExit.setBounds(200, 100, 100, 50);
		add(bExit);
		bExit.addActionListener(this);
		
	}
	public static void main(String[] args) 
	{
		FrameFirst22 window = new FrameFirst22();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
			if (source == bFirstButton)
					{
						System.out.println(new Date());
						FrameFirst22 secondFrame = new FrameFirst22();
						secondFrame.setVisible(true);
						
					}
			else if (source == bExit)
					{
						dispose();
						
					}
		//System.out.println(new Date());
		//System.out.println(new Date());
		
		
	}
public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
