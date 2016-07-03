package com.codingbat.solution.task.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Logic1Test
 * <p>
 * Basic boolean logic puzzles -- if else && || !.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Logic-1
 */
public class Logic1Test {

    private Logic1 logic;

    @Before
    public void setUp() {
        logic = new Logic1();
    }

    @Test
    public void testMaxSpan() {
        assertFalse("1", logic.cigarParty(30, false));
        assertTrue("2", logic.cigarParty(50, false));
        assertTrue("3", logic.cigarParty(70, true));
        assertFalse("4", logic.cigarParty(30, true));
        assertTrue("5", logic.cigarParty(50, true));
        assertTrue("6", logic.cigarParty(60, false));
        assertFalse("7", logic.cigarParty(61, false));
        assertTrue("8", logic.cigarParty(40, false));
        assertFalse("9", logic.cigarParty(39, false));
        assertTrue("10", logic.cigarParty(40, true));
        assertFalse("11", logic.cigarParty(39, true));
    }

    @Test
    public void testDateFashion() {
        assertEquals(2, logic.dateFashion(5, 10));
        assertEquals(0, logic.dateFashion(5, 2));
        assertEquals(1, logic.dateFashion(5, 5));
        assertEquals(1, logic.dateFashion(3, 3));
        assertEquals(0, logic.dateFashion(10, 2));
        assertEquals(0, logic.dateFashion(2, 9));
        assertEquals(2, logic.dateFashion(9, 9));
        assertEquals(2, logic.dateFashion(10, 5));
        assertEquals(0, logic.dateFashion(2, 2));
        assertEquals(1, logic.dateFashion(3, 7));
        assertEquals(0, logic.dateFashion(2, 7));
        assertEquals(0, logic.dateFashion(6, 2));
    }

    @Test
    public void testSquirrelPlay() {
        assertTrue(logic.squirrelPlay(70, false));
        assertFalse(logic.squirrelPlay(95, false));
        assertTrue(logic.squirrelPlay(95, true));
        assertTrue(logic.squirrelPlay(90, false));
        assertTrue(logic.squirrelPlay(90, true));
        assertFalse(logic.squirrelPlay(50, false));
        assertFalse(logic.squirrelPlay(50, true));
        assertFalse(logic.squirrelPlay(100, false));
        assertTrue(logic.squirrelPlay(100, true));
        assertFalse(logic.squirrelPlay(105, true));
        assertFalse(logic.squirrelPlay(59, false));
        assertFalse(logic.squirrelPlay(59, true));
        assertTrue(logic.squirrelPlay(60, false));
    }

    @Test
    public void testCaughtSpeeding() {
        assertEquals(0, logic.caughtSpeeding(60, false));
        assertEquals(1, logic.caughtSpeeding(65, false));
        assertEquals(0, logic.caughtSpeeding(65, true));
        assertEquals(1, logic.caughtSpeeding(80, false));
        assertEquals(2, logic.caughtSpeeding(85, false));
        assertEquals(1, logic.caughtSpeeding(85, true));
        assertEquals(1, logic.caughtSpeeding(70, false));
        assertEquals(1, logic.caughtSpeeding(75, false));
        assertEquals(1, logic.caughtSpeeding(75, true));
        assertEquals(0, logic.caughtSpeeding(40, false));
        assertEquals(0, logic.caughtSpeeding(40, true));
        assertEquals(2, logic.caughtSpeeding(90, false));
    }

    @Test
    public void testSortaSum() {
        assertEquals(7, logic.sortaSum(3, 4));
        assertEquals(20, logic.sortaSum(9, 4));
        assertEquals(21, logic.sortaSum(10, 11));
        assertEquals(9, logic.sortaSum(12, -3));
        assertEquals(9, logic.sortaSum(-3, 12));
        assertEquals(9, logic.sortaSum(4, 5));
        assertEquals(20, logic.sortaSum(4, 6));
        assertEquals(21, logic.sortaSum(14, 7));
        assertEquals(20, logic.sortaSum(14, 6));
    }

