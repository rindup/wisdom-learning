package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import processStrings.WordProcess;

class WordProcessTest {
	String textString = "The cow jumped over the moon";	
	WordProcess wordProcess = new WordProcess(textString);

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() { 
	    assertEquals("jumped", wordProcess.getwordList().get("longest").toString()); 
	    assertEquals(6, wordProcess.getwordList().get("longest").toString().length());
	    assertEquals("The", wordProcess.getwordList().get("shortest").toString());
	    assertEquals(3, wordProcess.getwordList().get("shortest").toString().length());
	}
}
