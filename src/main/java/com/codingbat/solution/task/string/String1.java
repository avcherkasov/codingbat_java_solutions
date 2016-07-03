package com.codingbat.solution.task.string;

/**
 * String1
 * <p>
 * Basic string problems -- no loops. Use + to combine Strings,
 * str.length() is the number of chars in a String,
 * str.substring(i, j) extracts the substring starting at index i
 * and running up to but not including index j.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/String-1
 */
class String1 {

    /**
     * Hello Name
     * <p>
     * Given a string name, e.g. "Bob",
     * return a greeting of the form "Hello Bob!".
     * <p>
     * helloName("Bob") -> "Hello Bob!"
     * helloName("Alice") -> "Hello Alice!"
     * helloName("X") -> "Hello X!"
     *
     * @param name String
     * @return String
     * @link http://codingbat.com/prob/p171896
     */
    String helloName(String name) {
        return String.format("Hello %s!", name);
    }


    /**
     * Make Abba
     * <p>
     * Given two strings, a and b,
     * return the result of putting them together in the order abba,
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * <p>
     * makeAbba("Hi", "Bye") -> "HiByeByeHi"
     * makeAbba("Yo", "Alice") -> "YoAliceAliceYo"
     * makeAbba("What", "Up") -> "WhatUpUpWhat"
     *
     * @param a String
     * @param b String
     * @return String
     * @link http://codingbat.com/prob/p161056
     */
    String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /**
     * Make Tags
     * <p>
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
     * Given tag and word strings, create the HTML string with tags
     * around the word, e.g. "<i>Yay</i>".
     * <p>
     * makeTags("i", "Yay") -> "<i>Yay</i>"
     * makeTags("i", "Hello") -> "<i>Hello</i>"
     * makeTags("cite", "Yay") -> "<cite>Yay</cite>"
     *
     * @param tag  String
     * @param word String
     * @return String
     * @link http://codingbat.com/prob/p147483
     */
    String makeTags(String tag, String word) {
        return String.format("<%s>%s</%s>", tag, word, tag);
    }

    /**
     * Make Out Word
     * <p>
     * Given an "out" string length 4, such as "<<>>", and a word,
     * return a new string where the word is in the middle
     * of the out string, e.g. "<<word>>".
     * Note: use str.substring(i, j) to extract the String starting at index i and
     * going up to but not including index j.
     * <p>
     * makeOutWord("<<>>", "Yay") -> "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") -> "<<WooHoo>>"
     * makeOutWord("[[]]", "word") -> "[[word]]"
     *
     * @param out  String
     * @param word String
     * @return String
     * @link http://codingbat.com/prob/p184030
     */
    String makeOutWord(String out, String word) {
        return String.format("%s%s%s", out.substring(0, 2), word, out.substring(2, 4));
    }

    /**
     * Extra End
     * <p>
     * Given a string,
     * return a new string made of 3 copies of the last 2 chars of the original string.
     * The string length will be at least 2.
     * <p>
     * extraEnd("Hello") -> "lololo"
     * extraEnd("ab") -> "ababab"
     * extraEnd("Hi") -> "HiHiHi"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p108853
     */
    String extraEnd(String str) {

        String last = str.substring(str.length() - 2);

        return last + last + last;
    }

    /**
     * First Two
     * <p>
     * Given a string,
     * return the string made of its first two chars,
     * so the String "Hello" yields "He".
     * If the string is shorter than length 2,
     * return whatever there is, so "X" yields "X",
     * and the empty string "" yields the empty string "".
     * Note that str.length() returns the length of a string.
     * <p>
     * firstTwo("Hello") -> "He"
     * firstTwo("abcdefg") -> "ab"
     * firstTwo("ab") -> "ab"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p163411
     */
    String firstTwo(String str) {
        return (str.length() > 2) ? str.substring(0, 2) : str;
    }

    /**
     * First Half
     * <p>
     * Given a string of even length, return the first half.
     * So the string "WooHoo" yields "Woo".
     * <p>
     * firstHalf("WooHoo") -> "Woo"
     * firstHalf("HelloThere") -> "Hello"
     * firstHalf("abcdef") -> "abc"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p172267
     */
    String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /**
     * Without End
     * <p>
     * Given a string,
     * return a version without the first and last char, so "Hello" yields "ell".
     * The string length will be at least 2.
     * <p>
     * withoutEnd("Hello") -> "ell"
     * withoutEnd("java") -> "av"
     * withoutEnd("coding") -> "odin"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p130896
     */
    String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * Combo String
     * <p>
     * Given 2 strings, a and b, return a string of the form short+long+short,
     * with the shorter string on the outside and the longer string on the inside.
     * The strings will not be the same length, but they may be empty (length 0).
     * <p>
     * comboString("Hello", "hi") -> "hiHellohi"
     * comboString("hi", "Hello") -> "hiHellohi"
     * comboString("aaa", "b") -> "baaab"
     *
     * @param a String
     * @param b String
     * @return String
     * @link http://codingbat.com/prob/p168564
     */
    String comboString(String a, String b) {
        return (a.length() > b.length()) ? b + a + b : a + b + a;
    }

