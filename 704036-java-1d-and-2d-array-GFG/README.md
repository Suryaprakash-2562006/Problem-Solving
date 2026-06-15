# [Java 1-d and 2-d Array](https://www.geeksforgeeks.org/problems/java-1-d-and-2-d-array2952/1?page=1&category=Java&status=unsolved&sortBy=submissions)
## Easy
Given a integer n. We have&nbsp;n*n&nbsp;values of a 2-d array,&nbsp;and&nbsp;&nbsp;n values of 1-d array. Task is to find the sum of the left&nbsp;diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.
Example 1:
â€‹Input : arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}} 
        and N = 3
brr[] = {3, 6, 9}
Output : 15 9
Explanation:
1 2 3
4 5 6
7 8 9
So, this sum of left diagonal (1+ 5 + 9) = 15
The maximum element in an array brr is 9
So, will return {15, 9} as an answer.

â€‹Example 2:
Input : arr[][] = {{1,2}, {1, 2}} and N = 2
brr[] = {10, 1} 
Output :  3 10 
&nbsp;
Your Task:This is a function problem. The input is already taken care of by the driver code. You only need to complete the function array() that takes a two-dimension array (a), another one dimension array (b),&nbsp;sizeOfArray (n), and return the ArrayList which is having&nbsp;the sum of the diagonal elements of the array a and the maximum number of the array&nbsp;b. The driver code takes care of the printing.
Expected Time Complexity:&nbsp;O(N).Expected Auxiliary Space:&nbsp;O(1).
&nbsp;
Constraints1 ≤ n ≤ 1001 ≤ a[i][j], b[i] ≤ 103