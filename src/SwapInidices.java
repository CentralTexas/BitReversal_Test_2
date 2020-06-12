class BitReversal {
	
	public void setValue( int start, int offset, int addToIndex, int[] data) {
		
// Array data is initially all 0's.
// Index j of data[j] is the sequential index of the array.
// The final result will be that data[j] contains bit reversed value of j.

		data[start + offset] = data[start] + addToIndex;
		
	}
	
	public void computeBitReversal( int [] data) {
		
		int g, numberOfIndicies, start, offset, addToIndex, N;
		
// Initialize values.
// N must be a power of 2.
		
		N = data.length;
		
		addToIndex = N / 2;
		
		numberOfIndicies = 1;
		
// Algorithm is as follows:
// Iteration 0: data[0] is 0, set data[1] = data[0] + N/2. Double numberOfIndicies and halve addToIndex at the end of each iteration.
// Using the results of iteration 0,
// Iteration 1: set data[2] = data[0] + N/4, set data[3] = data[1] + N/4.
// Using the results of iteration 1,
// Iteration 2: set data[4] = data[0] + N/8, set data[5] = data[1] + N/8, set data[6] = data[2] + N/8, set data[7] = data[3] + N/8.
// Repeat as long as addToIndex is >= 1;
		
		
		while ( addToIndex >= 1) {
		
		
			for( g = 0; g < numberOfIndicies; g++) {
				
				start = g;
				
				offset = numberOfIndicies;
				
				setValue( start, offset, addToIndex, data);
				
			}
			
			numberOfIndicies = numberOfIndicies * 2;
			
			addToIndex = addToIndex / 2;
		
		
		} // end while
		
		
		
	}
	
} // end class

public class SwapInidices {
	
// Utility functions.
	
	private static void writeToOut( String inStr) { System.out.println( inStr);}
	
	private static void initializeArray( int [] array) { int len = array.length; for (int i = 0; i < len; i++) { array[i] = 0;}}
	
	private static void showIndexSequence( int len) { for (int i = 0; i < len; i++) { System.out.printf("%d ", i);}}
	
	private static void showArray( int [] array) { int len = array.length; for (int i = 0; i < len; i++) { System.out.printf("%d ", array[i]);}}

// Data check.
	
	private static boolean isPowerOf2 ( int k) {
		
		int N = 2; boolean boolVal = false;
		
		while( N < k) {
			
			N *= 2;
			
			if( k == N) { boolVal = true; break;}
			
		}
		
		return boolVal;
		
	}

// Main.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int len = 0;
		boolean boolVal = false;
		BitReversal br = new BitReversal();
		
// Validate input length for array of bit reversed values.
		
		if ( args.length == 0) { len = 4; writeToOut("Zero args, default length is 4.");}
		else {
			
			len = Integer.parseInt(args[0]);
			
			writeToOut("Length is: " + len);
			
		}
		
		writeToOut("");
		
		boolVal = isPowerOf2( len);
		
		if ( boolVal) {
			
// Proceed with algorithm.
			
			int [] data = new int[len];
			
			initializeArray( data);
			
			writeToOut(" start - un decimated indices");
			
			showIndexSequence( len);
			
			writeToOut("");
			
			writeToOut(" bit reversal");
			
			br.computeBitReversal( data);
			
			showArray( data);
			
			writeToOut("");
			
			writeToOut(" finish");
		
		} else { writeToOut("Length is Not a power of 2, try again.");}

	}
}
