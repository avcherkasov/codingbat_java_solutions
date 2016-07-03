package com.codingbat.solution.task.recursion;

/**
 * Recursion1
 * <p>
 * Basic recursion problems.
 * Recursion strategy: first test for one or two base cases that are so simple,
 * the answer can be returned immediately.
 * Otherwise, make a recursive a call for a smaller case
 * (that is, a case which is a step towards the base case).
 * Assume that the recursive call works correctly,
 * and fix up what it returns to make the answer.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Recursion-1
 */
class Recursion1 {

    /**
     * Factorial
     * <p>
     * Given n of 1 or more,
     * return the factorial of n, which is n * (n-1) * (n-2) ... 1.
     * Compute the result recursively (without loops).
     * <p>
     * factorial(1) → 1
     * factorial(2) → 2
     * factorial(3) → 6
     *
     * @param n int
     * @return int
     * @link http://codingbat.com/prob/p154669
     */
    int factorial(int n) {
        return (n < 1) ? 1 : n * factorial(n - 1);
    }

    /**
     * BunnyEars
     * <p>
     * We have a number of bunnies and each bunny has two big floppy ears.
     * We want to compute the total number of ears across all the bunnies recursively
     * (without loops or multiplication).
     * <p>
     * bunnyEars(0) -> 0
     * bunnyEars(1) -> 2
     * bunnyEars(2) -> 4
     *
     * @param bunnies int
     * @return bunnies int
     * @link http://codingbat.com/prob/p183649
     */
    int bunnyEars(int bunnies) {
        return (bunnies == 0) ? 0 : 2 + bunnyEars(bunnies - 1);
    }

    /**
     * Fibonacci
     * <p>
     * The fibonacci sequence is a famous bit of mathematics,
     * and it happens to have a recursive definition.
     * The first two values in the sequence are 0 and 1 (essentially 2 base cases).
     * Each subsequent value is the sum of the previous two values,
     * so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
     * Define a recursive fibonacci(n) method that returns the nth fibonacci number,
     * with n=0 representing the start of the sequence.
     * <p>
     * fibonacci(0) -> 0
     * fibonacci(1) -> 1
     * fibonacci(2) -> 1
     *
     * @param n int
     * @return int
     * @link http://codingbat.com/prob/p120015
     */
    int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        return (n < 3) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * BunnyEars2
     * <p>
     * We have bunnies standing in a line, numbered 1, 2, ...
     * The odd bunnies (1, 3, ..) have the normal 2 ears.
     * The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot.
     * Recursively return the number of "ears" in the bunny line 1, 2, ... n
     * (without loops or multiplication).
     * <p>
     * bunnyEars2(0) -> 0
     * bunnyEars2(1) -> 2
     * bunnyEars2(2) -> 5
     *
     * @param bunnies int
     * @return int
     * @link http://codingbat.com/prob/p107330
     */
    int bunnyEars2(int bunnies) {

        if (bunnies == 0) {
            return 0;
        }

        return ((bunnies % 2 == 1) ? 2 : 3) + bunnyEars2(bunnies - 1);
    }

    /**
     * Triangle
     * <p>
     * We have triangle made of blocks.
     * The topmost row has 1 block, the next row down has 2 blocks,
     * the next row has 3 blocks, and so on.
     * Compute recursively (no loops or multiplication) the total number of blocks
     * in such a triangle with the given number of rows.
     * <p>
     * triangle(0) -> 0
     * triangle(1) -> 1
     * triangle(2) -> 3
     *
     * @param rows int
     * @return int
     * @link http://codingbat.com/prob/p194781
     */
    int triangle(int rows) {

        if (rows == 0)
            return 0;

        return rows + triangle(rows - 1);
    }

    /**
     * SumDigits
     * <p>
     * Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields
     * the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * <p>
     * sumDigits(126) -> 9
     * sumDigits(49) -> 13
     * sumDigits(12) -> 3
     *
     * @param n int
     * @return int
     * @link http://codingbat.com/prob/p163932
     */
    int sumDigits(int n) {

        if (n == 0)
            return 0;

        return n % 10 + sumDigits(n / 10);
    }

    /**
     * Count7
     * <p>
     * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
     * (no
     * loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the
     * rightmost digit (126 / 10 is 12).
     * <p>
     * count7(717) -> 2
     * count7(7) -> 1
     * count7(123) -> 0
     *
     * @param n int
     * @return int
     * @link http://codingbat.com/prob/p101409
     */
    int count7(int n) {

        if (n == 0)
            return 0;

        if (n % 10 == 7)
            return 1 + count7(n / 10);

        return count7(n / 10);
    }

    /**
     * Count8
     * <p>
     * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except
     * that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields
     * the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * <p>
     * count8(8) -> 1
     * count8(818) -> 2
     * count8(8818) -> 4
     *
     * @param n int
     * @return int
     * @link http://codingbat.com/prob/p192383
     */
    int count8(int n) {

        if (n == 0)
            return 0;

        if (n >= 88 && n % 100 == 88)
            return 2 + count8(n / 10);

        if (n % 10 == 8)
            return 1 + count8(n / 10);

        return count8(n / 10);
    }

    /**
     * PowerN
     * <p>
     * Given <b>base</b> and <b>n</b> that are both 1 or more, compute recursively (no loops) the value of base to the
     * n
     * power, so powerN(3, 2) is 9 (3 squared).
     * <p>
     * powerN(3, 1) -> 3
     * powerN(3, 2) -> 9
     * powerN(3, 3) -> 27
     *
     * @param base int
     * @param n    int
     * @return int
     * @link http://codingbat.com/prob/p158888
     */
    int powerN(int base, int n) {

        if (n == 0)
            return 1;

        return base * powerN(base, n - 1);
    }

    /**
     * CountX
     * <p>
     * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     * <p>
     * countX("xxhixx") -> 4
     * countX("xhixhix") -> 3
     * countX("hi") -> 0
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p170371
     */
    int countX(String str) {

        if (str.length() == 0)
            return 0;

        if (str.charAt(0) == 'x')
            return 1 + countX(str.substring(1));

        return countX(str.substring(1));
    }

    /**
     * CountHi
     * <p>
     * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
     * <p>
     * countHi("xxhixx") -> 1
     * countHi("xhixhix") -> 2
     * countHi("hi") -> 1
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p184029
     */
    int countHi(String str) {

        if (str.length() < 2)
            return 0;

        if (str.substring(0, 2).equals("hi"))
            return 1 + countHi(str.substring(2));

        return countHi(str.substring(1));
    }

    /**
     * ChangeXY
     * <p>
     * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed
     * to 'y' chars.
     * <p>
     * changeXY("codex") -> "codey"
     * changeXY("xxhixx") -> "yyhiyy"
     * changeXY("xhixhix") -> "yhiyhiy"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p101372
     */
    String changeXY(String str) {

        if (str.length() == 0)
            return str;

        if (str.charAt(0) == 'x')
            return "y" + changeXY(str.substring(1));

        return str.charAt(0) + changeXY(str.substring(1));
    }

    /**
     * ChangePi
     * <p>
     * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by
     * "3.14".
     * <p>
     * changePi("xpix") -> "x3.14x"
     * changePi("pipi") -> "3.143.14"
     * changePi("pip") -> "3.14p"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p170924
     */
    String changePi(String str) {

        if (str.length() < 2)
            return str;

        if (str.substring(0, 2).equals("pi"))
            return "3.14" + changePi(str.substring(2));

        return str.charAt(0) + changePi(str.substring(1));
    }

    /**
     * NoX
     * <p>
     * Given a string, compute recursively a new string where all the 'x' chars have been removed.
     * <p>
     * noX("xaxb") -> "ab"
     * noX("abc") -> "abc"
     * noX("xx") -> ""
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p118230
     */
    String noX(String str) {

        if (str.length() == 0)
            return "";

        if (str.charAt(0) == 'x')
            return noX(str.substring(1));

        return str.charAt(0) + noX(str.substring(1));
    }

    /**
     * Array6
     * <p>
     * Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering
     * only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to
     * move
     * down the array. The initial call will pass in index as 0.
     * <p>
     * array6({1, 6, 4}, 0) -> true
     * array6({1, 4}, 0) -> false
     * array6({6}, 0) -> true
     *
     * @param nums  int[]
     * @param index int
     * @return boolean
     * @link http://codingbat.com/prob/p108997
     */
    boolean array6(int[] nums, int index) {

        if (nums.length == 0)
            return false;

        if (index == nums.length - 1)
            return nums[index] == 6;

        return nums[index] == 6 || array6(nums, index + 1);
    }

