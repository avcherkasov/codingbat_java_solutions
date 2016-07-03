package com.codingbat.solution.task.warmup;

/**
 * WarmUp2
 * <p>
 * Medium warmUp string/array loops (solutions available)
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Warmup-2
 */
class WarmUp2 {

    /**
     * String Times
     * <p>
     * Given a string and a non-negative int n,
     * return a larger string that is n copies of the original string.
     * <p>
     * stringTimes("Hi", 2) -> "HiHi"
     * stringTimes("Hi", 3) -> "HiHiHi"
     * stringTimes("Hi", 1) -> "Hi"
     *
     * @param str String
     * @param n   int
     * @return String
     * @link http://codingbat.com/prob/p142270
     */
    String stringTimes(String str, int n) {

        StringBuilder result = new StringBuilder(str.length() * 3);

        for (int i = 0; i < n; ++i) {
            result.append(str);
        }

        return result.toString();
    }

    /**
     * Front Times
     * <p>
     * Given a string and a non-negative int n,
     * we'll say that the front of the string is the first 3 chars,
     * or whatever is there if the string is less than length 3.
     * Return n copies of the front;
     * <p>
     * frontTimes("Chocolate", 2) -> "ChoCho"
     * frontTimes("Chocolate", 3) -> "ChoChoCho"
     * frontTimes("Abc", 3) -> "AbcAbcAbc"
     *
     * @param str String
     * @param n   int
     * @return String
     * @link http://codingbat.com/prob/p101475
     */
    String frontTimes(String str, int n) {

        StringBuilder result = new StringBuilder(3 * n);
        String front = str.length() <= 3 ? str : str.substring(0, 3);

        for (int i = 0; i < n; ++i) {
            result.append(front);
        }

        return result.toString();
    }

    /**
     * String Bits
     * <p>
     * Given a string, return a new string made of every other char starting
     * with the first, so "Hello" yields "Hlo".
     * <p>
     * stringBits("Hello") -> "Hlo"
     * stringBits("Hi") -> "H"
     * stringBits("Heeololeo") -> "Hello"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p165666
     */
    String stringBits(String str) {

        StringBuilder result = new StringBuilder(str.length());
        int i = 0;

        for (char c : str.toCharArray()) {
            if (i % 2 == 0) {
                result.append(c);
            }
            i++;
        }

        return result.toString();
    }

    /**
     * String Splosion
     * <p>
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     * <p>
     * stringSplosion("Code") -> "CCoCodCode"
     * stringSplosion("abc") -> "aababc"
     * stringSplosion("ab") -> "aab"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p117334
     */
    String stringSplosion(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= str.length(); ++i) {
            result.append(str.substring(0, i));
        }

