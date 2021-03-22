package com.dbzrpg.entities;

import java.util.ArrayList;
import java.util.List;

public class Team {

	public Player player;
	public Ally allyOne, allyTwo, allyThree, allyFour, allyFive;
	
	public List<Ally> rooster = new ArrayList<Ally>();
}