    @Test
    public void testAlarmClock() {
        assertEquals("7:00", logic.alarmClock(1, false));
        assertEquals("7:00", logic.alarmClock(5, false));
        assertEquals("10:00", logic.alarmClock(0, false));
        assertEquals("10:00", logic.alarmClock(6, false));
        assertEquals("off", logic.alarmClock(0, true));
        assertEquals("off", logic.alarmClock(6, true));
        assertEquals("10:00", logic.alarmClock(1, true));
        assertEquals("10:00", logic.alarmClock(3, true));
        assertEquals("10:00", logic.alarmClock(5, true));
    }

    @Test
    public void testLove6() {
        assertTrue(logic.love6(6, 4));
        assertFalse(logic.love6(4, 5));
        assertTrue(logic.love6(1, 5));
        assertTrue(logic.love6(1, 6));
        assertFalse(logic.love6(1, 8));
        assertTrue(logic.love6(1, 7));
        assertFalse(logic.love6(7, 5));
        assertTrue(logic.love6(8, 2));
        assertTrue(logic.love6(6, 6));
        assertFalse(logic.love6(-6, 2));
        assertTrue(logic.love6(-4, -10));
        assertFalse(logic.love6(-7, 1));
        assertTrue(logic.love6(7, -1));
        assertTrue(logic.love6(-6, 12));
        assertFalse(logic.love6(-2, -4));
        assertTrue(logic.love6(7, 1));
        assertFalse(logic.love6(0, 9));
        assertFalse(logic.love6(8, 3));
        assertTrue(logic.love6(3, 3));
        assertFalse(logic.love6(3, 4));
    }

    @Test
    public void testIn1To10() {
        assertTrue(logic.in1To10(5, false));
        assertFalse(logic.in1To10(11, false));
        assertTrue(logic.in1To10(11, true));
        assertTrue(logic.in1To10(10, false));
        assertTrue(logic.in1To10(10, true));
        assertTrue(logic.in1To10(9, false));
        assertFalse(logic.in1To10(9, true));
        assertTrue(logic.in1To10(1, false));
        assertTrue(logic.in1To10(1, true));
        assertFalse(logic.in1To10(0, false));
        assertTrue(logic.in1To10(0, true));
        assertFalse(logic.in1To10(-1, false));
    }

    @Test
    public void testSpecialEleven() {
        assertTrue(logic.specialEleven(22));
        assertTrue(logic.specialEleven(23));
        assertFalse(logic.specialEleven(24));
        assertFalse(logic.specialEleven(21));
        assertTrue(logic.specialEleven(11));
        assertTrue(logic.specialEleven(12));
        assertFalse(logic.specialEleven(10));
        assertFalse(logic.specialEleven(9));
        assertFalse(logic.specialEleven(8));
        assertTrue(logic.specialEleven(0));
        assertTrue(logic.specialEleven(1));
        assertFalse(logic.specialEleven(2));
        assertTrue(logic.specialEleven(121));
        assertTrue(logic.specialEleven(122));
        assertFalse(logic.specialEleven(123));
        assertFalse(logic.specialEleven(46));
        assertFalse(logic.specialEleven(49));
        assertFalse(logic.specialEleven(52));
        assertFalse(logic.specialEleven(54));
        assertTrue(logic.specialEleven(55));
    }

    @Test
    public void testMore20() {
        assertFalse(logic.more20(20));
        assertTrue(logic.more20(21));
        assertTrue(logic.more20(22));
        assertFalse(logic.more20(23));
        assertFalse(logic.more20(25));
        assertFalse(logic.more20(30));
        assertFalse(logic.more20(31));
        assertFalse(logic.more20(59));
        assertFalse(logic.more20(60));
        assertTrue(logic.more20(61));
        assertTrue(logic.more20(62));
        assertFalse(logic.more20(1020));
        assertTrue(logic.more20(1021));
        assertFalse(logic.more20(1000));
        assertTrue(logic.more20(1001));
        assertFalse(logic.more20(50));
        assertFalse(logic.more20(55));
        assertFalse(logic.more20(40));
        assertTrue(logic.more20(41));
        assertFalse(logic.more20(39));
        assertTrue(logic.more20(42));
    }