        return result.toString();
    }

    /**
     * Last 2
     * <p>
     * Given a string, return the count of the number of times that a substring
     * length 2 appears in the string and also as the last 2 chars of the
     * string, so "hixxxhi" yields 1 (we won't count the end substring).
     * <p>
     * last2("hixxhi") -> 1
     * last2("xaxxaxaxx") -> 1
     * last2("axxxaaxx") -> 2
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p178318
     */
    int last2(String str) {

        if (str.length() <= 2) {
            return 0;
        }

        String fin = str.substring(str.length() - 2);
        int start = 0, result = 0;

        while (true) {

            int idx = str.indexOf(fin, start);

            if (idx < 0) {
                break;
            }

            result += 1;
            start = idx + 1;
        }

        return result - 1;
    }

    /**
     * Array Count 9
     * <p>
     * Given an array of ints, return the number of 9's in the array.
     * <p>
     * arrayCount9({1, 2, 9}) -> 1
     * arrayCount9({1, 9, 9}) -> 2
     * arrayCount9({1, 9, 9, 3, 9}) -> 3
     *
     * @param nums int[]
     * @return int
     * @link http://codingbat.com/prob/p184031
     */
    int arrayCount9(int[] nums) {

        int result = 0;

        for (int i : nums) {
            if (i == 9) {
                result++;
            }
        }

        return result;
    }

    /**
     * Array Front 9
     * <p>
     * Given an array of ints,
     * return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     * <p>
     * arrayFront9({1, 2, 9, 3, 4}) -> true
     * arrayFront9({1, 2, 3, 4, 9}) -> false
     * arrayFront9({1, 2, 3, 4, 5}) -> false
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p186031
     */
    boolean arrayFront9(int[] nums) {

        for (int i = 0; i < 4 && i < nums.length; ++i) {
            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }

    /**
     * Array 123
     * <p>
     * Given an array of ints,
     * return true if .. 1, 2, 3, .. appears in the array somewhere.
     * <p>
     * array123({1, 1, 2, 3, 1}) -> true
     * array123({1, 1, 2, 4, 1}) -> false
     * array123({1, 1, 2, 1, 2, 3}) -> true
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p136041
     */

    boolean array123(int[] nums) {

        for (int i = 0; i < nums.length - 2; ++i) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }

        return false;
    }

    /**
     * String Match
     * <p>
     * Given 2 strings, a and b,
     * return the number of the positions where they contain the same length 2 substring.
     * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
     * and "az" substrings appear in the same place in both strings.
     * <p>
     * stringMatch("xxcaazz", "xxbaaz") -> 3
     * stringMatch("abc", "abc") -> 2
     * stringMatch("abc", "axc") -> 0
     *
     * @param a String
     * @param b String
     * @return int
     * @link http://codingbat.com/prob/p198640
     */
    int stringMatch(String a, String b) {

        int result = 0;

        for (int i = 0; i < Math.min(a.length(), b.length()) - 1; ++i) {

            String subA = a.substring(i, i + 2), subB = b.substring(i, i + 2);

            if (subA.equals(subB)) {
                result++;
            }
        }

        return result;
    }

    /**
     * String X
     * <p>
     * Given a string, return a version where all the "x" have been removed.
     * Except an "x" at the very start or end should not be removed.
     * <p>
     * stringX("xxHxix") -> "xHix"
     * stringX("abxxxcd") -> "abcd"
     * stringX("xabxxxcdx") -> "xabcdx"
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p171260
     */
    String stringX(String str) {

        if (str.length() <= 2) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        result.append(str.substring(0, 1));

        for (int i = 1; i < str.length() - 1; i++) {

            char c = str.charAt(i);

            if (c == 'x') {
                continue;
            }

            result.append(c);
        }

        result.append(str.substring(str.length() - 1));

        return result.toString();
    }

    /**
     * Alt Pairs
     * <p>
     * Given a string,
     * return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
     * so "kittens" yields "kien".
     * <p>
     * altPairs("kitten") -> "kien"
     * altPairs("Chocolate") -> "Chole"
     * altPairs("CodingHorror") -> "Congrr"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p121596
     */
    String altPairs(String str) {

        boolean longAdd = false;
        int i = 0;
        StringBuilder result = new StringBuilder(str.length());

        while (i < str.length()) {
            result.append(str.charAt(i));
            i += longAdd ? 3 : 1;
            longAdd = !longAdd;
        }

        return result.toString();
    }

    /**
     * String Yak
     * <p>
     * Suppose the string "yak" is unlucky.
     * Given a string, return a version where all the "yak" are removed,
     * but the "a" can be any char. The "yak" strings will not overlap.
     * <p>
     * stringYak("yakpak") -> "pak"
     * stringYak("pakyak") -> "pak"
     * stringYak("yak123ya") -> "123ya"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p126212
     */
    String stringYak(String str) {
        return str.replaceAll("y.k", "");
    }

    /**
     * Array 667
     * <p>
     * Given an array of ints,
     * return the number of times that two 6's are next to each other in the array.
     * Also count instances where the second "6" is actually a 7.
     * <p>
     * array667({6, 6, 2}) -> 1
     * array667({6, 6, 2, 6}) -> 1
     * array667({6, 7, 2, 6}) -> 1
     *
     * @param nums int[]
     * @return int
     * @link http://codingbat.com/prob/p110019
     */
    int array667(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] != 6) {
                continue;
            }
            if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                result++;
            }
        }

        return result;
    }

    /**
     * No Triples
     * <p>
     * Given an array of ints,
     * we'll say that a triple is a value appearing 3 times in a row in the array.
     * Return true if the array does not contain any triples.
     * <p>
     * noTriples({1, 1, 2, 2, 1}) -> true
     * noTriples({1, 1, 2, 2, 2, 1}) -> false
     * noTriples({1, 1, 1, 2, 2, 2, 1}) -> false
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p170221
     */
    boolean noTriples(int[] nums) {

        for (int i = 0; i < nums.length - 2; ++i) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Has 271
     * <p>
     * Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a
     * value, followed by the value plus 5, followed by the value minus 1.
     * Additionally the 271 counts even if the "1" differs by 2 or less from the
     * correct value.
     * <p>
     * has271({1, 2, 7, 1}) -> true
     * has271({1, 2, 8, 1}) -> false
     * has271({2, 7, 1}) -> true
     *
     * @param nums int[]
     * @return boolean
     * @link http://codingbat.com/prob/p167430
     */
    boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 2; ++i) {
            
            int v = nums[i];

            if (nums[i + 1] == v + 5 && Math.abs(v - 1 - nums[i + 2]) <= 2) {
                return true;
            }
        }

        return false;
    }
}