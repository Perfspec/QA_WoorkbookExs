package com.qa.BlackJack;

public class Game {
	
	public int play(int player1, int player2) {
		
		
		
		if(player1<1||player2<1) {
			System.out.println("Error: negative player entry");
			return 0;
		} else {
			if( player1 > 21 && player2 > 21 ) {
				System.out.println("Fail: Both teams are too high");
				return 0;
			} else {
				if ( player1 > 21) {
					return player2;
				} else {
					if( player2 > 21) {
						return player1;						
					}
					else {
						if(player1 >= player2) {
							return player1;
						} else {
							return player2;
						}
					}
				}
			}
		} 
	}
}
