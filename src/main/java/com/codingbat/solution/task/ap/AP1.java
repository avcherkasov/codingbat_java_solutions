package com.codingbat.solution.task.ap;

import java.util.ArrayList;
import java.util.List;

/**
 * AP1
 * <p>
 * AP CS medium problems.
 * These problems are based on free response questions from old AP CS-A exams, 2004 and later.
 * Some are from the exams and some were just created to have a similar difficulty.
 * These problems are good practice for the logic/loop/array aspects of the exam.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/AP-1
 */
class AP1 {


    /**
     * Scores Increasing
     * <p>
     * Given an array of scores,
     * return true if each score is equal or greater than the one before.
     * The array will be length 2 or more.
     * <p>
     * scoresIncreasing({1, 3, 4}) -> true
     * scoresIncreasing({1, 3, 2}) -> false
     * scoresIncreasing({1, 1, 4}) -> true
     *
     * @param scores int[]
     * @return boolean
     * @link http://codingbat.com/prob/p146974
     */
    boolean scoresIncreasing(int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {

            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Scores 100
     * <p>
     * Given an array of scores,
     * return true if there are scores of 100 next to each other in the array.
     * The array length will be at least 2.
     * <p>
     * scores100({1, 100, 100}) -> true
     * scores100({1, 100, 99, 100}) -> false
     * scores100({100, 1, 100, 100}) -> true
     *
     * @param scores int[]
     * @return boolean
     * @link http://codingbat.com/prob/p179487
     */
    boolean scores100(int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }

        return false;
    }

    /**
     * Scores Clump
     * <p>
     * Given an array of scores sorted in increasing order,
     * return true if the array contains 3 adjacent scores that differ
     * from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
     * <p>
     * scoresClump({3, 4, 5}) -> true
     * scoresClump({3, 4, 6}) -> false
     * scoresClump({1, 3, 5, 5}) -> true
     *
     * @param scores int[]
     * @return boolean
     * @link http://codingbat.com/prob/p194530
     */
    boolean scoresClump(int[] scores) {

        if (scores.length > 2) {
            for (int i = 0; i < scores.length - 2; i++) {
                if (scores[i + 2] - scores[i] <= 2)
                    return true;
            }
        }

        return false;
    }

    /**
     * Scores Average
     * <p>
     * Given an array of scores, compute the int average of the first half and the second half, and return whichever is
     * larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To
     * practice decomposition, write a separate helper method <br><code>int average(int[] scores, int start, int end) {
     * </code> which computes the average of the elements between indexes start..end. Call your helper method twice to
     * implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area.
     * Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
     * <p>
     * scoresAverage({2, 2, 4, 4}) -> 4
     * scoresAverage({4, 4, 4, 2, 2, 2}) -> 4
     * scoresAverage({3, 4, 5, 1, 2, 3}) -> 4
     *
     * @param scores int[]
     * @return int
     * @link http://codingbat.com/prob/p123837
     */
    int scoresAverage(int[] scores) {

        int sum = 0, count = 0, first, second;

        for (int i = 0; i < scores.length / 2; i++) {
            sum += scores[i];
            count++;
        }

        first = sum / count;

        sum = count = 0;

        for (int i = scores.length / 2; i < scores.length; i++) {
            sum += scores[i];
            count++;
        }

        second = sum / count;

        return Math.max(first, second);
    }

    /**
     * Words Count
     * <p>
     * Given an array of strings, return the count of the number of strings with the given length.
     * <p>
     * wordsCount({"a", "bb", "b", "ccc"}, 1) -> 2
     * wordsCount({"a", "bb", "b", "ccc"}, 3) -> 1
     * wordsCount({"a", "bb", "b", "ccc"}, 4) -> 0
     *
     * @param words String[]
     * @param len   int
     * @return int
     * @link http://codingbat.com/prob/p124620
     */
    int wordsCount(String[] words, int len) {

        int count = 0;

        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }

        return count;
    }

    /**
     * Words Front
     * <p>
     * Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
     * <p>
     * wordsFront({"a", "b", "c", "d"}, 1) -> {"a"}
     * wordsFront({"a", "b", "c", "d"}, 2) -> {"a", "b"}
     * wordsFront({"a", "b", "c", "d"}, 3) -> {"a", "b", "c"}
     *
     * @param words String[]
     * @param n     int
     * @return String[]
     * @link http://codingbat.com/prob/p183837
     */
    String[] wordsFront(String[] words, int n) {

        String[] newWords = new String[n];
        System.arraycopy(words, 0, newWords, 0, n);

        return newWords;
    }

