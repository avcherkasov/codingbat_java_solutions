package com.codingbat.solution.task.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Recursion2Test
 * <p>
 * Harder recursion problems.
 * Currently, these are all recursive backtracking problems with arrays.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Recursion-2
 */
public class Recursion2Test {

    private Recursion2 recursion;

    @Before
    public void setUp() {
        recursion = new Recursion2();
    }

    @Test
    public void testGroupSum() {
        assertTrue(recursion.groupSum(0, new int[]{2, 4, 8}, 10));
        assertTrue(recursion.groupSum(0, new int[]{2, 4, 8}, 14));
        assertFalse(recursion.groupSum(0, new int[]{2, 4, 8}, 9));
        assertTrue(recursion.groupSum(0, new int[]{2, 4, 8}, 8));
        assertTrue(recursion.groupSum(1, new int[]{2, 4, 8}, 8));
        assertFalse(recursion.groupSum(1, new int[]{2, 4, 8}, 2));
        assertTrue(recursion.groupSum(0, new int[]{1}, 1));
        assertFalse(recursion.groupSum(0, new int[]{9}, 1));
        assertTrue(recursion.groupSum(1, new int[]{9}, 0));
        assertTrue(recursion.groupSum(0, new int[]{}, 0));
        assertTrue(recursion.groupSum(0, new int[]{10, 2, 2, 5}, 17));
        assertTrue(recursion.groupSum(0, new int[]{10, 2, 2, 5}, 15));
        assertTrue(recursion.groupSum(0, new int[]{10, 2, 2, 5}, 9));
    }

