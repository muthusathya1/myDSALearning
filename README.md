# Find Triangular Sum of an Array

Link  
https://leetcode.com/problems/find-triangular-sum-of-an-array/

## Problem
You are given a 0-indexed integer array `nums` of length `n`. Build a triangular array from `nums` as follows:
- Let `row0 = nums`.
- For each `i` from `0` to `n - 2`, define `row(i+1)` to be an array of length `n - i - 1` where:
  - `row(i+1)[j] = (row(i)[j] + row(i)[j + 1]) mod 10` for `0 ≤ j < n − i − 1`.

The triangular sum of `nums` is the single element in `row(n − 1)`. Return this triangular sum.

## Examples

### Example 1
Input: `nums = [1, 2, 3, 4, 5]`  
Output: `8`  
Explanation:  
- `row0: [1, 2, 3, 4, 5]`  
- `row1: [3, 5, 7, 9]`  
- `row2: [8, 2, 6]`  
- `row3: [0, 8]`  
- `row4: [8]`  
The final element is `8`.

### Example 2
Input: `nums = [5]`  
Output: `5`  
Explanation: The triangular array has only one row.

## Constraints
- `1 ≤ nums.length ≤ 1000`  
- `0 ≤ nums[i] ≤ 9`
