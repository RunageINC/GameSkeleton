package com.dbzrpg.entities;

public class Player extends GameCharacter {

	private int exp;
	private String race;
	private String job;
	private int recruitPower;
	
	//race exclusives
	private int raceAtk;
	private int raceDef;
	private int raceMag;
	private int raceMdef;
	private int raceSpd;
	
	//job exclusives
	private int jobAtk;
	private int jobDef;
	private int jobMag;
	private int jobMdef;
	private int jobSpd;
		
	public int getRecruitPower() {	
		return recruitPower;
	}
	public void setRecruitPower(int recruitPower) {
		this.recruitPower = recruitPower;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getRaceAtk() {
		return raceAtk;
	}
	public void setRaceAtk(int raceAtk) {
		this.raceAtk = raceAtk;
	}
	public int getRaceDef() {
		return raceDef;
	}
	public void setRaceDef(int raceDef) {
		this.raceDef = raceDef;
	}
	public int getRaceMag() {
		return raceMag;
	}
	public void setRaceMag(int raceMag) {
		this.raceMag = raceMag;
	}
	public int getRaceMdef() {
		return raceMdef;
	}
	public void setRaceMdef(int raceMdef) {
		this.raceMdef = raceMdef;
	}
	public int getRaceSpd() {
		return raceSpd;
	}
	public void setRaceSpd(int raceSpd) {
		this.raceSpd = raceSpd;
	}
	public int getJobAtk() {
		return jobAtk;
	}
	public void setJobAtk(int jobAtk) {
		this.jobAtk = jobAtk;
	}
	public int getJobDef() {
		return jobDef;
	}
	public void setJobDef(int jobDef) {
		this.jobDef = jobDef;
	}
	public int getJobMag() {
		return jobMag;
	}
	public void setJobMag(int jobMag) {
		this.jobMag = jobMag;
	}
	public int getJobMdef() {
		return jobMdef;
	}
	public void setJobMdef(int jobMdef) {
		this.jobMdef = jobMdef;
	}
	public int getJobSpd() {
		return jobSpd;
	}
	public void setJobSpd(int jobSpd) {
		this.jobSpd = jobSpd;
	}
	
	public String toString() {
		return name + ";" + race + ";" + job + ";" + Integer.toString(currentLevel) + ";" + Integer.toString(exp) + ";" 
			+ Integer.toString(currentHp) + ";" + Integer.toString(hp) + ";" + Integer.toString(atk) + ";" + Integer.toString(def) + ";" 
			+ Integer.toString(mag) + ";" + Integer.toString(mdef) + ";" + Integer.toString(spd)  + ";" 
			+ Integer.toString(raceAtk) + ";" + Integer.toString(raceDef) + ";" + Integer.toString(raceMag) + ";" 
			+ Integer.toString(raceMdef) + ";" + Integer.toString(raceSpd) + ";"
			+ Integer.toString(jobAtk) + ";" + Integer.toString(jobDef) + ";" + Integer.toString(jobMag) + ";" 
			+ Integer.toString(jobMdef) + ";" + Integer.toString(jobSpd) + ";"
			+ imgPath + ";" + skillOne.getId() + ";" + skillTwo.getId() + ";" + skillThree.getId() 
			+ ";" + skillFour.getId();
	}
}
