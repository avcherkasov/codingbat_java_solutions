package com.codingbat.solution.task.recursion;

/**
 * Recursion2
 * <p>
 * Harder recursion problems.
 * Currently, these are all recursive backtracking problems with arrays.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Recursion-2
 */
class Recursion2 {

    /**
     * Group Sum
     * <p>
     * Given an array of ints,
     * is it possible to choose a group of some of the ints,
     * such that the group sums to the given target?
     * This is a classic backtracking recursion problem.
     * Once you understand the recursive backtracking strategy in this problem,
     * you can use the same pattern for many problems to search a space of choices.
     * Rather than looking at the whole array, our convention is to consider the part
     * of the array starting at index start and continuing to the end of the array.
     * The caller can specify the whole array simply by passing start as 0.
     * No loops are needed -- the recursive calls progress down the array.
     * <p>
     * groupSum(0, {2, 4, 8}, 10) → true
     * groupSum(0, {2, 4, 8}, 14) → true
     * groupSum(0, {2, 4, 8}, 9) → false
     *
     * @param start  int
     * @param nums   int[]
     * @param target int
     * @return boolean
     * @link http://codingbat.com/prob/p145416
     */
    boolean groupSum(int start, int[] nums, int target) {

        if (start >= nums.length)
            return target == 0;

        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
    }

    /**
     * Group Sum 6
     * <p>
     * Given an array of ints,
     * is it possible to choose a group of some of the ints,
     * beginning at the start index, such that the group sums to the given target? However,
     * with the additional constraint that all 6's must be chosen. (No loops needed.)
     * <p>
     * groupSum6(0, {5, 6, 2}, 8) → true
     * groupSum6(0, {5, 6, 2}, 9) → false
     * groupSum6(0, {5, 6, 2}, 7) → false
     *
     * @param start  int
     * @param nums   int[]
     * @param target int
     * @return boolean
     * @link http://codingbat.com/prob/p199368
     */
    boolean groupSum6(int start, int[] nums, int target) {

        if (start >= nums.length)
            return target == 0;

        if (nums[start] == 6)
            return groupSum6(start + 1, nums, target - nums[start]);

        return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
    }

    /**
     * Group No Adj
     * <p>
     * Given an array of ints,
     * is it possible to choose a group of some of the ints,
     * such that the group sums to the given target with this additional constraint:
     * If a value in the array is chosen to be in the group,
     * the value immediately following it in the array must not be chosen.
     * (No loops needed.)
     * <p>
     * groupNoAdj(0, {2, 5, 10, 4}, 12) → true
     * groupNoAdj(0, {2, 5, 10, 4}, 14) → false
     * groupNoAdj(0, {2, 5, 10, 4}, 7) → false
     *
     * @param start  int
     * @param nums   int[]
     * @param target int
     * @return boolean
     * @link http://codingbat.com/prob/p169605
     */
    boolean groupNoAdj(int start, int[] nums, int target) {

        if (start >= nums.length)
            return target == 0;

        return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
    }

    /**
     * Group Sum 5
     * <p>
     * Given an array of ints,
     * is it possible to choose a group of some of the ints,
     * such that the group sums to the given target with these additional constraints:
     * all multiples of 5 in the array must be included in the group.
     * If the value immediately following a multiple of 5 is 1,
     * it must not be chosen. (No loops needed.)
     * <p>
     * groupSum5(0, {2, 5, 10, 4}, 19) → true
     * groupSum5(0, {2, 5, 10, 4}, 17) → true
     * groupSum5(0, {2, 5, 10, 4}, 12) → false
     *
     * @param start  int
     * @param nums   int[]
     * @param target int
     * @return boolean
     * @link http://codingbat.com/prob/p138907
     */
    boolean groupSum5(int start, int[] nums, int target) {

        if (start >= nums.length)
            return target == 0;

        if (nums[start] % 5 == 0) {
            if (start < nums.length - 1 && nums[start + 1] == 1)
                return groupSum5(start + 2, nums, target - nums[start]);

            return groupSum5(start + 1, nums, target - nums[start]);
        }

        return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
    }

