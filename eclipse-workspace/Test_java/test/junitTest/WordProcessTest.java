package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import msgTemp.MessageUtil;

class MessageUtilTest {
	String message = "The cow jumped over the moon";	
	MessageUtil messageUtil = new MessageUtil(message);

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() { 
	    assertEquals("jumped", messageUtil.getwordList().get("longest").toString()); 
	    assertEquals(6, messageUtil.getwordList().get("longest").toString().length());
	    assertEquals("The", messageUtil.getwordList().get("shortest").toString());
	    assertEquals(3, messageUtil.getwordList().get("shortest").toString().length());
	}
}
