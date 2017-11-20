package com.gambling;

import java.util.Random;

public class GamlingMachine {

	public void playGame(int amount) {
		MapConstants mapConstants = new MapConstants();
		String firstRound = mapConstants.getGame(getRandom());
		String secondRound = mapConstants.getGame(getRandom());
		String thirdRound = mapConstants.getGame(getRandom());
		System.out.println("firstRound :" + firstRound);
		System.out.println("secondRound :" + secondRound);
		System.out.println("thirdRound :" + thirdRound);

		if (thirdRound.equals(secondRound) && thirdRound.equals(firstRound)) {
			System.out.println("All three cases match, you won :" + amount * 3);
		} else {
			if (thirdRound.equals(secondRound) || thirdRound.equals(firstRound)
					|| secondRound.equals(firstRound)) {
				System.out.println("Only two cases match, you won :" + amount
						* 2);
			} else {
				System.out.println("Sorry! you lost all amount");
			}
		}

	}

	public int getRandom() {
		int max = 5, min = 0;
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

}
