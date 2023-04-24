# Last-Stone-weight
## Problem Statement
 It is a problem where we are given an array of integers representing the weights of stones, and we are to simulate a game where we repeatedly choose the two heaviest stones and smash them together, and then either discard both stones if they have the same weight or reduce the larger stone's weight by the weight of the smaller stone if they have different weights. The game ends when there is only one stone left, and we are to return the weight of that stone.
 
## Example 1:

Input: stones = [2,7,4,1,8,1]

Output: 1

Explanation: 

We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,

we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,

we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,

we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

## Example 2:

Input: stones = [1]

Output: 1

## Constraints:

1 <= stones.length <= 30
1 <= stones[i] <= 1000

# Solution
To solve this problem, we can use a max heap to keep track of the heaviest stones. We first add all the stones to the max heap. Then, we repeatedly extract the two heaviest stones from the heap, smash them together, and insert the resulting stone back into the heap. We continue doing this until there is at most one stone left in the heap. If there is one stone left, we return its weight. If there are no stones left, we return 0.

## Steps:

- Create a max heap.
- Add all the stones to the max heap.
- While there are at least two stones in the heap:
-- Extract the two heaviest stones from the heap.
-- Smash them together to get a new stone with weight = abs(stone1 - stone2).
-- Insert the new stone into the heap.
- If there is one stone left in the heap, return its weight.
- If there are no stones left in the heap, return 0.
## Time Complexity  
This solution has a time complexity of O(n log n), where n is the number of stones in the array, because we insert and extract from a max heap n times. The space complexity is also O(n), because we store all the stones in the heap.
