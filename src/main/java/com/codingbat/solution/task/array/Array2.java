package com.codingbat.solution.task.array;


/**
 * Array2
 * <p>
 * Medium array problems -- 1 loop.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Array-2
 */
class Array2 {

    /**
     * Count Evens
     * <p>
     * Return the number of even ints in the given array.
     * Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
     * <p>
     * countEvens({2, 1, 2, 3, 4}) → 3
     * countEvens({2, 2, 0}) → 3
     * countEvens({1, 3, 5}) → 0
     *
     * @param nums int[]
     * @return int
     * @link http://codingbat.com/prob/p162010
     */
    int countEvens(int[] nums) {

        int count = 0;

        if (nums.length != 0) {
            for (int num : nums) {
                if (num % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * Big Diff
     * <p>
     * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the
     * array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods  return the smaller or larger of two
     * values.
     * <p>
     * bigDiff({10, 3, 5, 6}) -> 7
     * bigDiff({7, 2, 10, 9}) -> 8
     * bigDiff({2, 10, 7, 2}) -> 8
     *
     * @param nums int[]
     * @return int
     * @link http://codingbat.com/prob/p196640;
     */
    int bigDiff(int[] nums) {

        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num <= min) {
                min = num;
            }
        }

        return max - min;
    }

    /**
     * Centered Average
     * <p>
     * Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except
     * ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
     * ignore
     * just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume
     * that the array is length 3 or more.
     * <p>
     * centeredAverage({1, 2, 3, 4, 100}) -> 3
     * centeredAverage({1, 1, 5, 5, 10, 8, 7}) -> 5
     * centeredAverage({-10, -4, -2, -4, -2, 0}) -> -3
     *
     * @param nums int[]
     * @return int
     * @link http://codingbat.com/prob/p136585;
     */
    int centeredAverage(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int sum = 0;

        for (int num : nums) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return (sum - (max + min)) / (nums.length - 2);
    }

    /**
     * Sum 13
     * <p>
     * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very
     * unlucky,
     * so it does not count and numbers that come immediately after a 13 also do not count.
     * <p>
     * sum13({1, 2, 2, 1}) -> 6
     * sum13({1, 1}) -> 2
     * sum13({1, 2, 2, 1, 13}) -> 6
     *
     * @param nums int[]
     * @return int
     * @link http://codingbat.com/prob/p127384;
     */
    int sum13(int[] nums) {

        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13)
                total += nums[i];
            else if (i <= nums.length - 1)
                i++;
        }

        return total;
    }

