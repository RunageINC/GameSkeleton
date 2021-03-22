package com.dbzrpg.filemanager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.dbzrpg.entities.Skill;
import com.dbzrpg.entities.Team;

public class PlayerFileManager {

	private static String SAVE_PATH = "res/save/";
	
	public void saveGame(Team t) {
		
	}
	
	public static void createSaveGame(Team t) {
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(SAVE_PATH + t.player.getName()));
			
			bw.write(t.player.toString());
			bw.newLine();
			
			for (Skill s : t.player.skillTree) {
				bw.write(s.getId() + ";");
			}
			
			bw.close();
			
			saveTeam(t);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void saveTeam(Team t) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(SAVE_PATH + t.player.getName() + "_TEAM"));
		
		if (t.allyOne != null) {
			bw.write(t.allyOne.toString());
			bw.newLine();
		}
		
		if (t.allyTwo != null) {
			bw.write(t.allyTwo.toString());
			bw.newLine();
		}
		
		if (t.allyThree != null) {
			bw.write(t.allyThree.toString());
			bw.newLine();
		}
		
		if (t.allyFour != null) {
			bw.write(t.allyFour.toString());
			bw.newLine();
		}
		
		if (t.allyFive != null) {
			bw.write(t.allyFive.toString());
			bw.newLine();			
		}
		
		bw.close();
	}
}