    @Test
    public void testOld35() {
        assertTrue(logic.old35(3));
        assertTrue(logic.old35(10));
        assertFalse(logic.old35(15));
        assertTrue(logic.old35(5));
        assertTrue(logic.old35(9));
        assertFalse(logic.old35(8));
        assertFalse(logic.old35(7));
        assertTrue(logic.old35(6));
        assertFalse(logic.old35(17));
        assertTrue(logic.old35(18));
        assertFalse(logic.old35(29));
        assertTrue(logic.old35(20));
        assertTrue(logic.old35(21));
        assertFalse(logic.old35(22));
        assertFalse(logic.old35(45));
        assertTrue(logic.old35(99));
    }

    @Test
    public void testLess20() {
        assertTrue(logic.less20(18));
        assertTrue(logic.less20(19));
        assertFalse(logic.less20(20));
        assertFalse(logic.less20(8));
        assertFalse(logic.less20(17));
        assertFalse(logic.less20(23));
        assertFalse(logic.less20(25));
        assertFalse(logic.less20(30));
        assertFalse(logic.less20(31));
        assertTrue(logic.less20(58));
        assertTrue(logic.less20(59));
        assertFalse(logic.less20(60));
        assertFalse(logic.less20(61));
        assertFalse(logic.less20(62));
        assertFalse(logic.less20(1017));
        assertTrue(logic.less20(1018));
        assertTrue(logic.less20(1019));
        assertFalse(logic.less20(1020));
        assertFalse(logic.less20(1021));
        assertFalse(logic.less20(1022));
        assertFalse(logic.less20(1023));
        assertFalse(logic.less20(37));
    }

    @Test
    public void testNearTen() {
        assertTrue(logic.nearTen(12));
        assertFalse(logic.nearTen(17));
        assertTrue(logic.nearTen(19));
        assertTrue(logic.nearTen(31));
        assertFalse(logic.nearTen(6));
        assertTrue(logic.nearTen(10));
        assertTrue(logic.nearTen(11));
        assertTrue(logic.nearTen(21));
        assertTrue(logic.nearTen(22));
        assertFalse(logic.nearTen(23));
        assertFalse(logic.nearTen(54));
        assertFalse(logic.nearTen(155));
        assertTrue(logic.nearTen(158));
        assertFalse(logic.nearTen(3));
        assertTrue(logic.nearTen(1));
    }

    @Test
    public void testTeenSum() {
        assertEquals(7, logic.teenSum(3, 4));
        assertEquals(19, logic.teenSum(10, 13));
        assertEquals(19, logic.teenSum(13, 2));
        assertEquals(19, logic.teenSum(3, 19));
        assertEquals(19, logic.teenSum(13, 13));
        assertEquals(20, logic.teenSum(10, 10));
        assertEquals(19, logic.teenSum(6, 14));
        assertEquals(19, logic.teenSum(15, 2));
        assertEquals(19, logic.teenSum(19, 19));
        assertEquals(19, logic.teenSum(19, 20));
        assertEquals(19, logic.teenSum(2, 18));
        assertEquals(16, logic.teenSum(12, 4));
        assertEquals(22, logic.teenSum(2, 20));
        assertEquals(19, logic.teenSum(2, 17));
        assertEquals(19, logic.teenSum(2, 16));
        assertEquals(13, logic.teenSum(6, 7));
    }

    @Test
    public void testAnswerCell() {
        assertTrue(logic.answerCell(false, false, false));
        assertFalse(logic.answerCell(false, false, true));
        assertFalse(logic.answerCell(true, false, false));
        assertTrue(logic.answerCell(true, true, false));
        assertTrue(logic.answerCell(false, true, false));
        assertFalse(logic.answerCell(true, true, true));
    }

    @Test
    public void testTeaParty() {
        assertEquals(1, logic.teaParty(6, 8));
        assertEquals(0, logic.teaParty(3, 8));
        assertEquals(2, logic.teaParty(20, 6));
        assertEquals(2, logic.teaParty(12, 6));
        assertEquals(1, logic.teaParty(11, 6));
        assertEquals(0, logic.teaParty(11, 4));
        assertEquals(0, logic.teaParty(4, 5));
        assertEquals(1, logic.teaParty(5, 5));
        assertEquals(1, logic.teaParty(6, 6));
        assertEquals(2, logic.teaParty(5, 10));
        assertEquals(1, logic.teaParty(5, 9));
        assertEquals(0, logic.teaParty(10, 4));
        assertEquals(2, logic.teaParty(10, 20));
    }

