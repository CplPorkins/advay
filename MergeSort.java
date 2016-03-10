/*======================================
Ruochong Wu
APCS2 Pd10
HW9 -- Mergers and Acquisitions...
2016-03-06

  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 
1. If only 1 card, return card.
2. If more than 1 card, split the deck in any way and pass each half to another instance of this function.
3. Return the value of the "Sort" helper function (compare top of two stacks of cards, put away smaller card, repeat) taking the value of the 2 instances created in step 2.


"Sort" helper function: Given two stacks of cards:
1. If one stack is empty, append remaining stack to the end of the return list and return.
2. Else, compare the number at index 0 of both stacks, append the smaller number to the end of return string.
3. Remove number just appended from the stack it came from, call Sort function on the two stacks.
  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] res = new int[a.length+b.length];
	int aCount = 0;
	int bCount = 0;
	int current = 0;
	while (current < res.length){
	    if (aCount==a.length){
		res[current]=b[bCount];
		bCount++;
		current++;
	    }
	    else if (bCount==b.length){
		res[current]=a[aCount];
		aCount++;
		current++;
	    }
		
	    else if (a[aCount]>b[bCount]){
		res[current]=b[bCount];
		bCount++;
		current++;
	    }
	    else{
		res[current]=a[aCount];
		aCount++;
		current++;
	    }
	}
	return res;
    
	    

    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
      public static int[] sort( int[] arr ) 
    {
	if (arr.length==1){
	    return arr;
	}
	else{
	    int cut = arr.length/2 ;
	    int[] arr1 = new int[cut];
	    int[] arr2 = new int[arr.length-cut];
	    for (int count =0 ; count<cut; count++){
		arr1[count]=arr[count];
	    }
	    for (int count = 0; count<arr2.length; count++){
		arr2[count]=arr[count+cut];
	    }
	    return merge(sort(arr1),sort(arr2));
	}
   

    }//end sort()
   


    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


	int[] arr0 = {0,1,2,3,7,9,10};
	int[] arr1 = {4,5,6,8};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	//	System.out.println("\nMerging arr4 and arr6: ");
	//	printArray( merge(arr4,arr6) );
	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
	/*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort
