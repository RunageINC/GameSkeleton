package com.dbzrpg.windows;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.dbzrpg.windows.addons.EnemyCard;
import com.dbzrpg.windows.addons.EnergyGrid;
import com.dbzrpg.windows.addons.PlayerCard;

public class FightScene extends JFrame {

	private JPanel enemyPanel = new JPanel(new GridLayout(1, 6));
	private JPanel playerPanel = new JPanel(new GridLayout(1, 6));
	
	public FightScene() {
		setEnemyPanel();
		setPlayerPanel();
		createWindow();
		setVisible(true);
	}
	
	private void setEnemyPanel() { 
		for (int i = 0; i < 6; i ++) 
			enemyPanel.add(new EnemyCard());
	}
	
	private void setPlayerPanel() {
		for (int i = 0; i < 6; i ++)
			playerPanel.add(new PlayerCard());
	}
	
	private JPanel setTopSide() {
		JPanel topSide = new JPanel(new BorderLayout());
		
		topSide.add(enemyPanel, BorderLayout.CENTER);
		topSide.add(new JLabel("VS"), BorderLayout.SOUTH);
		
		return topSide;
	}
	
	private JPanel setCenterPanel() {
		JPanel center = new JPanel(new GridLayout(2, 1));
		
		center.add(setTopSide());
		center.add(playerPanel);
		
		return center;
	}
	
	
	private void createWindow() {
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		add(setCenterPanel(), BorderLayout.CENTER);
		add(new EnergyGrid(), BorderLayout.WEST);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
