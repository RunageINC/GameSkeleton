package com.dbzrpg.windows;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.dbzrpg.entities.Player;
import com.dbzrpg.filemanager.ImageUtil;

public class PlayerCreation extends JFrame {

	private JLabel img = new JLabel();
	private JTextField inputName = new JTextField();
	private String[] races = {"Humano", "Namekusei-jin", "Saiyajin", "Frostling", "Tsufurujin", 
							"Cereallian", "Majin", "Demônio", "Anjo", "Kaioh"} ;
	private String[] jobs = {"Lutador", "Mago", "Suporte"};
	
	private JButton btnLoadImage = new JButton("Carregar Imagem");
	private JComboBox<String> raceBox = new JComboBox<String>(races);
	private JComboBox<String> jobBox = new JComboBox<String>(jobs);
	private JButton btnOk = new JButton("Tudo Certo!");
	
	//stats components
	private int points = 5;
	private int atk, def, mag, mdef, spd;
	private JLabel sts = new JLabel("Status: " + points);
	private JLabel lblAtk = new JLabel("Ataque: " + atk);
	private JLabel lblDef = new JLabel("Defesa: " + def);
	private JLabel lblMag = new JLabel("Magia: " + mag);
	private JLabel lblMDef = new JLabel("D. Mágica: " + mdef);
	private JLabel lblSpd = new JLabel("Velocidade: " + spd);
	
	private JButton addAtk = new JButton("+");
	private JButton addDef = new JButton("+");
	private JButton addMag = new JButton("+");
	private JButton addMdef = new JButton("+");
	private JButton addSpd = new JButton("+");
	private JButton removeAtk = new JButton("-");
	private JButton removeDef = new JButton("-");
	private JButton removeMag = new JButton("-");
	private JButton removeMdef = new JButton("-");
	private JButton removeSpd = new JButton("-");
	
	public PlayerCreation() {
		disableRemoveButtons();
		addActionListeners();
		buttonActions();
		createWindow();
	}
	
	private JPanel statsPanel() {
		JPanel mainGrid = new JPanel(new BorderLayout());
		JPanel centralGrid = new JPanel(new GridLayout(5, 3));
		
		centralGrid.add(lblAtk);
		centralGrid.add(addAtk);
		centralGrid.add(removeAtk);
		centralGrid.add(lblDef);
		centralGrid.add(addDef);
		centralGrid.add(removeDef);
		centralGrid.add(lblMag);
		centralGrid.add(addMag);
		centralGrid.add(removeMag);
		centralGrid.add(lblMDef);
		centralGrid.add(addMdef);
		centralGrid.add(removeMdef);
		centralGrid.add(lblSpd);
		centralGrid.add(addSpd);
		centralGrid.add(removeSpd);
		
		mainGrid.add(sts, BorderLayout.NORTH);
		mainGrid.add(centralGrid, BorderLayout.CENTER);
		
		return mainGrid;
	}
	
