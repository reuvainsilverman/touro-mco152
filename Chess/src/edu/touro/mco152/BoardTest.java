package edu.touro.mco152;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.touro.mco152.ChessPiece.PieceColor;

public class BoardTest {
	private Board b;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		b=new Board();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void test() {
		
		assertEquals(b.getNumOfPieces(),16);
		
	/*	Pawn white=new Pawn();
		b.add(white);
		assertEquals(b.getNumOfPieces(),1);
		ChessPiece[] array1={white};
		assertTrue(Arrays.equals(b.getList(),array1));
		
		Pawn black=new Pawn(PieceColor.BLACK);
		ChessPiece[] array2={white, black};
		b.add(black);
		assertEquals(b.getNumOfPieces(),2);
		assertTrue(Arrays.equals(b.getList(),array2));
		
		//b.add(7);*/
	}
	@Test
	public void testDrawBoard(){
		String periods="........";
		String picOfBoard="";
		picOfBoard+=periods+"\n";//first rank
		picOfBoard+= "pppppppp\n";//second rank
		picOfBoard+=periods+"\n";//third
		picOfBoard+=periods+"\n";//fourth
		picOfBoard+=periods+"\n";//fifth
		picOfBoard+=periods+"\n";//sixth
		picOfBoard+="PPPPPPPP\n";//seventh
		picOfBoard+=periods;//eighth
		assertEquals(picOfBoard,b.toString());
	}
	@Test
	public void testCreate(){
		ArrayList<ChessPiece> list;
		list=b.getSecondRank();
		String secondRank="";
		String seventhRank="";
		
		secondRank=createString(list);
		assertEquals("pppppppp",secondRank);
		
		list=b.getSeventhRank();
		seventhRank=createString(list);
		assertEquals("PPPPPPPP",seventhRank);
	}
	private String createString(ArrayList<ChessPiece> list){
		String rank="";
		for (int i=0;i<list.size();i++){
			rank+=list.get(i).toString();
		}
		return rank;
	}
}
