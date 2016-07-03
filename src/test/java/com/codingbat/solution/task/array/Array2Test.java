package com.codingbat.solution.task.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Array2Test
 * <p>
 * Medium array problems -- 1 loop.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Array-2
 */
public class Array2Test {

    private Array2 arr;

    @Before
    public void setUp() {
        arr = new Array2();
    }

    @Test
    public void testCountEvens() {
        assertEquals(3, arr.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, arr.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, arr.countEvens(new int[]{1, 3, 5}));
        assertEquals(0, arr.countEvens(new int[]{}));
        assertEquals(1, arr.countEvens(new int[]{11, 9, 0, 1}));
        assertEquals(2, arr.countEvens(new int[]{2, 11, 9, 0}));
        assertEquals(1, arr.countEvens(new int[]{2}));
        assertEquals(2, arr.countEvens(new int[]{2, 5, 12}));
    }

    @Test
    public void testBigDiff() {
        assertEquals(7, arr.bigDiff(new int[]{10, 3, 5, 6}));
        assertEquals(8, arr.bigDiff(new int[]{7, 2, 10, 9}));
        assertEquals(8, arr.bigDiff(new int[]{2, 10, 7, 2}));
        assertEquals(8, arr.bigDiff(new int[]{2, 10}));
        assertEquals(8, arr.bigDiff(new int[]{10, 2}));
        assertEquals(10, arr.bigDiff(new int[]{10, 0}));
        assertEquals(1, arr.bigDiff(new int[]{2, 3}));
        assertEquals(0, arr.bigDiff(new int[]{2, 2}));
        assertEquals(0, arr.bigDiff(new int[]{2}));
        assertEquals(8, arr.bigDiff(new int[]{5, 1, 6, 1, 9, 9}));
        assertEquals(3, arr.bigDiff(new int[]{7, 6, 8, 5}));
        assertEquals(3, arr.bigDiff(new int[]{7, 7, 6, 8, 5, 5, 6}));
    }

