//Team PC Master Race - Ruochong Wu, Lorenz Vargas
//APCS2 PD10
//HW11 -- Wrapping It Up
//2016-03-09


/*======================================
  class MergeSortTester

  ALGORITHM:
 1. If only 1 card, return card.
2. If more than 1 card, split the deck in any way and pass each half to another instance of this function.
3. Return the value of the "Merge" helper function (compare top of two stacks of cards, put away smaller card, repeat) taking the value of the 2 instances created in step 2.


"Merge" helper function: Given two stacks of cards:
1. If one stack is empty, append remaining stack to the end of the return list and return.
2. Else, compare the number at index 0 of both stacks, append the smaller number to the end of return string.
3. Remove number just appended from the stack it came from, call Merge function on the two stacks.


  BIG-OH CLASSIFICATION OF ALGORITHM:
Merge sort can be split into 2 main phases, the splitting phase and the merging phase.

The splitting phase is O(log n). The split phase starts with a list of length n, and must split this list (divide by 2) repeatedly until there are n amounts of list of length 1. Mathematically, this can be phrased as how many times do you need to divide n by 2 to obtain 1, which can be written as log n. It's also fundamentally the same process as doing something like binary search which we know has a log n runtime. 

The merge phase is basically the split phase run in reverse. It begins with n lists of length 1 and must merge them together 2 at a time to form a single list of length n. Thus, it will require log n layers of these merges to reconstruct the list. However, each layer of the merge require n amounts of appends (since each and every element present must be appended to a list at some point), thus the efficiency of the merge phase is n (log n).

Adding the two phases together Merge Sort has a Big O of O(n logn).

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {

    }//end main

}//end class