    @Test
    public void testFizzString() {
        assertEquals("Fizz", logic.fizzString("fig"));
        assertEquals("Buzz", logic.fizzString("dib"));
        assertEquals("FizzBuzz", logic.fizzString("fib"));
        assertEquals("abc", logic.fizzString("abc"));
        assertEquals("Fizz", logic.fizzString("fooo"));
        assertEquals("booo", logic.fizzString("booo"));
        assertEquals("Buzz", logic.fizzString("ooob"));
        assertEquals("FizzBuzz", logic.fizzString("fooob"));
        assertEquals("Fizz", logic.fizzString("f"));
        assertEquals("Buzz", logic.fizzString("b"));
        assertEquals("Buzz", logic.fizzString("abcb"));
        assertEquals("Hello", logic.fizzString("Hello"));
        assertEquals("Buzz", logic.fizzString("Hellob"));
        assertEquals("af", logic.fizzString("af"));
        assertEquals("bf", logic.fizzString("bf"));
        assertEquals("FizzBuzz", logic.fizzString("fb"));
    }

    @Test
    public void testFizzString2() {
        assertEquals("1!", logic.fizzString2(1));
        assertEquals("2!", logic.fizzString2(2));
        assertEquals("Fizz!", logic.fizzString2(3));
        assertEquals("4!", logic.fizzString2(4));
        assertEquals("Buzz!", logic.fizzString2(5));
        assertEquals("Fizz!", logic.fizzString2(6));
        assertEquals("7!", logic.fizzString2(7));
        assertEquals("8!", logic.fizzString2(8));
        assertEquals("Fizz!", logic.fizzString2(9));
        assertEquals("FizzBuzz!", logic.fizzString2(15));
        assertEquals("16!", logic.fizzString2(16));
        assertEquals("Fizz!", logic.fizzString2(18));
        assertEquals("19!", logic.fizzString2(19));
        assertEquals("Fizz!", logic.fizzString2(21));
        assertEquals("44!", logic.fizzString2(44));
        assertEquals("FizzBuzz!", logic.fizzString2(45));
        assertEquals("Buzz!", logic.fizzString2(100));
    }

    @Test
    public void testTwoAsOne() {
        assertTrue(logic.twoAsOne(1, 2, 3));
        assertTrue(logic.twoAsOne(3, 1, 2));
        assertFalse(logic.twoAsOne(3, 2, 2));
        assertTrue(logic.twoAsOne(2, 3, 1));
        assertTrue(logic.twoAsOne(5, 3, -2));
        assertFalse(logic.twoAsOne(5, 3, -3));
        assertTrue(logic.twoAsOne(2, 5, 3));
        assertFalse(logic.twoAsOne(9, 5, 5));
        assertTrue(logic.twoAsOne(9, 4, 5));
        assertTrue(logic.twoAsOne(5, 4, 9));
        assertTrue(logic.twoAsOne(3, 3, 0));
        assertFalse(logic.twoAsOne(3, 3, 2));
    }

    @Test
    public void testInOrder() {
        assertTrue(logic.inOrder(1, 2, 4, false));
        assertFalse(logic.inOrder(1, 2, 1, false));
        assertTrue(logic.inOrder(1, 1, 2, true));
        assertFalse(logic.inOrder(3, 2, 4, false));
        assertTrue(logic.inOrder(2, 3, 4, false));
        assertTrue(logic.inOrder(3, 2, 4, true));
        assertFalse(logic.inOrder(4, 2, 2, true));
        assertFalse(logic.inOrder(4, 5, 2, true));
        assertTrue(logic.inOrder(2, 4, 6, true));
        assertTrue(logic.inOrder(7, 9, 10, false));
        assertTrue(logic.inOrder(7, 5, 6, true));
        assertFalse(logic.inOrder(7, 5, 4, true));
    }

