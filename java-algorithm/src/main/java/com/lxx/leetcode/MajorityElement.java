package com.lxx.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中占比超过一半的元素称之为主要元素。给你一个 整数 数组，找出其中的主要元素。
 * 若没有，返回 -1 。请设计时间复杂度为 O(N)O(N) 、空间复杂度为 O(1)O(1) 的解决方案
 * <p>
 * 输入：[1,2,5,9,5,9,5,5,5]
 * <p>
 * 输出：5
 *
 * @Author lxx
 * @Date 2021/7/13
 */
public class MajorityElement {


    /**
     * 参考答案
     */
    class Solution {
        public int majorityElement(int[] nums) {
            int n = nums.length;
            Map<Integer, Integer> map = new HashMap<>();
            for (int x : nums) {
                map.put(x, map.getOrDefault(x, 0) + 1);
                if (map.get(x) > n / 2) {
                    return x;
                }
            }
            return -1;
        }
    }
}
