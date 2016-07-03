package com.codingbat.solution.task.warmup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * WarmUp1Test
 * <p>
 * Simple warmUp problems to get started (solutions available).
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Warmup-1
 */
public class WarmUp1Test {

    private WarmUp1 warmUp;

    @Before
    public void setUp() {
        warmUp = new WarmUp1();
    }

    @Test
    public void testSleepIn() {
        assertTrue(warmUp.sleepIn(false, false));
        assertFalse(warmUp.sleepIn(true, false));
        assertTrue(warmUp.sleepIn(false, true));
        assertTrue(warmUp.sleepIn(true, true));
    }

    @Test
    public void testMonkeyTrouble() {
        assertTrue(warmUp.monkeyTrouble(true, true));
        assertTrue(warmUp.monkeyTrouble(false, false));
        assertFalse(warmUp.monkeyTrouble(true, false));
        assertFalse(warmUp.monkeyTrouble(false, true));
    }

    @Test
    public void testSumDouble() {
        assertEquals(3, warmUp.sumDouble(1, 2));
        assertEquals(5, warmUp.sumDouble(3, 2));
        assertEquals(8, warmUp.sumDouble(2, 2));
        assertEquals(-1, warmUp.sumDouble(-1, 0));
        assertEquals(12, warmUp.sumDouble(3, 3));
        assertEquals(0, warmUp.sumDouble(0, 0));
        assertEquals(1, warmUp.sumDouble(0, 1));
        assertEquals(7, warmUp.sumDouble(3, 4));
    }

    @Test
    public void testDiff21() {
        assertEquals(2, warmUp.diff21(19));
        assertEquals(11, warmUp.diff21(10));
        assertEquals(0, warmUp.diff21(21));
        assertEquals(2, warmUp.diff21(22));
        assertEquals(8, warmUp.diff21(25));
        assertEquals(18, warmUp.diff21(30));
        assertEquals(21, warmUp.diff21(0));
        assertEquals(20, warmUp.diff21(1));
        assertEquals(19, warmUp.diff21(2));
        assertEquals(22, warmUp.diff21(-1));
        assertEquals(23, warmUp.diff21(-2));
        assertEquals(58, warmUp.diff21(50));
    }

    @Test
    public void testParrotTrouble() {
        assertTrue(warmUp.parrotTrouble(true, 6));
        assertFalse(warmUp.parrotTrouble(true, 7));
        assertFalse(warmUp.parrotTrouble(false, 6));
        assertTrue(warmUp.parrotTrouble(true, 21));
        assertFalse(warmUp.parrotTrouble(false, 21));
        assertFalse(warmUp.parrotTrouble(false, 20));
        assertTrue(warmUp.parrotTrouble(true, 23));
        assertFalse(warmUp.parrotTrouble(false, 23));
        assertFalse(warmUp.parrotTrouble(true, 20));
        assertFalse(warmUp.parrotTrouble(false, 12));
    }

    @Test
    public void testMakes10() {
        assertTrue(warmUp.makes10(9, 10));
        assertFalse(warmUp.makes10(9, 9));
        assertTrue(warmUp.makes10(1, 9));
        assertTrue(warmUp.makes10(10, 1));
        assertTrue(warmUp.makes10(10, 10));
        assertTrue(warmUp.makes10(8, 2));
        assertFalse(warmUp.makes10(8, 3));
        assertTrue(warmUp.makes10(10, 42));
        assertTrue(warmUp.makes10(12, -2));
    }

    @Test
    public void testNear10() {
        assertTrue(warmUp.nearHundred(93));
        assertTrue(warmUp.nearHundred(90));
        assertFalse(warmUp.nearHundred(89));
        assertTrue(warmUp.nearHundred(110));
        assertFalse(warmUp.nearHundred(111));
        assertFalse(warmUp.nearHundred(121));
        assertFalse(warmUp.nearHundred(0));
        assertFalse(warmUp.nearHundred(5));
        assertTrue(warmUp.nearHundred(191));
        assertFalse(warmUp.nearHundred(189));
        assertTrue(warmUp.nearHundred(190));
        assertTrue(warmUp.nearHundred(200));
        assertTrue(warmUp.nearHundred(210));
        assertFalse(warmUp.nearHundred(211));
        assertFalse(warmUp.nearHundred(290));
    }

