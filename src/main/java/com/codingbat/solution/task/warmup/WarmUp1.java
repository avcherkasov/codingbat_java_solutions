package com.codingbat.solution.task.warmup;

/**
 * WarmUp1
 * <p>
 * Simple warmUp problems to get started (solutions available).
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Warmup-1
 */
class WarmUp1 {

    /**
     * Sleep In
     * <p>
     * The parameter weekday is true if it is a weekday,
     * and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation.
     * Return true if we sleep in.
     * <p>
     * sleepIn(false, false) -> true
     * sleepIn(true, false) -> false
     * sleepIn(false, true) -> true
     *
     * @param weekday  boolean
     * @param vacation boolean
     * @return boolean
     * @link http://codingbat.com/prob/p187868
     */
    boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * Monkey Trouble
     * <p>
     * We have two monkeys, a and b, and the parameters aSmile and bSmile
     * indicate if each is smiling. We are in trouble if they are both smiling
     * or if neither of them is smiling. Return true if we are in trouble.
     * <p>
     * monkeyTrouble(true, true) -> true
     * monkeyTrouble(false, false) -> true
     * monkeyTrouble(true, false) -> false
     *
     * @param aSmile boolean
     * @param bSmile boolean
     * @return boolean
     * @link http://codingbat.com/prob/p181646
     */
    boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return !(aSmile ^ bSmile);
    }

    /**
     * Sum Double
     * <p>
     * Given two int values, return their sum. Unless the two values are the
     * same, then return double their sum.
     * <p>
     * sumDouble(1, 2) -> 3
     * sumDouble(3, 2) -> 5
     * sumDouble(2, 2) -> 8
     *
     * @param a int
     * @param b int
     * @return int
     * @link http://codingbat.com/prob/p154485
     */
    int sumDouble(int a, int b) {

        int result = a + b;

        if (a == b) {
            result *= 2;
        }

        return result;
    }

    /**
     * Diff21
     * <p>
     * Given an int n, return the absolute difference between n and 21,
     * except return double the absolute difference if n is over 21.
     * <p>
     * diff21(19) -> 2
     * diff21(10) -> 11
     * diff21(21) -> 0
     *
     * @param n int
     * @return int
     * @link http://codingbat.com/prob/p116624
     */
    int diff21(int n) {

        int result = Math.abs(n - 21);

        if (n > 21) {
            result *= 2;
        }

        return result;
    }

    /**
     * Parrot Trouble
     * <p>
     * We have a loud talking parrot. The "hour" parameter is the current hour
     * time in the range 0..23. We are in trouble if the parrot is talking and
     * the hour is before 7 or after 20. Return true if we are in trouble.
     * <p>
     * parrotTrouble(true, 6) -> true
     * parrotTrouble(true, 7) -> false
     * parrotTrouble(false, 6) -> false
     *
     * @param talking boolean
     * @param hour    int
     * @return boolean
     * @link http://codingbat.com/prob/p140449
     */

    boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    /**
     * Makes 10
     * <p>
     * Given 2 ints, a and b,
     * return true if one if them is 10 or if their sum is 10.
     * <p>
     * makes10(9, 10) -> true
     * makes10(9, 9) -> false
     * makes10(1, 9) -> true
     *
     * @param a int
     * @param b int
     * @return boolean
     * @link http://codingbat.com/prob/p182873
     */
    boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    /**
     * Near Hundred
     * <p>
     * Given an int n, return true if it is within 10 of 100 or 200.
     * Note: Math.abs(num) computes the absolute value of a number.
     * <p>
     * nearHundred(93) -> true
     * nearHundred(90) -> true
     * nearHundred(89) -> false
     *
     * @param n int
     * @return boolean
     * @link http://codingbat.com/prob/p184004
     */
    boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    /**
     * Pos Neg
     * <p>
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both
     * are negative.
     * <p>
     * posNeg(1, -1, false) -> true
     * posNeg(-1, 1, false) -> true
     * posNeg(-4, -5, true) -> true
     *
     * @param a        int
     * @param b        int
     * @param negative boolean
     * @return boolean
     * @link http://codingbat.com/prob/p159227
     */
    boolean posNeg(int a, int b, boolean negative) {
        return (negative) ? a < 0 && b < 0 : a * b < 0;
    }

    /**
     * Not String
     * <p>
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     * Note: use .equals() to compare 2 strings.
     * <p>
     * notString("candy") -> "not candy"
     * notString("x") -> "not x"
     * notString("not bad") -> "not bad"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p191914
     */
    String notString(String str) {

        if (str.startsWith("not")) {
            return str;
        }

        return "not " + str;
    }

    /**
     * Missing Char
     * <p>
     * Given a non-empty string and an int n,
     * return a new string where the char at index n has been removed.
     * The value of n will be a valid index of a char in the original string
     * (i.e. n will be in the range 0..str.length()-1 inclusive).
     * <p>
     * missingChar("kitten", 1) -> "ktten"
     * missingChar("kitten", 0) -> "itten"
     * missingChar("kitten", 4) -> "kittn"
     *
     * @param str String
     * @param n   int
     * @return String
     * @link http://codingbat.com/prob/p190570
     */
    String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    /**
     * Front Back
     * <p>
     * Given a string,
     * return a new string where the first and last chars have been exchanged.
     * <p>
     * frontBack("code") -> "eodc"
     * frontBack("a") -> "a"
     * frontBack("ab") -> "ba"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p123384
     */
    String frontBack(String str) {

        if (str.length() < 2) {
            return str;
        }

        return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
    }

    /**
     * Front 3
     * <p>
     * Given a string, we'll say that the front is the first 3 chars of the
     * string. If the string length is less than 3, the front is whatever is
     * there. Return a new string which is 3 copies of the front.
     * <p>
     * front3("Java") -> "JavJavJav"
     * front3("Chocolate") -> "ChoChoCho"
     * front3("abc") -> "abcabcabc"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p136351
     */
    String front3(String str) {

        String front = str.length() < 3 ? str : str.substring(0, 3);

        return front + front + front;
    }

    /**
     * Back Around
     * <p>
     * Given a string,
     * take the last char and return a new string with the last cha
     * added at the front and back, so "cat" yields "tcatt".
     * The original string will be length 1 or more.
     * <p>
     * backAround("cat") -> "tcatt"
     * backAround("Hello") -> "oHelloo"
     * backAround("a") -> "aaa"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p161642
     */
    String backAround(String str) {
        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
    }

    /**
     * Front 22
     * <p>
     * Given a string,
     * take the first 2 chars and return the string with the 2 chars
     * added at both the front and back, so "kitten" yields"kikittenki".
     * If the string length is less than 2, use whatever chars are there.
     * <p>
     * front22("kitten") -> "kikittenki"
     * front22("Ha") -> "HaHaHa"
     * front22("abc") -> "ababcab"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p183592
     */
    String front22(String str) {

        String front = str.length() < 2 ? str : str.substring(0, 2);

        return front + str + front;
    }

    /**
     * Start Hi
     * <p>
     * Given a string,
     * return true if the string starts with "hi" and false otherwise.
     * <p>
     * startHi("hi there") -> true
     * startHi("hi") -> true
     * startHi("hello hi") -> false
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p191022
     */
    boolean startHi(String str) {
        return str.startsWith("hi");
    }

    /**
     * Icy Hot
     * <p>
     * Given two temperatures,
     * return true if one is less than 0 and the other is greater than 100.
     * <p>
     * icyHot(120, -1) -> true
     * icyHot(-1, 120) -> true
     * icyHot(2, 120) -> false
     *
     * @param temp1 int
     * @param temp2 int
     * @return boolean
     * @link http://codingbat.com/prob/p192082
     */
    boolean icyHot(int temp1, int temp2) {
        return Math.min(temp1, temp2) < 0 && Math.max(temp1, temp2) > 100;
    }

    /**
     * In1020
     * <p>
     * Given 2 int values,
     * return true if either of them is in the range 10..20 inclusive.
     * <p>
     * in1020(12, 99) -> true
     * in1020(21, 12) -> true
     * in1020(8, 99) -> false
     *
     * @param a int
     * @param b int
     * @return boolean
     * @link http://codingbat.com/prob/p144535
     */
    boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    /**
     * Has Teen
     * <p>
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 3 int values, return true if 1 or more of them are teen.
     * <p>
     * hasTeen(13, 20, 10) -> true
     * hasTeen(20, 19, 10) -> true
     * hasTeen(20, 10, 13) -> true
     *
     * @param a int
     * @param b int
     * @param c int
     * @return boolean
     * @link http://codingbat.com/prob/p178986
     */
    boolean hasTeen(int a, int b, int c) {
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
    }

    /**
     * Lone Teen
     * <p>
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 2 int values, return true if one or the other is teen, but not both.
     * <p>
     * loneTeen(13, 99) -> true
     * loneTeen(21, 19) -> true
     * loneTeen(13, 13) -> false
     *
     * @param a int
     * @param b int
     * @return boolean
     * @link http://codingbat.com/prob/p165701
     */
    boolean loneTeen(int a, int b) {

        int i = 0;

        if (a >= 13 && a <= 19) {
            i++;
        }

        if (b >= 13 && b <= 19) {
            i++;
        }

        return i == 1;
    }

    /**
     * Del Del
     * <p>
     * Given a string, if the string "del" appears starting at index 1, return a
     * string where that "del" has been deleted. Otherwise, return the string
     * unchanged.
     * <p>
     * delDel("adelbc") -> "abc"
     * delDel("adelHello") -> "aHello"
     * delDel("adedbc") -> "adedbc"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p100905
     */
    String delDel(String str) {

        if (str.indexOf("del") != 1) {
            return str;
        }

        return str.substring(0, 1) + str.substring(4);
    }

    /**
     * Mix Start
     * <p>
     * Return true if the given string begins with "mix",
     * except the 'm' can be anything, so "pix", "9ix" .. all count.
     * <p>
     * mixStart("mix snacks") -> true
     * mixStart("pix snacks") -> true
     * mixStart("piz snacks") -> false
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p151713
     */
    boolean mixStart(String str) {
        return str.indexOf("ix") == 1;
    }

    /**
     * Start Oz
     * <p>
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o'
     * and include the second only if it is 'z',
     * so "ozymandias" yields "oz".
     * <p>
     * startOz("ozymandias") -> "oz"
     * startOz("bzoo") -> "z"
     * startOz("oxx") -> "o"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p199720
     */
    String startOz(String str) {

        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += "o";
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += "z";
        }

        return result;
    }

    /**
     * Int Max
     * <p>
     * Given three int values, A B C, return the largest.
     * <p>
     * intMax(1, 2, 3) -> 3
     * intMax(1, 3, 2) -> 3
     * intMax(3, 2, 1) -> 3
     *
     * @param a int
     * @param b int
     * @param c int
     * @return int
     * @link http://codingbat.com/prob/p101887
     */
    int intMax(int a, int b, int c) {

        int m1 = Math.max(a, b);

        return Math.max(m1, c);
    }

    /**
     * Close 10
     * <p>
     * Given 2 int values, return whichever value is nearest to the value 10,
     * or return 0 in the event of a tie.
     * Note that Math.abs(n) returns the absolute value of a number.
     * <p>
     * close10(8, 13) -> 8
     * close10(13, 8) -> 8
     * close10(13, 7) -> 0
     *
     * @param a int
     * @param b int
     * @return int
     * @link http://codingbat.com/prob/p172021
     */
    int close10(int a, int b) {

        if (Math.abs(10 - a) == Math.abs(10 - b)) {
            return 0;
        }

        return Math.abs(10 - a) < Math.abs(10 - b) ? a : b;
    }

    /**
     * In3050
     * <p>
     * Given 2 int values,
     * return true if they are both in the range 30..40 inclusive,
     * or they are both in the range 40..50 inclusive.
     * <p>
     * in3050(30, 31) -> true
     * in3050(30, 41) -> false
     * in3050(40, 50) -> true
     *
     * @param a int
     * @param b int
     * @return boolean
     * @link http://codingbat.com/prob/p132134
     */
    boolean in3050(int a, int b) {

        if (a >= 30 && a <= 40) {
            if (b >= 30 && b <= 40) {
                return true;
            }
        }

        if (a >= 40 && a <= 50) {
            if (b >= 40 && b <= 50) {
                return true;
            }
        }

        return false;
    }

    /**
     * Max 1020
     * <p>
     * Given 2 positive int values,
     * return the larger value that is in the range 10..20 inclusive,
     * or return 0 if neither is in that range.
     * <p>
     * max1020(11, 19) -> 19
     * max1020(19, 11) -> 19
     * max1020(11, 9) -> 11
     *
     * @param a int
     * @param b int
     * @return int
     * @link http://codingbat.com/prob/p177372
     */
    int max1020(int a, int b) {

        int r = 0;

        if (a >= 10 && a <= 20) {
            r = Math.max(r, a);
        }

        if (b >= 10 && b <= 20) {
            r = Math.max(r, b);
        }

        return r;
    }

    /**
     * String E
     * <p>
     * Return true if the given string contains between 1 and 3 'e' chars.
     * <p>
     * stringE("Hello") -> true
     * stringE("Heelle") -> true
     * stringE("Heelele") -> false
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p173784
     */
    boolean stringE(String str) {

        int d = str.length() - str.replaceAll("e", "").length();

        return (d >= 1 && d <= 3);
    }

    /**
     * Last Digit
     * <p>
     * Given two non-negative int values,
     * return true if they have the same last digit, such as with 27 and 57.
     * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
     * <p>
     * lastDigit(7, 17) -> true
     * lastDigit(6, 17) -> false
     * lastDigit(3, 113) -> true
     *
     * @param a int
     * @param b int
     * @return boolean
     * @link http://codingbat.com/prob/p125339
     */
    boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    /**
     * End Up
     * <p>
     * Given a string,
     * return a new string where the last 3 chars are now in upper case.
     * If the string has less than 3 chars, uppercase whatever is there.
     * Note that str.toUpperCase() returns the uppercase version of a string.
     * <p>
     * endUp("Hello") -> "HeLLO"
     * endUp("hi there") -> "hi thERE"
     * endUp("hi") -> "HI"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p125268
     */
    String endUp(String str) {

        if (str.length() <= 3) {
            return str.toUpperCase();
        }

        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }

    /**
     * Every Nth
     * <p>
     * Given a non-empty string and an int N,
     * return the string made starting with char 0,
     * and then every Nth char of the string.
     * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
     * <p>
     * everyNth("Miracle", 2) -> "Mrce"
     * everyNth("abcdefg", 2) -> "aceg"
     * everyNth("abcdefg", 3) -> "adg"
     *
     * @param str String
     * @param n   int
     * @return String
     * @link http://codingbat.com/prob/p196441
     */
    String everyNth(String str, int n) {
        return str.replaceAll(String.format("(.).{0,%d}", n - 1), "$1");
    }
}