    @Test
    public void testGroupSum6() {
        assertTrue(recursion.groupSum6(0, new int[]{5, 6, 2}, 8));
        assertFalse(recursion.groupSum6(0, new int[]{5, 6, 2}, 9));
        assertFalse(recursion.groupSum6(0, new int[]{5, 6, 2}, 7));
        assertTrue(recursion.groupSum6(0, new int[]{1}, 1));
        assertFalse(recursion.groupSum6(0, new int[]{9}, 1));
        assertTrue(recursion.groupSum6(0, new int[]{}, 0));
        assertTrue(recursion.groupSum6(0, new int[]{3, 2, 4, 6}, 8));
        assertTrue(recursion.groupSum6(0, new int[]{6, 2, 4, 3}, 8));
        assertFalse(recursion.groupSum6(0, new int[]{5, 2, 4, 6}, 9));
        assertFalse(recursion.groupSum6(0, new int[]{6, 2, 4, 5}, 9));
        assertFalse(recursion.groupSum6(0, new int[]{3, 2, 4, 6}, 3));
        assertTrue(recursion.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 12));
        assertTrue(recursion.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 13));
        assertFalse(recursion.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 4));
        assertFalse(recursion.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 9));
        assertTrue(recursion.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 14));
        assertTrue(recursion.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 15));
        assertFalse(recursion.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 16));
    }

    @Test
    public void testGroupNoAdj() {
        assertTrue(recursion.groupNoAdj(0, new int[]{2, 5, 10, 4}, 12));
        assertFalse(recursion.groupNoAdj(0, new int[]{2, 5, 10, 4}, 14));
        assertFalse(recursion.groupNoAdj(0, new int[]{2, 5, 10, 4}, 7));
        assertTrue(recursion.groupNoAdj(0, new int[]{2, 5, 10, 4, 2}, 7));
        assertTrue(recursion.groupNoAdj(0, new int[]{2, 5, 10, 4}, 9));
        assertTrue(recursion.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 15));
        assertFalse(recursion.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 7));
        assertTrue(recursion.groupNoAdj(0, new int[]{}, 0));
        assertTrue(recursion.groupNoAdj(0, new int[]{1}, 1));
        assertFalse(recursion.groupNoAdj(0, new int[]{9}, 1));
        assertTrue(recursion.groupNoAdj(0, new int[]{9}, 0));
        assertTrue(recursion.groupNoAdj(0, new int[]{5, 10, 4, 1}, 11));
    }

    @Test
    public void testGroupSum5() {
        assertTrue(recursion.groupSum5(0, new int[]{2, 5, 10, 4}, 19));
        assertTrue(recursion.groupSum5(0, new int[]{2, 5, 10, 4}, 17));
        assertFalse(recursion.groupSum5(0, new int[]{2, 5, 10, 4}, 12));
        assertFalse(recursion.groupSum5(0, new int[]{2, 5, 4, 10}, 12));
        assertFalse(recursion.groupSum5(0, new int[]{3, 5, 1}, 4));
        assertTrue(recursion.groupSum5(0, new int[]{3, 5, 1}, 5));
        assertTrue(recursion.groupSum5(0, new int[]{1, 3, 5}, 5));
        assertFalse(recursion.groupSum5(0, new int[]{3, 5, 1}, 9));
        assertFalse(recursion.groupSum5(0, new int[]{2, 5, 10, 4}, 7));
        assertTrue(recursion.groupSum5(0, new int[]{2, 5, 10, 4}, 15));
        assertFalse(recursion.groupSum5(0, new int[]{2, 5, 10, 4}, 11));
        assertTrue(recursion.groupSum5(0, new int[]{1}, 1));
        assertFalse(recursion.groupSum5(0, new int[]{9}, 1));
        assertTrue(recursion.groupSum5(0, new int[]{9}, 0));
        assertTrue(recursion.groupSum5(0, new int[]{}, 0));
    }

    @Test
    public void testGroupSumClump() {
        assertTrue(recursion.groupSumClump(0, new int[]{2, 4, 8}, 10));
        assertTrue(recursion.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
        assertFalse(recursion.groupSumClump(0, new int[]{2, 4, 4, 8}, 14));
        assertTrue(recursion.groupSumClump(0, new int[]{8, 2, 2, 1}, 9));
        assertFalse(recursion.groupSumClump(0, new int[]{8, 2, 2, 1}, 11));
        assertTrue(recursion.groupSumClump(0, new int[]{1}, 1));
        assertFalse(recursion.groupSumClump(0, new int[]{9}, 1));
    }

    @Test
    public void testSplitArray() {
        assertTrue(recursion.splitArray(new int[]{2, 2}));
        assertFalse(recursion.splitArray(new int[]{2, 3}));
        assertTrue(recursion.splitArray(new int[]{5, 2, 3}));
        assertFalse(recursion.splitArray(new int[]{5, 2, 2}));
        assertTrue(recursion.splitArray(new int[]{1, 1, 1, 1, 1, 1}));
        assertFalse(recursion.splitArray(new int[]{1, 1, 1, 1, 1}));
        assertTrue(recursion.splitArray(new int[]{}));
        assertFalse(recursion.splitArray(new int[]{1}));
        assertFalse(recursion.splitArray(new int[]{3, 5}));
        assertTrue(recursion.splitArray(new int[]{5, 3, 2}));
        assertTrue(recursion.splitArray(new int[]{2, 2, 10, 10, 1, 1}));
        assertFalse(recursion.splitArray(new int[]{1, 2, 2, 10, 10, 1, 1}));
        assertTrue(recursion.splitArray(new int[]{1, 2, 3, 10, 10, 1, 1}));
    }

    @Test
    public void testSplitOdd10() {
        assertTrue(recursion.splitOdd10(new int[]{5, 5, 5}));
        assertFalse(recursion.splitOdd10(new int[]{5, 5, 6}));
        assertTrue(recursion.splitOdd10(new int[]{5, 5, 6, 1}));
        assertTrue(recursion.splitOdd10(new int[]{6, 5, 5, 1}));
        assertTrue(recursion.splitOdd10(new int[]{6, 5, 5, 1, 10}));
        assertFalse(recursion.splitOdd10(new int[]{6, 5, 5, 5, 1}));
        assertTrue(recursion.splitOdd10(new int[]{1}));
        assertFalse(recursion.splitOdd10(new int[]{}));
        assertTrue(recursion.splitOdd10(new int[]{10, 7, 5, 5}));
        assertFalse(recursion.splitOdd10(new int[]{10, 0, 5, 5}));
        assertTrue(recursion.splitOdd10(new int[]{10, 7, 5, 5, 2}));
        assertFalse(recursion.splitOdd10(new int[]{10, 7, 5, 5, 1}));
    }

    @Test
    public void testSplit53() {
        assertTrue(recursion.split53(new int[]{1, 1}));
        assertFalse(recursion.split53(new int[]{1, 1, 1}));
        assertTrue(recursion.split53(new int[]{2, 4, 2}));
        assertFalse(recursion.split53(new int[]{2, 2, 2, 1}));
        assertTrue(recursion.split53(new int[]{3, 3, 5, 1}));
        assertFalse(recursion.split53(new int[]{3, 5, 8}));
        assertTrue(recursion.split53(new int[]{2, 4, 6}));
        assertTrue(recursion.split53(new int[]{3, 5, 6, 10, 3, 3}));
    }

}