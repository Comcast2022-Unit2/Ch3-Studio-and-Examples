package com.company;

public class Loops {
    public static void main(String[] args) {
        // in JS: for (let i = 0; i < 10; i++)
//        for (int i = 0; i < 10; i++ ) {
//            System.out.println(i);
//        }

        // create an array of integers
        // in JS: let nums = [1, 1, 2, 3, etc....];
        int[] nums = {1, 1, 2, 3, 5, 8, 13, 21};
        // if we were to loop through this in JS:
        // for (let i = 0; i < nums.length; i++) {etc...}
        for (int i = 0; i < nums.length; i++) {
            // print all the integers in nums
            System.out.println(nums[i]);
        }

        // A different type of loop syntax in JS:
        // for (let num of nums) {etc...}
        // for (let num in nums) {etc...}
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
