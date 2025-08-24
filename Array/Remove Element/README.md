# Remove Element

## Problem Statement
Given an integer array `nums` and an integer `val`, remove **all occurrences** of `val` in-place.  
The order of the elements may be changed. Then return the number of elements in `nums` that are **not equal** to `val`.

- Modify the array `nums` such that the **first `k` elements** contain the elements which are not equal to `val`.
- The remaining elements of `nums` can be ignored.
- Return `k`.

---

## Example 1
**Input**
nums = [3,2,2,3], val = 3


**Output**
k = 2, nums = [2,2,_,_]


**Explanation**
Your function should return `k = 2`, with the first two elements of `nums` being `2`.  
The underscores (`_`) indicate values beyond `k` that are irrelevant.

---

## Example 2
**Input**
nums = [0,1,2,2,3,0,4,2], val = 2


**Output**
k = 5, nums = [0,1,4,0,3,,,_]

**Explanation**
Your function should return `k = 5`. The first five elements can be `[0,1,4,0,3]` in any order.  
The values after index `k-1` do not matter.

---

## Constraints
- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

---
 ### Author 
 Vipul Singh[@Vipul-shr](https://github.com/Vipul-shr)
---
