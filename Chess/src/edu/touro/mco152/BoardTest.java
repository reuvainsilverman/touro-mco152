package edu.touro.mco152;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.touro.mco152.ChessPiece.PieceColor;

public class BoardTest {

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
		Board b=new Board();
		assertEquals(b.getNumOfPieces(),0);
		
		Pawn white=new Pawn();
		b.add(white);
		assertEquals(b.getNumOfPieces(),1);
		ChessPiece[] array1={white};
		assertTrue(Arrays.equals(b.getList(),array1));
		
		Pawn black=new Pawn(PieceColor.BLACK);
		ChessPiece[] array2={white, black};
		b.add(black);
		assertEquals(b.getNumOfPieces(),2);
		assertTrue(Arrays.equals(b.getList(),array2));
		
		//b.add(7);
		
	}

}
