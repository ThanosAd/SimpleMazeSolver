//Thanasis Antamis A.M 2639

public class Maze {
	
	private int numberOfRows=0;
	private int numberOfColumns = 0;
	private boolean[][] tfMaze = null; 
	StackOfStates Stack = new StackOfStates();
	
	public Maze(int NumberOfRows, int NumberOfColumns, boolean[][] TFmaze){
		numberOfRows = NumberOfRows;
		numberOfColumns = NumberOfColumns;
		tfMaze = TFmaze;
	}
	public boolean solve(){
		
		if(tfMaze[0][0] == false || tfMaze[numberOfRows-1][numberOfColumns-1]== false){
			return false;
		}
		int i=0;
		int j=0;
		int k=0;
		String PreMove="";
		State aState = new State(i,j,tfMaze,"-","-");
		boolean flag=false;
		
		while(i!=numberOfRows-1 || j!=numberOfColumns-1){
			
			k=0;
			if(Stack.inStack(i, j)==false && k < aState.getListOfPossibleMoves().size()){
				if(aState.getListOfPossibleMoves().get(k)=="up"){
					aState.setCurrentMove("up");
					Stack.push(aState);
					i=i-1;
					PreMove="up";
				}else if(aState.getListOfPossibleMoves().get(k)=="down"){
					aState.setCurrentMove("down");
					Stack.push(aState);
					i=i+1;	
					PreMove="down";
				}else if(aState.getListOfPossibleMoves().get(k)=="left"){
					aState.setCurrentMove("left");
					Stack.push(aState);
					j=j-1;	
					PreMove="left";
				}else if(aState.getListOfPossibleMoves().get(k)=="right"){
					aState.setCurrentMove("right");
					Stack.push(aState);	
					j=j+1;
					PreMove="right";
				}
			}else{
				State aStateTemp = aState;
				i=Stack.getStackOfStates().get(Stack.getTop()).getRow();
				j=Stack.getStackOfStates().get(Stack.getTop()).getColumn();
				aState = Stack.getStackOfStates().get(Stack.getTop());
				
				for(int x=0;x<Stack.getStackOfStates().get(Stack.getTop()).getListOfPossibleMoves().size();x++){
					if(aState.getCurrentMove()==Stack.getStackOfStates().get(Stack.getTop()).getListOfPossibleMoves().get(x)){
						k = x+1;
					}
				}
				if(aStateTemp.getListOfPossibleMoves().size()==0){
					Stack.push(aState);
					
					Stack.pop();
					i=Stack.getStackOfStates().get(Stack.getTop()).getRow();
					j=Stack.getStackOfStates().get(Stack.getTop()).getColumn();
					aState = Stack.getStackOfStates().get(Stack.getTop());
					
					for(int x=0;x<Stack.getStackOfStates().get(Stack.getTop()).getListOfPossibleMoves().size();x++){
						if(aState.getCurrentMove()==Stack.getStackOfStates().get(Stack.getTop()).getListOfPossibleMoves().get(x)){
							k = x+1;
						}
					}
					flag=true;
				}else if(k >= aState.getListOfPossibleMoves().size() ){
					
					Stack.pop();
					if(Stack.isEmpty()== true){
						return false;
					}
					i=Stack.getStackOfStates().get(Stack.getTop()).getRow();
					j=Stack.getStackOfStates().get(Stack.getTop()).getColumn();
					aState = Stack.getStackOfStates().get(Stack.getTop());
					
					for(int x=0;x<Stack.getStackOfStates().get(Stack.getTop()).getListOfPossibleMoves().size();x++){
						if(aState.getCurrentMove()==Stack.getStackOfStates().get(Stack.getTop()).getListOfPossibleMoves().get(x)){
							k = x+1;
						}
					}
					flag=true;
				}else{
					if(aState.getListOfPossibleMoves().get(k)=="up"){
						aState.setCurrentMove("up");
						i=i-1;
						PreMove="up";
					}else if(aState.getListOfPossibleMoves().get(k)=="down"){
						aState.setCurrentMove("down");
						i=i+1;	
						PreMove="down";
					}else if(aState.getListOfPossibleMoves().get(k)=="left"){
						aState.setCurrentMove("left");
						j=j-1;	
						PreMove="left";
					}else if(aState.getListOfPossibleMoves().get(k)=="right"){
						aState.setCurrentMove("right");
						j=j+1;
						PreMove="right";
					}
				}
				flag=false;	
			}
			if(flag==false){
				aState = new State(i,j,tfMaze,"-",PreMove);
			}
		}	
		Stack.push(aState);
		return true;
	}
	
	public String  toString(){
		
		String BinMaze = "";
		for (int i=0; i<tfMaze.length; i++) {
			BinMaze = BinMaze + "\n";
			for (int j=0; j<tfMaze[i].length; j++) {
				if (tfMaze[i][j]==true) BinMaze = BinMaze + "0";
				else BinMaze=BinMaze + "1";
			}
		}
		return BinMaze;
	}
	
	public void printSolution(){
		String SolutionPath="";
		boolean IsIn=false;
		
		for (int i=0;i<tfMaze.length; i++){
			SolutionPath=SolutionPath+"\n";
			
			for (int j=0; j<tfMaze[i].length; j++){
				IsIn=false;
				for( int k=0;k<Stack.getStackOfStates().size();k++){
					if(i==Stack.getStackOfStates().get(k).getRow() && j==Stack.getStackOfStates().get(k).getColumn()){
							 IsIn=true;
					} 
				}
				if(IsIn==true){
					SolutionPath=SolutionPath+"*";
				}else if(tfMaze[i][j]==true){
					SolutionPath=SolutionPath+"0";
				}else{
					SolutionPath=SolutionPath+"1";
				}
			}
		}
		
		System.out.println("The Solution Path is:\n"+SolutionPath);
		
	}
	
	public boolean[][] getTFmaze(){
		return tfMaze;
	}
}
