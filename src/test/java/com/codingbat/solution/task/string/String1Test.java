package com.codingbat.solution.task.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * String1Test
 * <p>
 * Basic string problems -- no loops. Use + to combine Strings,
 * str.length() is the number of chars in a String,
 * str.substring(i, j) extracts the substring starting at index i
 * and running up to but not including index j.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/String-1
 */
public class String1Test {

    private String1 string;

    @Before
    public void setUp() {
        string = new String1();
    }

    @Test
    public void testHelloName() {
        assertEquals("Hello Bob!", string.helloName("Bob"));
        assertEquals("Hello Alice!", string.helloName("Alice"));
        assertEquals("Hello X!", string.helloName("X"));
        assertEquals("Hello Dolly!", string.helloName("Dolly"));
        assertEquals("Hello Alpha!", string.helloName("Alpha"));
        assertEquals("Hello Omega!", string.helloName("Omega"));
        assertEquals("Hello Goodbye!", string.helloName("Goodbye"));
        assertEquals("Hello ho ho ho!", string.helloName("ho ho ho"));
        assertEquals("Hello xyz!!", string.helloName("xyz!"));
        assertEquals("Hello Hello!", string.helloName("Hello"));
    }

    @Test
    public void testMakeAbba() {
        assertEquals("HiByeByeHi", string.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", string.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", string.makeAbba("What", "Up"));
        assertEquals("aaabbbbbbaaa", string.makeAbba("aaa", "bbb"));
        assertEquals("xyyx", string.makeAbba("x", "y"));
        assertEquals("xx", string.makeAbba("x", ""));
        assertEquals("yy", string.makeAbba("", "y"));
        assertEquals("BoYaYaBo", string.makeAbba("Bo", "Ya"));
        assertEquals("YaYaYaYa", string.makeAbba("Ya", "Ya"));
    }

    @Test
    public void testMakeTags() {
        assertEquals("<i>Yay</i>", string.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", string.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", string.makeTags("cite", "Yay"));
        assertEquals("<address>here</address>", string.makeTags("address", "here"));
        assertEquals("<body>Heart</body>", string.makeTags("body", "Heart"));
        assertEquals("<i>i</i>", string.makeTags("i", "i"));
        assertEquals("<i></i>", string.makeTags("i", ""));
    }

    @Test
    public void testMakeOutWord() {
        assertEquals("<<Yay>>", string.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", string.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", string.makeOutWord("[[]]", "word"));
        assertEquals("HHHellooo", string.makeOutWord("HHoo", "Hello"));
        assertEquals("abYAYyz", string.makeOutWord("abyz", "YAY"));
    }

    @Test
    public void testExtraEnd() {
        assertEquals("lololo", string.extraEnd("Hello"));
        assertEquals("ababab", string.extraEnd("ab"));
        assertEquals("HiHiHi", string.extraEnd("Hi"));
        assertEquals("dydydy", string.extraEnd("Candy"));
        assertEquals("dedede", string.extraEnd("Code"));
    }

    @Test
    public void testFirstTwo() {
        assertEquals("He", string.firstTwo("Hello"));
        assertEquals("ab", string.firstTwo("abcdefg"));
        assertEquals("ab", string.firstTwo("ab"));
        assertEquals("a", string.firstTwo("a"));
        assertEquals("", string.firstTwo(""));
        assertEquals("Ki", string.firstTwo("Kitten"));
        assertEquals("hi", string.firstTwo("hi"));
        assertEquals("hi", string.firstTwo("hiya"));
    }

    @Test
    public void testFirstHalf() {
        assertEquals("Woo", string.firstHalf("WooHoo"));
        assertEquals("Hello", string.firstHalf("HelloThere"));
        assertEquals("abc", string.firstHalf("abcdef"));
        assertEquals("a", string.firstHalf("ab"));
        assertEquals("", string.firstHalf(""));
        assertEquals("01234", string.firstHalf("0123456789"));
        assertEquals("kit", string.firstHalf("kitten"));
    }

    @Test
    public void testWithoutEnd() {
        assertEquals("ell", string.withoutEnd("Hello"));
        assertEquals("av", string.withoutEnd("java"));
        assertEquals("odin", string.withoutEnd("coding"));
        assertEquals("od", string.withoutEnd("code"));
        assertEquals("", string.withoutEnd("ab"));
        assertEquals("hocolate", string.withoutEnd("Chocolate!"));
        assertEquals("itte", string.withoutEnd("kitten"));
        assertEquals("ooho", string.withoutEnd("woohoo"));
    }

