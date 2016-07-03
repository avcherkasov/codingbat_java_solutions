package com.codingbat.solution.task.warmup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * WarmUp2Test
 * <p>
 * Medium warmUp string/array loops (solutions available)
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Warmup-2
 */
public class WarmUp2Test {

    private WarmUp2 warmUp;

    @Before
    public void setUp() {
        warmUp = new WarmUp2();
    }

    @Test
    public void testStringTimes() {
        assertEquals("HiHi", warmUp.stringTimes("Hi", 2));
        assertEquals("HiHiHi", warmUp.stringTimes("Hi", 3));
        assertEquals("Hi", warmUp.stringTimes("Hi", 1));
        assertEquals("", warmUp.stringTimes("Hi", 0));
        assertEquals("HiHiHiHiHi", warmUp.stringTimes("Hi", 5));
        assertEquals("Oh Boy!Oh Boy!", warmUp.stringTimes("Oh Boy!", 2));
        assertEquals("xxxx", warmUp.stringTimes("x", 4));
        assertEquals("", warmUp.stringTimes("", 4));
        assertEquals("codecode", warmUp.stringTimes("code", 2));
        assertEquals("codecodecode", warmUp.stringTimes("code", 3));
    }

    @Test
    public void testFrontTimes() {
        assertEquals("ChoCho", warmUp.frontTimes("Chocolate", 2));
        assertEquals("ChoChoCho", warmUp.frontTimes("Chocolate", 3));
        assertEquals("AbcAbcAbc", warmUp.frontTimes("Abc", 3));
        assertEquals("AbAbAbAb", warmUp.frontTimes("Ab", 4));
        assertEquals("AAAA", warmUp.frontTimes("A", 4));
        assertEquals("", warmUp.frontTimes("", 4));
        assertEquals("", warmUp.frontTimes("Abc", 0));
    }

    @Test
    public void testStringBits() {
        assertEquals("Hlo", warmUp.stringBits("Hello"));
        assertEquals("H", warmUp.stringBits("Hi"));
        assertEquals("Hello", warmUp.stringBits("Heeololeo"));
        assertEquals("HHH", warmUp.stringBits("HiHiHi"));
        assertEquals("", warmUp.stringBits(""));
        assertEquals("Getns", warmUp.stringBits("Greetings"));
        assertEquals("Coot", warmUp.stringBits("Chocoate"));
        assertEquals("p", warmUp.stringBits("pi"));
        assertEquals("HloKte", warmUp.stringBits("Hello Kitten"));
        assertEquals("happy", warmUp.stringBits("hxaxpxpxy"));
    }

    @Test
    public void testStringSplosion() {
        assertEquals("CCoCodCode", warmUp.stringSplosion("Code"));
        assertEquals("aababc", warmUp.stringSplosion("abc"));
        assertEquals("aab", warmUp.stringSplosion("ab"));
        assertEquals("x", warmUp.stringSplosion("x"));
        assertEquals("ffafadfade", warmUp.stringSplosion("fade"));
        assertEquals("TThTheTherThere", warmUp.stringSplosion("There"));
        assertEquals("KKiKitKittKitteKitten", warmUp.stringSplosion("Kitten"));
        assertEquals("BByBye", warmUp.stringSplosion("Bye"));
        assertEquals("GGoGooGood", warmUp.stringSplosion("Good"));
        assertEquals("BBaBad", warmUp.stringSplosion("Bad"));
    }

    @Test
    public void testLast2() {
        assertEquals(1, warmUp.last2("hixxhi"));
        assertEquals(1, warmUp.last2("xaxxaxaxx"));
        assertEquals(2, warmUp.last2("axxxaaxx"));
        assertEquals(3, warmUp.last2("xxaxxaxxaxx"));
        assertEquals(0, warmUp.last2("xaxaxaxx"));
        assertEquals(2, warmUp.last2("xxxx"));
        assertEquals(1, warmUp.last2("13121312"));
        assertEquals(1, warmUp.last2("11212"));
        assertEquals(0, warmUp.last2("13121311"));
        assertEquals(2, warmUp.last2("1717171"));
        assertEquals(0, warmUp.last2("hi"));
        assertEquals(0, warmUp.last2("h"));
        assertEquals(0, warmUp.last2(""));
    }

