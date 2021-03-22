package com.dbzrpg.entities;

public class Skill {

	private String id;
	private String name;
	private String description;
	private int cost;
	private String skillType;
	private int cooldownTime;
	public int currentCooldownTime;
	
	
	public int getCooldownTime() {
		return cooldownTime;
	}
	public void setCooldownTime(int cooldownTime) {
		this.cooldownTime = cooldownTime;
	}
	public String getSkillType() {
		return skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
