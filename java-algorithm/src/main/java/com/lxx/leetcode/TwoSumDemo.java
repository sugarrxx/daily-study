package com.lxx.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 * <p>
 * 输入：nums = [2,7,11,15], target = 9 输出：[0,1]
 *
 * @Author lxx
 * @Date 2021/7/15
 */
public class TwoSumDemo {

    public static void main(String[] args) {
        int[] ints = {12, 17, 2, 22, 15, 7};

//        int[] one = twoSum(ints, 9);
//        int[] one = hashTwoSum(ints, 9);
        int[] one = hashTwoSumReverse(ints, 9);

        System.out.println(Arrays.toString(one));
    }

    /**
     * 时间复杂度：两重循环，复杂度是 O(n²)
     * 空间复杂度：O(1)
     */
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (target == arr[i] + arr[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] hashTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = target - a;
            if (map.get(a) == i) {
                map.remove(a);
            }
            if (map.containsKey(b)) {
                return new int[]{i, map.get(b)};
            }
        }
        return new int[]{};
    }

    /**
     * 从 LeetCode 上的执行时间来看，第一种哈希表做法是 4ms，而第二种哈希表的做法是 0ms（不足 1ms 的意思）
     * 快在了我们减少了哈希表的插入和删除操作
     */
    public static int[] hashTwoSumReverse(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i], b = target - a;
            if (map.containsKey(b)) {
                return new int[]{map.get(b), i};
            }
            map.put(a, i);
        }
        return new int[]{};
    }
}
