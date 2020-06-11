package org.lj.leetcode

import scala.collection.mutable
import scala.util.control.Breaks._
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
object TwoSum {
  def main(args: Array[String]): Unit = {
    twoSum(Array(7, 7, 11, 15, 2, 3), 14).foreach(println _)
    twoSum2(Array(7, 7, 11, 15, 2, 3), 14).foreach(println _)
  }

  //解法1,暴力解法
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val result = new Array[Int](2)
    breakable {
      for (i <- (0 to nums.length - 2)) {
        for (j <- ((i + 1) to nums.length - 1)) {
          //需避开相同元素
          if (nums(i) + nums(j) == target && nums(i) != nums(j)) {
            result(0) = i
            result(1) = j
            break
          }
        }
      }
    }
    result
  }


  /*解法2
    利用hashmap,少了第二次遍历,直接命中,时间复杂度为o(1)
   */
  def twoSum2(nums: Array[Int], target: Int): Array[Int] = {
    val result = new Array[Int](2)
    val hash = new mutable.HashMap[Int, Int]()
    breakable {
      for (i <- (0 to nums.length - 1)) {
        if (hash.contains(target - nums(i)) && !hash.contains(nums(i))) {
          result(0) = hash.get(target - nums(i)).get
          result(1) = i
          break()
        }
        hash.put(nums(i), i)
      }
    }
    result
  }
}