    /**
     * Words Without List
     * <p>
     * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are
     * omitted. See wordsWithout() below which is more difficult because it uses arrays.
     * <p>
     * wordsWithoutList({"a", "bb", "b", "ccc"}, 1) -> {"bb", "ccc"}
     * wordsWithoutList({"a", "bb", "b", "ccc"}, 3) -> {"a", "bb", "b"}
     * wordsWithoutList({"a", "bb", "b", "ccc"}, 4) -> {"a", "bb", "b", "ccc"}
     *
     * @param words String[]
     * @param len   int
     * @return List
     * @link http://codingbat.com/prob/p183407
     */
    List wordsWithoutList(String[] words, int len) {

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.length() != len) {
                result.add(word);
            }
        }

        return result;
    }

    /**
     * Has One
     * <p>
     * Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to
     * discard the rightmost digit.
     * <p>
     * hasOne(10) -> true
     * hasOne(22) -> false
     * hasOne(220) -> false
     *
     * @param n int
     * @return boolean
     * @link http://codingbat.com/prob/p191212
     */
    boolean hasOne(int n) {

        while (n > 0) {
            if (n % 10 == 1)
                return true;
            n /= 10;
        }

        return false;
    }

    /**
     * Divides Self
     * <p>
     * We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for
     * example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into
     * anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to
     * discard the rightmost digit.
     * <p>
     * dividesSelf(128) -> true
     * dividesSelf(12) -> true
     * dividesSelf(120) -> false
     *
     * @param n int
     * @return boolean
     * @link http://codingbat.com/prob/p165941
     */
    boolean dividesSelf(int n) {

        int copyN = n;

        while (n > 0)
            if (n % 10 == 0)
                return false;
            else if (copyN % (n % 10) == 0)
                n /= 10;
            else
                return false;

        return true;
    }

    /**
     * Copy Evens
     * <p>
     * Given an array of positive ints, return a new array of length "count" containing the first even numbers from the
     * original array. The original array will contain at least "count" even numbers.
     * <p>
     * copyEvens({3, 2, 4, 5, 8}, 2) -> {2, 4}
     * copyEvens({3, 2, 4, 5, 8}, 3) -> {2, 4, 8}
     * copyEvens({6, 1, 2, 4, 5, 8}, 3) -> {6, 2, 4}
     *
     * @param nums  int[]
     * @param count int
     * @return int[]
     * @link http://codingbat.com/prob/p134174
     */
    int[] copyEvens(int[] nums, int count) {

        int[] result = new int[count];
        int position = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[position] = num;
                position++;
            }
            if (position == count) {
                break;
            }
        }

        return result;
    }

    /**
     * Copy Endy
     * <p>
     * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of
     * positive ints, return a new array of length "count" containing the first endy numbers from the original array.
     * Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at
     * least "count" endy numbers.
     * <p>
     * copyEndy({9, 11, 90, 22, 6}, 2) -> {9, 90}
     * copyEndy({9, 11, 90, 22, 6}, 3) -> {9, 90, 6}
     * copyEndy({12, 1, 1, 13, 0, 20}, 2) -> {1, 1}
     *
     * @param nums  int[]
     * @param count int
     * @return int[]
     * @link http://codingbat.com/prob/p130124
     */
    int[] copyEndy(int[] nums, int count) {

        int[] result = new int[count];

        for (int i = 0, pos = 0; i < nums.length; i++) {
            if (nums[i] >= 0 && nums[i] <= 10 || nums[i] >= 90 && nums[i] <= 100) {
                result[pos] = nums[i];
                pos++;
            }
            if (pos == count)
                break;
        }

        return result;
    }

    /**
     * Match Up
     * <p>
     * Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st
     * string in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are
     * non-empty and
     * start with the same char. The strings may be any length, including 0.
     * <p>
     * matchUp({"aa", "bb", "cc"}, {"aaa", "xx", "bb"}) -> 1
     * matchUp({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) -> 2
     * matchUp({"aa", "bb", "cc"}, {"", "", "ccc"}) -> 1
     *
     * @param a String[]
     * @param b String[]
     * @return int
     * @link http://codingbat.com/prob/p139677
     */
    int matchUp(String[] a, String[] b) {

        int count = 0;

        for (int i = 0; i < a.length; i++)
            if (!a[i].equals("") && !b[i].equals("") && a[i].charAt(0) == b[i].charAt(0))
                count++;

        return count;
    }

    /**
     * Score Up
     * <p>
     * The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers"
     * array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty
     * and are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for
     * each
     * incorrect answer, and +0 for each blank answer.
     * <p>
     * scoreUp({"a", "a", "b", "b"}, {"a", "c", "b", "c"}) -> 6
     * scoreUp({"a", "a", "b", "b"}, {"a", "a", "b", "c"}) -> 11
     * scoreUp({"a", "a", "b", "b"}, {"a", "a", "b", "b"}) -> 16
     *
     * @param key     String[]
     * @param answers String[]
     * @return int
     * @link http://codingbat.com/prob/p180365
     */
    int scoreUp(String[] key, String[] answers) {

        int sum = 0;

        for (int i = 0; i < answers.length; i++)
            if (answers[i].equals(key[i]))
                sum += 4;
            else if (!answers[i].equals("?"))
                sum -= 1;

        return sum;
    }

    /**
     * Words Without
     * <p>
     * Given an array of strings, return a new array without the strings that are equal to the target string. One
     * approach is to count the occurrences of the target string, make a new array of the correct length, and then copy
     * over the correct strings.
     * <p>
     * wordsWithout({"a", "b", "c", "a"}, "a") -> {"b", "c"}
     * wordsWithout({"a", "b", "c", "a"}, "b") -> {"a", "c", "a"}
     * wordsWithout({"a", "b", "c", "a"}, "c") -> {"a", "b", "a"}
     *
     * @param words  String[]
     * @param target String
     * @return String[]
     * @link http://codingbat.com/prob/p121236
     */
    String[] wordsWithout(String[] words, String target) {

        int count = 0;

        for (String word : words) {
            if (!word.equals(target)) {
                count++;
            }
        }

        String[] result = new String[count];

        for (int i = 0, pos = 0; i < words.length; i++)
            if (!words[i].equals(target)) {
                result[pos] = words[i];
                pos++;
            }

        return result;
    }

    /**
     * Scores Special
     * <p>
     * Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such
     * as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice
     * decomposition, write a separate helper method which finds the largest special score in an array. Write your
     * helper method after your scoresSpecial() method in the JavaBat text area.
     * <p>
     * scoresSpecial({12, 10, 4}, {2, 20, 30}) -> 40
     * scoresSpecial({20, 10, 4}, {2, 20, 10}) -> 40
     * scoresSpecial({12, 11, 4}, {2, 20, 31}) -> 20
     *
     * @param a int[]
     * @param b int[]
     * @return int
     * @link http://codingbat.com/prob/p140485
     */
    int scoresSpecial(int[] a, int[] b) {

        int resultA = 0;

        for (int anA : a) {
            if (anA % 10 == 0 && anA > resultA) {
                resultA = anA;
            }
        }

        int resultB = 0;

        for (int aB : b) {
            if (aB % 10 == 0 && aB > resultB) {
                resultB = aB;
            }
        }

        return resultA + resultB;
    }

    /**
     * Sum Heights
     * <p>
     * We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the
     * array, return the sum of the changes for a walk beginning at the start index and ending at the end index. For
     * example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6. The start end end index
     * will both be valid indexes into the array with start <= end.
     * <p>
     * sumHeights({5, 3, 6, 7, 2}, 2, 4) -> 6
     * sumHeights({5, 3, 6, 7, 2}, 0, 1) -> 2
     * sumHeights({5, 3, 6, 7, 2}, 0, 4) -> 11
     *
     * @param heights int[]
     * @param start   int
     * @param end     int
     * @return int
     * @link http://codingbat.com/prob/p148138
     */
    int sumHeights(int[] heights, int start, int end) {

        int sum = 0;

        for (int i = start; i < end; i++)
            sum += Math.abs(heights[i] - heights[i + 1]);

        return sum;
    }

    /**
     * Sum Heights 2
     * <p>
     * (A variation on the sumHeights problem.) We have an array of heights,
     * representing the altitude along a walking trail.
     * Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start
     * index and ending at the end index, however increases in height count double.
     * For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7.
     * The start end end index will both be valid indexes into the array with start <= end.
     * <p>
     * sumHeights2({5, 3, 6, 7, 2}, 2, 4) -> 7
     * sumHeights2({5, 3, 6, 7, 2}, 0, 1) -> 2
     * sumHeights2({5, 3, 6, 7, 2}, 0, 4) -> 15
     *
     * @param heights int[]
     * @param start   int
     * @param end     int
     * @return int
     * @link http://codingbat.com/prob/p157900
     */
    int sumHeights2(int[] heights, int start, int end) {

        int sum = 0;

        for (int i = start; i < end; i++)
            if (heights[i] < heights[i + 1])
                sum += (2 * Math.abs(heights[i] - heights[i + 1]));
            else
                sum += Math.abs(heights[i] - heights[i + 1]);

        return sum;
    }

    /**
     * Big Heights
     * <p>
     * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking
     * trail. Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start
     * index and ending at the end index. We'll say that  step is big if it is 5 or more up or down. The start end end
     * index will both be valid indexes into the array with start <= end.
     * <p>
     * bigHeights({5, 3, 6, 7, 2}, 2, 4) -> 1
     * bigHeights({5, 3, 6, 7, 2}, 0, 1) -> 0
     * bigHeights({5, 3, 6, 7, 2}, 0, 4) -> 1
     *
     * @param heights int[]
     * @param start   int
     * @param end     int
     * @return int
     * @link http://codingbat.com/prob/p197710
     */
    int bigHeights(int[] heights, int start, int end) {

        int count = 0;

        for (int i = start; i < end; i++)
            if (Math.abs(heights[i] - heights[i + 1]) >= 5)
                count++;

        return count;
    }

    /**
     * User Compare
     * <p>
     * We have data for two users, A and B, each with a String name and an int id. The goal is to order the users such
     * as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same. Order first by
     * the string names, and then by the id numbers if the names are the same. Note: with Strings str1.compareTo(str2)
     * returns an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the value is not
     * limited to -1/0/1). (On the AP, there would be two User objects, but here the code simply takes the two strings
     * and two ints directly. The code logic is the same.)
     * <p>
     * userCompare("bb", 1, "zz", 2) -> -1
     * userCompare("bb", 1, "aa", 2) -> 1
     * userCompare("bb", 1, "bb", 1) -> 0
     *
     * @param aName String
     * @param aId   int
     * @param bName String
     * @param bId   int
     * @return int
     * @link http://codingbat.com/prob/p143482
     */
    int userCompare(String aName, int aId, String bName, int bId) {

        if (aName.compareTo(bName) < 0)
            return -1;

        if (aName.equals(bName)) {
            if (aId == bId)
                return 0;
            if (aId < bId)
                return -1;
        }

        return 1;
    }

    /**
     * Merge Two
     * <p>
     * Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
     * Return a new array containing the first N elements from the two arrays. The result array should be in
     * alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear"
     * solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order,
     * copying elements directly to the new array.
     * <p>
     * mergeTwo({"a", "c", "z"}, {"b", "f", "z"}, 3) -> {"a", "b", "c"}
     * mergeTwo({"a", "c", "z"}, {"c", "f", "z"}, 3) -> {"a", "c", "f"}
     * mergeTwo({"f", "g", "z"}, {"c", "f", "g"}, 3) -> {"c", "f", "g"}
     *
     * @param a String[]
     * @param b String[]
     * @param n int
     * @return String[]
     * @link http://codingbat.com/prob/p139150
     */
    String[] mergeTwo(String[] a, String[] b, int n) {

        String[] result = new String[n];
        int indexResult = 0;
        int indexA = 0;
        int indexB = 0;

        while (indexResult < n)
            if (a[indexA].compareTo(b[indexB]) < 0)
                result[indexResult++] = a[indexA++];
            else if (a[indexA].compareTo(b[indexB]) > 0)
                result[indexResult++] = b[indexB++];
            else { // identical strings
                result[indexResult++] = a[indexA++];
                indexB++;
            }

        return result;
    }

    /**
     * Common Two
     * <p>
     * Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
     * Return the count of the number of strings which appear in both arrays.
     * The best "linear" solution makes a single pass over both arrays,
     * taking advantage of the fact that they are in alphabetical order.
     * <p>
     * commonTwo({"a", "c", "x"}, {"b", "c", "d", "x"}) -> 2
     * commonTwo({"a", "c", "x"}, {"a", "b", "c", "x", "z"}) -> 3
     * commonTwo({"a", "b", "c"}, {"a", "b", "c"}) -> 3
     *
     * @param a String[]
     * @param b String[]
     * @return int
     * @link http://codingbat.com/prob/p100369
     */
    int commonTwo(String[] a, String[] b) {

        int count = 0;
        String lastChecked = null;

        for (String anA : a) {
            if (!anA.equals(lastChecked)) {
                for (String aB : b) {
                    if (anA.equals(aB)) {
                        count++;
                        lastChecked = anA;
                        break;
                    }
                }
            }
        }

        return count;
    }

}