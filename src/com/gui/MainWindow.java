package com.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainWindow extends JFrame implements ActionListener {
	
	//Variables
	private JButton btn;
	private JLabel label;
	private JTextField simpleText;
	
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
		
		initializeComponents();
	}
	
	private void initializeComponents() {
		setLayout(null); //Para distribucion de los elementos
		
		//Boton
		btn=new JButton(); //Creacion de un boton
		btn.setText("Presioname");
		btn.setBounds(10, 90, 120, 30); //x, y, width, height
		
		btn.addActionListener(this); //Agregar la accion al boton
		
		//Etiqueta
		label=new JLabel("Etiqueta");
		label.setBounds(150, 20, 150, 40);
		label.setOpaque(true); //Para poder modificar el color de fondo
		
		//Campo de texto simple
		simpleText=new JTextField();
		simpleText.setBounds(20, 30, 120, 30);
		
		add(btn); //Agregamos a la pantalla
		add(label); //Agregamos etiqueta
		add(simpleText); //Agregamos el campo de texto simple
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Si se presiona el boton. . .
		if(e.getSource() == btn) {
			
			String data=simpleText.getText(); //Para capturar lo que se escriba en el campo de texto
			
			label.setText("Dato= " + data);
			label.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null, "Boton presionado");
		}
		
	}
}