    /**
     * Non Start
     * <p>
     * Given 2 strings,
     * return their concatenation, except omit the first char of each.
     * The strings will be at least length 1.
     * <p>
     * nonStart("Hello", "There") -> "ellohere"
     * nonStart("java", "code") -> "avaode"
     * nonStart("shotl", "java") -> "hotlava"
     *
     * @param a String
     * @param b String
     * @return String
     * @link http://codingbat.com/prob/p143825
     */
    String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    /**
     * Left 2
     * <p>
     * Given a string,
     * return a "rotated left 2" version where the first 2 chars are moved to the end.
     * The string length will be at least 2.
     * <p>
     * left2("Hello") -> "lloHe"
     * left2("java") -> "vaja"
     * left2("Hi") -> "Hi"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p197720
     */
    String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    /**
     * Right 2
     * <p>
     * Given a string,
     * return a "rotated right 2" version where the last 2 chars are moved to the start.
     * The string length will be at least 2.
     * <p>
     * right2("Hello") -> "loHel"
     * right2("java") -> "vaja"
     * right2("Hi") -> "Hi"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p130781
     */
    String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    /**
     * The End
     * <p>
     * Given a string,
     * return a string length 1 from its front,
     * unless front is false, in which case return a string
     * length 1 from its back. The string will be non-empty.
     * <p>
     * theEnd("Hello", true) -> "H"
     * theEnd("Hello", false) -> "o"
     * theEnd("oh", true) -> "o"
     *
     * @param str   String
     * @param front boolean
     * @return String
     * @link http://codingbat.com/prob/p162477
     */
    String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    /**
     * Without End 2
     * <p>
     * Given a string,
     * return a version without both the first and last char of the string.
     * The string may be any length, including 0.
     * <p>
     * withouEnd2("Hello") -> "ell"
     * withouEnd2("abc") -> "b"
     * withouEnd2("ab") -> ""
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p174254
     */
    String withoutEnd2(String str) {
        return (str.length() > 2) ? str.substring(1, str.length() - 1) : "";
    }

    /**
     * Middle Two
     * <p>
     * Given a string of even length,
     * return a string made of the middle two chars,
     * so the string "string" yields "ri".
     * The string length will be at least 2.
     * <p>
     * middleTwo("string") -> "ri"
     * middleTwo("code") -> "od"
     * middleTwo("Practice") -> "ct"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p137729
     */
    String middleTwo(String str) {

        int num = str.length() / 2;

        return str.substring(num - 1, num + 1);
    }

    /**
     * Ends Ly
     * <p>
     * Given a string, return true if it ends in "ly".
     * <p>
     * endsLy("oddly") -> true
     * endsLy("y") -> false
     * endsLy("oddy") -> false
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p103895
     */
    boolean endsLy(String str) {
        return str.length() >= 2 && str.substring(str.length() - 2).equals("ly");
    }

    /**
     * nTwice
     * <p>
     * Given a string and an int n,
     * return a string made of the first and last n chars from the string.
     * The string length will be at least n.
     * <p>
     * nTwice("Hello", 2) -> "Helo"
     * nTwice("Chocolate", 3) -> "Choate"
     * nTwice("Chocolate", 1) -> "Ce"
     *
     * @param str String
     * @param n   int
     * @return String
     * @link http://codingbat.com/prob/p174148
     */
    String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    /**
     * Two Char
     * <p>
     * Given a string and an index,
     * return a string length 2 starting at the given index.
     * If the index is too big or too small to define a string length 2,
     * use the first 2 chars. The string length will be at least 2.
     * <p>
     * twoChar("java", 0) -> "ja"
     * twoChar("java", 2) -> "va"
     * twoChar("java", 3) -> "ja"
     *
     * @param str   String
     * @param index int
     * @return String
     * @link http://codingbat.com/prob/p144623
     */
    String twoChar(String str, int index) {

        if (0 > index) {
            return str.substring(0, 2);
        }

        if ((index + 2) <= str.length() && (index + 2) > 0)
            return str.substring(index, index + 2);

        return str.substring(0, 2);
    }