	private void addActionListeners() {
		addAtk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				points --;
				atk ++;
				lblAtk.setText("Ataque: " + atk);
				sts.setText("Status: " + points); 
				removeAtk.setEnabled(true);
				checkStatus();
			}
		});
		addDef.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				points --;
				def ++;
				lblDef.setText("Defesa: " + def);
				sts.setText("Status: " + points);
				removeDef.setEnabled(true);
				checkStatus();
			}
		});
		addMag.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				points --;
				mag ++;
				lblMag.setText("Magia: " + mag);
				sts.setText("Status: " + points); 
				removeMag.setEnabled(true);
				checkStatus();
			}
		});
		addMdef.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				points --;
				mdef ++;
				lblMDef.setText("D. Mágica: " + mdef);
				sts.setText("Status: " + points); 
				removeMdef.setEnabled(true);
				checkStatus();
			}
		});
		addSpd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				points --;
				spd ++;
				lblSpd.setText("Ataque: " + spd);
				sts.setText("Status: " + points); 
				removeSpd.setEnabled(true);
				checkStatus();
			}
		});
		
		removeAtk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				points ++;
				atk --;
				
				if (atk == 0)
					removeAtk.setEnabled(false);
				
				lblAtk.setText("Ataque: " + atk);
				sts.setText("Status: " + points); 
				checkStatus();
			}
		});
		removeDef.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				points ++;
				def --;
				
				if (def == 0)
					removeDef.setEnabled(false);
				
				lblDef.setText("Defesa: " + def);
				sts.setText("Status: " + points);
				checkStatus();
			}
		});
		removeMag.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				points ++;
				mag --;
				
				if (mag == 0)
					removeMag.setEnabled(false);
				
				lblMag.setText("Magia: " + mag);
				sts.setText("Status: " + points); 
				checkStatus();
			}
		});
		removeMdef.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				points ++;
				mdef --;
				
				if (mdef == 0)
					removeMdef.setEnabled(false);
				
				lblMDef.setText("D. Mágica: " + mdef);
				sts.setText("Status: " + points); 
				checkStatus();
			}
		});
		removeSpd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				points ++;
				spd --;
				
				if (spd == 0)
					removeSpd.setEnabled(false);
				
				lblSpd.setText("Ataque: " + spd);
				sts.setText("Status: " + points); 
				checkStatus();
			}
		});
	}
	
	private void checkStatus() {
		if (points == 0) {
			disableAddButtons(false);
		} else {
			disableAddButtons(true);
		} if (points == 5) {
			disableRemoveButtons();
		}
	}
	
	private void disableAddButtons(boolean isEnabled) {
		addAtk.setEnabled(isEnabled);
		addDef.setEnabled(isEnabled);
		addMag.setEnabled(isEnabled);
		addMdef.setEnabled(isEnabled);
		addSpd.setEnabled(isEnabled);
	}
	
	private void disableRemoveButtons() {
		removeAtk.setEnabled(false);
		removeDef.setEnabled(false);
		removeMag.setEnabled(false);
		removeMdef.setEnabled(false);
		removeSpd.setEnabled(false);
	}
	
	private void createWindow() {
		setSize(800, 240);
		setLayout(new GridLayout(1, 3));
		
		add(img);
		add(leftPanel());
		add(statsPanel());
				
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	private void buttonActions() {
		btnLoadImage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("is working");
				img.setIcon(ImageUtil.loadImg(inputName.getText().toLowerCase() + ".jpeg"));
				repaint();
			}
		});
		
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Player p = generatePlayer();
			}
		});
	}
	
	private JPanel leftPanel() {
		JPanel grid = new JPanel(new GridLayout(5, 1));
		
		grid.add(inputName);
		grid.add(btnLoadImage);
		grid.add(raceBox);
		grid.add(jobBox);
		grid.add(btnOk);
				
		return grid;
	}
	
	private Player generatePlayer() {
		Player p = new Player();
		
		String name = inputName.getText();
		
		p.setName(name);
		p.setCurrentLevel(1);
		
		p = returnRaceBenefits(p);
		p = returnJobBenefits(p);
		
		p.setAtk(atk);
		p.setDef(def);
		p.setMag(mag);
		p.setMdef(mdef);
		p.setSpd(spd);
		p.setCurrentHp(100 + p.getDef() * 10 + p.getRaceDef() * 10 + p.getJobDef() * 10);
		
		return p;
	}
	
	private Player returnRaceBenefits(Player p) {
		String selectedRace = raceBox.getSelectedItem().toString();
		
		if (selectedRace.equals("Anjo")) {
			p.setRace("Anjo");
			p.setRaceAtk(5);
			p.setRaceDef(5);
			p.setRaceMag(5);
			p.setRaceMdef(5);
			p.setRaceSpd(5);
		}
		
		return p;
	}
	
	private Player returnJobBenefits(Player p) { 
		String selectedJob = jobBox.getSelectedItem().toString();
		
		if (selectedJob.equals("Mago")) {
			p.setJob("Mago");
			p.setJobAtk(5);
			p.setJobDef(5);
			p.setJobMag(5);
			p.setJobMdef(5);
			p.setJobSpd(5);
		}
		
		return p;
	}
}
