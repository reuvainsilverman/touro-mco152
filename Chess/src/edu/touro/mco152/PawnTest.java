package edu.touro.mco152;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.touro.mco152.ChessPiece.PieceColor;

public class PawnTest {
	private Pawn whitePawn, blackPawn;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 whitePawn= new Pawn();
		 blackPawn = new Pawn(PieceColor.BLACK);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		assertEquals(PieceColor.WHITE,whitePawn.getColor());
	}
	
	@Test
	public void testBlackConstruct() {
		
		assertEquals(PieceColor.BLACK, blackPawn.getColor());
	}
	@Test
	public void testPawnPrint(){
		assertEquals(whitePawn.toString(),"p");
		assertEquals(blackPawn.toString(),"P");
	}
	
	@Test
	public void testCreate() {
		
		
	}

}
