# DAA_P1
# POSSIBLE EQUAL MAXIMUM SUM ASSIGNMENT
## Name : Pranjali Joshi
## Sec : A
## Roll No : 13
## Branch : CSE - 1
## Subject : DAA
## PROBLEM STATEMENT
You are given 3 queues. Find the maximum sum possible such that sum of elements of each queue are equal and maximum.You can only remove elements from front of the queue.

Algorithm
1. Make 3 queues.
2. Initialise variables for sum of queue,front of stack etc.
3. Find the sum of each of the stacks using loops.
4. Check if queues are empty or not. If empty go to step
5. Check if sum of queuesbare equal or not.If equal go to step
6. Check using an infinite loop which queue has maximum sum. Then the queue which is found ,it's sum is decreased by the no present at front of queue and the value of front is increased. Go to step 3.
7. Return 0 if empty ,or if equal sum found then return the sum.
Example
Sum of queue1= 10 , sum of queue2= 9 , sum of queue3= 10

Now if we remove the front element from queue 1 , i.e) 4 ,we get sum of queue1 as 10 - 4 = 6

if we remove the front element from queue2 , i.e) 3 ,we get sum of queue2 as 9 - 3= 6

if we remove the front element from queue 1 , i.e) 3 ,we get sum of queue3 as 10 - 4 = 6r
