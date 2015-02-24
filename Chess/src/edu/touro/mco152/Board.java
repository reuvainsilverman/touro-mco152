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
	
	public String toString(){
		String board="";
		String periods="........";
		board+=periods+"\n";//first rank
		for(int i=0;i<secondRank.size();i++)
			board+=secondRank.get(i).toString();//second rank
		board+="\n"+periods+"\n";//third
		board+=periods+"\n";//fourth
		board+=periods+"\n";//fifth
		board+=periods+"\n";//sixth
		for(int i=0;i<seventhRank.size();i++)
			board+=seventhRank.get(i).toString();//seventh
		board+="\n"+periods; //eighth
		return board;
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
