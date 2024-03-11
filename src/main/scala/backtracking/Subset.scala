package backtracking

import scala.collection.mutable.{ListBuffer, Set}

// https://leetcode.com/problems/subsets/description/

// Given an integer array nums of unique elements, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.


// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]

object Subset {
    object sulution {
        def subset(nums: Array[Int]): List[List[Int]] = {
            val ans = Set.empty[scala.collection.immutable.Set[Int]]
            backtracking(0, Set.empty[Int], nums, ans)
            ans.map(_.toList).toList
        }

        def backtracking(startIndex: Int, current: Set[Int], nums: Array[Int], ans: Set[scala.collection.immutable.Set[Int]]): Unit = {
            val nextSet = current.toSet
            if(!ans.contains(nextSet)) {
                ans.add(nextSet)
            }

            for (num <-  nums.drop(startIndex)) {
                if(!current.contains(num)) {
                    println(s"add $num to $current")
                    current.add(num)
                    backtracking(startIndex + 1, current, nums, ans)
                    current.remove(num)
                }
            }
        }
    }
  
}
