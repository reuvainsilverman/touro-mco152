package edu.touro.mco152;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testWhitespace {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(true,Character.isWhitespace('\n'));
		assertEquals(true,Character.isWhitespace('\t'));
		assertEquals(true,Character.isWhitespace(' '));
		
		//assertEquals(true,Character.isWhitespace('.'));
		//assertEquals(true,Character.isWhitespace('d'));
		
	}

}
