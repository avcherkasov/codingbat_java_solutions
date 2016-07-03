package com.codingbat.solution.task.string;

/**
 * String 3
 * <p>
 * Harder String problems -- 2 loops.
 * See the Java String Help document for help with strings.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/String-3
 */
class String3 {


    /**
     * CountYZ
     * <p>
     * Given a string,count the number of words ending in 'y' or 'z'
     * -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive).
     * We'll say that a y or z is at the end of a word if there
     * is not an alphabetic letter immediately following it.
     * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * <p>
     * countYZ("fez day") → 2
     * countYZ("day fez") → 2
     * countYZ("day fyyyz") → 2
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p199171
     */
    int countYZ(String str) {

        int count = 0;

        str = str.toLowerCase() + " ";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }

        return count;
    }


    /**
     * Without String
     * <p>
     * Given two strings, base and remove,
     * return a version of the base string where all instances of the remove string
     * have been removed (not case sensitive).
     * You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * withoutString("Hello there", "llo") → "He there"
     * withoutString("Hello there", "e") → "Hllo thr"
     * withoutString("Hello there", "x") → "Hello there"
     *
     * @param base   String
     * @param remove String
     * @return String
     * @link http://codingbat.com/prob/p192570
     */
    String withoutString(String base, String remove) {

        String result = "";
        int index = base.toLowerCase().indexOf(remove.toLowerCase());

        while (index != -1) {
            result += base.substring(0, index);
            base = base.substring(index + remove.length());
            index = base.toLowerCase().indexOf(remove.toLowerCase());
        }

        result += base;

        return result;
    }

    /**
     * Equal Is Not
     * <p>
     * Given a string, return true if the number of appearances
     * of "is" anywhere in the string is equal to the number
     * of appearances of "not" anywhere in the string (case sensitive).
     * <p>
     * equalIsNot("This is not") → false
     * equalIsNot("This is notnot") → true
     * equalIsNot("noisxxnotyynotxisi") → true
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p141736
     */
    boolean equalIsNot(String str) {

        int countIs = 0;
        int countNot = 0;
        str = str + "X";

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is"))
                countIs++;

            if (str.substring(i, i + 3).equals("not"))
                countNot++;
        }

        return (countIs == countNot);
    }

    /**
     * G Happy
     * <p>
     * We'll say that a lowercase 'g' in a string is "happy"
     * if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * <p>
     * gHappy("xxggxx") → true
     * gHappy("xxgxx") → false
     * gHappy("xxggyygxx") → false
     *
     * @param str String
     * @return boolean
     * @link http://codingbat.com/prob/p198664
     */
    boolean gHappy(String str) {

        str = "X" + str + "X"; // for corner cases

        for (int i = 1; i < str.length() - 1; i++)
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g')
                return false;

        return true;
    }

    /**
     * Count Triple
     * <p>
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * <p>
     * countTriple("abcXXXabc") → 1
     * countTriple("xxxabyyyycd") → 3
     * countTriple("a") → 0
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p195714
     */
    int countTriple(String str) {

        int count = 0;

        for (int i = 0; i < str.length() - 2; i++)
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2))
                count++;

        return count;
    }

    /**
     * Sum Digits
     * <p>
     * Given a string, return the sum of the digits 0-9 that appear in the string,
     * ignoring all other characters.
     * Return 0 if there are no digits in the string.
     * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
     * Integer.parseInt(string) converts a string to an int.)
     * <p>
     * sumDigits("aa1bc2d3") → 6
     * sumDigits("aa11b33") → 8
     * sumDigits("Chocolate") → 0
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p197890
     */
    int sumDigits(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(str.substring(i, i + 1));

        return sum;
    }

    /**
     * Same Ends
     * <p>
     * Given a string,
     * return the longest substring that appears at both the beginning
     * and end of the string without overlapping.
     * For example, sameEnds("abXab") is "ab".
     * <p>
     * sameEnds("abXYab") → "ab"
     * sameEnds("xx") → "x"
     * sameEnds("xxx") → "x"
     *
     * @param string String
     * @return String
     * @link http://codingbat.com/prob/p131516
     */
    String sameEnds(String string) {

        String result = "";
        int len = string.length();

        for (int i = 0; i <= len / 2; i++)
            for (int j = len / 2; j < len; j++)
                if (string.substring(0, i).equals(string.substring(j)))
                    result = string.substring(0, i);

        return result;
    }

    /**
     * Mirror Ends
     * <p>
     * Given a string, look for a mirror image (backwards)
     * string at both the beginning and end of the given string.
     * In other words, zero or more characters at the very begining of the given string,
     * and at the very end of the string in reverse order (possibly overlapping).
     * For example, the string "abXYZba" has the mirror end "ab".
     * <p>
     * mirrorEnds("abXYZba") → "ab"
     * mirrorEnds("abca") → "a"
     * mirrorEnds("aba") → "aba"
     *
     * @param string String
     * @return String
     * @link http://codingbat.com/prob/p139411
     */
    String mirrorEnds(String string) {

        String result = "";
        int len = string.length();

        for (int i = 0, j = len - 1; i < len; i++, j--)
            if (string.charAt(i) == string.charAt(j))
                result += string.charAt(i);
            else
                break;

        return result;
    }

    /**
     * Max Block
     * <p>
     * Given a string, return the length of the largest "block" in the string.
     * A block is a run of adjacent chars that are the same.
     * <p>
     * maxBlock("hoopla") → 2
     * maxBlock("abbCCCddBBBxx") → 3
     * maxBlock("") → 0
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p179479
     */
    int maxBlock(String str) {

        int max = 0;

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
                else
                    break;
            }

            if (count > max)
                max = count;
        }

        return max;
    }

    /**
     * Sum Numbers
     * <p>
     * Given a string, return the sum of the numbers appearing in the string,
     * ignoring all other characters.
     * A number is a series of 1 or more digit chars in a row.
     * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
     * Integer.parseInt(string) converts a string to an int.)
     * <p>
     * sumNumbers("abc123xyz") → 123
     * sumNumbers("aa11b33") → 44
     * sumNumbers("7 11") → 18
     *
     * @param str String
     * @return int
     * @link http://codingbat.com/prob/p121193
     */
    int sumNumbers(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {

                int count = 0;

                for (int j = i; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j)))
                        count++;
                    else
                        break;
                }

                sum += Integer.parseInt(str.substring(i, i + count));
                i += count;
            }
        }

        return sum;
    }

    /**
     * Not Replace
     * <p>
     * Given a string,
     * return a string where every appearance of the lowercase word "is" has been replaced with "is not".
     * The word "is" should not be immediately preceeded or followed by a letter
     * -- so for example the "is" in "this" does not count.
     * (Note: Character.isLetter(char) tests if a char is a letter.)
     * <p>
     * notReplace("is test") → "is not test"
     * notReplace("is-is") → "is not-is not"
     * notReplace("This is right") → "This is not right"
     *
     * @param str String
     * @return String
     * @link http://codingbat.com/prob/p154137
     */
    String notReplace(String str) {

        String result = "";
        str = " " + str + "  "; // avoid issues with corner cases

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'i') {
                if (str.charAt(i + 1) == 's' && !Character.isLetter(str.charAt(i + 2)) && !Character.isLetter(str.charAt(i - 1))) {
                    result += "is not";
                    i += 1;
                } else
                    result += "i";
            } else
                result += str.charAt(i);
        }

        return result.substring(1);
    }

}