    /**
     * Array11
     * <p>
     * Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll
     * use
     * the convention of considering only the part of the array that begins at the given index. In this way, a
     * recursive
     * call can pass index+1 to move down the array. The initial call will pass in index as 0.
     * <p>
     * array11({1, 2, 11}, 0) -> 1
     * array11({11, 11}, 0) -> 2
     * array11({1, 2, 3, 4}, 0) -> 0
     *
     * @param nums  int[]
     * @param index int
     * @return int
     * @link http://codingbat.com/prob/p135988
     */
    int array11(int[] nums, int index) {

        if (index == nums.length)
            return 0;

        if (nums[index] == 11)
            return 1 + array11(nums, index + 1);

        return array11(nums, index + 1);
    }

    /**
     * Array220
     * <p>
     * Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by
     * that
     * value times 10. We'll use the convention of considering only the part of the array that begins at the given
     * index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in
     * index
     * as 0.
     * <p>
     * array220({1, 2, 20}, 0) -> true
     * array220({3, 30}, 0) -> true
     * array220({3}, 0) -> false
     *
     * @param nums  int[]
     * @param index int
     * @return boolean
     * @link http://codingbat.com/prob/p173469
     */
    boolean array220(int[] nums, int index) {
        return !(nums.length < 2 || index == nums.length - 1) && (nums[index + 1] == nums[index] * 10 || array220(nums, index + 1));
    }

    /**
     * AllStar
     * <p>
     * Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
     * <p>
     * allStar("hello") -> "h*e*l*l*o"
     * allStar("abc") -> "a*b*c"
     * allStar("ab") -> "a*b"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p183394
     */
    String allStar(String str) {

        if (str.length() <= 1)
            return str;

        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    /**
     * PairStar
     * <p>
     * Given a string, compute recursively a new string where identical chars that are adjacent in the original string
     * are separated from each other by a "*".
     * <p>
     * pairStar("hello") -> "hel*lo"
     * pairStar("xxyy") -> "x*xy*y"
     * pairStar("aaaa") -> "a*a*a*a"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p158175
     */
    String pairStar(String str) {

        if (str.length() < 2)
            return str;

        if (str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));

        return str.charAt(0) + pairStar(str.substring(1));
    }

    /**
     * EndX
     * <p>
     * Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of
     * the string.
     * <p>
     * endX("xxre") -> "rexx"
     * endX("xxhixx") -> "hixxxx"
     * endX("xhixhix") -> "hihixxx"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p105722
     */
    String endX(String str) {

        if (str.length() == 0)
            return str;

        if (str.charAt(0) == 'x')
            return endX(str.substring(1)) + "x";

        return str.charAt(0) + endX(str.substring(1));
    }

    /**
     * CountPairs
     * <p>
     * We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a
     * pair.
     * Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs
     * in the given string.
     * <p>
     * countPairs("axa") -> 1
     * countPairs("axax") -> 2
     * countPairs("axbx") -> 1
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p154048
     */
    int countPairs(String str) {

        if (str.length() < 3)
            return 0;

        if (str.charAt(0) == str.charAt(2))
            return 1 + countPairs(str.substring(1));

        return countPairs(str.substring(1));
    }

    /**
     * CountAbc
     * <p>
     * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
     * <p>
     * countAbc("abc") -> 1
     * countAbc("abcxxabc") -> 2
     * countAbc("abaxxaba") -> 2
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p161124
     */
    int countAbc(String str) {

        if (str.length() < 3)
            return 0;

        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba"))
            return 1 + countAbc(str.substring(1));

        return countAbc(str.substring(1));
    }

    /**
     * Count11
     * <p>
     * Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings
     * should not overlap.
     * <p>
     * count11("11abc11") -> 2
     * count11("abc11x11x11") -> 3
     * count11("111") -> 1
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p167015
     */
    int count11(String str) {

        if (str.length() < 2)
            return 0;

        if (str.substring(0, 2).equals("11"))
            return 1 + count11(str.substring(2));

        return count11(str.substring(1));
    }

