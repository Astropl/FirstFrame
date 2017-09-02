// Version 1.5

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class frameFirst extends JFrame implements ActionListener

{
	JButton bExit, bFirstButton;
	
	public frameFirst ()
	{
		setSize (500,400);
		setTitle("Okienko");
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
		frameFirst window = new frameFirst();
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
					}
			else if (source == bExit)
					{
						dispose();
						
					}
		//System.out.println(new Date());
		//System.out.println(new Date());
		
		
	}

}