    /**
     * Group Sum Clump
     * <p>
     * Given an array of ints,
     * is it possible to choose a group of some of the ints,
     * such that the group sums to the given target,
     * with this additional constraint:
     * if there are numbers in the array that are adjacent and the identical value,
     * they must either all be chosen, or none of them chosen.
     * For example, with the array {1, 2, 2, 2, 5, 2},
     * either all three 2's in the middle must be chosen or not,
     * all as a group. (one loop can be used to find the extent of the identical values).
     * <p>
     * groupSumClump(0, {2, 4, 8}, 10) → true
     * groupSumClump(0, {1, 2, 4, 8, 1}, 14) → true
     * groupSumClump(0, {2, 4, 4, 8}, 14) → false
     *
     * @param start  int
     * @param nums   int[]
     * @param target int
     * @return boolean
     * @link http://codingbat.com/prob/p105136
     */
    boolean groupSumClump(int start, int[] nums, int target) {

        if (start >= nums.length)
            return target == 0;

        int sum = nums[start];
        int count = 1;

        for (int i = start + 1; i < nums.length; i++)
            if (nums[i] == nums[start]) {
                sum += nums[i];
                count++;
            }

        return groupSumClump(start + count, nums, target - sum) || groupSumClump(start + count, nums, target);
    }

    /**
     * Split Array
     * <p>
     * Given an array of ints,
     * is it possible to divide the ints into two groups,
     * so that the sums of the two groups are the same.
     * Every int must be in one group or the other.
     * Write a recursive helper method that takes whatever arguments you like,
     * and make the initial call to your recursive helper from splitArray().
     * (No loops needed.)
     * <p>
     * splitArray({2, 2}) → true
     * splitArray({2, 3}) → false
     * splitArray({5, 2, 3}) → true
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p185204
     */
    boolean splitArray(int[] nums) {
        return splitArrayHelper(0, nums, 0, 0);
    }

    /**
     * Split Array Helper
     *
     * @param start int
     * @param nums  int[]
     * @param sum1  int
     * @param sum2  int
     * @return boolean
     */
    private boolean splitArrayHelper(int start, int[] nums, int sum1, int sum2) {

        if (start >= nums.length)
            return sum1 == sum2;

        return splitArrayHelper(start + 1, nums, sum1 + nums[start], sum2) || splitArrayHelper(start + 1, nums, sum1, sum2 + nums[start]);
    }

    /**
     * Split Odd 10
     * <p>
     * Given an array of ints,
     * is it possible to divide the ints into two groups,
     * so that the sum of one group is a multiple of 10,
     * and the sum of the other group is odd.
     * Every int must be in one group or the other.
     * Write a recursive helper method that takes whatever arguments you like,
     * and make the initial call to your recursive helper from splitOdd10().
     * (No loops needed.)
     * <p>
     * splitOdd10({5, 5, 5}) → true
     * splitOdd10({5, 5, 6}) → false
     * splitOdd10({5, 5, 6, 1}) → true
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p171660
     */
    boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(0, nums, 0, 0);
    }

    /**
     * Split Odd 10 Helper
     *
     * @param start int
     * @param nums  int[]
     * @param sum1  int
     * @param sum2  int
     * @return boolean
     */
    private boolean splitOdd10Helper(int start, int[] nums, int sum1, int sum2) {

        if (start >= nums.length)
            return sum1 % 10 == 0 && sum2 % 2 == 1 || sum1 % 2 == 1 && sum2 % 10 == 0;

        return splitOdd10Helper(start + 1, nums, sum1 + nums[start], sum2) || splitOdd10Helper(start + 1, nums, sum1, sum2 + nums[start]);
    }

    /**
     * Split 53
     * <p>
     * Given an array of ints,
     * is it possible to divide the ints into two groups,
     * so that the sum of the two groups is the same,
     * with these constraints: all the values that are multiple of 5 must be in one group,
     * and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other.
     * (No loops needed.)
     * <p>
     * split53({1,1}) → true
     * split53({1, 1, 1}) → false
     * split53({2, 4, 2}) → true
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p168295
     */
    boolean split53(int[] nums) {
        return split53Helper(0, nums, 0, 0);
    }

    /**
     * Split 53 Helper
     *
     * @param start int
     * @param nums  int[]
     * @param sum1  int
     * @param sum2  int
     * @return boolean
     */
    private boolean split53Helper(int start, int[] nums, int sum1, int sum2) {

        if (start >= nums.length)
            return sum1 == sum2;

        if (nums[start] % 5 == 0)
            return split53Helper(start + 1, nums, sum1 + nums[start], sum2);

        if (nums[start] % 3 == 0)
            return split53Helper(start + 1, nums, sum1, sum2 + nums[start]);

        return split53Helper(start + 1, nums, sum1 + nums[start], sum2) || split53Helper(start + 1, nums, sum1, sum2 + nums[start]);
    }

}