    @Test
    public void testArrayCount9() {
        assertEquals(1, warmUp.arrayCount9(new int[]{1, 2, 9}));
        assertEquals(2, warmUp.arrayCount9(new int[]{1, 9, 9}));
        assertEquals(3, warmUp.arrayCount9(new int[]{1, 9, 9, 3, 9}));
        assertEquals(0, warmUp.arrayCount9(new int[]{1, 2, 3}));
        assertEquals(0, warmUp.arrayCount9(new int[]{}));
        assertEquals(0, warmUp.arrayCount9(new int[]{4, 2, 4, 3, 1}));
        assertEquals(1, warmUp.arrayCount9(new int[]{9, 2, 4, 3, 1}));
    }

    @Test
    public void testArrayFront9() {
        assertTrue(warmUp.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        assertFalse(warmUp.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        assertFalse(warmUp.arrayFront9(new int[]{1, 2, 3, 4, 5}));
        assertTrue(warmUp.arrayFront9(new int[]{9, 2, 3}));
        assertTrue(warmUp.arrayFront9(new int[]{1, 9, 9}));
        assertFalse(warmUp.arrayFront9(new int[]{1, 2, 3}));
        assertTrue(warmUp.arrayFront9(new int[]{1, 9}));
        assertFalse(warmUp.arrayFront9(new int[]{5, 5}));
        assertFalse(warmUp.arrayFront9(new int[]{2}));
        assertTrue(warmUp.arrayFront9(new int[]{9}));
        assertFalse(warmUp.arrayFront9(new int[]{}));
        assertTrue(warmUp.arrayFront9(new int[]{3, 9, 2, 3, 3}));
    }

    @Test
    public void testArray123() {
        assertTrue(warmUp.array123(new int[]{1, 1, 2, 3, 1}));
        assertFalse(warmUp.array123(new int[]{1, 1, 2, 4, 1}));
        assertTrue(warmUp.array123(new int[]{1, 1, 2, 1, 2, 3}));
        assertFalse(warmUp.array123(new int[]{1, 1, 2, 1, 2, 1}));
        assertTrue(warmUp.array123(new int[]{1, 2, 3, 1, 2, 3}));
        assertTrue(warmUp.array123(new int[]{1, 2, 3}));
        assertFalse(warmUp.array123(new int[]{1, 1, 1}));
        assertFalse(warmUp.array123(new int[]{1, 2}));
        assertFalse(warmUp.array123(new int[]{1}));
        assertFalse(warmUp.array123(new int[]{}));
    }

    @Test
    public void testStringMatch() {
        assertEquals(3, warmUp.stringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2, warmUp.stringMatch("abc", "abc"));
        assertEquals(0, warmUp.stringMatch("abc", "axc"));
        assertEquals(1, warmUp.stringMatch("hello", "he"));
        assertEquals(1, warmUp.stringMatch("he", "hello"));
        assertEquals(0, warmUp.stringMatch("h", "hello"));
        assertEquals(0, warmUp.stringMatch("", "hello"));
        assertEquals(1, warmUp.stringMatch("aabbccdd", "abbbxxd"));
        assertEquals(3, warmUp.stringMatch("aaxxaaxx", "iaxxai"));
        assertEquals(3, warmUp.stringMatch("iaxxai", "aaxxaaxx"));
    }

    @Test
    public void testStringX() {
        assertEquals("xHix", warmUp.stringX("xxHxix"));
        assertEquals("abcd", warmUp.stringX("abxxxcd"));
        assertEquals("xabcdx", warmUp.stringX("xabxxxcdx"));
        assertEquals("xKittenx", warmUp.stringX("xKittenx"));
        assertEquals("Hello", warmUp.stringX("Hello"));
        assertEquals("xx", warmUp.stringX("xx"));
        assertEquals("x", warmUp.stringX("x"));
        assertEquals("", warmUp.stringX(""));
    }

    @Test
    public void testAltPairs() {
        assertEquals("kien", warmUp.altPairs("kitten"));
        assertEquals("Chole", warmUp.altPairs("Chocolate"));
        assertEquals("Congrr", warmUp.altPairs("CodingHorror"));
        assertEquals("ya", warmUp.altPairs("yak"));
        assertEquals("ya", warmUp.altPairs("ya"));
        assertEquals("y", warmUp.altPairs("y"));
        assertEquals("", warmUp.altPairs(""));
        assertEquals("ThThThth", warmUp.altPairs("ThisThatTheOther"));
    }

    @Test
    public void testStringYak() {
        assertEquals("pak", warmUp.stringYak("yakpak"));
        assertEquals("pak", warmUp.stringYak("pakyak"));
        assertEquals("123ya", warmUp.stringYak("yak123ya"));
        assertEquals("", warmUp.stringYak("yak"));
        assertEquals("xxx", warmUp.stringYak("yakxxxyak"));
        assertEquals("HiHi", warmUp.stringYak("HiyakHi"));
        assertEquals("xxxyyzzz", warmUp.stringYak("xxxyakyyyakzzz"));
    }

    @Test
    public void testArray667() {
        assertEquals(1, warmUp.array667(new int[]{6, 6, 2}));
        assertEquals(1, warmUp.array667(new int[]{6, 6, 2, 6}));
        assertEquals(1, warmUp.array667(new int[]{6, 7, 2, 6}));
        assertEquals(2, warmUp.array667(new int[]{6, 6, 2, 6, 7}));
        assertEquals(0, warmUp.array667(new int[]{1, 6, 3}));
        assertEquals(0, warmUp.array667(new int[]{6, 1}));
        assertEquals(0, warmUp.array667(new int[]{}));
        assertEquals(1, warmUp.array667(new int[]{3, 6, 7, 6}));
        assertEquals(2, warmUp.array667(new int[]{3, 6, 6, 7}));
        assertEquals(1, warmUp.array667(new int[]{6, 3, 6, 6}));
        assertEquals(2, warmUp.array667(new int[]{6, 7, 6, 6}));
        assertEquals(0, warmUp.array667(new int[]{1, 2, 3, 5, 6}));
        assertEquals(1, warmUp.array667(new int[]{1, 2, 3, 6, 6}));
    }

    @Test
    public void testNoTriples() {
        assertTrue(warmUp.noTriples(new int[]{1, 1, 2, 2, 1}));
        assertFalse(warmUp.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        assertFalse(warmUp.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
        assertTrue(warmUp.noTriples(new int[]{1, 1, 2, 2, 1, 2, 1}));
        assertTrue(warmUp.noTriples(new int[]{1, 2, 1}));
        assertFalse(warmUp.noTriples(new int[]{1, 1, 1}));
        assertTrue(warmUp.noTriples(new int[]{1, 1}));
        assertTrue(warmUp.noTriples(new int[]{1}));
        assertTrue(warmUp.noTriples(new int[]{}));
    }

    @Test
    public void testHas271() {
        assertTrue(warmUp.has271(new int[]{1, 2, 7, 1}));
        assertFalse(warmUp.has271(new int[]{1, 2, 8, 1}));
        assertTrue(warmUp.has271(new int[]{2, 7, 1}));
        assertTrue(warmUp.has271(new int[]{3, 8, 2}));
        assertTrue(warmUp.has271(new int[]{2, 7, 3}));
        assertFalse(warmUp.has271(new int[]{2, 7, 4}));
        assertTrue(warmUp.has271(new int[]{2, 7, -1}));
        assertFalse(warmUp.has271(new int[]{2, 7, -2}));
        assertTrue(warmUp.has271(new int[]{4, 5, 3, 8, 0}));
        assertTrue(warmUp.has271(new int[]{2, 7, 5, 10, 4}));
        assertTrue(warmUp.has271(new int[]{2, 7, -2, 4, 9, 3}));
        assertFalse(warmUp.has271(new int[]{2, 7, 5, 10, 1}));
        assertFalse(warmUp.has271(new int[]{2, 7, -2, 4, 10, 2}));
    }

}