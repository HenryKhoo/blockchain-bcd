package my.apu.bcd.client.cli;

import java.util.Arrays;

import my.apu.bcd.function.MerkleTree;

public class TestMerkleTree {

	public static void main(String[] args) {
		
		String[] arr = new String[] { "ali", "peter", "mick", "johnny" } ;
		MerkleTree mt = MerkleTree.getInstance( Arrays.asList( arr ) );
		mt.build();
		
		String rootHash = mt.getRoot();
		
		System.out.println( "Root: "+ rootHash );

	}

}
