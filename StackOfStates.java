//Thanasis Antamis A.M 2639

import java.util.ArrayList;

public class StackOfStates {
	
	private ArrayList<State> StackOfStates = new ArrayList<State>();
	private int top = -1;
	
	public void pop(){
		
		StackOfStates.remove(top);
		top = top - 1;
	}
	
	public void  push(State aState){
		top = top +1;
		StackOfStates.add(top,aState);
	}
	
	public boolean  isEmpty(){
		if(top==-1){
			return true;
		}
		return false;
	}
	
	public boolean  inStack(int aRow, int aColumn){
		for(int i=0; i< StackOfStates.size(); i++){
			if(StackOfStates.get(i).getRow() == aRow && StackOfStates.get(i).getColumn() == aColumn){
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<State> getStackOfStates(){
		return StackOfStates;
	}
	
	public int getTop(){
		return top;
	}
	
	public String toString(){
		String StackToString="";
		for(int i=0;i<StackOfStates.size();i++){
			StackToString= "" +  StackOfStates.get(i) ;
		}
		return StackToString;
	}
	
}
