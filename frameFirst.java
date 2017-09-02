import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Date;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class frameFirst extends JFrame implements ActionListener

{
	public frameFirst ()
	{
		setSize (300,200);
		setTitle("Okienko");
		setLayout(null);
		JButton firstButton = new JButton("Nacinij");
		firstButton.setBounds(100, 100, 100, 50);
		add(firstButton);
		firstButton.addActionListener(this);
		
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
		//System.out.println(new Date());
		//System.out.println(new Date());
		System.out.println(new Date());
	}

}
