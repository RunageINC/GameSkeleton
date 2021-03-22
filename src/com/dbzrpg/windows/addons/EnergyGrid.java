package com.dbzrpg.windows.addons;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.dbzrpg.filemanager.ImageUtil;

public class EnergyGrid extends JPanel {
	
	public JLabel[] indicator = new JLabel[8];
	
	public EnergyGrid() {
		setLayout(new GridLayout(8, 1));
		
		generateIndicator();
	}
	
	private void generateIndicator() {
		for (int i = 0; i < 8; i ++) {
			indicator[i] = new JLabel();
			indicator[i].setIcon(ImageUtil.loadEnergyIcon());
			add(indicator[i]);
		}
	}
}