    /**
     * StringClean
     * <p>
     * Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced
     * to a single char. So "yyzzza" yields "yza".
     * <p>
     * stringClean("yyzzza") -> "yza"
     * stringClean("abbbcdd") -> "abcd"
     * stringClean("Hello") -> "Helo"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p104029
     */
    String stringClean(String str) {

        if (str.length() < 2)
            return str;

        if (str.charAt(0) == str.charAt(1))
            return stringClean(str.substring(1));

        return str.charAt(0) + stringClean(str.substring(1));
    }

    /**
     * CountHi2
     * <p>
     * Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not
     * count "hi" that have an 'x' immedately before them.
     * <p>
     * countHi2("ahixhi") -> 1
     * countHi2("ahibhi") -> 2
     * countHi2("xhixhi") -> 0
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p143900
     */
    int countHi2(String str) {

        if (str.length() < 2)
            return 0;

        if (str.substring(0, 2).equals("hi"))
            return 1 + countHi2(str.substring(2));

        if (str.charAt(0) == 'x' && str.length() >= 3) {
            if (str.substring(1, 3).equals("hi"))
                return countHi2(str.substring(3));

            return countHi2(str.substring(1));
        }

        return countHi2(str.substring(1));
    }

    /**
     * ParenBit
     * <p>
     * Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the
     * parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
     * <p>
     * parenBit("xyz(abc)123") -> "(abc)"
     * parenBit("x(hello)") -> "(hello)"
     * parenBit("(xy)1") -> "(xy)"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p137918
     */
    String parenBit(String str) {

        if (!str.substring(0, 1).equals("("))
            return parenBit(str.substring(1));

        return (str.substring(0, str.indexOf(")") + 1));
    }

    /**
     * NestParen
     * <p>
     * Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
     * Suggestion: check the first and last chars, and then recur on what's inside them.
     * <p>
     * nestParen("(())") -> true
     * nestParen("((()))") -> true
     * nestParen("(((x))") -> false
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p183174
     */
    boolean nestParen(String str) {
        return str.equals("") || str.equals("()") || str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')' && nestParen(str.substring(1, str.length() - 1));
    }

    /**
     * StrCount
     * <p>
     * Given a string and a non-empty substring <b>sub</b>, compute recursively the number of times that sub appears in
     * the string, without the sub strings overlapping.
     * <p>
     * strCount("catcowcat", "cat") -> 2
     * strCount("catcowcat", "cow") -> 1
     * strCount("catcowcat", "dog") -> 0
     *
     * @param str String
     * @param sub String
     * @return int
     * @link http://codingbat.com/prob/p186177
     */
    int strCount(String str, String sub) {

        if (str.length() < sub.length())
            return 0;

        if (str.substring(0, sub.length()).equals(sub))
            return 1 + strCount(str.substring(sub.length()), sub);

        return strCount(str.substring(1), sub);
    }

    /**
     * StrCopies
     * <p>
     * Given a string and a non-empty substring <b>sub</b>, compute recursively if at least n copies of sub appear in
     * the string somewhere, possibly with overlapping. N will be non-negative.
     * <p>
     * strCopies("catcowcat", "cat", 2) -> true
     * strCopies("catcowcat", "cow", 2) -> false
     * strCopies("catcowcat", "cow", 1) -> true
     *
     * @param str String
     * @param sub String
     * @param n   int
     * @return boolean
     * @link http://codingbat.com/prob/p118182
     */
    boolean strCopies(String str, String sub, int n) {

        if (str.length() < sub.length())
            return (n <= 0);

        if (str.substring(0, sub.length()).equals(sub))
            return strCopies(str.substring(1), sub, n - 1);

        return strCopies(str.substring(1), sub, n);
    }

    /**
     * StrDist
     * <p>
     * Given a string and a non-empty substring <b>sub</b>, compute recursively the largest substring which starts and
     * ends with sub and return its length.
     * <p>
     * strDist("catcowcat", "cat") -> 9
     * strDist("catcowcat", "cow") -> 3
     * strDist("cccatcowcatxx", "cat") -> 9
     *
     * @param str String
     * @param sub String
     * @return int
     * @link http://codingbat.com/prob/p195413
     */
    int strDist(String str, String sub) {

        if (!str.contains(sub))
            return 0;

        if (str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length()).equals(sub))
            return str.length();

        if (!str.substring(0, sub.length()).equals(sub))
            return strDist(str.substring(1), sub);

        // case: (!str.substring(str.length()-sub.length()).equals(sub))
        return strDist(str.substring(0, str.length() - 1), sub);
    }

}