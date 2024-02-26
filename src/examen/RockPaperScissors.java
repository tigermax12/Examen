package examen;
import java.util.*;
	/**
	 * @version 1.0
	 * @author DAW08
	 * 
	 */
	public class RockPaperScissors {
		private static int keyboard = 0;
		// Se crea un Scanner para que el usuario pueda insertar datos
		private static Scanner scanner = new Scanner(System.in);
		public RockPaperScissors(){}
		public static void main(String[] args) {
			List<String> optionList = Arrays.asList("Rock", "Paper", "Scissors");
			/**
			 * Este bucle se repite mientras keyboard sea mayor que 1 o menor que 3
			 */
			do {
				System.out.println("Welcome to Rock, Paper, Scissors!");
				System.out.print("Enter your choice (Rock(1), Paper(2), or Scissors(3)): ");
				keyboard = scanner.nextInt();scanner.nextLine();
				}
			while (keyboard < 1 || keyboard > 3);
			String computerChoice = optionList.get(new Random().nextInt(3));
			String userChoice = optionList.get(keyboard - 1);
			System.out.println("Your chose: " + userChoice + "\nComputer chose: " + computerChoice);
			System.out.println(RockPaperScissors.checkGame(computerChoice, userChoice));
			scanner.close();
			}
		/*
		 * @return String
		 * @paragram String userChoice, String computerChoice
		 * Pide las String userChoice y computeChoice y devuleve un String
		 */
		public static String checkGame(String userChoice, String computerChoice){
			String gameResult = "";
			if(userChoice.equals(computerChoice))
				{gameResult="It's a tie!";}
			else if(userChoice.equals("Rock") && computerChoice.equals("Scissors"))
				{gameResult="You win this round!";} 
			else if(userChoice.equals("Paper") && computerChoice.equals("Rock"))
				{gameResult="You win this round!";}
			else if(userChoice.equals("Scissors") && computerChoice.equals("Paper"))
				{gameResult="You win this round!";}
			else{gameResult="Computer wins this round!";}
				return gameResult;
				}
		}


