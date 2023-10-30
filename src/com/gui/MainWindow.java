package com.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainWindow extends JFrame implements ActionListener {
	
	//Variables
	private JButton btn;
	private JLabel label;
	private JTextField simpleText;
	private JMenuBar menuBar;
	private JMenu menuArchive, menuOptions;
	private JMenuItem item1, item2, item3;
	
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
		
		//Barra Menu
		menuBar=new JMenuBar();
		
		//Items
		item1=new JMenuItem("item1");
		item1.addActionListener(this);
		
		item2=new JMenuItem("item2");
		item2.addActionListener(this);
		
		item3=new JMenuItem("item3");
		item3.addActionListener(this);
		
		//Menus
		menuArchive=new JMenu("Archivo");
		//Le agregamos sus items
		menuArchive.add(item1);
		menuArchive.add(item2);
		
		menuOptions=new JMenu("Opciones");
		//Le agregamos sus items
		menuOptions.add(item3);
		
		//Agregar menus a la Barra de Manu
		menuBar.add(menuArchive);
		menuBar.add(menuOptions);
		
		//Asignamos el menuBar
		setJMenuBar(menuBar);
		
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
		String data=simpleText.getText(); //Para capturar lo que se escriba en el campo de texto
		
		//
		if(e.getSource() == item1) {			
			label.setText("Dato= " + data);
			label.setBackground(Color.RED);
		}
		
		//Si se presiona el boton. . .
		if(e.getSource() == btn) {
			label.setText("Dato= " + data);
			label.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null, "Boton presionado");
		}
		
	}
}
