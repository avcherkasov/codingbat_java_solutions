package com.codingbat.solution.task.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * String 3 Test
 * <p>
 * Harder String problems -- 2 loops.
 * See the Java String Help document for help with strings.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/String-3
 */
public class String3Test {

    private String3 string;

    @Before
    public void setUp() {
        string = new String3();
    }

    @Test
    public void testCountYZ() {
        assertEquals(2, string.countYZ("fez day"));
        assertEquals(2, string.countYZ("day fez"));
        assertEquals(2, string.countYZ("day fyyyz"));
        assertEquals(1, string.countYZ("day yak"));
        assertEquals(1, string.countYZ("day:yak"));
        assertEquals(2, string.countYZ("!!day--yaz!!"));
        assertEquals(0, string.countYZ("yak zak"));
        assertEquals(2, string.countYZ("DAY abc XYZ"));
        assertEquals(3, string.countYZ("aaz yyz my"));
        assertEquals(2, string.countYZ("y2bz"));
        assertEquals(0, string.countYZ("zxyx"));
    }

    @Test
    public void testWithoutString() {
        assertEquals("He there", string.withoutString("Hello there", "llo"));
        assertEquals("Hllo thr", string.withoutString("Hello there", "e"));
        assertEquals("Hello there", string.withoutString("Hello there", "x"));
        assertEquals("Th  a FH", string.withoutString("This is a FISH", "IS"));
        assertEquals("TH  a FH", string.withoutString("THIS is a FISH", "is"));
        assertEquals("TH  a FH", string.withoutString("THIS is a FISH", "iS"));
        assertEquals("abab", string.withoutString("abxxxxab", "xx"));
        assertEquals("abxab", string.withoutString("abxxxab", "xx"));
        assertEquals("abab", string.withoutString("abxxxab", "x"));
        assertEquals("", string.withoutString("xxx", "x"));
        assertEquals("x", string.withoutString("xxx", "xx"));
        assertEquals("xzz", string.withoutString("xyzzy", "Y"));
        assertEquals("", string.withoutString("", "x"));
        assertEquals("acac", string.withoutString("abcabc", "b"));
        assertEquals("AAbb", string.withoutString("AA22bb", "2"));
        assertEquals("", string.withoutString("1111", "1"));
        assertEquals("", string.withoutString("1111", "11"));
        assertEquals("jtx", string.withoutString("MkjtMkx", "Mk"));
        assertEquals("Hi ", string.withoutString("Hi HoHo", "Ho"));
    }

    @Test
    public void testEqualIsNot() {
        assertFalse(string.equalIsNot("This is not"));
        assertTrue(string.equalIsNot("This is notnot"));
        assertTrue(string.equalIsNot("noisxxnotyynotxisi"));
        assertFalse(string.equalIsNot("noisxxnotyynotxsi"));
        assertTrue(string.equalIsNot("xxxyyyzzzintint"));
        assertTrue(string.equalIsNot(""));
        assertTrue(string.equalIsNot("isisnotnot"));
        assertFalse(string.equalIsNot("isisnotno7Not"));
        assertFalse(string.equalIsNot("isnotis"));
        assertFalse(string.equalIsNot("mis3notpotbotis"));
    }

    @Test
    public void testGHappy() {
        assertTrue(string.gHappy("xxggxx"));
        assertFalse(string.gHappy("xxgxx"));
        assertFalse(string.gHappy("xxggyygxx"));
        assertFalse(string.gHappy("g"));
        assertTrue(string.gHappy("gg"));
        assertTrue(string.gHappy(""));
        assertTrue(string.gHappy("xxgggxyz"));
        assertFalse(string.gHappy("xxgggxyg"));
        assertTrue(string.gHappy("xxgggxygg"));
        assertFalse(string.gHappy("mgm"));
        assertTrue(string.gHappy("mggm"));
        assertTrue(string.gHappy("yyygggxyy"));
    }

    @Test
    public void testCountTriple() {
        assertEquals(1, string.countTriple("abcXXXabc"));
        assertEquals(3, string.countTriple("xxxabyyyycd"));
        assertEquals(0, string.countTriple("a"));
        assertEquals(0, string.countTriple(""));
        assertEquals(1, string.countTriple("XXXabc"));
        assertEquals(2, string.countTriple("XXXXabc"));
        assertEquals(3, string.countTriple("XXXXXabc"));
        assertEquals(3, string.countTriple("222abyyycdXXX"));
        assertEquals(4, string.countTriple("abYYYabXXXXXab"));
        assertEquals(0, string.countTriple("abYYXabXXYXXab"));
        assertEquals(0, string.countTriple("abYYXabXXYXXab"));
        assertEquals(1, string.countTriple("122abhhh2"));
    }

