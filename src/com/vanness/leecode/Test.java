package com.vanness.leecode;

/**
 * Created by pyy on 2019/11/25.
 */
public class Test {
    public static void main(String[] args) {
        //NO1_TwoSum
        test_no1_twosum();


    }

    /**
     * 两数之和
     */
    private static void test_no1_twosum() {
        NO1_TwoSum solution = new NO1_TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 22;
        int[] result = solution.twoSum(nums, target);
        System.out.print("[");
        for(int x : result){
            System.out.print(x + " ");
        }
        System.out.print("]");
    }



}