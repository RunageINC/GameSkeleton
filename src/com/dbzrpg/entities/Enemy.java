package com.dbzrpg.entities;

public class Enemy extends GameCharacter {
	
	private String dropList;
	
	public int getRecruitRate() {
		return getAtk() + getDef() + getMag() + getMdef() + getSpd();
	}

	public String getDropList() {
		return dropList;
	}

	public void setDropList(String dropList) {
		this.dropList = dropList;
	}
	
	
}
