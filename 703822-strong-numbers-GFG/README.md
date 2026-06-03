# [Strong Numbers](https://www.geeksforgeeks.org/problems/strong-numbers4336/1)
## Easy
Strong Numbers&nbsp;are the numbers whose sum of factorial of digits is equal to the original number. Given a number, the task is to check if it is a Strong Number or not.
&nbsp;

Example 1:

Input: 145
Output: 1
Explanation: 1! + 4! + 5! = 145


Example 2:

Input: 5314
Output: 0
Explanation: 5! + 3! + 1! + 4! 
is not equal to 5314.


&nbsp;

Your Task:
You don't need to read or print anything. Your task is to complete the function is_StrongNumber()&nbsp;which takes the number as input parameter and returns 1 if it is Strong Number otherwise returns 0.
&nbsp;

Expected Time Complexity :&nbsp;O(Number of digits in N)
Expected Space Complexity:&nbsp;O(1)
&nbsp;

Constraints:
1 &lt;= n &lt;= 10000
