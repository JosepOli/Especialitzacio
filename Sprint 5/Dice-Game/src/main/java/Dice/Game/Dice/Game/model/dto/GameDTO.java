package Dice.Game.Dice.Game.model.dto;

public class GameDTO {

	private Integer id;
	private int diceOneValue;
	private int diceTwoValue;
	private boolean win;

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDiceOneValue() {
		return diceOneValue;
	}

	public void setDiceOneValue(int diceOneValue) {
		this.diceOneValue = diceOneValue;
	}

	public int getDiceTwoValue() {
		return diceTwoValue;
	}

	public void setDiceTwoValue(int diceTwoValue) {
		this.diceTwoValue = diceTwoValue;
	}

	public boolean isWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}
}