    /**
     * Middle Three
     * <p>
     * Given a string of odd length,
     * return the string length 3 from its middle, so "Candy" yields "and".
     * The string length will be at least 3.
     * <p>
     * middleThree("Candy") -> "and"
     * middleThree("and") -> "and"
     * middleThree("solving") -> "lvi"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p115863
     */
    String middleThree(String str) {
        return (str.length() <= 3) ? str : str.substring((str.length() / 2 - 1), (str.length() / 2 + 2));
    }

    /**
     * Has Bad
     * <p>
     * Given a string,
     * return true if "bad" appears starting at index 0 or 1 in the string,
     * such as with "badxxx" or "xbadxx" but not "xxbadxx".
     * The string may be any length, including 0.
     * Note: use .equals() to compare 2 strings.
     * <p>
     * hasBad("badxx") -> true
     * hasBad("xbadxx") -> true
     * hasBad("xxbadxx") -> false
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p139075
     */
    boolean hasBad(String str) {

        if (str.length() < 3)
            return false;

        if (str.length() == 3 && str.equals("bad")) {
            return true;
        }

        if (str.length() > 3) {
            if (str.substring(1, 4).equals("bad") || str.substring(0, 3).equals("bad")) {
                return true;
            }
        }

        return false;
    }

    /**
     * At First
     * <p>
     * Given a string,
     * return a string length 2 made of its first 2 chars.
     * If the string length is less than 2, use '@' for the missing chars.
     * <p>
     * atFirst("hello") -> "he"
     * atFirst("hi") -> "hi"
     * atFirst("h") -> "h@"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p139076
     */
    String atFirst(String str) {

        if (str.length() == 1) {
            return str + "@";
        } else if (str.length() == 0) {
            return "@@";
        }

        return str.substring(0, 2);
    }

    /**
     * Last Chars
     * <p>
     * Given 2 strings,
     * a and b, return a new string made of the first char of a and the last char of b,
     * so "yo" and "java" yields "ya".
     * If either string is length 0, use '@' for its missing char.
     * <p>
     * lastChars("last", "chars") -> "ls"
     * lastChars("yo", "java") -> "ya"
     * lastChars("hi", "") -> "h@"
     *
     * @param a String
     * @param b String
     * @return String
     * @link http://codingbat.com/prob/p138183
     */
    String lastChars(String a, String b) {

        a = (a.isEmpty()) ? "@" : a.substring(0, 1);
        b = (b.isEmpty()) ? "@" : b.substring(b.length() - 1);

        return a + b;
    }

