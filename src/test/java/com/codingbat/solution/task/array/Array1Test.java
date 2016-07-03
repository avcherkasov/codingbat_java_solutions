package com.codingbat.solution.task.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Array1Test
 * <p>
 * Basic array problems -- no loops..
 * Use a[0], a[1], ... to access elements in an array,
 * a.length is the length (note that s.length() is for Strings).
 * Allocate a new array like this: int[] a = new int[10]; // length 10 array
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Array-1
 */
public class Array1Test {

    private Array1 arr;

    @Before
    public void setUp() {
        arr = new Array1();
    }

    @Test
    public void testFirstLast6() {
        assertTrue(arr.firstLast6(new int[]{1, 2, 6}));
        assertTrue(arr.firstLast6(new int[]{6, 1, 2, 3}));
        assertFalse(arr.firstLast6(new int[]{13, 6, 1, 2, 3}));
        assertTrue(arr.firstLast6(new int[]{13, 6, 1, 2, 6}));
        assertFalse(arr.firstLast6(new int[]{3, 2, 1}));
        assertFalse(arr.firstLast6(new int[]{3, 6, 1}));
        assertTrue(arr.firstLast6(new int[]{3, 6}));
        assertTrue(arr.firstLast6(new int[]{6}));
        assertFalse(arr.firstLast6(new int[]{3}));
        assertTrue(arr.firstLast6(new int[]{5, 6}));
        assertFalse(arr.firstLast6(new int[]{5, 5}));
        assertTrue(arr.firstLast6(new int[]{1, 2, 3, 4, 6}));
        assertFalse(arr.firstLast6(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testSameFirstLast() {
        assertFalse(arr.sameFirstLast(new int[]{1, 2, 3}));
        assertTrue(arr.sameFirstLast(new int[]{1, 2, 3, 1}));
        assertTrue(arr.sameFirstLast(new int[]{1, 2, 1}));
        assertTrue(arr.sameFirstLast(new int[]{7}));
        assertFalse(arr.sameFirstLast(new int[]{}));
        assertTrue(arr.sameFirstLast(new int[]{1, 2, 3, 4, 5, 1}));
        assertFalse(arr.sameFirstLast(new int[]{1, 2, 3, 4, 5, 13}));
        assertTrue(arr.sameFirstLast(new int[]{13, 2, 3, 4, 5, 13}));
        assertTrue(arr.sameFirstLast(new int[]{7, 7}));
    }

    @Test
    public void testMakePi() {
        assertArrayEquals(new int[]{3, 1, 4}, arr.makePi());
    }

    @Test
    public void testCommonEnd() {
        assertTrue(arr.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        assertFalse(arr.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        assertTrue(arr.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
        assertTrue(arr.commonEnd(new int[]{1, 2, 3}, new int[]{1}));
        assertFalse(arr.commonEnd(new int[]{1, 2, 3}, new int[]{2}));
    }

    @Test
    public void testSum3() {
        assertEquals(6, arr.sum3(new int[]{1, 2, 3}));
        assertEquals(18, arr.sum3(new int[]{5, 11, 2}));
        assertEquals(7, arr.sum3(new int[]{7, 0, 0}));
        assertEquals(4, arr.sum3(new int[]{1, 2, 1}));
        assertEquals(3, arr.sum3(new int[]{1, 1, 1}));
        assertEquals(11, arr.sum3(new int[]{2, 7, 2}));
    }

    @Test
    public void testRotateLeft3() {
        assertArrayEquals(new int[]{2, 3, 1}, arr.rotateLeft3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 9, 5}, arr.rotateLeft3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{0, 0, 7}, arr.rotateLeft3(new int[]{7, 0, 0}));
        assertArrayEquals(new int[]{2, 1, 1}, arr.rotateLeft3(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{0, 1, 0}, arr.rotateLeft3(new int[]{0, 0, 1}));
    }

    @Test
    public void testReverse3() {
        assertArrayEquals(new int[]{3, 2, 1}, arr.reverse3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{9, 11, 5}, arr.reverse3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{0, 0, 7}, arr.reverse3(new int[]{7, 0, 0}));
        assertArrayEquals(new int[]{2, 1, 2}, arr.reverse3(new int[]{2, 1, 2}));
        assertArrayEquals(new int[]{1, 2, 1}, arr.reverse3(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{3, 11, 2}, arr.reverse3(new int[]{2, 11, 3}));
        assertArrayEquals(new int[]{5, 6, 0}, arr.reverse3(new int[]{0, 6, 5}));
        assertArrayEquals(new int[]{3, 2, 7}, arr.reverse3(new int[]{7, 2, 3}));
    }

    @Test
    public void testMaxEnd3() {
        assertArrayEquals(new int[]{3, 3, 3}, arr.maxEnd3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, arr.maxEnd3(new int[]{11, 5, 9}));
        assertArrayEquals(new int[]{3, 3, 3}, arr.maxEnd3(new int[]{2, 11, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, arr.maxEnd3(new int[]{11, 3, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, arr.maxEnd3(new int[]{3, 11, 11}));
        assertArrayEquals(new int[]{2, 2, 2}, arr.maxEnd3(new int[]{2, 2, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, arr.maxEnd3(new int[]{2, 11, 2}));
        assertArrayEquals(new int[]{1, 1, 1}, arr.maxEnd3(new int[]{0, 0, 1}));
    }

    @Test
    public void testSum2() {
        assertEquals(3, arr.sum2(new int[]{1, 2, 3}));
        assertEquals(2, arr.sum2(new int[]{1, 1}));
        assertEquals(2, arr.sum2(new int[]{1, 1, 1, 1}));
        assertEquals(3, arr.sum2(new int[]{1, 2}));
        assertEquals(1, arr.sum2(new int[]{1}));
        assertEquals(0, arr.sum2(new int[]{}));
        assertEquals(9, arr.sum2(new int[]{4, 5, 6}));
        assertEquals(4, arr.sum2(new int[]{4}));
    }

    @Test
    public void testMiddleWay() {
        assertArrayEquals(new int[]{2, 5}, arr.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{7, 8}, arr.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}));
        assertArrayEquals(new int[]{2, 4}, arr.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5}));
        assertArrayEquals(new int[]{9, 8}, arr.middleWay(new int[]{1, 9, 7}, new int[]{4, 8, 8}));
        assertArrayEquals(new int[]{2, 1}, arr.middleWay(new int[]{1, 2, 3}, new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{2, 1}, arr.middleWay(new int[]{1, 2, 3}, new int[]{4, 1, 1}));
    }

    @Test
    public void testMakeEnds() {
        assertArrayEquals(new int[]{1, 3}, arr.makeEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 4}, arr.makeEnds(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{7, 2}, arr.makeEnds(new int[]{7, 4, 6, 2}));
        assertArrayEquals(new int[]{1, 3}, arr.makeEnds(new int[]{1, 2, 2, 2, 2, 2, 2, 3}));
        assertArrayEquals(new int[]{7, 4}, arr.makeEnds(new int[]{7, 4}));
        assertArrayEquals(new int[]{7, 7}, arr.makeEnds(new int[]{7}));
        assertArrayEquals(new int[]{5, 9}, arr.makeEnds(new int[]{5, 2, 9}));
        assertArrayEquals(new int[]{2, 1}, arr.makeEnds(new int[]{2, 3, 4, 1}));
    }

    @Test
    public void testHas23() {
        assertTrue(arr.has23(new int[]{2, 5}));
        assertTrue(arr.has23(new int[]{4, 3}));
        assertFalse(arr.has23(new int[]{4, 5}));
        assertTrue(arr.has23(new int[]{2, 2}));
        assertTrue(arr.has23(new int[]{3, 2}));
        assertTrue(arr.has23(new int[]{3, 3}));
        assertFalse(arr.has23(new int[]{7, 7}));
        assertTrue(arr.has23(new int[]{3, 9}));
        assertFalse(arr.has23(new int[]{9, 5}));
    }

    @Test
    public void testNo23() {
        assertTrue(arr.no23(new int[]{4, 5}));
        assertFalse(arr.no23(new int[]{4, 2}));
        assertFalse(arr.no23(new int[]{3, 5}));
        assertTrue(arr.no23(new int[]{1, 9}));
        assertFalse(arr.no23(new int[]{2, 9}));
        assertFalse(arr.no23(new int[]{1, 3}));
        assertTrue(arr.no23(new int[]{1, 1}));
        assertFalse(arr.no23(new int[]{2, 2}));
        assertFalse(arr.no23(new int[]{3, 3}));
        assertTrue(arr.no23(new int[]{7, 8}));
        assertTrue(arr.no23(new int[]{8, 7}));
    }

    @Test
    public void testMakeLast() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 6}, arr.makeLast(new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{0, 0, 0, 2}, arr.makeLast(new int[]{1, 2}));
        assertArrayEquals(new int[]{0, 3}, arr.makeLast(new int[]{3}));
        assertArrayEquals(new int[]{0, 0}, arr.makeLast(new int[]{0}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 7}, arr.makeLast(new int[]{7, 7, 7}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 4}, arr.makeLast(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 4}, arr.makeLast(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0}, arr.makeLast(new int[]{1, 2, 3, 0}));
        assertArrayEquals(new int[]{0, 0, 0, 4}, arr.makeLast(new int[]{2, 4}));
    }

    @Test
    public void testDouble23() {
        assertTrue(arr.double23(new int[]{2, 2}));
        assertTrue(arr.double23(new int[]{3, 3}));
        assertFalse(arr.double23(new int[]{2, 3}));
        assertFalse(arr.double23(new int[]{3, 2}));
        assertFalse(arr.double23(new int[]{4, 5}));
        assertFalse(arr.double23(new int[]{2}));
        assertFalse(arr.double23(new int[]{3}));
        assertFalse(arr.double23(new int[]{}));
        assertFalse(arr.double23(new int[]{3, 4}));
    }

    @Test
    public void testFix23() {
        assertArrayEquals(new int[]{1, 2, 0}, arr.fix23(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{2, 0, 5}, arr.fix23(new int[]{2, 3, 5}));
        assertArrayEquals(new int[]{1, 2, 1}, arr.fix23(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{3, 2, 1}, arr.fix23(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{2, 2, 0}, arr.fix23(new int[]{2, 2, 3}));
        assertArrayEquals(new int[]{2, 0, 3}, arr.fix23(new int[]{2, 3, 3}));
    }

    @Test
    public void testStart1() {
        assertEquals(2, arr.start1(new int[]{1, 2, 3}, new int[]{1, 3}));
        assertEquals(1, arr.start1(new int[]{7, 2, 3}, new int[]{1}));
        assertEquals(1, arr.start1(new int[]{1, 2}, new int[]{}));
        assertEquals(1, arr.start1(new int[]{}, new int[]{1, 2}));
        assertEquals(0, arr.start1(new int[]{7}, new int[]{}));
        assertEquals(1, arr.start1(new int[]{7}, new int[]{1}));
        assertEquals(2, arr.start1(new int[]{1}, new int[]{1}));
        assertEquals(0, arr.start1(new int[]{7}, new int[]{8}));
        assertEquals(0, arr.start1(new int[]{}, new int[]{}));
        assertEquals(2, arr.start1(new int[]{1, 3}, new int[]{1}));
    }

    @Test
    public void testBiggerTwo() {
        assertArrayEquals("1", new int[]{3, 4}, arr.biggerTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals("2", new int[]{3, 4}, arr.biggerTwo(new int[]{3, 4}, new int[]{1, 2}));
        assertArrayEquals("3", new int[]{1, 2}, arr.biggerTwo(new int[]{1, 1}, new int[]{1, 2}));
        assertArrayEquals("4", new int[]{2, 1}, arr.biggerTwo(new int[]{2, 1}, new int[]{1, 1}));
        assertArrayEquals("5", new int[]{2, 2}, arr.biggerTwo(new int[]{2, 2}, new int[]{1, 3}));
        assertArrayEquals("6", new int[]{1, 3}, arr.biggerTwo(new int[]{1, 3}, new int[]{2, 2}));
        assertArrayEquals("7", new int[]{6, 7}, arr.biggerTwo(new int[]{6, 7}, new int[]{3, 1}));
    }

    @Test
    public void testMakeMiddle() {
        assertArrayEquals(new int[]{2, 3}, arr.makeMiddle(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{2, 3}, arr.makeMiddle(new int[]{7, 1, 2, 3, 4, 9}));
        assertArrayEquals(new int[]{1, 2}, arr.makeMiddle(new int[]{1, 2}));
        assertArrayEquals(new int[]{2, 4}, arr.makeMiddle(new int[]{5, 2, 4, 7}));
        assertArrayEquals(new int[]{4, 3}, arr.makeMiddle(new int[]{9, 0, 4, 3, 9, 1}));
    }

    @Test
    public void testPlusTwo() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr.plusTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{4, 4, 2, 2}, arr.plusTwo(new int[]{4, 4}, new int[]{2, 2}));
        assertArrayEquals(new int[]{9, 2, 3, 4}, arr.plusTwo(new int[]{9, 2}, new int[]{3, 4}));
    }

    @Test
    public void testSwapEnds() {
        assertArrayEquals(new int[]{4, 2, 3, 1}, arr.swapEnds(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{3, 2, 1}, arr.swapEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 6, 7, 9, 8}, arr.swapEnds(new int[]{8, 6, 7, 9, 5}));
        assertArrayEquals(new int[]{9, 1, 4, 1, 5, 3}, arr.swapEnds(new int[]{3, 1, 4, 1, 5, 9}));
        assertArrayEquals(new int[]{2, 1}, arr.swapEnds(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, arr.swapEnds(new int[]{1}));
    }

    @Test
    public void testMidThree() {
        assertArrayEquals(new int[]{2, 3, 4}, arr.midThree(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{7, 5, 3}, arr.midThree(new int[]{8, 6, 7, 5, 3, 0, 9}));
        assertArrayEquals(new int[]{1, 2, 3}, arr.midThree(new int[]{1, 2, 3}));
    }

    @Test
    public void testMaxTriple() {
        assertEquals(3, arr.maxTriple(new int[]{1, 2, 3}));
        assertEquals(5, arr.maxTriple(new int[]{1, 5, 3}));
        assertEquals(5, arr.maxTriple(new int[]{5, 2, 3}));
        assertEquals(3, arr.maxTriple(new int[]{1, 2, 3, 1, 1}));
        assertEquals(5, arr.maxTriple(new int[]{1, 7, 3, 1, 5}));
        assertEquals(5, arr.maxTriple(new int[]{5, 1, 3, 7, 1}));
        assertEquals(5, arr.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1}));
        assertEquals(9, arr.maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1}));
        assertEquals(9, arr.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 9}));
        assertEquals(5, arr.maxTriple(new int[]{2, 2, 5, 1, 1}));
    }

    @Test
    public void testFrontPiece() {
        assertArrayEquals(new int[]{1, 2}, arr.frontPiece(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2}, arr.frontPiece(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, arr.frontPiece(new int[]{1}));
        assertArrayEquals(new int[]{}, arr.frontPiece(new int[]{}));
        assertArrayEquals(new int[]{6, 5}, arr.frontPiece(new int[]{6, 5, 0}));
        assertArrayEquals(new int[]{6, 5}, arr.frontPiece(new int[]{6, 5}));
        assertArrayEquals(new int[]{3, 1}, arr.frontPiece(new int[]{3, 1, 4, 1, 5}));
        assertArrayEquals(new int[]{6}, arr.frontPiece(new int[]{6}));
    }

    @Test
    public void testUnlucky1() {
        assertTrue(arr.unlucky1(new int[]{1, 3, 4, 5}));
        assertTrue(arr.unlucky1(new int[]{2, 1, 3, 4, 5}));
        assertFalse(arr.unlucky1(new int[]{1, 1, 1}));
        assertTrue(arr.unlucky1(new int[]{1, 3, 1}));
        assertTrue(arr.unlucky1(new int[]{1, 1, 3}));
        assertFalse(arr.unlucky1(new int[]{1, 2, 3}));
        assertFalse(arr.unlucky1(new int[]{3, 3, 3}));
        assertTrue(arr.unlucky1(new int[]{1, 3}));
        assertFalse(arr.unlucky1(new int[]{1, 4}));
        assertFalse(arr.unlucky1(new int[]{1}));
        assertFalse(arr.unlucky1(new int[]{}));
        assertFalse(arr.unlucky1(new int[]{1, 1, 1, 3, 1}));
        assertTrue(arr.unlucky1(new int[]{1, 1, 3, 1, 1}));
        assertTrue(arr.unlucky1(new int[]{1, 1, 1, 1, 3}));
        assertFalse(arr.unlucky1(new int[]{1, 4, 1, 5}));
        assertFalse(arr.unlucky1(new int[]{1, 1, 2, 3}));
        assertFalse(arr.unlucky1(new int[]{2, 3, 2, 1}));
        assertTrue(arr.unlucky1(new int[]{2, 3, 1, 3}));
        assertTrue(arr.unlucky1(new int[]{1, 2, 3, 4, 1, 3}));
    }

    @Test
    public void testMake2() {
        assertArrayEquals(new int[]{4, 5}, arr.make2(new int[]{4, 5}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 1}, arr.make2(new int[]{4}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2}, arr.make2(new int[]{}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, arr.make2(new int[]{1, 2}, new int[]{}));
        assertArrayEquals(new int[]{3, 1}, arr.make2(new int[]{3}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{3, 1}, arr.make2(new int[]{3}, new int[]{1}));
        assertArrayEquals(new int[]{3, 1}, arr.make2(new int[]{3, 1, 4}, new int[]{}));
        assertArrayEquals(new int[]{1, 1}, arr.make2(new int[]{1}, new int[]{1}));
        assertArrayEquals(new int[]{1, 2}, arr.make2(new int[]{1, 2, 3}, new int[]{7, 8}));
        assertArrayEquals(new int[]{7, 8}, arr.make2(new int[]{7, 8}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{7, 1}, arr.make2(new int[]{7}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 4}, arr.make2(new int[]{5, 4}, new int[]{2, 3, 7}));
    }

    @Test
    public void testFront11() {
        assertArrayEquals(new int[]{1, 7}, arr.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}));
        assertArrayEquals(new int[]{1, 2}, arr.front11(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1}, arr.front11(new int[]{1, 7}, new int[]{}));
        assertArrayEquals(new int[]{2}, arr.front11(new int[]{}, new int[]{2, 8}));
        assertArrayEquals(new int[]{}, arr.front11(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{3, 1}, arr.front11(new int[]{3}, new int[]{1, 4, 1, 9}));
        assertArrayEquals(new int[]{1}, arr.front11(new int[]{1, 4, 1, 9}, new int[]{}));
    }

}