    @Test
    public void testComboString() {
        assertEquals("hiHellohi", string.comboString("Hello", "hi"));
        assertEquals("hiHellohi", string.comboString("hi", "Hello"));
        assertEquals("baaab", string.comboString("aaa", "b"));
        assertEquals("baaab", string.comboString("b", "aaa"));
        assertEquals("aaa", string.comboString("aaa", ""));
        assertEquals("bb", string.comboString("", "bb"));
        assertEquals("aaa1234aaa", string.comboString("aaa", "1234"));
        assertEquals("bbaaabb", string.comboString("aaa", "bb"));
        assertEquals("abba", string.comboString("a", "bb"));
        assertEquals("abba", string.comboString("bb", "a"));
        assertEquals("abxyzab", string.comboString("xyz", "ab"));
    }

    @Test
    public void testNonStart() {
        assertEquals("ellohere", string.nonStart("Hello", "There"));
        assertEquals("avaode", string.nonStart("java", "code"));
        assertEquals("hotlava", string.nonStart("shotl", "java"));
        assertEquals("by", string.nonStart("ab", "xy"));
        assertEquals("b", string.nonStart("ab", "x"));
        assertEquals("c", string.nonStart("x", "ac"));
        assertEquals("", string.nonStart("a", "x"));
        assertEquals("itat", string.nonStart("kit", "kat"));
        assertEquals("artart", string.nonStart("mart", "dart"));
    }

    @Test
    public void testLeft2() {
        assertEquals("lloHe", string.left2("Hello"));
        assertEquals("vaja", string.left2("java"));
        assertEquals("Hi", string.left2("Hi"));
        assertEquals("deco", string.left2("code"));
        assertEquals("tca", string.left2("cat"));
        assertEquals("34512", string.left2("12345"));
        assertEquals("ocolateCh", string.left2("Chocolate"));
        assertEquals("icksbr", string.left2("bricks"));
    }

    @Test
    public void testRight2() {
        assertEquals("loHel", string.right2("Hello"));
        assertEquals("vaja", string.right2("java"));
        assertEquals("Hi", string.right2("Hi"));
        assertEquals("deco", string.right2("code"));
        assertEquals("atc", string.right2("cat"));
        assertEquals("45123", string.right2("12345"));
    }

    @Test
    public void testTheEnd() {
        assertEquals("H", string.theEnd("Hello", true));
        assertEquals("o", string.theEnd("Hello", false));
        assertEquals("o", string.theEnd("oh", true));
        assertEquals("h", string.theEnd("oh", false));
        assertEquals("x", string.theEnd("x", true));
        assertEquals("x", string.theEnd("x", false));
        assertEquals("j", string.theEnd("java", true));
        assertEquals("e", string.theEnd("chocolate", false));
        assertEquals("1", string.theEnd("1234", true));
        assertEquals("e", string.theEnd("code", false));
    }

    @Test
    public void testWithouEnd2() {
        assertEquals("ell", string.withoutEnd2("Hello"));
        assertEquals("b", string.withoutEnd2("abc"));
        assertEquals("", string.withoutEnd2("ab"));
        assertEquals("", string.withoutEnd2("a"));
        assertEquals("", string.withoutEnd2(""));
        assertEquals("old", string.withoutEnd2("coldy"));
        assertEquals("ava cod", string.withoutEnd2("java code"));
    }

    @Test
    public void testMiddleTwo() {
        assertEquals("ri", string.middleTwo("string"));
        assertEquals("od", string.middleTwo("code"));
        assertEquals("ct", string.middleTwo("Practice"));
        assertEquals("ab", string.middleTwo("ab"));
        assertEquals("45", string.middleTwo("0123456789"));
    }

    @Test
    public void testEndsLy() {
        assertTrue(string.endsLy("oddly"));
        assertFalse(string.endsLy("y"));
        assertFalse(string.endsLy("oddy"));
        assertFalse(string.endsLy("oddl"));
        assertFalse(string.endsLy("olydd"));
        assertTrue(string.endsLy("ly"));
        assertFalse(string.endsLy(""));
        assertFalse(string.endsLy("falsey"));
        assertTrue(string.endsLy("evenly"));
    }

    @Test
    public void testNTwice() {
        assertEquals("Helo", string.nTwice("Hello", 2));
        assertEquals("Choate", string.nTwice("Chocolate", 3));
        assertEquals("Ce", string.nTwice("Chocolate", 1));
        assertEquals("", string.nTwice("Chocolate", 0));
        assertEquals("Hellello", string.nTwice("Hello", 4));
        assertEquals("CodeCode", string.nTwice("Code", 4));
        assertEquals("Code", string.nTwice("Code", 2));
    }

