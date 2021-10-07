package my.apu.bcd.client.cli;

import my.apu.bcd.function.Block;
import my.apu.bcd.function.Blockchain;
import my.apu.bcd.function.Transaction;

public class TestBlockchain {

	public static void main(String[] args) {
		
		configure();
		
		tstBlockchain2( new String[] { "ali", "peter", "mick", "johnny" }  );

	}
	
	/**
	 * code reference for the exercise - dummytranx.txt
	 */
	static void tstBlockchain2( String[] lst ) {
		
		Transaction t1 = new Transaction();
		t1.add( lst[0] );
		t1.add( lst[1] );
		Transaction t2 = new Transaction();
		t2.add( lst[2] );
		t2.add( lst[3] );
		Transaction[] tranxCollection = { t1, t2 };
		
		for ( int i = 0; i < tranxCollection.length; i++ ) {
			Block blk = new Block( 
					Blockchain.get().getLast().getHeader().getCurrentHash() 
					);
			blk.setTranx( tranxCollection[i] );
			Blockchain.nextBlock( blk );
			
		}
		Blockchain.distribute();
		
	}

	static void tstBlockchain( String[] lst ) {
		
		Transaction t1 = new Transaction();
		t1.add( lst[0] );
		t1.add( lst[1] );
		t1.add( lst[2] );
		t1.add( lst[3] );
		Block blk = new Block( 
				Blockchain.get().getLast().getHeader().getCurrentHash() 
				);
		blk.setTranx(t1);
		Blockchain.nextBlock( blk );
		
		Blockchain.distribute();
	}
	
	/**
	 * configure the system with a genesis block
	 */
	static void configure() {
		Block genesis = new Block( "0" );
		Blockchain.nextBlock(genesis);
	}
	
}
