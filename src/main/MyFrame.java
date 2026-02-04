package main;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	
	public MyFrame() {
		setSize(500,700);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500,10);
		//setBounds(x,y, ancho, largo)
		setResizable(false);
		setTitle("Buenos días mono");
		setLocationRelativeTo(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icono = tk.getImage("src/pics/Reigen.jpg");
		setIconImage(icono);
		
		MiPanel panelito = new MiPanel();
		add(panelito);
		
		setVisible(true);
	}
	
}