    @Test
    public void testCenteredAverage() {
        assertEquals(3, arr.centeredAverage(new int[]{1, 2, 3, 4, 100}));
        assertEquals(5, arr.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        assertEquals(-3, arr.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
        assertEquals(4, arr.centeredAverage(new int[]{5, 3, 4, 6, 2}));
        assertEquals(4, arr.centeredAverage(new int[]{5, 3, 4, 0, 100}));
        assertEquals(4, arr.centeredAverage(new int[]{100, 0, 5, 3, 4}));
        assertEquals(4, arr.centeredAverage(new int[]{4, 0, 100}));
        assertEquals(3, arr.centeredAverage(new int[]{0, 2, 3, 4, 100}));
        assertEquals(1, arr.centeredAverage(new int[]{1, 1, 100}));
        assertEquals(7, arr.centeredAverage(new int[]{7, 7, 7}));
        assertEquals(7, arr.centeredAverage(new int[]{1, 7, 8}));
        assertEquals(50, arr.centeredAverage(new int[]{1, 1, 99, 99}));
        assertEquals(50, arr.centeredAverage(new int[]{1000, 0, 1, 99}));
        assertEquals(4, arr.centeredAverage(new int[]{4, 4, 4, 4, 5}));
        assertEquals(4, arr.centeredAverage(new int[]{4, 4, 4, 1, 5}));
        assertEquals(6, arr.centeredAverage(new int[]{6, 4, 8, 12, 3}));
    }

    @Test
    public void testSum13() {
        assertEquals(6, arr.sum13(new int[]{1, 2, 2, 1}));
        assertEquals(2, arr.sum13(new int[]{1, 1}));
        assertEquals(6, arr.sum13(new int[]{1, 2, 2, 1, 13}));
        assertEquals(4, arr.sum13(new int[]{1, 2, 13, 2, 1, 13}));
        assertEquals(3, arr.sum13(new int[]{13, 1, 2, 13, 2, 1, 13}));
        assertEquals(0, arr.sum13(new int[]{}));
        assertEquals(0, arr.sum13(new int[]{13}));
        assertEquals(0, arr.sum13(new int[]{13, 13}));
        assertEquals(0, arr.sum13(new int[]{13, 0, 13}));
        assertEquals(0, arr.sum13(new int[]{13, 1, 13}));
        assertEquals(14, arr.sum13(new int[]{5, 7, 2}));
        assertEquals(5, arr.sum13(new int[]{5, 13, 2}));
        assertEquals(0, arr.sum13(new int[]{0}));
        assertEquals(0, arr.sum13(new int[]{13, 0}));
    }

    @Test
    public void testSum67() {
        assertEquals(5, arr.sum67(new int[]{1, 2, 2}));
        assertEquals(5, arr.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        assertEquals(4, arr.sum67(new int[]{1, 1, 6, 7, 2}));
        assertEquals(2, arr.sum67(new int[]{1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));
        assertEquals(2, arr.sum67(new int[]{1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));
        assertEquals(18, arr.sum67(new int[]{2, 7, 6, 2, 6, 7, 2, 7}));
        assertEquals(9, arr.sum67(new int[]{2, 7, 6, 2, 6, 2, 7}));
        assertEquals(8, arr.sum67(new int[]{1, 6, 7, 7}));
        assertEquals(8, arr.sum67(new int[]{6, 7, 1, 6, 7, 7}));
        assertEquals(0, arr.sum67(new int[]{6, 8, 1, 6, 7}));
        assertEquals(0, arr.sum67(new int[]{}));
        assertEquals(11, arr.sum67(new int[]{6, 7, 11}));
        assertEquals(22, arr.sum67(new int[]{11, 6, 7, 11}));
        assertEquals(11, arr.sum67(new int[]{2, 2, 6, 7, 7}));
    }

    @Test
    public void testHas22() {
        assertTrue(arr.has22(new int[]{1, 2, 2}));
        assertFalse(arr.has22(new int[]{1, 2, 1, 2}));
        assertFalse(arr.has22(new int[]{2, 1, 2}));
        assertTrue(arr.has22(new int[]{2, 2, 1, 2}));
        assertFalse(arr.has22(new int[]{1, 3, 2}));
        assertTrue(arr.has22(new int[]{1, 3, 2, 2}));
        assertTrue(arr.has22(new int[]{2, 3, 2, 2}));
        assertTrue(arr.has22(new int[]{4, 2, 4, 2, 2, 5}));
        assertFalse(arr.has22(new int[]{1, 2}));
        assertTrue(arr.has22(new int[]{2, 2}));
        assertFalse(arr.has22(new int[]{2}));
        assertFalse(arr.has22(new int[]{}));
        assertTrue(arr.has22(new int[]{3, 3, 2, 2}));
        assertFalse(arr.has22(new int[]{5, 2, 5, 2}));
    }

    @Test
    public void testLucky13() {
        assertTrue(arr.lucky13(new int[]{0, 2, 4}));
        assertFalse(arr.lucky13(new int[]{1, 2, 3}));
        assertFalse(arr.lucky13(new int[]{1, 2, 4}));
        assertTrue(arr.lucky13(new int[]{2, 7, 2, 8}));
        assertFalse(arr.lucky13(new int[]{2, 7, 1, 8}));
        assertFalse(arr.lucky13(new int[]{3, 7, 2, 8}));
        assertFalse(arr.lucky13(new int[]{2, 7, 2, 1}));
        assertFalse(arr.lucky13(new int[]{1, 2}));
        assertTrue(arr.lucky13(new int[]{2, 2}));
        assertTrue(arr.lucky13(new int[]{2}));
        assertFalse(arr.lucky13(new int[]{3}));
        assertTrue(arr.lucky13(new int[]{}));
    }

    @Test
    public void testSum28() {
        assertTrue(arr.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        assertFalse(arr.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        assertFalse(arr.sum28(new int[]{1, 2, 3, 4}));
        assertTrue(arr.sum28(new int[]{2, 2, 2, 2}));
        assertTrue(arr.sum28(new int[]{1, 2, 2, 2, 2, 4}));
        assertFalse(arr.sum28(new int[]{}));
        assertFalse(arr.sum28(new int[]{2}));
        assertFalse(arr.sum28(new int[]{8}));
        assertFalse(arr.sum28(new int[]{2, 2, 2}));
        assertFalse(arr.sum28(new int[]{2, 2, 2, 2, 2}));
        assertTrue(arr.sum28(new int[]{1, 2, 2, 1, 2, 2}));
        assertTrue(arr.sum28(new int[]{5, 2, 2, 2, 4, 2}));
    }

    @Test
    public void testMore14() {
        assertTrue(arr.more14(new int[]{1, 4, 1}));
        assertFalse(arr.more14(new int[]{1, 4, 1, 4}));
        assertTrue(arr.more14(new int[]{1, 1}));
        assertTrue(arr.more14(new int[]{1, 6, 6}));
        assertTrue(arr.more14(new int[]{1}));
        assertFalse(arr.more14(new int[]{1, 4}));
        assertTrue(arr.more14(new int[]{6, 1, 1}));
        assertFalse(arr.more14(new int[]{1, 6, 4}));
        assertTrue(arr.more14(new int[]{1, 1, 4, 4, 1}));
        assertTrue(arr.more14(new int[]{1, 1, 6, 4, 4, 1}));
        assertFalse(arr.more14(new int[]{}));
        assertFalse(arr.more14(new int[]{4, 1, 4, 6}));
        assertFalse(arr.more14(new int[]{4, 1, 4, 6, 1}));
        assertTrue(arr.more14(new int[]{1, 4, 1, 4, 1, 6}));
    }

    @Test
    public void testFizzArray() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, arr.fizzArray(4));
        assertArrayEquals(new int[]{0}, arr.fizzArray(1));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, arr.fizzArray(10));
        assertArrayEquals(new int[]{}, arr.fizzArray(0));
        assertArrayEquals(new int[]{0, 1}, arr.fizzArray(2));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6}, arr.fizzArray(7));
    }

    @Test
    public void testOnly14() {
        assertTrue(arr.only14(new int[]{1, 4, 1, 4}));
        assertFalse(arr.only14(new int[]{1, 4, 2, 4}));
        assertTrue(arr.only14(new int[]{1, 1}));
        assertTrue(arr.only14(new int[]{4, 1}));
        assertFalse(arr.only14(new int[]{2}));
        assertTrue(arr.only14(new int[]{}));
        assertFalse(arr.only14(new int[]{1, 4, 1, 3}));
        assertFalse(arr.only14(new int[]{3, 1, 3}));
        assertTrue(arr.only14(new int[]{1}));
        assertTrue(arr.only14(new int[]{4}));
        assertFalse(arr.only14(new int[]{3, 4}));
        assertFalse(arr.only14(new int[]{1, 3, 4}));
        assertTrue(arr.only14(new int[]{1, 1, 1}));
        assertFalse(arr.only14(new int[]{1, 1, 1, 5}));
        assertTrue(arr.only14(new int[]{4, 1, 4, 1}));
    }

    @Test
    public void testFizzArray2() {
        assertArrayEquals(new String[]{"0", "1", "2", "3"}, arr.fizzArray2(4));
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}, arr.fizzArray2(10));
        assertArrayEquals(new String[]{"0", "1"}, arr.fizzArray2(2));
        assertArrayEquals(new String[]{"0"}, arr.fizzArray2(1));
        assertArrayEquals(new String[]{}, arr.fizzArray2(0));
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6"}, arr.fizzArray2(7));
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"}, arr.fizzArray2(9));
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, arr.fizzArray2(11));
    }

    @Test
    public void testNo14() {
        assertTrue(arr.no14(new int[]{1, 2, 3}));
        assertFalse(arr.no14(new int[]{1, 2, 3, 4}));
        assertTrue(arr.no14(new int[]{2, 3, 4}));
        assertFalse(arr.no14(new int[]{1, 1, 4, 4}));
        assertTrue(arr.no14(new int[]{2, 2, 4, 4}));
        assertFalse(arr.no14(new int[]{2, 3, 4, 1}));
        assertTrue(arr.no14(new int[]{2, 1, 1}));
        assertFalse(arr.no14(new int[]{1, 4}));
        assertTrue(arr.no14(new int[]{2}));
        assertTrue(arr.no14(new int[]{2, 1}));
        assertTrue(arr.no14(new int[]{1}));
        assertTrue(arr.no14(new int[]{4}));
        assertTrue(arr.no14(new int[]{}));
        assertTrue(arr.no14(new int[]{1, 1, 1, 1}));
        assertFalse(arr.no14(new int[]{9, 4, 4, 1}));
        assertFalse(arr.no14(new int[]{4, 2, 3, 1}));
        assertTrue(arr.no14(new int[]{4, 2, 3, 5}));
        assertTrue(arr.no14(new int[]{4, 4, 2}));
        assertFalse(arr.no14(new int[]{1, 4, 4}));
    }

    @Test
    public void testIsEverywhere() {
        assertTrue(arr.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        assertFalse(arr.isEverywhere(new int[]{1, 2, 1, 3}, 2));
        assertFalse(arr.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
        assertTrue(arr.isEverywhere(new int[]{2, 1, 2, 1}, 1));
        assertTrue(arr.isEverywhere(new int[]{2, 1, 2, 1}, 2));
        assertFalse(arr.isEverywhere(new int[]{2, 1, 2, 3, 1}, 2));
        assertTrue(arr.isEverywhere(new int[]{3, 1}, 3));
        assertFalse(arr.isEverywhere(new int[]{3, 1}, 2));
        assertTrue(arr.isEverywhere(new int[]{3}, 1));
        assertTrue(arr.isEverywhere(new int[]{}, 1));
        assertTrue(arr.isEverywhere(new int[]{1, 2, 1, 2, 3, 2, 5}, 2));
        assertFalse(arr.isEverywhere(new int[]{1, 2, 1, 1, 1, 2}, 2));
        assertFalse(arr.isEverywhere(new int[]{2, 1, 2, 1, 1, 2}, 2));
        assertFalse(arr.isEverywhere(new int[]{2, 1, 2, 2, 2, 1, 1, 2}, 2));
        assertTrue(arr.isEverywhere(new int[]{2, 1, 2, 2, 2, 1, 2, 1}, 2));
        assertTrue(arr.isEverywhere(new int[]{2, 1, 2, 1, 2}, 2));
    }

    @Test
    public void testEither24() {
        assertTrue(arr.either24(new int[]{1, 2, 2}));
        assertTrue(arr.either24(new int[]{4, 4, 1}));
        assertFalse(arr.either24(new int[]{4, 4, 1, 2, 2}));
        assertFalse(arr.either24(new int[]{1, 2, 3, 4}));
        assertFalse(arr.either24(new int[]{3, 5, 9}));
        assertTrue(arr.either24(new int[]{1, 2, 3, 4, 4}));
        assertTrue(arr.either24(new int[]{2, 2, 3, 4}));
        assertTrue(arr.either24(new int[]{1, 2, 3, 2, 2, 4}));
        assertFalse(arr.either24(new int[]{1, 2, 3, 2, 2, 4, 4}));
        assertFalse(arr.either24(new int[]{1, 2}));
        assertTrue(arr.either24(new int[]{2, 2}));
        assertTrue(arr.either24(new int[]{4, 4}));
        assertFalse(arr.either24(new int[]{2}));
        assertFalse(arr.either24(new int[]{}));
    }

    @Test
    public void testMatchUp() {
        assertEquals(2, arr.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        assertEquals(3, arr.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        assertEquals(2, arr.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
        assertEquals(1, arr.matchUp(new int[]{5, 3}, new int[]{5, 5}));
        assertEquals(2, arr.matchUp(new int[]{5, 3}, new int[]{4, 4}));
        assertEquals(1, arr.matchUp(new int[]{5, 3}, new int[]{3, 3}));
        assertEquals(1, arr.matchUp(new int[]{5, 3}, new int[]{2, 2}));
        assertEquals(1, arr.matchUp(new int[]{5, 3}, new int[]{1, 1}));
        assertEquals(0, arr.matchUp(new int[]{5, 3}, new int[]{0, 0}));
        assertEquals(0, arr.matchUp(new int[]{4}, new int[]{4}));
        assertEquals(1, arr.matchUp(new int[]{4}, new int[]{5}));
    }

    @Test
    public void testHas77() {
        assertTrue(arr.has77(new int[]{1, 7, 7}));
        assertTrue(arr.has77(new int[]{1, 7, 1, 7}));
        assertFalse(arr.has77(new int[]{1, 7, 1, 1, 7}));
        assertTrue(arr.has77(new int[]{7, 7, 1, 1, 7}));
        assertFalse(arr.has77(new int[]{2, 7, 2, 2, 7, 2}));
        assertTrue(arr.has77(new int[]{2, 7, 2, 2, 7, 7}));
        assertTrue(arr.has77(new int[]{7, 2, 7, 2, 2, 7}));
        assertFalse(arr.has77(new int[]{7, 2, 6, 2, 2, 7}));
        assertTrue(arr.has77(new int[]{7, 7, 7}));
        assertTrue(arr.has77(new int[]{7, 1, 7}));
        assertFalse(arr.has77(new int[]{7, 1, 1}));
        assertFalse(arr.has77(new int[]{1, 2}));
        assertFalse(arr.has77(new int[]{1, 7}));
        assertFalse(arr.has77(new int[]{7}));
    }

    @Test
    public void testHas12() {
        assertTrue(arr.has12(new int[]{1, 3, 2}));
        assertTrue(arr.has12(new int[]{3, 1, 2}));
        assertTrue(arr.has12(new int[]{3, 1, 4, 5, 2}));
        assertFalse(arr.has12(new int[]{3, 1, 4, 5, 6}));
        assertTrue(arr.has12(new int[]{3, 1, 4, 1, 6, 2}));
        assertTrue(arr.has12(new int[]{2, 1, 4, 1, 6, 2}));
        assertFalse(arr.has12(new int[]{2, 1, 4, 1, 6}));
        assertFalse(arr.has12(new int[]{3, 5, 9}));
        assertFalse(arr.has12(new int[]{3, 5, 1}));
        assertFalse(arr.has12(new int[]{3, 2, 1}));
        assertTrue(arr.has12(new int[]{1, 2}));
        assertFalse(arr.has12(new int[]{1, 1}));
        assertFalse(arr.has12(new int[]{1}));
        assertFalse(arr.has12(new int[]{}));
    }

    @Test
    public void testModThree() {
        assertTrue(arr.modThree(new int[]{2, 1, 3, 5}));
        assertFalse(arr.modThree(new int[]{2, 1, 2, 5}));
        assertTrue(arr.modThree(new int[]{2, 4, 2, 5}));
        assertFalse(arr.modThree(new int[]{1, 2, 1, 2, 1}));
        assertTrue(arr.modThree(new int[]{9, 9, 9}));
        assertFalse(arr.modThree(new int[]{1, 2, 1}));
        assertFalse(arr.modThree(new int[]{1, 2}));
        assertFalse(arr.modThree(new int[]{1}));
        assertFalse(arr.modThree(new int[]{}));
        assertFalse(arr.modThree(new int[]{9, 7, 2, 9}));
        assertFalse(arr.modThree(new int[]{9, 7, 2, 9, 2, 2}));
        assertTrue(arr.modThree(new int[]{9, 7, 2, 9, 2, 2, 6}));
    }

    @Test
    public void testHaveThree() {
        assertTrue(arr.haveThree(new int[]{3, 1, 3, 1, 3}));
        assertFalse(arr.haveThree(new int[]{3, 1, 3, 3}));
        assertFalse(arr.haveThree(new int[]{3, 4, 3, 3, 4}));
        assertFalse(arr.haveThree(new int[]{1, 3, 1, 3, 1, 2}));
        assertTrue(arr.haveThree(new int[]{1, 3, 1, 3, 1, 3}));
        assertFalse(arr.haveThree(new int[]{1, 3, 3, 1, 3}));
        assertFalse(arr.haveThree(new int[]{1, 3, 1, 3, 1, 3, 4, 3}));
        assertTrue(arr.haveThree(new int[]{3, 4, 3, 4, 3, 4, 4}));
        assertFalse(arr.haveThree(new int[]{3, 3, 3}));
        assertFalse(arr.haveThree(new int[]{1, 3}));
        assertFalse(arr.haveThree(new int[]{3}));
        assertFalse(arr.haveThree(new int[]{1}));
    }

    @Test
    public void testTwoTwo() {
        assertTrue(arr.twoTwo(new int[]{4, 2, 2, 3}));
        assertTrue(arr.twoTwo(new int[]{2, 2, 4}));
        assertFalse(arr.twoTwo(new int[]{2, 2, 4, 2}));
        assertTrue(arr.twoTwo(new int[]{1, 3, 4}));
        assertTrue(arr.twoTwo(new int[]{1, 2, 2, 3, 4}));
        assertFalse(arr.twoTwo(new int[]{1, 2, 3, 4}));
        assertTrue(arr.twoTwo(new int[]{2, 2}));
        assertTrue(arr.twoTwo(new int[]{2, 2, 7}));
        assertFalse(arr.twoTwo(new int[]{2, 2, 7, 2, 1}));
        assertTrue(arr.twoTwo(new int[]{4, 2, 2, 2}));
        assertTrue(arr.twoTwo(new int[]{2, 2, 2}));
        assertFalse(arr.twoTwo(new int[]{1, 2}));
        assertFalse(arr.twoTwo(new int[]{2}));
        assertTrue(arr.twoTwo(new int[]{1}));
        assertTrue(arr.twoTwo(new int[]{}));
        assertTrue(arr.twoTwo(new int[]{5, 2, 2, 3}));
        assertFalse(arr.twoTwo(new int[]{2, 2, 5, 2}));
    }

    @Test
    public void testSameEnds() {
        assertFalse(arr.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
        assertTrue(arr.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
        assertFalse(arr.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));
        assertTrue(arr.sameEnds(new int[]{1, 2, 5, 2, 1}, 1));
        assertFalse(arr.sameEnds(new int[]{1, 2, 5, 2, 1}, 2));
        assertTrue(arr.sameEnds(new int[]{1, 2, 5, 2, 1}, 0));
        assertTrue(arr.sameEnds(new int[]{1, 2, 5, 2, 1}, 5));
        assertTrue(arr.sameEnds(new int[]{1, 1, 1}, 0));
        assertTrue(arr.sameEnds(new int[]{1, 1, 1}, 1));
        assertTrue(arr.sameEnds(new int[]{1, 1, 1}, 2));
        assertTrue(arr.sameEnds(new int[]{1, 1, 1}, 3));
        assertTrue(arr.sameEnds(new int[]{1}, 1));
        assertTrue(arr.sameEnds(new int[]{}, 0));
        assertFalse(arr.sameEnds(new int[]{4, 2, 4, 5}, 1));
    }

    @Test
    public void testTripleUp() {
        assertTrue(arr.tripleUp(new int[]{1, 4, 5, 6, 2}));
        assertTrue(arr.tripleUp(new int[]{1, 2, 3}));
        assertFalse(arr.tripleUp(new int[]{1, 2, 4}));
        assertTrue(arr.tripleUp(new int[]{1, 2, 4, 5, 7, 6, 5, 6, 7, 6}));
        assertFalse(arr.tripleUp(new int[]{1, 2, 4, 5, 7, 6, 5, 7, 7, 6}));
        assertFalse(arr.tripleUp(new int[]{1, 2}));
        assertFalse(arr.tripleUp(new int[]{1}));
        assertFalse(arr.tripleUp(new int[]{}));
        assertTrue(arr.tripleUp(new int[]{10, 9, 8, -100, -99, -98, 100}));
        assertFalse(arr.tripleUp(new int[]{10, 9, 8, -100, -99, 99, 100}));
        assertTrue(arr.tripleUp(new int[]{-100, -99, -99, 100, 101, 102}));
        assertFalse(arr.tripleUp(new int[]{2, 3, 5, 6, 8, 9, 2, 3}));
    }

    @Test
    public void testFizzArray3() {
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, arr.fizzArray3(5, 10));
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17}, arr.fizzArray3(11, 18));
        assertArrayEquals(new int[]{1, 2}, arr.fizzArray3(1, 3));
        assertArrayEquals(new int[]{1}, arr.fizzArray3(1, 2));
        assertArrayEquals(new int[]{}, arr.fizzArray3(1, 1));
        assertArrayEquals(new int[]{1000, 1001, 1002, 1003, 1004}, arr.fizzArray3(1000, 1005));
    }

    @Test
    public void testShiftLeft() {
        assertArrayEquals(new int[]{2, 5, 3, 6}, arr.shiftLeft(new int[]{6, 2, 5, 3}));
        assertArrayEquals(new int[]{2, 1}, arr.shiftLeft(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, arr.shiftLeft(new int[]{1}));
        assertArrayEquals(new int[]{}, arr.shiftLeft(new int[]{}));
        assertArrayEquals(new int[]{1, 2, 2, 4, 1}, arr.shiftLeft(new int[]{1, 1, 2, 2, 4}));
        assertArrayEquals(new int[]{1, 1, 1}, arr.shiftLeft(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{2, 3, 1}, arr.shiftLeft(new int[]{1, 2, 3}));
    }

    @Test
    public void testTenRun() {
        assertArrayEquals(new int[]{2, 10, 10, 10, 20, 20}, arr.tenRun(new int[]{2, 10, 3, 4, 20, 5}));
        assertArrayEquals(new int[]{10, 10, 20, 20}, arr.tenRun(new int[]{10, 1, 20, 2}));
        assertArrayEquals(new int[]{10, 10, 10, 20}, arr.tenRun(new int[]{10, 1, 9, 20}));
        assertArrayEquals(new int[]{1, 2, 50, 50}, arr.tenRun(new int[]{1, 2, 50, 1}));
        assertArrayEquals(new int[]{1, 20, 50, 50}, arr.tenRun(new int[]{1, 20, 50, 1}));
        assertArrayEquals(new int[]{10, 10}, arr.tenRun(new int[]{10, 10}));
        assertArrayEquals(new int[]{10, 10}, arr.tenRun(new int[]{10, 2}));
        assertArrayEquals(new int[]{0, 0}, arr.tenRun(new int[]{0, 2}));
        assertArrayEquals(new int[]{1, 2}, arr.tenRun(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, arr.tenRun(new int[]{1}));
        assertArrayEquals(new int[]{}, arr.tenRun(new int[]{}));
    }

    @Test
    public void testPre4() {
        assertArrayEquals(new int[]{1, 2}, arr.pre4(new int[]{1, 2, 4, 1}));
        assertArrayEquals(new int[]{3, 1}, arr.pre4(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{1}, arr.pre4(new int[]{1, 4, 4}));
        assertArrayEquals(new int[]{1}, arr.pre4(new int[]{1, 4, 4, 2}));
        assertArrayEquals(new int[]{1, 3}, arr.pre4(new int[]{1, 3, 4, 2, 4}));
        assertArrayEquals(new int[]{}, arr.pre4(new int[]{4, 4}));
        assertArrayEquals(new int[]{3, 3}, arr.pre4(new int[]{3, 3, 4}));
        assertArrayEquals(new int[]{1, 2, 1}, arr.pre4(new int[]{1, 2, 1, 4}));
        assertArrayEquals(new int[]{2, 1}, arr.pre4(new int[]{2, 1, 4, 2}));
        assertArrayEquals(new int[]{2, 1, 2, 1}, arr.pre4(new int[]{2, 1, 2, 1, 4, 2}));
    }

    @Test
    public void testPost4() {
        assertArrayEquals(new int[]{1, 2}, arr.post4(new int[]{2, 4, 1, 2}));
        assertArrayEquals(new int[]{2}, arr.post4(new int[]{4, 1, 4, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, arr.post4(new int[]{4, 4, 1, 2, 3}));
        assertArrayEquals(new int[]{2}, arr.post4(new int[]{4, 2}));
        assertArrayEquals(new int[]{3}, arr.post4(new int[]{4, 4, 3}));
        assertArrayEquals(new int[]{}, arr.post4(new int[]{4, 4}));
        assertArrayEquals(new int[]{}, arr.post4(new int[]{4}));
        assertArrayEquals(new int[]{3, 2}, arr.post4(new int[]{2, 4, 1, 4, 3, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, arr.post4(new int[]{4, 1, 4, 2, 2, 2}));
        assertArrayEquals(new int[]{3, 2}, arr.post4(new int[]{3, 4, 3, 2}));
    }

    @Test
    public void testNotAlone() {
        assertArrayEquals(new int[]{1, 3, 3}, arr.notAlone(new int[]{1, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 2}, arr.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2));
        assertArrayEquals(new int[]{3, 4}, arr.notAlone(new int[]{3, 4}, 3));
        assertArrayEquals(new int[]{3, 3}, arr.notAlone(new int[]{3, 3}, 3));
        assertArrayEquals(new int[]{1, 3, 3, 2}, arr.notAlone(new int[]{1, 3, 1, 2}, 1));
        assertArrayEquals(new int[]{3}, arr.notAlone(new int[]{3}, 3));
        assertArrayEquals(new int[]{}, arr.notAlone(new int[]{}, 3));
        assertArrayEquals(new int[]{7, 7, 6}, arr.notAlone(new int[]{7, 1, 6}, 1));
        assertArrayEquals(new int[]{1, 1, 1}, arr.notAlone(new int[]{1, 1, 1}, 1));
        assertArrayEquals(new int[]{1, 1, 1, 2}, arr.notAlone(new int[]{1, 1, 1, 2}, 1));
    }

    @Test
    public void testZeroFront() {
        assertArrayEquals(new int[]{0, 0, 1, 1}, arr.zeroFront(new int[]{1, 0, 0, 1}));
        assertArrayEquals(new int[]{0, 0, 1, 1, 1}, arr.zeroFront(new int[]{0, 1, 1, 0, 1}));
        assertArrayEquals(new int[]{0, 1}, arr.zeroFront(new int[]{1, 0}));
        assertArrayEquals(new int[]{0, 1}, arr.zeroFront(new int[]{0, 1}));
        assertArrayEquals(new int[]{0, 1, 1, 1}, arr.zeroFront(new int[]{1, 1, 1, 0}));
        assertArrayEquals(new int[]{2, 2, 2, 2}, arr.zeroFront(new int[]{2, 2, 2, 2}));
        assertArrayEquals(new int[]{0, 0, 0, 1}, arr.zeroFront(new int[]{0, 0, 1, 0}));
        assertArrayEquals(new int[]{0, 0, 0, -1, -1}, arr.zeroFront(new int[]{-1, 0, 0, -1, 0}));
        assertArrayEquals(new int[]{0, 0, -3, -3}, arr.zeroFront(new int[]{0, -3, 0, -3}));
        assertArrayEquals(new int[]{}, arr.zeroFront(new int[]{}));
        assertArrayEquals(new int[]{0, 0, 9, 9, 9, 9}, arr.zeroFront(new int[]{9, 9, 0, 9, 0, 9}));
    }

    @Test
    public void testWithoutTen() {
        assertArrayEquals(new int[]{1, 2, 0, 0}, arr.withoutTen(new int[]{1, 10, 10, 2}));
        assertArrayEquals(new int[]{2, 0, 0}, arr.withoutTen(new int[]{10, 2, 10}));
        assertArrayEquals(new int[]{1, 99, 0}, arr.withoutTen(new int[]{1, 99, 10}));
        assertArrayEquals(new int[]{13, 14, 0, 0}, arr.withoutTen(new int[]{10, 13, 10, 14}));
        assertArrayEquals(new int[]{13, 14, 0, 0, 0}, arr.withoutTen(new int[]{10, 13, 10, 14, 10}));
        assertArrayEquals(new int[]{3, 0, 0}, arr.withoutTen(new int[]{10, 10, 3}));
        assertArrayEquals(new int[]{1}, arr.withoutTen(new int[]{1}));
        assertArrayEquals(new int[]{13, 1}, arr.withoutTen(new int[]{13, 1}));
        assertArrayEquals(new int[]{0}, arr.withoutTen(new int[]{10}));
        assertArrayEquals(new int[]{}, arr.withoutTen(new int[]{}));
    }

    @Test
    public void testZeroMax() {
        assertArrayEquals(new int[]{5, 5, 3, 3}, arr.zeroMax(new int[]{0, 5, 0, 3}));
        assertArrayEquals(new int[]{3, 4, 3, 3}, arr.zeroMax(new int[]{0, 4, 0, 3}));
        assertArrayEquals(new int[]{1, 1, 0}, arr.zeroMax(new int[]{0, 1, 0}));
        assertArrayEquals(new int[]{5, 1, 5}, arr.zeroMax(new int[]{0, 1, 5}));
        assertArrayEquals(new int[]{0, 2, 0}, arr.zeroMax(new int[]{0, 2, 0}));
        assertArrayEquals(new int[]{1}, arr.zeroMax(new int[]{1}));
        assertArrayEquals(new int[]{0}, arr.zeroMax(new int[]{0}));
        assertArrayEquals(new int[]{}, arr.zeroMax(new int[]{}));
        assertArrayEquals(new int[]{7, 3, 4, 3, 0, 2}, arr.zeroMax(new int[]{7, 0, 4, 3, 0, 2}));
        assertArrayEquals(new int[]{7, 3, 4, 3, 1, 1}, arr.zeroMax(new int[]{7, 0, 4, 3, 0, 1}));
        assertArrayEquals(new int[]{7, 3, 4, 3, 0, 0}, arr.zeroMax(new int[]{7, 0, 4, 3, 0, 0}));
        assertArrayEquals(new int[]{7, 7, 1, 7, 7, 7}, arr.zeroMax(new int[]{7, 0, 1, 0, 0, 7}));
    }

    @Test
    public void testEvenOdd() {
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 1}, arr.evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}));
        assertArrayEquals(new int[]{2, 3, 3}, arr.evenOdd(new int[]{3, 3, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, arr.evenOdd(new int[]{2, 2, 2}));
        assertArrayEquals(new int[]{2, 2, 3}, arr.evenOdd(new int[]{3, 2, 2}));
        assertArrayEquals(new int[]{0, 0, 1, 1, 1}, arr.evenOdd(new int[]{1, 1, 0, 1, 0}));
        assertArrayEquals(new int[]{1}, arr.evenOdd(new int[]{1}));
        assertArrayEquals(new int[]{2, 1}, arr.evenOdd(new int[]{1, 2}));
        assertArrayEquals(new int[]{2, 1}, arr.evenOdd(new int[]{2, 1}));
        assertArrayEquals(new int[]{}, arr.evenOdd(new int[]{}));
    }

    @Test
    public void testFizzBuzz() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, arr.fizzBuzz(1, 6));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, arr.fizzBuzz(1, 8));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, arr.fizzBuzz(1, 11));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, arr.fizzBuzz(1, 16));
        assertArrayEquals(new String[]{"1", "2", "Fizz"}, arr.fizzBuzz(1, 4));
        assertArrayEquals(new String[]{"1"}, arr.fizzBuzz(1, 2));
        assertArrayEquals(new String[]{"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"}, arr.fizzBuzz(50, 56));
        assertArrayEquals(new String[]{"FizzBuzz", "16"}, arr.fizzBuzz(15, 17));
        assertArrayEquals(new String[]{"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"}, arr.fizzBuzz(30, 36));
        assertArrayEquals(new String[]{"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"}, arr.fizzBuzz(1000, 1006));
        assertArrayEquals(new String[]{"Fizz", "Buzz", "101"}, arr.fizzBuzz(99, 102));
        assertArrayEquals(new String[]{"14", "FizzBuzz", "16", "17", "Fizz", "19"}, arr.fizzBuzz(14, 20));
    }

}