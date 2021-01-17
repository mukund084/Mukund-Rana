// J7A3

class SumArrays
  {
    public static void main ( String[] args )
    {
	  int[] valA = { 13, -22, 82, 17};
	  int[] valB = {-12, 24, -79, -13};
	  int[] sum  = { (valA [0] + valB[0]) +  (valA [1] + valB[1]) + (valA [2] + valB[2]) + (valA [3] + valB[4]) }; 
	  
	  System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
	  
	  //
	  // Now repeat the process above using a for loop.
	  //
     
	  int[] sumL = new int [4];
	  
	  System.out.println( "index -- sum");
	  for ( int i = 0; i < sumL.length  ; i++)
	  {
	    sumL[i] = ( valA[i] + valB[i]);
	    System.out.println( i + " -- " + sumL[valA[i] + valB[i]] );
	  }
	}
}