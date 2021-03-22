package com.dbzrpg.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class GameCharacter {

	protected String id;
	protected String name;
	protected int hp;
	protected int currentLevel;
	protected int currentHp;
	protected int atk;
	protected int def;
	protected int mag;
	protected int mdef;
	protected int spd;
	protected String imgPath;
	
	protected Skill skillOne;
	protected Skill skillTwo;
	protected Skill skillThree;
	protected Skill skillFour;
	
	public List<Skill> skillTree = new ArrayList<Skill>();
	public GameStates states;
	
	public String getImgPath() {
		return imgPath;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public Skill getSkillOne() {
		return skillOne;
	}
	public void setSkillOne(Skill skillOne) {
		this.skillOne = skillOne;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Skill getSkillTwo() {
		return skillTwo;
	}
	public void setSkillTwo(Skill skillTwo) {
		this.skillTwo = skillTwo;
	}
	public Skill getSkillThree() {
		return skillThree;
	}
	public void setSkillThree(Skill skillThree) {
		this.skillThree = skillThree;
	}
	public Skill getSkillFour() {
		return skillFour;
	}
	public void setSkillFour(Skill skillFour) {
		this.skillFour = skillFour;
	}
	public List<Skill> getSkillTree() {
		return skillTree;
	}
	public void setSkillTree(List<Skill> skillTree) {
		this.skillTree = skillTree;
	}

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getCurrentLevel() {
		return currentLevel;
	}
	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}
	
	public int getCurrentHp() {
		return currentHp;
	}
	public void setCurrentHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getMag() {
		return mag;
	}
	public void setMag(int mag) {
		this.mag = mag;
	}
	public int getMdef() {
		return mdef;
	}
	public void setMdef(int mdef) {
		this.mdef = mdef;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	
	public void takeDamage(int damage) {
		currentHp -= damage;
	}
	
	public boolean isDead() {
		return currentHp == 0;
	}
}