    @Test
    public void testInOrderEqual() {
        assertTrue(logic.inOrderEqual(2, 5, 11, false));
        assertFalse(logic.inOrderEqual(5, 7, 6, false));
        assertTrue(logic.inOrderEqual(5, 5, 7, true));
        assertFalse(logic.inOrderEqual(5, 5, 7, false));
        assertFalse(logic.inOrderEqual(2, 5, 4, false));
        assertFalse(logic.inOrderEqual(3, 4, 3, false));
        assertFalse(logic.inOrderEqual(3, 4, 4, false));
        assertFalse(logic.inOrderEqual(3, 4, 3, true));
        assertTrue(logic.inOrderEqual(3, 4, 4, true));
        assertTrue(logic.inOrderEqual(1, 5, 5, true));
        assertTrue(logic.inOrderEqual(5, 5, 5, true));
        assertFalse(logic.inOrderEqual(2, 2, 1, true));
        assertFalse(logic.inOrderEqual(9, 2, 2, true));
        assertFalse(logic.inOrderEqual(0, 1, 0, true));
    }

    @Test
    public void testLastDigit() {
        assertTrue(logic.lastDigit(23, 19, 13));
        assertFalse(logic.lastDigit(23, 19, 12));
        assertTrue(logic.lastDigit(23, 19, 3));
        assertTrue(logic.lastDigit(23, 19, 39));
        assertFalse(logic.lastDigit(1, 2, 3));
        assertTrue(logic.lastDigit(1, 1, 2));
        assertTrue(logic.lastDigit(1, 2, 2));
        assertFalse(logic.lastDigit(14, 25, 43));
        assertTrue(logic.lastDigit(14, 25, 45));
        assertFalse(logic.lastDigit(248, 106, 1002));
        assertTrue(logic.lastDigit(248, 106, 1008));
        assertTrue(logic.lastDigit(10, 11, 20));
        assertTrue(logic.lastDigit(0, 11, 0));
    }

    @Test
    public void testLessBy10() {
        assertTrue(logic.lessBy10(1, 7, 11));
        assertFalse(logic.lessBy10(1, 7, 10));
        assertTrue(logic.lessBy10(11, 1, 7));
        assertFalse(logic.lessBy10(10, 7, 1));
        assertTrue(logic.lessBy10(-10, 2, 2));
        assertFalse(logic.lessBy10(2, 11, 11));
        assertTrue(logic.lessBy10(3, 3, 30));
        assertFalse(logic.lessBy10(3, 3, 3));
        assertTrue(logic.lessBy10(10, 1, 11));
        assertTrue(logic.lessBy10(10, 11, 1));
        assertFalse(logic.lessBy10(10, 11, 2));
        assertTrue(logic.lessBy10(3, 30, 3));
        assertTrue(logic.lessBy10(2, 2, -8));
        assertTrue(logic.lessBy10(2, 8, 12));
    }

    @Test
    public void testWithoutDoubles() {
        assertEquals(5, logic.withoutDoubles(2, 3, true));
        assertEquals(7, logic.withoutDoubles(3, 3, true));
        assertEquals(6, logic.withoutDoubles(3, 3, false));
        assertEquals(5, logic.withoutDoubles(2, 3, false));
        assertEquals(9, logic.withoutDoubles(5, 4, true));
        assertEquals(9, logic.withoutDoubles(5, 4, false));
        assertEquals(11, logic.withoutDoubles(5, 5, true));
        assertEquals(10, logic.withoutDoubles(5, 5, false));
        assertEquals(7, logic.withoutDoubles(6, 6, true));
        assertEquals(12, logic.withoutDoubles(6, 6, false));
        assertEquals(7, logic.withoutDoubles(1, 6, true));
        assertEquals(7, logic.withoutDoubles(6, 1, false));
    }

    @Test
    public void testMaxMod5() {
        assertEquals(3, logic.maxMod5(2, 3));
        assertEquals(6, logic.maxMod5(6, 2));
        assertEquals(3, logic.maxMod5(3, 2));
        assertEquals(12, logic.maxMod5(8, 12));
        assertEquals(7, logic.maxMod5(7, 12));
        assertEquals(6, logic.maxMod5(11, 6));
        assertEquals(2, logic.maxMod5(2, 7));
        assertEquals(0, logic.maxMod5(7, 7));
        assertEquals(9, logic.maxMod5(9, 1));
        assertEquals(9, logic.maxMod5(9, 14));
        assertEquals(2, logic.maxMod5(1, 2));
    }