    @Test
    public void testPosNeg() {
        assertTrue(warmUp.posNeg(1, -1, false));
        assertTrue(warmUp.posNeg(-1, 1, false));
        assertTrue(warmUp.posNeg(-4, -5, true));
        assertFalse(warmUp.posNeg(-4, -5, false));
        assertTrue(warmUp.posNeg(-4, 5, false));
        assertFalse(warmUp.posNeg(-4, 5, true));
        assertFalse(warmUp.posNeg(1, 1, false));
        assertFalse(warmUp.posNeg(-1, -1, false));
        assertFalse(warmUp.posNeg(1, -1, true));
        assertFalse(warmUp.posNeg(-1, 1, true));
        assertFalse(warmUp.posNeg(1, 1, true));
        assertTrue(warmUp.posNeg(-1, -1, true));
        assertTrue(warmUp.posNeg(5, -5, false));
        assertTrue(warmUp.posNeg(-6, 6, false));
        assertFalse(warmUp.posNeg(-5, -6, false));
        assertFalse(warmUp.posNeg(-2, -1, false));
        assertFalse(warmUp.posNeg(1, 2, false));
        assertFalse(warmUp.posNeg(-5, 6, true));
        assertTrue(warmUp.posNeg(-5, -5, true));
    }

    @Test
    public void testNotString() {
        assertEquals("not candy", warmUp.notString("candy"));
        assertEquals("not x", warmUp.notString("x"));
        assertEquals("not bad", warmUp.notString("not bad"));
        assertEquals("not bad", warmUp.notString("bad"));
        assertEquals("not", warmUp.notString("not"));
        assertEquals("not is not", warmUp.notString("is not"));
        assertEquals("not no", warmUp.notString("no"));
    }

    @Test
    public void testMissingChar() {
        assertEquals("ktten", warmUp.missingChar("kitten", 1));
        assertEquals("itten", warmUp.missingChar("kitten", 0));
        assertEquals("kittn", warmUp.missingChar("kitten", 4));
        assertEquals("i", warmUp.missingChar("Hi", 0));
        assertEquals("H", warmUp.missingChar("Hi", 1));
        assertEquals("ode", warmUp.missingChar("code", 0));
        assertEquals("cde", warmUp.missingChar("code", 1));
        assertEquals("coe", warmUp.missingChar("code", 2));
        assertEquals("cod", warmUp.missingChar("code", 3));
        assertEquals("chocolat", warmUp.missingChar("chocolate", 8));
    }

    @Test
    public void testFront3() {
        assertEquals("JavJavJav", warmUp.front3("Java"));
        assertEquals("ChoChoCho", warmUp.front3("Chocolate"));
        assertEquals("abcabcabc", warmUp.front3("abc"));
        assertEquals("abcabcabc", warmUp.front3("abcXYZ"));
        assertEquals("ababab", warmUp.front3("ab"));
        assertEquals("aaa", warmUp.front3("a"));
        assertEquals("", warmUp.front3(""));
    }

    @Test
    public void testFrontBack() {
        assertEquals("eodc", warmUp.frontBack("code"));
        assertEquals("a", warmUp.frontBack("a"));
        assertEquals("ba", warmUp.frontBack("ab"));
        assertEquals("cba", warmUp.frontBack("abc"));
        assertEquals("", warmUp.frontBack(""));
        assertEquals("ehocolatC", warmUp.frontBack("Chocolate"));
        assertEquals("Java", warmUp.frontBack("aavJ"));
        assertEquals("oellh", warmUp.frontBack("hello"));
    }

    @Test
    public void testBackAround() {
        assertEquals("tcatt", warmUp.backAround("cat"));
        assertEquals("oHelloo", warmUp.backAround("Hello"));
        assertEquals("aaa", warmUp.backAround("a"));
        assertEquals("cabcc", warmUp.backAround("abc"));
        assertEquals("dreadd", warmUp.backAround("read"));
        assertEquals("obooo", warmUp.backAround("boo"));
    }

    @Test
    public void testFront22() {
        assertEquals("kikittenki", warmUp.front22("kitten"));
        assertEquals("HaHaHa", warmUp.front22("Ha"));
        assertEquals("ababcab", warmUp.front22("abc"));
        assertEquals("ababab", warmUp.front22("ab"));
        assertEquals("aaa", warmUp.front22("a"));
        assertEquals("", warmUp.front22(""));
        assertEquals("LoLogicLo", warmUp.front22("Logic"));
    }

    @Test
    public void testStartHi() {
        assertTrue(warmUp.startHi("hi there"));
        assertTrue(warmUp.startHi("hi"));
        assertFalse(warmUp.startHi("hello hi"));
        assertFalse(warmUp.startHi("he"));
        assertFalse(warmUp.startHi("h"));
        assertFalse(warmUp.startHi(""));
        assertFalse(warmUp.startHi("ho hi"));
        assertTrue(warmUp.startHi("hi ho"));
    }

