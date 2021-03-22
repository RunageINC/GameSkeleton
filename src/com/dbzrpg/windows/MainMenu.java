package com.dbzrpg.windows;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainMenu extends JFrame implements ActionListener {

	private JButton btnFight = new JButton("Lutar");
	private JButton btnTeam = new JButton("Editar Time");
	private JButton btnSave = new JButton("Salvar Jogo");
	
	public MainMenu() {
		createWindow();
		setVisible(true);
	}
	
	private void createWindow() {
		setSize(300, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(3,1));
		add(btnFight);
		add(btnTeam);
		add(btnSave);
		
		btnFight.addActionListener(this);
		btnTeam.addActionListener(this);
		btnSave.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if (cmd.equals("Lutar"))
			new FightScene();
	}
}
