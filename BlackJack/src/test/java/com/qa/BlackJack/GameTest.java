package com.qa.BlackJack;

import static org.junit.Assert.*;
import org.junit.Test;

public class GameTest {
	
	@Test
	public void test() {
		Game blackjack = new Game();
		
		assertEquals(10, blackjack.play(10,22));
		assertEquals(10, blackjack.play(22,10));
		assertEquals(0, blackjack.play(22,22));
		assertEquals(0, blackjack.play(-10,8));
		assertEquals(0, blackjack.play(10,-12));
		
		
	}
	
	
	

}
