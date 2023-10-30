package com.gui;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	
	//Constructor
	public MainWindow() {
		//Tamanio de la ventana
		setSize(500, 400); //width, height
		
		//Titulo de la ventana
		setTitle("Ventana Principal");
		
		//Para que la ventana aparezca en el centro
		setLocationRelativeTo(null);
		
		/* setBounds(50, 120, 500, 300); //x, y, width, height
		 * Este se utiliza cuando queremos ubicar la ventana en un lugar especifico,
		 * es como el setSize() mas el setLocationRelativeTo()
		 * */
		
		//Para mostrar la ventana
		//setVisible(true);
		/*
		 * En este caso lo hago mejor desde el Main.Java
		 * */
	}
}
