package com.gui;

public class Main {

	public static void main(String[] args) {
		
		//JFrame
		MainWindow mainWindow;
		mainWindow=new MainWindow();
		mainWindow.setVisible(true);
		
		//JDialog
		WindowDialog windowDialog=new WindowDialog();
		windowDialog.setVisible(true);
	}

}
