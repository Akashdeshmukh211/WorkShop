package workShops;

import java.util.*;

public class gambler {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter initial stake amount :");
		int stake = scanner.nextInt();

		System.out.println("set the goal amount :");
		int goal = scanner.nextInt();

		System.out.println("Enter number of times you want to play :");
		int trials = scanner.nextInt();

		game(stake, goal, trials);
		scanner.close();
		
	}
	public static void game(int stake, int goal, int trials) {
		int wins = 0, i, loss = 0;
		for (i = 0; i < trials; i++) {
			int cash = stake;

			while (cash > 0 && cash < goal) {
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal)
				wins++;
			else
				loss++;
		}
		System.out.println("Number of Percentage won..." + (100 * wins) / trials + "%");
		System.out.println("Number of Percentage loss..." + (100 * loss) / trials + "%");
	}
	

}

