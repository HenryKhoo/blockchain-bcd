package my.apu.bcd.function;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Transaction implements Serializable{
	
	private final int SIZE = 5;
	
	//array or collection
	//String[] tranxLst;
	List<String> tranxLst; //simple demo...
	
	public Transaction() {
		tranxLst = new ArrayList<>( SIZE );
	}
	
	//add( String ) : void
	public void add( String tranx ){
		tranxLst.add(tranx);
	}

	@Override
	public String toString() {
		return "Transaction [tranxLst=" + tranxLst + "]";
	}

}	
