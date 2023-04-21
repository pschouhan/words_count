package com.wordsCount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import services.WordsCount;

public class TestWordCounter {
	
	private WordsCount wordscount = new WordsCount();
	
	@Test
	public void testWordCount() {
	    final Map<String,Integer> myResult = wordscount.count("This This");
	    final Map<String, Integer> expected = new HashMap<String, Integer>() {
	        {
	            put("This",2);
	           
	        }
	    };
	    assertEquals(expected, myResult);
	}
}