    /**
     * Sum 67
     * <p>
     * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to
     * the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
     * <p>
     * sum67({1, 2, 2}) -> 5
     * sum67({1, 2, 2, 6, 99, 99, 7}) -> 5
     * sum67({1, 1, 6, 7, 2}) -> 4
     *
     * @param nums int[]
     * @return int
     * @link http://codingbat.com/prob/p111327;
     */
    int sum67(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6)
                sum += nums[i];
            else
                while (nums[i] != 7)
                    i++;
        }

        return sum;
    }

    /**
     * Has 22
     * <p>
     * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
     * <p>
     * has22({1, 2, 2}) -> true
     * has22({1, 2, 1, 2}) -> false
     * has22({2, 1, 2}) -> false
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p121853;
     */
    boolean has22(int[] nums) {

        for (int i = 0; i <= nums.length - 2; i++)
            if (nums[i] == 2 && nums[i + 1] == 2)
                return true;

        return false;
    }

    /**
     * Lucky 13
     * <p>
     * Given an array of ints, return true if the array contains no 1's and no 3's.
     * <p>
     * lucky13({0, 2, 4}) -> true
     * lucky13({1, 2, 3}) -> false
     * lucky13({1, 2, 4}) -> false
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p194525;
     */
    boolean lucky13(int[] nums) {

        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }

        return true;
    }

    /**
     * Sum 28
     * <p>
     * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
     * <p>
     * sum28({2, 3, 2, 2, 4, 2}) -> true
     * sum28({2, 3, 2, 2, 4, 2, 2}) -> false
     * sum28({1, 2, 3, 4}) -> false
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p199612;
     */
    boolean sum28(int[] nums) {

        int sum = 0;

        for (int num : nums) {
            if (num == 2) {
                sum += 2;
            }
        }

        return sum == 8;
    }

    /**
     * More 14
     * <p>
     * Given an array of ints, return true if the number of 1's is greater than the number of 4's
     * <p>
     * more14({1, 4, 1}) -> true
     * more14({1, 4, 1, 4}) -> false
     * more14({1, 1}) -> true
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p104627;
     */
    boolean more14(int[] nums) {

        int ones = 0;
        int fours = 0;

        for (int num : nums) {
            if (num == 1) {
                ones++;
            }
            if (num == 4) {
                fours++;
            }
        }

        return ones > fours;
    }

    /**
     * Fizz Array
     * <p>
     * Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The
     * given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the
     * length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make
     * a new int array is: new int[desired_length]
     * <p>
     * fizzArray(4) -> {0, 1, 2, 3}
     * fizzArray(1) -> {0}
     * fizzArray(10) -> {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
     *
     * @param n int
     * @return int[]
     * @link http://codingbat.com/prob/p180920;
     */
    int[] fizzArray(int n) {

        int[] result = new int[n];

        for (int i = 0; i < n; i++)
            result[i] = i;

        return result;
    }

    /**
     * Only 14
     * <p>
     * Given an array of ints, return true if every element is a 1 or a 4.
     * <p>
     * only14({1, 4, 1, 4}) -> true
     * only14({1, 4, 2, 4}) -> false
     * only14({1, 1}) -> true
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p186672;
     */
    boolean only14(int[] nums) {

        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }

        return true;
    }

    /**
     * Fizz Array 2
     * <p>
     * Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" ..
     * through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the
     * String form of most types. The syntax to make a new string array is: new String[desired_length]
     * <p>
     * fizzArray2(4) -> {"0", "1", "2", "3"}
     * fizzArray2(10) -> {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
     * fizzArray2(2) -> {"0", "1"}
     *
     * @param n int
     * @return String[]
     * @link http://codingbat.com/prob/p178353;
     */
    String[] fizzArray2(int n) {

        String[] result = new String[n];

        for (int i = 0; i < n; i++)
            result[i] = String.valueOf(i);

        return result;
    }

    /**
     * No 14
     * <p>
     * Given an array of ints, return true if it contains no 1's or it contains no 4's.
     * <p>
     * no14({1, 2, 3}) -> true
     * no14({1, 2, 3, 4}) -> false
     * no14({2, 3, 4}) -> true
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p136648;
     */
    boolean no14(int[] nums) {

        int ones = 0;
        int fours = 0;

        for (int num : nums) {
            if (num == 1) {
                ones++;
            }
            if (num == 4) {
                fours++;
            }
        }

        return ones == 0 || fours == 0;
    }

    /**
     * Is Everywhere
     * <p>
     * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least
     * one of the pair is that value. Return true if the given value is everywhere in the array.
     * <p>
     * isEverywhere({1, 2, 1, 3}, 1) -> true
     * isEverywhere({1, 2, 1, 3}, 2) -> false
     * isEverywhere({1, 2, 1, 3, 4}, 1) -> false
     *
     * @param nums int[]
     * @param val  int
     * @return boolean
     * @link http://codingbat.com/prob/p110222;
     */
    boolean isEverywhere(int[] nums, int val) {

        boolean flag1 = true;
        boolean flag2 = true;

        for (int i = 0; i < nums.length; i += 2)
            if (nums[i] != val)
                flag1 = false;

        for (int i = 0; i < nums.length - 1; i += 2)
            if (nums[i + 1] != val)
                flag2 = false;

        return flag1 || flag2;
    }

    /**
     * Either 24
     * <p>
     * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
     * <p>
     * either24({1, 2, 2}) -> true
     * either24({4, 4, 1}) -> true
     * either24({4, 4, 1, 2, 2}) -> false
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p191878;
     */
    boolean either24(int[] nums) {

        Boolean twos = false;
        Boolean fours = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                twos = true;
            if (nums[i] == 4 && nums[i + 1] == 4)
                fours = true;
        }

        return twos ^ fours;
    }

    /**
     * Match Up
     * <p>
     * Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element
     * in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less,
     * but are not equal.
     * <p>
     * matchUp({1, 2, 3}, {2, 3, 10}) -> 2
     * matchUp({1, 2, 3}, {2, 3, 5}) -> 3
     * matchUp({1, 2, 3}, {2, 3, 3}) -> 2
     *
     * @param nums1 int[]
     * @param nums2 int[]
     * @return int
     * @link http://codingbat.com/prob/p136254;
     */
    int matchUp(int[] nums1, int[] nums2) {

        int count = 0;

        for (int i = 0; i < nums1.length; i++)
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2)
                count++;

        return count;
    }

    /**
     * Has 77
     * <p>
     * Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's
     * separated by one element, such as with {7, 1, 7}.
     * <p>
     * has77({1, 7, 7}) -> true
     * has77({1, 7, 1, 7}) -> true
     * has77({1, 7, 1, 1, 7}) -> false
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p168357;
     */
    boolean has77(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == 7 && nums[i + 1] == 7)
                return true;

        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] == 7 && nums[i + 2] == 7)
                return true;

        return false;
    }

    /**
     * Has 12
     * <p>
     * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
     * <p>
     * has12({1, 3, 2}) -> true
     * has12({3, 1, 2}) -> true
     * has12({3, 1, 4, 5, 2}) -> true
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p169260;
     */
    boolean has12(int[] nums) {

        int one = 0;
        int two = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                one = i;
            if (nums[i] == 2)
                two = i;
        }

        return two > one;
    }

    /**
     * Mod Three
     * <p>
     * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
     * <p>
     * modThree({2, 1, 3, 5}) -> true
     * modThree({2, 1, 2, 5}) -> false
     * modThree({2, 4, 2, 5}) -> true
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p159979;
     */
    boolean modThree(int[] nums) {

        for (int i = 0; i <= nums.length - 3; i++) {
            boolean cond1 = nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0;
            boolean cond2 = nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1;
            if (cond1 || cond2)
                return true;
        }

        return false;
    }

    /**
     * Have Three
     * <p>
     * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to
     * each other.
     * <p>
     * haveThree({3, 1, 3, 1, 3}) -> true
     * haveThree({3, 1, 3, 3}) -> false
     * haveThree({3, 4, 3, 3, 4}) -> false
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p109783;
     */
    boolean haveThree(int[] nums) {

        int count = 0;
        int pos = -2; // in case nums[0] == 3

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i - pos == 1)
                    return false;
                pos = i;
            }
        }

        return count == 3;
    }

    /**
     * TwoTwo
     * <p>
     * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
     * <p>
     * <p>
     * twoTwo({4, 2, 2, 3}) -> true
     * twoTwo({2, 2, 4}) -> true
     * twoTwo({2, 2, 4, 2}) -> false
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p102145;
     */
    boolean twoTwo(int[] nums) {

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2) {
                int count = 0;
                for (int j = i; j < nums.length; j++)
                    if (nums[j] == 2)
                        count++;
                    else
                        break;
                i += count;
                if (count < 2)
                    return false;
            }

        return true;
    }

    /**
     * Same Ends
     * <p>
     * Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6,
     * 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in
     * the range 0..nums.length inclusive.
     * <p>
     * sameEnds({5, 6, 45, 99, 13, 5, 6}, 1) -> false
     * sameEnds({5, 6, 45, 99, 13, 5, 6}, 2) -> true
     * sameEnds({5, 6, 45, 99, 13, 5, 6}, 3) -> false
     *
     * @param nums int[]
     * @param len  int
     * @return boolean
     * @link http://codingbat.com/prob/p134300;
     */
    boolean sameEnds(int[] nums, int len) {

        for (int i = 0, j = nums.length - len; i < len; i++, j++)
            if (nums[i] != nums[j])
                return false;

        return true;
    }

    /**
     * Triple Up
     * <p>
     * Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23,
     * 24,
     * 25.
     * <p>
     * tripleUp({1, 4, 5, 6, 2}) -> true
     * tripleUp({1, 2, 3}) -> true
     * tripleUp({1, 2, 4}) -> false
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p137874;
     */
    boolean tripleUp(int[] nums) {

        for (int i = 0; i <= nums.length - 3; i++)
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2)
                return true;

        return false;
    }

    /**
     * Fizz Array 3
     * <p>
     * Given <b>start</b> and <b>end</b> numbers, return a new array containing the sequence of integers from start up
     * to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal
     * to the start number. Note that a length-0 array is valid. (See also: <a href=/doc/practice/fizzbuzz-code.html>FizzBuzz
     * Code</a>)
     * <p>
     * fizzArray3(5, 10) -> {5, 6, 7, 8, 9}
     * fizzArray3(11, 18) -> {11, 12, 13, 14, 15, 16, 17}
     * fizzArray3(1, 3) -> {1, 2}
     *
     * @param start int
     * @param end   int
     * @return int[]
     * @link http://codingbat.com/prob/p142539;
     */
    int[] fizzArray3(int start, int end) {

        int n = end - start;
        int[] result = new int[n];

        for (int i = 0; i < n; i++)
            result[i] = start++;

        return result;
    }

    /**
     * Shift Left
     * <p>
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return
     * the given array, or return a new array.
     * <p>
     * shiftLeft({6, 2, 5, 3}) -> {2, 5, 3, 6}
     * shiftLeft({1, 2}) -> {2, 1}
     * shiftLeft({1}) -> {1}
     *
     * @param nums int[]
     * @return int[]
     * @link http://codingbat.com/prob/p105031;
     */
    int[] shiftLeft(int[] nums) {

        if (nums.length > 0) {
            int first = nums[0];
            System.arraycopy(nums, 1, nums, 0, nums.length - 1);
            nums[nums.length - 1] = first;
        }

        return nums;
    }

    /**
     * Ten Run
     * <p>
     * For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until
     * encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
     * <p>
     * tenRun({2, 10, 3, 4, 20, 5}) -> {2, 10, 10, 10, 20, 20}
     * tenRun({10, 1, 20, 2}) -> {10, 10, 20, 20}
     * tenRun({10, 1, 9, 20}) -> {10, 10, 10, 20}
     *
     * @param nums int[]
     * @return int[]
     * @link http://codingbat.com/prob/p199484;
     */
    int[] tenRun(int[] nums) {

        boolean replace = false;
        int multiple = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                if (!replace) {
                    replace = true;
                    multiple = nums[i];
                } else
                    multiple = nums[i];
            }
            if (nums[i] % 10 != 0 && replace)
                nums[i] = multiple;
        }

        return nums;
    }

    /**
     * Pre 4
     * <p>
     * Given a non-empty array of ints, return a new array containing the elements from the original array that come
     * before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid
     * in java to create an array of length 0.
     * <p>
     * pre4({1, 2, 4, 1}) -> {1, 2}
     * pre4({3, 1, 4}) -> {3, 1}
     * pre4({1, 4, 4}) -> {1}
     *
     * @param nums int[]
     * @return int[]
     * @link http://codingbat.com/prob/p100246;
     */
    int[] pre4(int[] nums) {

        int count = 0;

        for (int num : nums) {
            if (num != 4) {
                count++;
            } else {
                break;
            }
        }

        int[] result = new int[count];

        System.arraycopy(nums, 0, result, 0, result.length);

        return result;
    }

    /**
     * Post 4
     * <p>
     * Given a non-empty array of ints, return a new array containing the elements from the original array that come
     * after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in
     * java to create an array of length 0.
     * <p>
     * post4({2, 4, 1, 2}) -> {1, 2}
     * post4({4, 1, 4, 2}) -> {2}
     * post4({4, 4, 1, 2, 3}) -> {1, 2, 3}
     *
     * @param nums int[]
     * @return int[]
     * @link http://codingbat.com/prob/p164144;
     */
    int[] post4(int[] nums) {

        int last4 = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 4)
                last4 = i;

        int[] res = new int[nums.length - (last4 + 1)];

        for (int i = last4 + 1, j = 0; i < nums.length; i++, j++)
            res[j] = nums[i];

        return res;
    }

    /**
     * Not Alone
     * <p>
     * We'll say that an element in an array is "alone" if there are values before and after it, and those values are
     * different from it. Return a version of the given array where every instance of the given value which is alone is
     * replaced by whichever value to its left or right is larger.
     * <p>
     * notAlone({1, 2, 3}, 2) -> {1, 3, 3}
     * notAlone({1, 2, 3, 2, 5, 2}, 2) -> {1, 3, 3, 5, 5, 2}
     * notAlone({3, 4}, 3) -> {3, 4}
     *
     * @param nums int[]
     * @param val  int
     * @return int[]
     * @link http://codingbat.com/prob/p169506;
     */
    int[] notAlone(int[] nums, int val) {

        for (int i = 1; i < nums.length - 1; i++)
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val)
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);

        return nums;
    }

    /**
     * Zero Front
     * <p>
     * Return an array that contains the exact same numbers as the given array,
     * but rearranged so that all the zeros are grouped at the start of the array.
     * The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
     * You may modify and return the given array or make a new array.
     * <p>
     * zeroFront({1, 0, 0, 1}) -> {0, 0, 1, 1}
     * zeroFront({0, 1, 1, 0, 1}) -> {0, 0, 1, 1, 1}
     * zeroFront({1, 0}) -> {0, 1}
     *
     * @param nums int[]
     * @return int[]
     * @link http://codingbat.com/prob/p193753;
     */
    int[] zeroFront(int[] nums) {

        int[] res = new int[nums.length];
        int zeroPos = 0;
        int nonZeroPos = res.length - 1;

        for (int num : nums) {
            if (num == 0) {
                res[zeroPos++] = 0;
            } else {
                res[nonZeroPos--] = num;
            }
        }

        return res;
    }

    /**
     * Without Ten
     * <p>
     * Return a version of the given array where all the 10's have been removed. The remaining elements should shift
     * left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1,
     * 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
     * <p>
     * withoutTen({1, 10, 10, 2}) -> {1, 2, 0, 0}
     * withoutTen({10, 2, 10}) -> {2, 0, 0}
     * withoutTen({1, 99, 10}) -> {1, 99, 0}
     *
     * @param nums int[]
     * @return int[]
     * @link http://codingbat.com/prob/p196976;
     */
    int[] withoutTen(int[] nums) {

        int[] copy = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                copy[index] = num;
                index++;
            }
        }

        return copy;
    }

    /**
     * Zero Max
     * <p>
     * Return a version of the given array where each zero value in the array is replaced by the largest odd value to
     * the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
     * <p>
     * zeroMax({0, 5, 0, 3}) -> {5, 5, 3, 3}
     * zeroMax({0, 4, 0, 3}) -> {3, 4, 3, 3}
     * zeroMax({0, 1, 0}) -> {1, 1, 0}
     *
     * @param nums int[]
     * @return int[]
     * @link http://codingbat.com/prob/p187050;
     */
    int[] zeroMax(int[] nums) {

        int largestOdd = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1 && nums[i] > largestOdd)
                largestOdd = nums[i];
            if (nums[i] == 0)
                nums[i] = largestOdd;
        }

        return nums;
    }

    /**
     * Even Odd
     * <p>
     * Return an array that contains the exact same numbers as the given array, but rearranged so that all the even
     * numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and
     * return the given array, or make a new array.
     * <p>
     * evenOdd({1, 0, 1, 0, 0, 1, 1}) -> {0, 0, 0, 1, 1, 1, 1}
     * evenOdd({3, 3, 2}) -> {2, 3, 3}
     * evenOdd({2, 2, 2}) -> {2, 2, 2}
     *
     * @param nums int[]
     * @return int[]
     * @link http://codingbat.com/prob/p105771;
     */
    int[] evenOdd(int[] nums) {

        int[] res = new int[nums.length];
        int evenPos = 0;
        int oddPos = res.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                res[evenPos++] = num;
            } else {
                res[oddPos--] = num;
            }
        }

        return res;
    }

    /**
     * FizzBuzz
     * <p>
     * This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first
     * problem for job interviews. Consider the series of numbers beginning at <b>start</b>
     * and running up to but not including <b>end</b>, so for example
     * start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these
     * numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for
     * multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or
     * other type. This version is a little more complicated than the usual version since you have to allocate and
     * index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
     * <p>
     * fizzBuzz(1, 6) -> {"1", "2", "Fizz", "4", "Buzz"}
     * fizzBuzz(1, 8) -> {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}
     * fizzBuzz(1, 11) -> {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}
     *
     * @param start int
     * @param end   int
     * @return String[]
     * @link http://codingbat.com/prob/p153059;
     */
    String[] fizzBuzz(int start, int end) {

        int n = end - start;
        String[] result = new String[n];

        int pos = 0;

        for (int i = start; i < end; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;

            if (fizz && buzz)
                result[pos] = "FizzBuzz";
            else if (fizz)
                result[pos] = "Fizz";
            else if (buzz)
                result[pos] = "Buzz";
            else
                result[pos] = String.valueOf(i);
            pos++;
        }

        return result;
    }

}