//Thanasis Antamis A.M 2639

import java.util.ArrayList;

public class State {
	
	private int Row ;
	private int Column;
	private ArrayList <String> ListOfPossibleMoves = new ArrayList<String>(0);
	private String CurrentMove = "-";
	
	public State(int aRow, int aColumn, boolean[][] aMaze, String CMove, String PreviousMove){
		Row = aRow;
		Column = aColumn;
		 if(PreviousMove=="up"){                               //If the previous move is up then down must not be in the list of possible moves for that block
			if(Row==0){                                        // Check the first row of the maze
				if(Column==0){
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}else if(Column==aMaze[0].length-1){
					
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
				}else{
					
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}
				
			}else if(Row==aMaze.length-1){                      //Check the last row of the maze
				if(Column==0){
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}else if(Column==aMaze[0].length-1){
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
				}else{
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}
				
			}else if(Column==0){                                //Check the first column 
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				
				if(aMaze[Row][Column+1]==true){
					ListOfPossibleMoves.add("right");
				}
			}else if(Column==aMaze[0].length-1){                //Check the last column
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				
				if(aMaze[Row][Column-1]==true){
					ListOfPossibleMoves.add("left");
				}
			}else{
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				
				if(aMaze[Row][Column-1]==true){
					ListOfPossibleMoves.add("left");
				}
				if(aMaze[Row][Column+1]==true){
					ListOfPossibleMoves.add("right");
				}
			}
		}else if(PreviousMove=="down"){                            //If the previous move is down then up must not be in the list of possible moves for that block
			if(Row==0){
				if(Column==0){
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}else if(Column==aMaze[0].length-1){
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
				}else{
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}
				
			}else if(Row==aMaze.length-1){
				if(Column==0){
					
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}else if(Column==aMaze[0].length-1){
					
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
				}else{
					
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}
			 	
			}else if(Column==0){
				
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				if(aMaze[Row][Column+1]==true){
					ListOfPossibleMoves.add("right");
				}
			}else if(Column==aMaze[0].length-1){
				
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				if(aMaze[Row][Column-1]==true){
					ListOfPossibleMoves.add("left");
				}
			}else{
				
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				if(aMaze[Row][Column-1]==true){
					ListOfPossibleMoves.add("left");
				}
				if(aMaze[Row][Column+1]==true){
					ListOfPossibleMoves.add("right");
				}
			}
		}else if(PreviousMove=="left"){                            //If the previous move is left then right must not be in the list of possible moves for that block
			if(Row==0){
				if(Column==0){
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					
				}else if(Column==aMaze[0].length-1){
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
				}else{
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
					
				}
				
			}else if(Row==aMaze.length-1){
				if(Column==0){
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					
				}else if(Column==aMaze[0].length-1){
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
				}else{
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
					
				}
				
			}else if(Column==0){
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				
			}else if(Column==aMaze[0].length-1){
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				if(aMaze[Row][Column-1]==true){
					ListOfPossibleMoves.add("left");
				}
			}else{
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				if(aMaze[Row][Column-1]==true){
					ListOfPossibleMoves.add("left");
				}
				
			}
		}else if(PreviousMove=="right"){                            //If the previous move is right then left must not be in the list of possible moves for that block
			if(Row==0){
				if(Column==0){
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}else if(Column==aMaze[0].length-1){
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					
				}else{
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}
				
			}else if(Row==aMaze.length-1){
				if(Column==0){
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}else if(Column==aMaze[0].length-1){
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					
				}else{
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}
				
			}else if(Column==0){
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				if(aMaze[Row][Column+1]==true){
					ListOfPossibleMoves.add("right");
				}
			}else if(Column==aMaze[0].length-1){
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				
			}else{
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				
				if(aMaze[Row][Column+1]==true){
					ListOfPossibleMoves.add("right");
				}
			}
		}else{
			if(Row==0){
				if(Column==0){
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}else if(Column==aMaze[0].length-1){
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
				}else{
					if(aMaze[Row+1][Column]==true){
						ListOfPossibleMoves.add("down");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}
				
			}else if(Row==aMaze.length-1){
				if(Column==0){
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}else if(Column==aMaze[0].length-1){
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
				}else{
					if(aMaze[Row-1][Column]==true){
						ListOfPossibleMoves.add("up");
					}
					if(aMaze[Row][Column-1]==true){
						ListOfPossibleMoves.add("left");
					}
					if(aMaze[Row][Column+1]==true){
						ListOfPossibleMoves.add("right");
					}
				}
				
			}else if(Column==0){
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				if(aMaze[Row][Column+1]==true){
					ListOfPossibleMoves.add("right");
				}
			}else if(Column==aMaze[0].length-1){
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				if(aMaze[Row][Column-1]==true){
					ListOfPossibleMoves.add("left");
				}
			}else{
				if(aMaze[Row-1][Column]==true){
					ListOfPossibleMoves.add("up");
				}
				if(aMaze[Row+1][Column]==true){
					ListOfPossibleMoves.add("down");
				}
				if(aMaze[Row][Column-1]==true){
					ListOfPossibleMoves.add("left");
				}
				if(aMaze[Row][Column+1]==true){
					ListOfPossibleMoves.add("right");
				}
			}
		}
		
		
		
		CurrentMove = CMove;
	}
	
	public String getCurrentMove(){
		return CurrentMove;
	}
	
	public void setCurrentMove(String aMove){
		CurrentMove = aMove;
	}
	
	public int getRow(){
		return Row;
	}
	
	public int getColumn(){
		return Column;
	}
	
	public ArrayList <String> getListOfPossibleMoves(){
		return ListOfPossibleMoves;
	}
}
