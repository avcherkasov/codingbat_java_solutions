package com.codingbat.solution.task.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * String2Test
 * <p>
 * Medium String problems -- 1 loop.
 * See the Java String Help document for help with strings.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/String-2
 */
public class String2Test {

    private String2 string;

    @Before
    public void setUp() {
        string = new String2();
    }

    @Test
    public void doubleChar() {
        assertEquals("TThhee", string.doubleChar("The"));
        assertEquals("AAAAbbbb", string.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", string.doubleChar("Hi-There"));
        assertEquals("WWoorrdd!!", string.doubleChar("Word!"));
        assertEquals("!!!!", string.doubleChar("!!"));
        assertEquals("", string.doubleChar(""));
        assertEquals("aa", string.doubleChar("a"));
        assertEquals("..", string.doubleChar("."));
        assertEquals("aaaa", string.doubleChar("aa"));
    }

    @Test
    public void countHi() {

        assertEquals(1, string.countHi("abc hi ho"));
        assertEquals(2, string.countHi("ABChi hi"));
        assertEquals(2, string.countHi("hihi"));
        assertEquals(2, string.countHi("hiHIhi"));
        assertEquals(0, string.countHi(""));
        assertEquals(0, string.countHi("h"));
        assertEquals(1, string.countHi("hi"));
        assertEquals(0, string.countHi("Hi is no HI on ahI"));
        assertEquals(2, string.countHi("hiho not HOHIhi"));
    }

    @Test
    public void catDog() {
        assertTrue(string.catDog("catdog"));
        assertFalse(string.catDog("catcat"));
        assertTrue(string.catDog("1cat1cadodog"));
        assertFalse(string.catDog("catxxdogxxxdog"));
        assertTrue(string.catDog("catxdogxdogxcat"));
        assertFalse(string.catDog("catxdogxdogxca"));
        assertFalse(string.catDog("dogdogcat"));
        assertTrue(string.catDog("dogogcat"));
        assertFalse(string.catDog("dog"));
        assertFalse(string.catDog("cat"));
        assertTrue(string.catDog("ca"));
        assertTrue(string.catDog("c"));
        assertTrue(string.catDog(""));
    }

    @Test
    public void countCode() {
        assertEquals(1, string.countCode("aaacodebbb"));
        assertEquals(2, string.countCode("codexxcode"));
        assertEquals(2, string.countCode("cozexxcope"));
        assertEquals(1, string.countCode("cozfxxcope"));
        assertEquals(1, string.countCode("xxcozeyycop"));
        assertEquals(0, string.countCode("cozcop"));
        assertEquals(0, string.countCode("abcxyz"));
        assertEquals(1, string.countCode("code"));
        assertEquals(0, string.countCode("ode"));
        assertEquals(0, string.countCode("c"));
        assertEquals(0, string.countCode(""));
        assertEquals(3, string.countCode("AAcodeBBcoleCCccoreDD"));
        assertEquals(2, string.countCode("AAcodeBBcoleCCccorfDD"));
        assertEquals(3, string.countCode("coAcodeBcoleccoreDD"));
    }

    @Test
    public void endOther() {
        assertTrue(string.endOther("Hiabc", "abc"));
        assertTrue(string.endOther("AbC", "HiaBc"));
        assertTrue(string.endOther("abc", "abXabc"));
        assertFalse(string.endOther("Hiabc", "abcd"));
        assertTrue(string.endOther("Hiabc", "bc"));
        assertFalse(string.endOther("Hiabcx", "bc"));
        assertTrue(string.endOther("abc", "abc"));
        assertTrue(string.endOther("xyz", "12xyz"));
        assertFalse(string.endOther("yz", "12xz"));
        assertTrue(string.endOther("Z", "12xz"));
        assertTrue(string.endOther("12", "12"));
        assertFalse(string.endOther("abcXYZ", "abcDEF"));
        assertFalse(string.endOther("ab", "ab12"));
        assertTrue(string.endOther("ab", "12ab"));
    }

    @Test
    public void xyzThere() {
        assertTrue(string.xyzThere("abcxyz"));
        assertFalse(string.xyzThere("abc.xyz"));
        assertTrue(string.xyzThere("xyz.abc"));
        assertFalse(string.xyzThere("abcxy"));
        assertTrue(string.xyzThere("xyz"));
        assertFalse(string.xyzThere("xy"));
        assertFalse(string.xyzThere("x"));
        assertFalse(string.xyzThere(""));
        assertTrue(string.xyzThere("abc.xyzxyz"));
        assertTrue(string.xyzThere("abc.xxyz"));
        assertFalse(string.xyzThere(".xyz"));
        assertFalse(string.xyzThere("12.xyz"));
        assertTrue(string.xyzThere("12xyz"));
        assertFalse(string.xyzThere("1.xyz.xyz2.xyz"));
    }

    @Test
    public void bobThere() {
        assertTrue(string.bobThere("abcbob"));
        assertTrue(string.bobThere("b9b"));
        assertFalse(string.bobThere("bac"));
        assertTrue(string.bobThere("bbb"));
        assertFalse(string.bobThere("abcdefb"));
        assertTrue(string.bobThere("123abcbcdbabxyz"));
        assertFalse(string.bobThere("b12"));
        assertTrue(string.bobThere("b1b"));
        assertTrue(string.bobThere("b12b1b"));
        assertFalse(string.bobThere("bbc"));
        assertTrue(string.bobThere("bbb"));
        assertFalse(string.bobThere("bb"));
        assertFalse(string.bobThere("b"));
    }

    @Test
    public void xyBalance() {
        assertTrue(string.xyBalance("aaxbby"));
        assertFalse(string.xyBalance("aaxbb"));
        assertFalse(string.xyBalance("yaaxbb"));
        assertTrue(string.xyBalance("yaaxbby"));
        assertTrue(string.xyBalance("xaxxbby"));
        assertFalse(string.xyBalance("xaxxbbyx"));
        assertTrue(string.xyBalance("xxbxy"));
        assertFalse(string.xyBalance("xxbx"));
        assertTrue(string.xyBalance("bbb"));
        assertFalse(string.xyBalance("bxbb"));
        assertTrue(string.xyBalance("bxyb"));
        assertTrue(string.xyBalance("xy"));
        assertTrue(string.xyBalance("y"));
        assertFalse(string.xyBalance("x"));
        assertTrue(string.xyBalance(""));
        assertFalse(string.xyBalance("yxyxyxyx"));
        assertTrue(string.xyBalance("yxyxyxyxy"));
        assertTrue(string.xyBalance("12xabxxydxyxyzz"));
    }

    @Test
    public void mixString() {
        assertEquals("axbycz", string.mixString("abc", "xyz"));
        assertEquals("HTihere", string.mixString("Hi", "There"));
        assertEquals("xTxhxexre", string.mixString("xxxx", "There"));
        assertEquals("xXxx", string.mixString("xxx", "X"));
        assertEquals("22/7 around", string.mixString("2/", "27 around"));
        assertEquals("Hello", string.mixString("", "Hello"));
        assertEquals("Abc", string.mixString("Abc", ""));
        assertEquals("", string.mixString("", ""));
        assertEquals("ab", string.mixString("a", "b"));
        assertEquals("abx", string.mixString("ax", "b"));
        assertEquals("abx", string.mixString("a", "bx"));
        assertEquals("SLoong", string.mixString("So", "Long"));
        assertEquals("LSoong", string.mixString("Long", "So"));
    }

    @Test
    public void repeatEnd() {
        assertEquals("llollollo", string.repeatEnd("Hello", 3));
        assertEquals("lolo", string.repeatEnd("Hello", 2));
        assertEquals("o", string.repeatEnd("Hello", 1));
        assertEquals("", string.repeatEnd("Hello", 0));
        assertEquals("abcabcabc", string.repeatEnd("abc", 3));
        assertEquals("3434", string.repeatEnd("1234", 2));
        assertEquals("234234234", string.repeatEnd("1234", 3));
        assertEquals("", string.repeatEnd("", 0));
    }

    @Test
    public void repeatFront() {
        assertEquals("ChocChoChC", string.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", string.repeatFront("Chocolate", 3));
        assertEquals("IcI", string.repeatFront("Ice Cream", 2));
        assertEquals("I", string.repeatFront("Ice Cream", 1));
        assertEquals("", string.repeatFront("Ice Cream", 0));
        assertEquals("xyzxyx", string.repeatFront("xyz", 3));
        assertEquals("", string.repeatFront("", 0));
        assertEquals("JavaJavJaJ", string.repeatFront("Java", 4));
        assertEquals("J", string.repeatFront("Java", 1));
    }

    @Test
    public void repeatSeparator() {
        assertEquals("WordXWordXWord", string.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", string.repeatSeparator("This", "And", 2));
        assertEquals("This", string.repeatSeparator("This", "And", 1));
        assertEquals("Hi-n-Hi", string.repeatSeparator("Hi", "-n-", 2));
        assertEquals("AAA", string.repeatSeparator("AAA", "", 1));
        assertEquals("", string.repeatSeparator("AAA", "", 0));
        assertEquals("ABABABABA", string.repeatSeparator("A", "B", 5));
        assertEquals("abcXXabcXXabc", string.repeatSeparator("abc", "XX", 3));
        assertEquals("abcXXabc", string.repeatSeparator("abc", "XX", 2));
        assertEquals("abc", string.repeatSeparator("abc", "XX", 1));
        assertEquals("XYZaXYZ", string.repeatSeparator("XYZ", "a", 2));
    }

    @Test
    public void prefixAgain() {
        assertTrue(string.prefixAgain("abXYabc", 1));
        assertTrue(string.prefixAgain("abXYabc", 2));
        assertFalse(string.prefixAgain("abXYabc", 3));
        assertTrue(string.prefixAgain("xyzxyxyxy", 2));
        assertFalse(string.prefixAgain("xyzxyxyxy", 3));
        assertTrue(string.prefixAgain("Hi12345Hi6789Hi10", 1));
        assertTrue(string.prefixAgain("Hi12345Hi6789Hi10", 2));
        assertTrue(string.prefixAgain("Hi12345Hi6789Hi10", 3));
        assertFalse(string.prefixAgain("Hi12345Hi6789Hi10", 4));
        assertFalse(string.prefixAgain("a", 1));
        assertTrue(string.prefixAgain("aa", 1));
        assertFalse(string.prefixAgain("ab", 1));
    }

    @Test
    public void xyzMiddle() {
        assertTrue(string.xyzMiddle("AAxyzBB"));
        assertTrue(string.xyzMiddle("AxyzBB"));
        assertFalse(string.xyzMiddle("AxyzBBB"));
        assertFalse(string.xyzMiddle("AxyzBBBB"));
        assertFalse(string.xyzMiddle("AAAxyzB"));
        assertTrue(string.xyzMiddle("AAAxyzBB"));
        assertFalse(string.xyzMiddle("AAAAxyzBB"));
        assertFalse(string.xyzMiddle("AAAAAxyzBBB"));
        assertTrue(string.xyzMiddle("1x345xyz12x4"));
        assertTrue(string.xyzMiddle("xyzAxyzBBB"));
        assertTrue(string.xyzMiddle("xyzAxyzBxyz"));
        assertTrue(string.xyzMiddle("xyzxyzAxyzBxyzxyz"));
        assertTrue(string.xyzMiddle("xyzxyzxyzBxyzxyz"));
        assertTrue(string.xyzMiddle("xyzxyzAxyzxyzxyz"));
        assertFalse(string.xyzMiddle("xyzxyzAxyzxyzxy"));
        assertFalse(string.xyzMiddle("AxyzxyzBB"));
        assertFalse(string.xyzMiddle(""));
        assertFalse(string.xyzMiddle("x"));
        assertFalse(string.xyzMiddle("xy"));
        assertTrue(string.xyzMiddle("xyz"));
        assertTrue(string.xyzMiddle("xyzz"));
    }

    @Test
    public void getSandwich() {
        assertEquals("jam", string.getSandwich("breadjambread"));
        assertEquals("jam", string.getSandwich("xxbreadjambreadyy"));
        assertEquals("", string.getSandwich("xxbreadyy"));
        assertEquals("breadjam", string.getSandwich("xxbreadbreadjambreadyy"));
        assertEquals("A", string.getSandwich("breadAbread"));
        assertEquals("", string.getSandwich("breadbread"));
        assertEquals("", string.getSandwich("abcbreaz"));
        assertEquals("", string.getSandwich("xyz"));
        assertEquals("", string.getSandwich(""));
        assertEquals("breax", string.getSandwich("breadbreaxbread"));
        assertEquals("y", string.getSandwich("breaxbreadybread"));
        assertEquals("breadbread", string.getSandwich("breadbreadbreadbread"));
    }

    @Test
    public void sameStarChar() {
        assertTrue(string.sameStarChar("xy*yzz"));
        assertFalse(string.sameStarChar("xy*zzz"));
        assertTrue(string.sameStarChar("*xa*az"));
        assertFalse(string.sameStarChar("*xa*bz"));
        assertTrue(string.sameStarChar("*xa*a*"));
        assertTrue(string.sameStarChar(""));
        assertTrue(string.sameStarChar("*xa*a*a"));
        assertFalse(string.sameStarChar("*xa*a*b"));
        assertTrue(string.sameStarChar("*12*2*2"));
        assertFalse(string.sameStarChar("12*2*3*"));
        assertTrue(string.sameStarChar("abcDEF"));
        assertFalse(string.sameStarChar("XY*YYYY*Z*"));
        assertTrue(string.sameStarChar("XY*YYYY*Y*"));
        assertFalse(string.sameStarChar("12*2*3*"));
        assertTrue(string.sameStarChar("*"));
        assertTrue(string.sameStarChar("**"));
    }

    @Test
    public void zipZap() {
        assertEquals("zpXzp", string.zipZap("zipXzap"));
        assertEquals("zpzp", string.zipZap("zopzop"));
        assertEquals("zzzpzp", string.zipZap("zzzopzop"));
        assertEquals("zibzp", string.zipZap("zibzap"));
        assertEquals("zp", string.zipZap("zip"));
        assertEquals("zi", string.zipZap("zi"));
        assertEquals("z", string.zipZap("z"));
        assertEquals("", string.zipZap(""));
        assertEquals("zp", string.zipZap("zzp"));
        assertEquals("abcppp", string.zipZap("abcppp"));
        assertEquals("azbcppp", string.zipZap("azbcppp"));
        assertEquals("azbcpzp", string.zipZap("azbcpzpp"));
    }

    @Test
    public void starOut() {
        assertEquals("ad", string.starOut("ab*cd"));
        assertEquals("ad", string.starOut("ab**cd"));
        assertEquals("silly", string.starOut("sm*eilly"));
        assertEquals("siy", string.starOut("sm*eil*ly"));
        assertEquals("siy", string.starOut("sm**eil*ly"));
        assertEquals("siy", string.starOut("sm***eil*ly"));
        assertEquals("string", string.starOut("stringy*"));
        assertEquals("tringy", string.starOut("*stringy"));
        assertEquals("ty", string.starOut("*str*in*gy"));
        assertEquals("abc", string.starOut("abc"));
        assertEquals("c", string.starOut("a*bc"));
        assertEquals("ab", string.starOut("ab"));
        assertEquals("", string.starOut("a*b"));
        assertEquals("a", string.starOut("a"));
        assertEquals("", string.starOut("a*"));
        assertEquals("", string.starOut("*a"));
        assertEquals("", string.starOut("*"));
        assertEquals("", string.starOut(""));
    }

    @Test
    public void plusOut() {
        assertEquals("++xy++", string.plusOut("12xy34", "xy"));
        assertEquals("1+++++", string.plusOut("12xy34", "1"));
        assertEquals("++xy++xy+++xy", string.plusOut("12xy34xyabcxy", "xy"));
        assertEquals("ab++ab++++", string.plusOut("abXYabcXYZ", "ab"));
        assertEquals("++++abc+++", string.plusOut("abXYabcXYZ", "abc"));
        assertEquals("++XY+++XY+", string.plusOut("abXYabcXYZ", "XY"));
        assertEquals("+++++++XYZ", string.plusOut("abXYxyzXYZ", "XYZ"));
        assertEquals("++++++", string.plusOut("--++ab", "++"));
        assertEquals("++xxxx++", string.plusOut("aaxxxxbb", "xx"));
        assertEquals("++3++3", string.plusOut("123123", "3"));
    }

    @Test
    public void wordEnds() {
        assertEquals("c13i", string.wordEnds("abcXY123XYijk", "XY"));
        assertEquals("13", string.wordEnds("XY123XY", "XY"));
        assertEquals("11", string.wordEnds("XY1XY", "XY"));
        assertEquals("XY", string.wordEnds("XYXY", "XY"));
        assertEquals("", string.wordEnds("XY", "XY"));
        assertEquals("", string.wordEnds("Hi", "XY"));
        assertEquals("", string.wordEnds("", "XY"));
        assertEquals("cxziij", string.wordEnds("abc1xyz1i1j", "1"));
        assertEquals("cxz", string.wordEnds("abc1xyz1", "1"));
        assertEquals("cxz11", string.wordEnds("abc1xyz11", "1"));
        assertEquals("11", string.wordEnds("abc1xyz1abc", "abc"));
        assertEquals("acac", string.wordEnds("abc1xyz1abc", "b"));
        assertEquals("1111", string.wordEnds("abc1abc1abc", "abc"));
    }

}