package com.dbzrpg.entities;

public class Ally extends GameCharacter {

	private int maxLevel;
	private int exp;
	private short stars;
	private short rarity;
	
	public int getMaxLevel() {
		return maxLevel;
	}
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public short getStars() {
		return stars;
	}
	public void setStars(short stars) {
		this.stars = stars;
	}
	public short getRarity() {
		return rarity;
	}
	public void setRarity(short rarity) {
		this.rarity = rarity;
	}
	
	public String toString() {
		return id + ";" + name + ";" + Integer.toString(currentLevel) + ";" + Integer.toString(maxLevel) + ";" + Integer.toString(exp) + ";" + Short.toString(stars) + ";" + Short.toString(rarity) + ";"
				+ Integer.toString(currentHp) + ";" + Integer.toString(hp) + ";" + Integer.toString(atk) + ";" + Integer.toString(def) + ";" 
				+ Integer.toString(mag) + ";" + Integer.toString(mdef) + ";" + Integer.toString(spd)  + ";" 
				+ imgPath + ";" + skillOne.getId() + ";" + skillTwo.getId() + ";" + skillThree.getId() 
				+ ";" + skillFour.getId();
	}
}
