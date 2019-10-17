package com.skilldistillery.lordoftheobjects;

public class Player extends Character {

	private boolean shieldActive;
	private int shieldStr;
	private int score;
	private boolean win;
	
	


	public Player(String name) {
		
		setName(name);
		shieldStr = 100;
		setOutputDamage(100);
		score = 0;
		setHitChance(.75);
	}
	
	
	
	public int getShieldStr() {
		return shieldStr;
	}
	public void setShieldStr(int shieldStr) {
		this.shieldStr = shieldStr;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int point) {
		this.score += point;
	}
	public boolean isWin() {
		return win;
	}
	public void setWin(boolean win) {
		this.win = win;
	}
	
	
	
	
}
