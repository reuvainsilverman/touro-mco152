package edu.touro.mco152;

public class Board {
	private int numOfPieces;
	private ChessPiece [] CPieces;
	public Board(){
		/**
		 * each player has 16 chess pieces, therefore there can only be 32 pieces 
		 * on a board at one time
		 */
		CPieces=new ChessPiece[32];
		numOfPieces=0;
	}

	public int getNumOfPieces(){
		return numOfPieces;
	}
	
	public void add(ChessPiece cP){
		CPieces[numOfPieces]=cP;
		numOfPieces++;
	}
	
	public ChessPiece[] getList(){
		ChessPiece[] cp=new ChessPiece[numOfPieces];
		for(int i=0;i<numOfPieces;i++){
			cp[i]=CPieces[i];
		}
		return cp;
	}
}