    @Test
    public void testSumDigits() {
        assertEquals(6, string.sumDigits("aa1bc2d3"));
        assertEquals(8, string.sumDigits("aa11b33"));
        assertEquals(0, string.sumDigits("Chocolate"));
        assertEquals(7, string.sumDigits("5hoco1a1e"));
        assertEquals(12, string.sumDigits("123abc123"));
        assertEquals(0, string.sumDigits(""));
        assertEquals(0, string.sumDigits("Hello"));
        assertEquals(12, string.sumDigits("X1z9b2"));
        assertEquals(14, string.sumDigits("5432a"));
    }

    @Test
    public void testSameEnds() {
        assertEquals("ab", string.sameEnds("abXYab"));
        assertEquals("x", string.sameEnds("xx"));
        assertEquals("x", string.sameEnds("xxx"));
        assertEquals("xx", string.sameEnds("xxxx"));
        assertEquals("java", string.sameEnds("javaXYZjava"));
        assertEquals("java", string.sameEnds("javajava"));
        assertEquals("", string.sameEnds("xavaXYZjava"));
        assertEquals("Hello!", string.sameEnds("Hello! and Hello!"));
        assertEquals("", string.sameEnds("x"));
        assertEquals("", string.sameEnds(""));
        assertEquals("", string.sameEnds("abcb"));
        assertEquals("my", string.sameEnds("mymmy"));
    }

    @Test
    public void testMirrorEnds() {
        assertEquals("ab", string.mirrorEnds("abXYZba"));
        assertEquals("a", string.mirrorEnds("abca"));
        assertEquals("aba", string.mirrorEnds("aba"));
        assertEquals("", string.mirrorEnds("abab"));
        assertEquals("xxx", string.mirrorEnds("xxx"));
        assertEquals("xxYxx", string.mirrorEnds("xxYxx"));
        assertEquals("Hi ", string.mirrorEnds("Hi and iH"));
        assertEquals("x", string.mirrorEnds("x"));
        assertEquals("", string.mirrorEnds(""));
        assertEquals("123", string.mirrorEnds("123and then 321"));
        assertEquals("ba", string.mirrorEnds("band andab"));
    }

    @Test
    public void testMaxBlock() {
        assertEquals(2, string.maxBlock("hoopla"));
        assertEquals(3, string.maxBlock("abbCCCddBBBxx"));
        assertEquals(0, string.maxBlock(""));
        assertEquals(1, string.maxBlock("xyz"));
        assertEquals(2, string.maxBlock("xxyz"));
        assertEquals(2, string.maxBlock("xyzz"));
        assertEquals(3, string.maxBlock("abbbcbbbxbbbx"));
        assertEquals(3, string.maxBlock("XXBBBbbxx"));
        assertEquals(4, string.maxBlock("XXBBBBbbxx"));
        assertEquals(4, string.maxBlock("XXBBBbbxxXXXX"));
        assertEquals(4, string.maxBlock("XX2222BBBbbXX2222"));
    }

    @Test
    public void testSumNumbers() {
        assertEquals(123, string.sumNumbers("abc123xyz"));
        assertEquals(44, string.sumNumbers("aa11b33"));
        assertEquals(18, string.sumNumbers("7 11"));
        assertEquals(0, string.sumNumbers("Chocolate"));
        assertEquals(7, string.sumNumbers("5hoco1a1e"));
        assertEquals(7, string.sumNumbers("5$$1;;1!!"));
        assertEquals(1245, string.sumNumbers("a1234bb11"));
        assertEquals(0, string.sumNumbers(""));
        assertEquals(25, string.sumNumbers("a22bbb3"));
    }

    @Test
    public void testNotReplace() {
        assertEquals("is not test", string.notReplace("is test"));
        assertEquals("is not-is not", string.notReplace("is-is"));
        assertEquals("This is not right", string.notReplace("This is right"));
        assertEquals("This is not isabell", string.notReplace("This is isabell"));
        assertEquals("", string.notReplace(""));
        assertEquals("is not", string.notReplace("is"));
        assertEquals("isis", string.notReplace("isis"));
        assertEquals("Dis is not bliss is not", string.notReplace("Dis is bliss is"));
        assertEquals("is not his", string.notReplace("is his"));
        assertEquals("xis yis", string.notReplace("xis yis"));
        assertEquals("AAAis is not", string.notReplace("AAAis is"));
    }

}