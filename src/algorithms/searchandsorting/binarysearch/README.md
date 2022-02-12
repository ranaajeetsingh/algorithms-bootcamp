**Binary Search Approach**: Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n). The basic steps to perform Binary Search are:

Begin with an interval covering the whole array.  
If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.  
Otherwise, narrow it to the upper half.  
Repeatedly check until the value is found or the interval is empty.  