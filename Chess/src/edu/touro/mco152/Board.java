package edu.touro.mco152;

import java.util.ArrayList;

import edu.touro.mco152.ChessPiece.PieceColor;

public class Board {
	private int numOfPieces;
	//private ChessPiece [] CPieces;
	private ArrayList<ChessPiece> secondRank=new ArrayList<ChessPiece>(8);
	private ArrayList<ChessPiece> seventhRank=new ArrayList<ChessPiece>(8);
	public Board(){
		initialize();
	}

	private void initialize(){
		/**
		 * each player has 16 chess pieces, therefore there can only be 32 pieces 
		 * on a board at one time
		 */
		//CPieces=new ChessPiece[32];
		Pawn whitePawn= new Pawn();
		Pawn blackPawn=new Pawn(PieceColor.BLACK);
		for (int i=0;i<8;i++)
		{
			secondRank.add(whitePawn);
			seventhRank.add(blackPawn);
		}
		numOfPieces=16;
	}
	
	public int getNumOfPieces(){
		return numOfPieces;
	}
	
	public ArrayList<ChessPiece> getSecondRank(){
		return secondRank;
	}
	
	public ArrayList<ChessPiece> getSeventhRank(){
		return seventhRank;
	}
	
	
	/*public void add(ChessPiece cP){
		CPieces[numOfPieces]=cP;
		numOfPieces++;
	}
	
	public ChessPiece[] getList(){
		ChessPiece[] cp=new ChessPiece[numOfPieces];
		for(int i=0;i<numOfPieces;i++){
			cp[i]=CPieces[i];
		}
		return cp;
	}*/
}
