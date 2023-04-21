package com.wordsCount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import services.RegExp;
import services.WordsCount;

@SpringBootTest
class WordsCountApplicationTests {

	private RegExp regexp =new RegExp();
	
	@Test
	void testRegExp() {
		assertEquals(true,regexp.isAlpha("Prabhudev"));
	}
	
	

	
	
	
	
	

}