    @Test
    public void testRedTicket() {
        assertEquals(10, logic.redTicket(2, 2, 2));
        assertEquals(0, logic.redTicket(2, 2, 1));
        assertEquals(5, logic.redTicket(0, 0, 0));
        assertEquals(1, logic.redTicket(2, 0, 0));
        assertEquals(5, logic.redTicket(1, 1, 1));
        assertEquals(0, logic.redTicket(1, 2, 1));
        assertEquals(1, logic.redTicket(1, 2, 0));
        assertEquals(1, logic.redTicket(0, 2, 2));
        assertEquals(1, logic.redTicket(1, 2, 2));
        assertEquals(0, logic.redTicket(0, 2, 0));
        assertEquals(0, logic.redTicket(1, 1, 2));
    }

    @Test
    public void testGreenTicket() {
        assertEquals(0, logic.greenTicket(1, 2, 3));
        assertEquals(20, logic.greenTicket(2, 2, 2));
        assertEquals(10, logic.greenTicket(1, 1, 2));
        assertEquals(10, logic.greenTicket(2, 1, 1));
        assertEquals(10, logic.greenTicket(1, 2, 1));
        assertEquals(0, logic.greenTicket(3, 2, 1));
        assertEquals(20, logic.greenTicket(0, 0, 0));
        assertEquals(10, logic.greenTicket(2, 0, 0));
        assertEquals(0, logic.greenTicket(0, 9, 10));
        assertEquals(10, logic.greenTicket(0, 10, 0));
        assertEquals(20, logic.greenTicket(9, 9, 9));
        assertEquals(10, logic.greenTicket(9, 0, 9));
    }

    @Test
    public void testBlueTicket() {
        assertEquals(10, logic.blueTicket(9, 1, 0));
        assertEquals(0, logic.blueTicket(9, 2, 0));
        assertEquals(10, logic.blueTicket(6, 1, 4));
        assertEquals(0, logic.blueTicket(6, 1, 5));
        assertEquals(10, logic.blueTicket(10, 0, 0));
        assertEquals(5, logic.blueTicket(15, 0, 5));
        assertEquals(10, logic.blueTicket(5, 15, 5));
        assertEquals(5, logic.blueTicket(4, 11, 1));
        assertEquals(5, logic.blueTicket(13, 2, 3));
        assertEquals(0, logic.blueTicket(8, 4, 3));
        assertEquals(10, logic.blueTicket(8, 4, 2));
        assertEquals(0, logic.blueTicket(8, 4, 1));
    }

    @Test
    public void testShareDigit() {
        assertTrue(logic.shareDigit(12, 23));
        assertFalse(logic.shareDigit(12, 43));
        assertFalse(logic.shareDigit(12, 44));
        assertTrue(logic.shareDigit(23, 12));
        assertTrue(logic.shareDigit(23, 39));
        assertFalse(logic.shareDigit(23, 19));
        assertTrue(logic.shareDigit(30, 90));
        assertFalse(logic.shareDigit(30, 91));
        assertTrue(logic.shareDigit(55, 55));
        assertFalse(logic.shareDigit(55, 44));
    }

    @Test
    public void testSumLimit() {
        assertEquals(5, logic.sumLimit(2, 3));
        assertEquals(8, logic.sumLimit(8, 3));
        assertEquals(9, logic.sumLimit(8, 1));
        assertEquals(50, logic.sumLimit(11, 39));
        assertEquals(11, logic.sumLimit(11, 99));
        assertEquals(0, logic.sumLimit(0, 0));
        assertEquals(99, logic.sumLimit(99, 0));
        assertEquals(99, logic.sumLimit(99, 1));
        assertEquals(124, logic.sumLimit(123, 1));
        assertEquals(1, logic.sumLimit(1, 123));
        assertEquals(83, logic.sumLimit(23, 60));
        assertEquals(23, logic.sumLimit(23, 80));
        assertEquals(9001, logic.sumLimit(9000, 1));
        assertEquals(90000001, logic.sumLimit(90000000, 1));
        assertEquals(9000, logic.sumLimit(9000, 1000));
    }

}