    @Test
    public void testTwoChar() {
        assertEquals("ja", string.twoChar("java", 0));
        assertEquals("va", string.twoChar("java", 2));
        assertEquals("ja", string.twoChar("java", 3));
        assertEquals("ja", string.twoChar("java", 4));
        assertEquals("ja", string.twoChar("java", -1));
        assertEquals("He", string.twoChar("Hello", 0));
        assertEquals("el", string.twoChar("Hello", 1));
        assertEquals("He", string.twoChar("Hello", 99));
        assertEquals("lo", string.twoChar("Hello", 3));
        assertEquals("He", string.twoChar("Hello", 4));
        assertEquals("He", string.twoChar("Hello", 5));
        assertEquals("He", string.twoChar("Hello", -7));
        assertEquals("He", string.twoChar("Hello", 6));
        assertEquals("He", string.twoChar("Hello", -1));
        assertEquals("ya", string.twoChar("yay", 0));
    }

    @Test
    public void testMiddleThree() {
        assertEquals("and", string.middleThree("Candy"));
        assertEquals("and", string.middleThree("and"));
        assertEquals("lvi", string.middleThree("solving"));
        assertEquals("yet", string.middleThree("Hi yet Hi"));
        assertEquals("yet", string.middleThree("java yet java"));
        assertEquals("col", string.middleThree("Chocolate"));
        assertEquals("xyz", string.middleThree("XabcxyzabcX"));
    }

    @Test
    public void testHasBad() {
        assertTrue(string.hasBad("badxx"));
        assertTrue(string.hasBad("xbadxx"));
        assertFalse(string.hasBad("xxbadxx"));
        assertFalse(string.hasBad("code"));
        assertTrue(string.hasBad("bad"));
        assertFalse(string.hasBad("ba"));
        assertFalse(string.hasBad("xba"));
        assertTrue(string.hasBad("xbad"));
        assertFalse(string.hasBad(""));
        assertTrue(string.hasBad("badyy"));
    }

    @Test
    public void testAtFirst() {
        assertEquals("he", string.atFirst("hello"));
        assertEquals("hi", string.atFirst("hi"));
        assertEquals("h@", string.atFirst("h"));
        assertEquals("@@", string.atFirst(""));
        assertEquals("ki", string.atFirst("kitten"));
        assertEquals("ja", string.atFirst("java"));
        assertEquals("j@", string.atFirst("j"));
    }

    @Test
    public void testLastChars() {
        assertEquals("ls", string.lastChars("last", "chars"));
        assertEquals("ya", string.lastChars("yo", "java"));
        assertEquals("h@", string.lastChars("hi", ""));
        assertEquals("@o", string.lastChars("", "hello"));
        assertEquals("@@", string.lastChars("", ""));
        assertEquals("ki", string.lastChars("kitten", "hi"));
        assertEquals("kp", string.lastChars("k", "zip"));
        assertEquals("k@", string.lastChars("kitten", ""));
        assertEquals("kp", string.lastChars("kitten", "zip"));
    }

    @Test
    public void testConCat() {
        assertEquals("abcat", string.conCat("abc", "cat"));
        assertEquals("dogcat", string.conCat("dog", "cat"));
        assertEquals("abc", string.conCat("abc", ""));
        assertEquals("cat", string.conCat("", "cat"));
        assertEquals("pig", string.conCat("pig", "g"));
        assertEquals("pigdoggy", string.conCat("pig", "doggy"));
    }

    @Test
    public void testLastTwo() {
        assertEquals("codign", string.lastTwo("coding"));
        assertEquals("cta", string.lastTwo("cat"));
        assertEquals("ba", string.lastTwo("ab"));
        assertEquals("a", string.lastTwo("a"));
        assertEquals("", string.lastTwo(""));
    }

    @Test
    public void testSeeColor() {
        assertEquals("red", string.seeColor("redxx"));
        assertEquals("", string.seeColor("xxred"));
        assertEquals("blue", string.seeColor("blueTimes"));
        assertEquals("", string.seeColor("NoColor"));
        assertEquals("red", string.seeColor("red"));
        assertEquals("", string.seeColor("re"));
        assertEquals("", string.seeColor("blu"));
        assertEquals("blue", string.seeColor("blue"));
        assertEquals("", string.seeColor("a"));
        assertEquals("", string.seeColor(""));
        assertEquals("", string.seeColor("xyzred"));
    }

    @Test
    public void testFrontAgain() {
        assertTrue(string.frontAgain("edited"));
        assertFalse(string.frontAgain("edit"));
        assertTrue(string.frontAgain("ed"));
        assertTrue(string.frontAgain("jj"));
        assertTrue(string.frontAgain("jjj"));
        assertTrue(string.frontAgain("jjjj"));
        assertFalse(string.frontAgain("jjjk"));
        assertFalse(string.frontAgain("x"));
        assertFalse(string.frontAgain(""));
        assertFalse(string.frontAgain("java"));
        assertTrue(string.frontAgain("javaja"));
    }

