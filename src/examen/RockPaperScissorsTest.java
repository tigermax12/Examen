package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {

	@Test
	void c1() {
		String userChoice= "Rock";
		String computerChoice= "Rock";
		String devuelve= "Its a tie!";
		assertEquals(RockPaperScissors.checkGame(computerChoice, userChoice), devuelve);
	}
	@Test
	void c2() {
		String userChoice= "Rock";
		String computerChoice= "Scissors";
		String devuelve= "You win this round!";
		assertEquals(RockPaperScissors.checkGame(computerChoice, userChoice), devuelve);
	}
	@Test
	void c3() {
		String userChoice= "Paper";
		String computerChoice= "Rock";
		String devuelve= "You win this round!";
		assertEquals(RockPaperScissors.checkGame(computerChoice, userChoice), devuelve);
	}
	@Test
	void c4() {
		String userChoice= "Scissors";
		String computerChoice= "Rock";
		String devuelve= "Computer win this round!";
		assertEquals(RockPaperScissors.checkGame(computerChoice, userChoice), devuelve);
	}
	}
	

