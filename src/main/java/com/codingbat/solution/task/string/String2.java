package com.codingbat.solution.task.string;

/**
 * String 2
 * <p>
 * Medium String problems -- 1 loop.
 * See the Java String Help document for help with strings.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/String-2
 */
class String2 {

    /**
     * Double Char
     * <p>
     * Given a string,
     * return a string where for every char in the original,
     * there are two chars.
     * <p>
     * doubleChar("The") -> "TThhee"
     * doubleChar("AAbb") -> "AAAAbbbb"
     * doubleChar("Hi-There") -> "HHii--TThheerree"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p165312
     */
    String doubleChar(String str) {

        StringBuilder sb = new StringBuilder(str.length() * 2);

        for (int i = 0; i < str.length(); ++i) {
            for (int j = 0; j < 2; j++) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    /**
     * Count Hi
     * <p>
     * Return the number of times that the string "hi" appears anywhere in the given string.
     * <p>
     * countHi("abc hi ho") -> 1
     * countHi("ABChi hi") -> 2
     * countHi("hihi") -> 2
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p147448
     */
    int countHi(String str) {

        String find = "hi";
        int start = 0, count = 0;

        while (true) {

            int found = str.indexOf(find, start);

            if (found == -1)
                break;

            count++;

            start = found + find.length();  // move start up for next iteration
        }

        return count;
    }

    /**
     * Cat Dog
     * <p>
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     * <p>
     * catDog("catdog") -> true
     * catDog("catcat") -> false
     * catDog("1cat1cadodog") -> true
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p111624
     */
    boolean catDog(String str) {

        int cats = 0, dogs = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat"))
                cats += 1;
            if (str.substring(i, i + 3).equals("dog"))
                dogs += 1;
        }

        return cats == dogs;
    }

    /**
     * Count Code
     * <p>
     * Return the number of times that the string "code" appears anywhere in the given string,
     * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
     * <p>
     * countCode("aaacodebbb") -> 1
     * countCode("codexxcode") -> 2
     * countCode("cozexxcope") -> 2
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p123614
     */
    int countCode(String str) {

        int count = 0;

        for (int i = 0; i < str.length() - 3; i++)
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e')
                count++;

        return count;
    }

    /**
     * End Other
     * <p>
     * Given two strings,
     * return true if either of the strings appears at the very end of the other string,
     * ignoring upper/lower case differences
     * (in other words, the computation should not be "case sensitive").
     * Note: str.toLowerCase() returns the lowercase version of a string.
     * <p>
     * endOther("Hiabc", "abc") -> true
     * endOther("AbC", "HiaBc") -> true
     * endOther("abc", "abXabc") -> true
     *
     * @param a String
     * @param b String
     * @return boolean
     * @link http://codingbat.com/prob/p126880
     */
    boolean endOther(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }

    /**
     * xyz There
     * <p>
     * Return true if the given string contains an appearance of "xyz"
     * where the xyz is not directly preceeded by a period (.).
     * So "xxyz" counts but "x.xyz" does not.
     * <p>
     * xyzThere("abcxyz") -> true
     * xyzThere("abc.xyz") -> false
     * xyzThere("xyz.abc") -> true
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p136594
     */
    boolean xyzThere(String str) {

        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("xyz"))
                return true;

            for (int i = 0; i < str.length() - 3; i++)
                if (str.substring(i + 1, i + 4).equals("xyz") && str.charAt(i) != '.')
                    return true;
        }

