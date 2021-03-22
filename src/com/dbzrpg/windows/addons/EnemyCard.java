package com.dbzrpg.windows.addons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import com.dbzrpg.filemanager.ImageUtil;

public class EnemyCard extends JPanel {

	private JLabel name = new JLabel();
	private JLabel img = new JLabel();
	private JProgressBar hp = new JProgressBar();
	
	public EnemyCard(String name, String img, int hp) {
		this.name.setText(name);
		this.img.setIcon(ImageUtil.loadImg(img));
		
		defineLayout();
	}
	
	public EnemyCard() {
		name.setText("-");
		img.setBackground(Color.GRAY);
		
		hp.setValue(100);
		hp.setMinimum(0);
		hp.setMaximum(100);
		hp.setBackground(Color.red);
		
		defineLayout();
	}
	
	private JPanel middlePanel() {
		JPanel middle = new JPanel(new BorderLayout());
		
		middle.add(img, BorderLayout.CENTER);
		middle.add(hp, BorderLayout.SOUTH);
		
		return middle;
	}
	
	private JPanel bottomPanel() {
		JPanel actionBar = new JPanel(new GridLayout(4, 1));
		
		return actionBar;
	}
	
	private void defineLayout() {
		setLayout(new BorderLayout());
		
		img.setBorder(BorderFactory.createLineBorder(Color.black));
		
		add(name, BorderLayout.NORTH);
		add(middlePanel(), BorderLayout.CENTER);
		add(bottomPanel(), BorderLayout.SOUTH);
	}
}