    @Test
    public void testMinCat() {
        assertEquals("loHi", string.minCat("Hello", "Hi"));
        assertEquals("ellojava", string.minCat("Hello", "java"));
        assertEquals("javaello", string.minCat("java", "Hello"));
        assertEquals("cx", string.minCat("abc", "x"));
        assertEquals("xc", string.minCat("x", "abc"));
        assertEquals("", string.minCat("abc", ""));
    }

    @Test
    public void testExtraFront() {
        assertEquals("HeHeHe", string.extraFront("Hello"));
        assertEquals("ababab", string.extraFront("ab"));
        assertEquals("HHH", string.extraFront("H"));
        assertEquals("", string.extraFront(""));
        assertEquals("CaCaCa", string.extraFront("Candy"));
        assertEquals("CoCoCo", string.extraFront("Code"));
    }

    @Test
    public void testWithout2() {
        assertEquals("lloHe", string.without2("HelloHe"));
        assertEquals("HelloHi", string.without2("HelloHi"));
        assertEquals("", string.without2("Hi"));
        assertEquals("Chocolate", string.without2("Chocolate"));
        assertEquals("x", string.without2("xxx"));
        assertEquals("", string.without2("xx"));
        assertEquals("x", string.without2("x"));
        assertEquals("", string.without2(""));
        assertEquals("Fruits", string.without2("Fruits"));
    }

    @Test
    public void testDeFront() {
        assertEquals("llo", string.deFront("Hello"));
        assertEquals("va", string.deFront("java"));
        assertEquals("aay", string.deFront("away"));
        assertEquals("ay", string.deFront("axy"));
        assertEquals("abc", string.deFront("abc"));
        assertEquals("by", string.deFront("xby"));
        assertEquals("ab", string.deFront("ab"));
        assertEquals("a", string.deFront("ax"));
        assertEquals("ab", string.deFront("axb"));
        assertEquals("aa", string.deFront("aaa"));
        assertEquals("bc", string.deFront("xbc"));
        assertEquals("bb", string.deFront("bbb"));
        assertEquals("zz", string.deFront("bazz"));
        assertEquals("", string.deFront("ba"));
        assertEquals("abxyz", string.deFront("abxyz"));
        assertEquals("", string.deFront("hi"));
        assertEquals("s", string.deFront("his"));
        assertEquals("", string.deFront("xz"));
        assertEquals("z", string.deFront("zzz"));
    }

    @Test
    public void testStartWord() {
        assertEquals("hi", string.startWord("hippo", "hi"));
        assertEquals("hip", string.startWord("hippo", "xip"));
        assertEquals("h", string.startWord("hippo", "i"));
        assertEquals("", string.startWord("hippo", "ix"));
        assertEquals("", string.startWord("h", "ix"));
        assertEquals("", string.startWord("", "i"));
        assertEquals("hi", string.startWord("hip", "zi"));
        assertEquals("hip", string.startWord("hip", "zip"));
        assertEquals("", string.startWord("hip", "zig"));
        assertEquals("h", string.startWord("h", "z"));
        assertEquals("hippo", string.startWord("hippo", "xippo"));
        assertEquals("", string.startWord("hippo", "xyz"));
        assertEquals("hip", string.startWord("hippo", "hip"));
        assertEquals("kit", string.startWord("kitten", "cit"));
        assertEquals("kit", string.startWord("kit", "cit"));
    }

    @Test
    public void testWithoutX() {
        assertEquals("Hi", string.withoutX("xHix"));
        assertEquals("Hi", string.withoutX("xHi"));
        assertEquals("Hxi", string.withoutX("Hxix"));
        assertEquals("Hi", string.withoutX("Hi"));
        assertEquals("xHi", string.withoutX("xxHi"));
        assertEquals("Hi", string.withoutX("Hix"));
        assertEquals("axb", string.withoutX("xaxbx"));
        assertEquals("", string.withoutX("xx"));
        assertEquals("", string.withoutX("x"));
        assertEquals("", string.withoutX(""));
        assertEquals("Hello", string.withoutX("Hello"));
        assertEquals("Hexllo", string.withoutX("Hexllo"));
    }

    @Test
    public void testWithoutX2() {
        assertEquals("Hi", string.withoutX2("xHi"));
        assertEquals("Hi", string.withoutX2("Hxi"));
        assertEquals("Hi", string.withoutX2("Hi"));
        assertEquals("Hi", string.withoutX2("xxHi"));
        assertEquals("Hix", string.withoutX2("Hix"));
        assertEquals("axb", string.withoutX2("xaxb"));
        assertEquals("", string.withoutX2("xx"));
        assertEquals("", string.withoutX2("x"));
        assertEquals("", string.withoutX2(""));
        assertEquals("Hello", string.withoutX2("Hello"));
        assertEquals("Hexllo", string.withoutX2("Hexllo"));
        assertEquals("Hxllo", string.withoutX2("xHxllo"));
    }

}