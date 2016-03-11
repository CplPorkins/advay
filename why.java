//PC Master Race - Lorenz Vargas and Ruochong Wu
//APCS2 pd10
//HW10 -- Justify
//2016-03-08

/*
Merge sort can be split into 2 main phases, the splitting phase and the merging phase.

The splitting phase is O(log n). The split phase starts with a list of length n, and must split this list (divide by 2) repeatedly until there are n amounts of list of length 1. Mathematically, this can be phrased as how many times do you need to divide n by 2 to obtain 1, which can be written as log n. It's also fundamentally the same process as doing something like binary search which we know has a log n runtime. 

The merge phase is basically the split phase run in reverse. It begins with n lists of length 1 and must merge them together 2 at a time to form a single list of length n. Thus, it will require log n layers of these merges to reconstruct the list. However, each layer of the merge require n amounts of appends (since each and every element present must be appended to a list at some point), thus the efficiency of the merge phase is n (log n).

Adding the two phases together Merge Sort has a Big O of O(n logn).
*/