    /**
     * Con Cat
     * <p>
     * Given two strings,
     * append them together (known as "concatenation") and return the result.
     * However, if the concatenation creates a double-char,
     * then omit one of the chars, so "abc" and "cat" yields "abcat".
     * <p>
     * conCat("abc", "cat") -> "abcat"
     * conCat("dog", "cat") -> "dogcat"
     * conCat("abc", "") -> "abc"
     *
     * @param a String
     * @param b String
     * @return String
     * @link http://codingbat.com/prob/p132118
     */
    String conCat(String a, String b) {

        if (a.isEmpty() || b.isEmpty())
            return a + b;

        if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1) + b;
        }

        return a + b;
    }

    /**
     * Last Two
     * <p>
     * Given a string of any length,
     * return a new string where the last 2 chars,
     * if present, are swapped, so "coding" yields "codign".
     * <p>
     * lastTwo("coding") -> "codign"
     * lastTwo("cat") -> "cta"
     * lastTwo("ab") -> "ba"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p194786
     */
    String lastTwo(String str) {

        if (str.length() < 2) {
            return str;
        }

        return str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1);
    }

    /**
     * See Color
     * <p>
     * Given a string,
     * if the string begins with "red" or "blue" return that color string,
     * otherwise return the empty string.
     * <p>
     * seeColor("redxx") -> "red"
     * seeColor("xxred") -> ""
     * seeColor("blueTimes") -> "blue"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p199216
     */
    String seeColor(String str) {

        if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        } else if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        }

        return "";
    }

    /**
     * Front Again
     * <p>
     * Given a string,
     * return true if the first 2 chars in the string also appear at the end of the string,
     * such as with "edited".
     * <p>
     * frontAgain("edited") -> true
     * frontAgain("edit") -> false
     * frontAgain("ed") -> true
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p196652
     */
    boolean frontAgain(String str) {
        return (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2)));
    }

    /**
     * Min Cat
     * <p>
     * Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the strings are different lengths,
     * omit chars from the longer string so it is the same length as the shorter string.
     * So "Hello" and "Hi" yield "loHi". The strings may be any length.
     * <p>
     * minCat("Hello", "Hi") -> "loHi"
     * minCat("Hello", "java") -> "ellojava"
     * minCat("java", "Hello") -> "javaello"
     *
     * @param a String
     * @param b String
     * @return String
     * @link http://codingbat.com/prob/p105745
     */
    String minCat(String a, String b) {

        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length(), a.length()) + b;
        } else if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length(), b.length());
        }

        return a + b;
    }

    /**
     * Extra Front
     * <p>
     * Given a string,
     * return a new string made of 3 copies of the first 2 chars of the original string.
     * The string may be any length.
     * If there are fewer than 2 chars, use whatever is there.
     * <p>
     * extraFront("Hello") -> "HeHeHe"
     * extraFront("ab") -> "ababab"
     * extraFront("H") -> "HHH"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p172063
     */
    String extraFront(String str) {

        if (str.length() == 1) {
            return str + str + str;
        } else if (str.length() > 1) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }

        return "";
    }

    /**
     * Without 2
     * <p>
     * Given a string, if a length 2 substring appears at both its beginning and end,
     * return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
     * The substring may overlap with itself, so "Hi" yields "". Otherwise,
     * return the original string unchanged.
     * <p>
     * without2("HelloHe") -> "lloHe"
     * without2("HelloHi") -> "HelloHi"
     * without2("Hi") -> ""
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p142247
     */
    String without2(String str) {

        if (str.isEmpty()) {
            return "";
        } else if (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return str.substring(2, str.length());
        }

        return str;
    }

    /**
     * De Front
     * <p>
     * Given a string, return a version without the first 2 chars.
     * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
     * The string may be any length. Harder than it looks.
     * <p>
     * deFront("Hello") -> "llo"
     * deFront("java") -> "va"
     * deFront("away") -> "aay"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p110141
     */
    String deFront(String str) {

        StringBuilder result = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); ++i) {

            char c = str.charAt(i);

            switch (i) {
                case 0:
                    if (c == 'a') {
                        result.append(c);
                    }
                    break;

                case 1:
                    if (c == 'b') {
                        result.append(c);
                    }
                    break;

                default:
                    result.append(c);
            }
        }

        return result.toString();
    }

    /**
     * Start Word
     * <p>
     * Given a string and a second "word" string,
     * we'll say that the word matches the string if it appears at the front of the string,
     * except its first char does not need to match exactly.
     * On a match, return the front of the string, or otherwise return the empty string.
     * So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns
     * "hip". The word will be at least length 1.
     * <p>
     * startWord("hippo", "hi") -> "hi"
     * startWord("hippo", "xip") -> "hip"
     * startWord("hippo", "i") -> "h"
     *
     * @param str  String
     * @param word String
     * @return String
     * @link http://codingbat.com/prob/p141494
     */
    String startWord(String str, String word) {

        if (str.length() < 1 || str.substring(1).indexOf(word.substring(1)) != 0) {
            return "";
        }

        return str.substring(0, word.length());
    }

    /**
     * Without X
     * <p>
     * Given a string, if the first or last chars are 'x',
     * return the string without those 'x' chars, and otherwise
     * return the string unchanged.
     * <p>
     * withoutX("xHix") -> "Hi"
     * withoutX("xHi") -> "Hi"
     * withoutX("Hxix") -> "Hxi"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p151940
     */
    String withoutX(String str) {

        if (str.isEmpty() || (str.length() == 1 && str.substring(0, 1).equals("x"))) {
            return "";
        }

        if (str.length() > 1) {
            if (str.substring(0, 1).equals("x") && str.substring(str.length() - 1, str.length()).equals("x")) {
                return str.substring(1, str.length() - 1);
            } else if (str.substring(0, 1).equals("x")) {
                return str.substring(1);
            } else if (str.substring(str.length() - 1, str.length()).equals("x")) {
                return str.substring(0, str.length() - 1);
            }
        }

        return str;
    }

    /**
     * Without X2
     * <p>
     * Given a string, if one or both of the first 2 chars is 'x',
     * return the string without those 'x' chars, and
     * otherwise return the string unchanged.
     * This is a little harder than it looks.
     * <p>
     * withoutX2("xHi") -> "Hi"
     * withoutX2("Hxi") -> "Hi"
     * withoutX2("Hi") -> "Hi"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p151359
     */
    String withoutX2(String str) {

        if (str.isEmpty() || (str.length() == 1 && str.substring(0, 1).equals("x"))) {
            return "";
        } else if (str.length() > 1) {

            if (str.substring(0, 1).equals("x") && str.substring(1, 2).equals("x")) {
                return str.substring(2);
            } else if (str.substring(0, 1).equals("x")) {
                return str.substring(1);
            } else if (str.substring(1, 2).equals("x")) {
                return str.substring(0, 1) + str.substring(2);
            }

        }

        return str;
    }

}