    @Test
    public void testIcyHot() {
        assertTrue(warmUp.icyHot(120, -1));
        assertTrue(warmUp.icyHot(-1, 120));
        assertFalse(warmUp.icyHot(2, 120));
        assertFalse(warmUp.icyHot(-1, 100));
        assertFalse(warmUp.icyHot(-2, -2));
        assertFalse(warmUp.icyHot(120, 120));
    }

    @Test
    public void testIn1020() {
        assertTrue(warmUp.in1020(12, 99));
        assertTrue(warmUp.in1020(21, 12));
        assertFalse(warmUp.in1020(8, 99));
        assertTrue(warmUp.in1020(99, 10));
        assertTrue(warmUp.in1020(20, 20));
        assertFalse(warmUp.in1020(21, 21));
        assertFalse(warmUp.in1020(9, 9));
    }

    @Test
    public void testHasTeen() {
        assertTrue(warmUp.hasTeen(13, 20, 10));
        assertTrue(warmUp.hasTeen(20, 19, 10));
        assertTrue(warmUp.hasTeen(20, 10, 13));
        assertFalse(warmUp.hasTeen(1, 20, 12));
        assertTrue(warmUp.hasTeen(19, 20, 12));
        assertTrue(warmUp.hasTeen(12, 20, 19));
        assertFalse(warmUp.hasTeen(12, 9, 20));
        assertTrue(warmUp.hasTeen(12, 18, 20));
        assertTrue(warmUp.hasTeen(14, 2, 20));
        assertFalse(warmUp.hasTeen(4, 2, 20));
        assertFalse(warmUp.hasTeen(11, 22, 22));
    }

    @Test
    public void testLoneTeen() {
        assertTrue(warmUp.loneTeen(13, 99));
        assertTrue(warmUp.loneTeen(21, 19));
        assertFalse(warmUp.loneTeen(13, 13));
        assertTrue(warmUp.loneTeen(14, 20));
        assertTrue(warmUp.loneTeen(20, 15));
        assertFalse(warmUp.loneTeen(16, 17));
        assertTrue(warmUp.loneTeen(16, 9));
        assertFalse(warmUp.loneTeen(16, 18));
        assertFalse(warmUp.loneTeen(13, 19));
        assertTrue(warmUp.loneTeen(13, 20));
        assertTrue(warmUp.loneTeen(6, 18));
        assertTrue(warmUp.loneTeen(99, 13));
        assertFalse(warmUp.loneTeen(99, 99));
    }

    @Test
    public void testDelDel() {
        assertEquals("abc", warmUp.delDel("adelbc"));
        assertEquals("aHello", warmUp.delDel("adelHello"));
        assertEquals("adedbc", warmUp.delDel("adedbc"));
        assertEquals("abcdel", warmUp.delDel("abcdel"));
        assertEquals("add", warmUp.delDel("add"));
        assertEquals("ad", warmUp.delDel("ad"));
        assertEquals("a", warmUp.delDel("a"));
        assertEquals("", warmUp.delDel(""));
        assertEquals("del", warmUp.delDel("del"));
        assertEquals("a", warmUp.delDel("adel"));
        assertEquals("aadelbb", warmUp.delDel("aadelbb"));
    }

    @Test
    public void testMixStart() {
        assertTrue(warmUp.mixStart("mix snacks"));
        assertTrue(warmUp.mixStart("pix snacks"));
        assertFalse(warmUp.mixStart("piz snacks"));
        assertTrue(warmUp.mixStart("nix"));
        assertFalse(warmUp.mixStart("ni"));
        assertFalse(warmUp.mixStart("n"));
        assertFalse(warmUp.mixStart(""));
    }

    @Test
    public void testStartOz() {
        assertEquals("oz", warmUp.startOz("ozymandias"));
        assertEquals("z", warmUp.startOz("bzoo"));
        assertEquals("o", warmUp.startOz("oxx"));
        assertEquals("oz", warmUp.startOz("oz"));
        assertEquals("o", warmUp.startOz("ounce"));
        assertEquals("o", warmUp.startOz("o"));
        assertEquals("", warmUp.startOz("abc"));
        assertEquals("", warmUp.startOz(""));
        assertEquals("", warmUp.startOz("zoo"));
        assertEquals("z", warmUp.startOz("aztec"));
        assertEquals("z", warmUp.startOz("zzzz"));
        assertEquals("oz", warmUp.startOz("oznic"));
    }