        return false;
    }

    /**
     * Bob There
     * <p>
     * Return true if the given string contains a "bob" string,
     * but where the middle 'o' char can be any char.
     * <p>
     * bobThere("abcbob") -> true
     * bobThere("b9b") -> true
     * bobThere("bac") -> false
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p175762
     */
    boolean bobThere(String str) {

        if (str.length() >= 3)
            for (int i = 0; i < str.length() - 2; i++)
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                    return true;

        return false;
    }

    /**
     * xy Balance
     * <p>
     * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
     * there exists a 'y' char somewhere later in the string.
     * So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
     * Return true if the given string is xy-balanced.
     * <p>
     * xyBalance("aaxbby") -> true
     * xyBalance("aaxbb") -> false
     * xyBalance("yaaxbb") -> false
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p134250
     */
    boolean xyBalance(String str) {

        int lastX = str.lastIndexOf("y");
        int lastY = str.lastIndexOf("x");

        return lastX == -1 && lastY == -1 || (lastX > lastY);
    }

    /**
     * Mix String
     * <p>
     * Given two strings,
     * A and B, create a bigger string made of the first char of A,
     * the first char of B, the second char of A, the second char of B, and so on.
     * Any leftover chars go at the end of the result.
     * <p>
     * mixString("abc", "xyz") -> "axbycz"
     * mixString("Hi", "There") -> "HTihere"
     * mixString("xxxx", "There") -> "xTxhxexre"
     *
     * @param a String
     * @param b String
     * @return String
     * @link http://codingbat.com/prob/p125185
     */
    String mixString(String a, String b) {

        String res = "";

        for (int i = 0; i < Math.min(a.length(), b.length()); i++)
            res += "" + a.charAt(i) + b.charAt(i);

        if (a.length() > b.length())
            return res + a.substring(b.length());

        return res + b.substring(a.length());
    }

    /**
     * Repeat End
     * <p>
     * Given a string and an int N,
     * return a string made of N repetitions of the last N characters of the string.
     * You may assume that N is between 0 and the length of the string, inclusive.
     * <p>
     * repeatEnd("Hello", 3) -> "llollollo"
     * repeatEnd("Hello", 2) -> "lolo"
     * repeatEnd("Hello", 1) -> "o"
     *
     * @param str String
     * @param n   int
     * @return String
     * @link http://codingbat.com/prob/p125185
     */
    String repeatEnd(String str, int n) {

        String res = "";

        for (int i = 0; i < n; i++)
            res += str.substring(str.length() - n);

        return res;
    }

    /**
     * Repeat Front
     * <p>
     * Given a string and an int n,
     * return a string made of the first n characters of the string,
     * followed by the first n-1 characters of the string, and so on.
     * You may assume that n is between 0 and the length of the string,
     * inclusive (i.e. n >= 0 and n <= str.length()).
     * <p>
     * repeatFront("Chocolate", 4) -> "ChocChoChC"
     * repeatFront("Chocolate", 3) -> "ChoChC"
     * repeatFront("Ice Cream", 2) -> "IcI"
     *
     * @param str String
     * @param n   int
     * @return String
     * @link http://codingbat.com/prob/p152339
     */
    String repeatFront(String str, int n) {

        String res = "";

        for (int i = n; i > 0; i--)
            res += str.substring(0, i);

        return res;
    }

    /**
     * Repeat Separator
     * <p>
     * Given two strings, word and a separator,
     * return a big string made of count occurences of the word,
     * separated by the separator string.
     * <p>
     * repeatSeparator("Word", "X", 3) -> "WordXWordXWord"
     * repeatSeparator("This", "And", 2) -> "ThisAndThis"
     * repeatSeparator("This", "And", 1) -> "This"
     *
     * @param word  String
     * @param sep   String
     * @param count int
     * @return String
     * @link http://codingbat.com/prob/p109637
     */
    String repeatSeparator(String word, String sep, int count) {

        String res = "";

        if (count == 0)
            return "";

        while (count > 1) {
            res += word + sep;
            count--;
        }

        return res + word;
    }

    /**
     * Prefix Again
     * <p>
     * Given a string,
     * consider the prefix string made of the first N chars of the string.
     * Does that prefix string appear somewhere else in the string?
     * Assume that the string is not empty and that N is in the range 1..str.length().
     * <p>
     * prefixAgain("abXYabc", 1) -> true
     * prefixAgain("abXYabc", 2) -> true
     * prefixAgain("abXYabc", 3) -> false
     *
     * @param str String
     * @param n   int
     * @return boolean
     * @link http://codingbat.com/prob/p136417
     */
    boolean prefixAgain(String str, int n) {

        String prefix = str.substring(0, n);

        for (int i = n; i <= str.length() - prefix.length(); i++)
            if (str.substring(i, i + prefix.length()).equals(prefix))
                return true;

        return false;
    }

    /**
     * xyz Middle
     * <p>
     * Given a string, does "xyz" appear in the middle of the string?
     * To define middle, we'll say that the number of chars
     * to the left and right of the "xyz" must differ by at most one.
     * This problem is harder than it looks.
     * <p>
     * xyzMiddle("AAxyzBB") -> true
     * xyzMiddle("AxyzBB") -> true
     * xyzMiddle("AxyzBBB") -> false
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p159772
     */
    boolean xyzMiddle(String str) {

        int len = str.length();

        if (len < 3)
            return false;

        if (len % 2 == 1)
            return str.substring(len / 2 - 1, len / 2 + 2).equals("xyz");

        return str.substring(len / 2 - 2, len / 2 + 1).equals("xyz") || str.substring(len / 2 - 1, len / 2 + 2).equals("xyz");
    }

    /**
     * Get Sandwich
     * <p>
     * A sandwich is two pieces of bread with something in between.
     * Return the string that is between the first and last appearance of "bread" in the given string,
     * or return the empty string "" if there are not two pieces of bread.
     * <p>
     * getSandwich("breadjambread") -> "jam"
     * getSandwich("xxbreadjambreadyy") -> "jam"
     * getSandwich("xxbreadyy") -> ""
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p129952
     */
    String getSandwich(String str) {

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == last)
            return "";

        return str.substring(first + 5, last);
    }

    /**
     * Same Star Char
     * <p>
     * Returns true if for every '*' (star) in the string,
     * if there are chars both immediately before and after the star,
     * they are the same.
     * <p>
     * sameStarChar("xy*yzz") -> true
     * sameStarChar("xy*zzz") -> false
     * sameStarChar("*xa*az") -> true
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p194491
     */
    boolean sameStarChar(String str) {

        for (int i = 1; i < str.length() - 1; i++)
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;

        return true;
    }

    /**
     * Zip Zap
     * <p>
     * Look for patterns like "zip" and "zap" in the string -- length-3,
     * starting with 'z' and ending with 'p'.
     * Return a string where for all such words,
     * the middle letter is gone, so "zipXzap" yields "zpXzp".
     * <p>
     * zipZap("zipXzap") -> "zpXzp"
     * zipZap("zopzop") -> "zpzp"
     * zipZap("zzzopzop") -> "zzzpzp"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p180759
     */
    String zipZap(String str) {

        for (int i = 0; i < str.length() - 2; i++)
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p')
                str = str.substring(0, i + 1) + str.substring(i + 2);

        return str;
    }

    /**
     * Star Out
     * <p>
     * Return a version of the given string,
     * where for every star (*) in the string the star
     * and the chars immediately to its left and right are gone.
     * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
     * <p>
     * starOut("ab*cd") -> "ad"
     * starOut("ab**cd") -> "ad"
     * starOut("sm*eilly") -> "silly"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p139564
     */
    String starOut(String str) {

        while (str.indexOf('*') != -1) {

            if (str.equals("*"))
                return "";

            int starPos = str.indexOf('*');
            int secondStar = str.indexOf('*', starPos + 1);

            if (secondStar - starPos == 1) {
                str = str.substring(0, starPos) + str.substring(secondStar);
                continue;
            }

            if (starPos == 0)
                str = str.substring(starPos + 2);
            else if (starPos == str.length() - 1)
                str = str.substring(0, str.length() - 2);
            else
                str = str.substring(0, starPos - 1) + str.substring(starPos + 2);
        }

        return str;
    }

    /**
     * Plus Out
     * <p>
     * Given a string and a non-empty word string,
     * return a version of the original String where all chars have been replaced by pluses ("+"),
     * except for appearances of the word string which are preserved unchanged.
     * <p>
     * plusOut("12xy34", "xy") -> "++xy++"
     * plusOut("12xy34", "1") -> "1+++++"
     * plusOut("12xy34xyabcxy", "xy") -> "++xy++xy+++xy"
     *
     * @param str  String
     * @param word String
     * @return String
     * @link http://codingbat.com/prob/p170829
     */
    String plusOut(String str, String word) {

        int start = 0;
        int end = str.indexOf(word);

        while (end != -1) {
            for (int i = start; i < end; i++)
                str = str.substring(0, i) + "+" + str.substring(i + 1);

            start = end + word.length();
            end = str.indexOf(word, start);
        }

        for (int i = start; i < str.length(); i++)
            str = str.substring(0, i) + "+" + str.substring(i + 1);

        return str;
    }

    /**
     * Word Ends
     * <p>
     * Given a string and a non-empty word string,
     * return a string made of each char just before
     * and just after every appearance of the word in the string.
     * Ignore cases where there is no char before or
     * after the word, and a char may be included twice if it is between two words.
     * <p>
     * wordEnds("abcXY123XYijk", "XY") -> "c13i"
     * wordEnds("XY123XY", "XY") -> "13"
     * wordEnds("XY1XY", "XY") -> "11"
     *
     * @param str  String
     * @param word String
     * @return String
     * @link http://codingbat.com/prob/p147538
     */
    String wordEnds(String str, String word) {

        String res = "";
        int pos = str.indexOf(word);

        while (pos != -1) {
            if (pos != 0)
                res += str.charAt(pos - 1);

            if (pos + word.length() == str.length())
                break;

            res += str.charAt(pos + word.length());
            pos = str.indexOf(word, pos + 1);
        }

        return res;
    }

}