    @Test
    public void testIntMax() {
        assertEquals(3, warmUp.intMax(1, 2, 3));
        assertEquals(3, warmUp.intMax(1, 3, 2));
        assertEquals(3, warmUp.intMax(3, 2, 1));
        assertEquals(9, warmUp.intMax(9, 3, 3));
        assertEquals(9, warmUp.intMax(3, 9, 3));
        assertEquals(9, warmUp.intMax(3, 3, 9));
        assertEquals(8, warmUp.intMax(8, 2, 3));
        assertEquals(-1, warmUp.intMax(-3, -1, -2));
    }

    @Test
    public void testClose10() {
        assertEquals(8, warmUp.close10(8, 13));
        assertEquals(8, warmUp.close10(13, 8));
        assertEquals(0, warmUp.close10(13, 7));
        assertEquals(0, warmUp.close10(7, 13));
        assertEquals(5, warmUp.close10(5, 21));
        assertEquals(0, warmUp.close10(0, 20));
        assertEquals(0, warmUp.close10(10, 10));
    }

    @Test
    public void testIn3050() {
        assertTrue(warmUp.in3050(30, 31));
        assertFalse(warmUp.in3050(30, 41));
        assertTrue(warmUp.in3050(40, 50));
        assertFalse(warmUp.in3050(40, 51));
        assertFalse(warmUp.in3050(39, 50));
        assertFalse(warmUp.in3050(50, 39));
        assertTrue(warmUp.in3050(40, 39));
        assertTrue(warmUp.in3050(49, 48));
        assertTrue(warmUp.in3050(50, 40));
        assertFalse(warmUp.in3050(50, 51));
        assertTrue(warmUp.in3050(35, 36));
        assertFalse(warmUp.in3050(35, 45));
    }

    @Test
    public void testMax1020() {
        assertEquals(19, warmUp.max1020(11, 19));
        assertEquals(19, warmUp.max1020(19, 11));
        assertEquals(11, warmUp.max1020(11, 9));
        assertEquals(0, warmUp.max1020(9, 21));
        assertEquals(10, warmUp.max1020(10, 21));
        assertEquals(10, warmUp.max1020(21, 10));
        assertEquals(11, warmUp.max1020(9, 11));
        assertEquals(10, warmUp.max1020(23, 10));
        assertEquals(20, warmUp.max1020(20, 10));
        assertEquals(20, warmUp.max1020(7, 20));
        assertEquals(17, warmUp.max1020(17, 16));
    }

    @Test
    public void testStringE() {
        assertTrue(warmUp.stringE("Hello"));
        assertTrue(warmUp.stringE("Heelle"));
        assertFalse(warmUp.stringE("Heelele"));
        assertFalse(warmUp.stringE("Hll"));
        assertTrue(warmUp.stringE("e"));
        assertFalse(warmUp.stringE(""));
    }

    @Test
    public void testLastDigit() {
        assertTrue(warmUp.lastDigit(7, 17));
        assertFalse(warmUp.lastDigit(6, 17));
        assertTrue(warmUp.lastDigit(3, 113));
        assertFalse(warmUp.lastDigit(114, 113));
        assertTrue(warmUp.lastDigit(114, 4));
        assertTrue(warmUp.lastDigit(10, 0));
        assertFalse(warmUp.lastDigit(11, 0));
    }

    @Test
    public void testEndUp() {
        assertEquals("HeLLO", warmUp.endUp("Hello"));
        assertEquals("hi thERE", warmUp.endUp("hi there"));
        assertEquals("HI", warmUp.endUp("hi"));
        assertEquals("woo HOO", warmUp.endUp("woo hoo"));
        assertEquals("xyZ12", warmUp.endUp("xyz12"));
        assertEquals("X", warmUp.endUp("x"));
        assertEquals("", warmUp.endUp(""));
    }

    @Test
    public void testEveryNth() {
        assertEquals("Mrce", warmUp.everyNth("Miracle", 2));
        assertEquals("aceg", warmUp.everyNth("abcdefg", 2));
        assertEquals("adg", warmUp.everyNth("abcdefg", 3));
        assertEquals("Cca", warmUp.everyNth("Chocolate", 3));
        assertEquals("Ccas", warmUp.everyNth("Chocolates", 3));
        assertEquals("Coe", warmUp.everyNth("Chocolates", 4));
        assertEquals("C", warmUp.everyNth("Chocolates", 100));
    }

}