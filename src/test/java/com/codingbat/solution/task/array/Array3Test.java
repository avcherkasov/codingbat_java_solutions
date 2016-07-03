package com.codingbat.solution.task.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Array3Test
 * <p>
 * Harder array problems -- 2 loops, more complex logic.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Array-3
 */
public class Array3Test {

    private Array3 arr;

    @Before
    public void setUp() {
        arr = new Array3();
    }

    @Test
    public void testMaxSpan() {
        assertEquals(4, arr.maxSpan(new int[]{1, 2, 1, 1, 3}));
        assertEquals(6, arr.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        assertEquals(6, arr.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
        assertEquals(3, arr.maxSpan(new int[]{3, 3, 3}));
        assertEquals(3, arr.maxSpan(new int[]{3, 9, 3}));
        assertEquals(2, arr.maxSpan(new int[]{3, 9, 9}));
        assertEquals(1, arr.maxSpan(new int[]{3, 9}));
        assertEquals(2, arr.maxSpan(new int[]{3, 3}));
        assertEquals(0, arr.maxSpan(new int[]{}));
        assertEquals(1, arr.maxSpan(new int[]{1}));
    }

    @Test
    public void testFix34() {
        assertArrayEquals(new int[]{1, 3, 4, 1}, arr.fix34(new int[]{1, 3, 1, 4}));
        assertArrayEquals(new int[]{1, 3, 4, 1, 1, 3, 4}, arr.fix34(new int[]{1, 3, 1, 4, 4, 3, 1}));
        assertArrayEquals(new int[]{3, 4, 2, 2}, arr.fix34(new int[]{3, 2, 2, 4}));
        assertArrayEquals(new int[]{3, 4, 3, 4, 2, 2}, arr.fix34(new int[]{3, 2, 3, 2, 4, 4}));
        assertArrayEquals(new int[]{2, 3, 4, 3, 4, 2, 2}, arr.fix34(new int[]{2, 3, 2, 3, 2, 4, 4}));
        assertArrayEquals(new int[]{3, 4, 1}, arr.fix34(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{3, 4, 1}, arr.fix34(new int[]{3, 4, 1}));
        assertArrayEquals(new int[]{1, 1, 1}, arr.fix34(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{1}, arr.fix34(new int[]{1}));
        assertArrayEquals(new int[]{}, arr.fix34(new int[]{}));
        assertArrayEquals(new int[]{7, 3, 4, 7, 7}, arr.fix34(new int[]{7, 3, 7, 7, 4}));
        assertArrayEquals(new int[]{3, 4, 1, 3, 4, 1}, arr.fix34(new int[]{3, 1, 4, 3, 1, 4}));
        assertArrayEquals(new int[]{3, 4, 1, 3, 4, 1}, arr.fix34(new int[]{3, 1, 1, 3, 4, 4}));
    }

    @Test
    public void testFix45() {
        assertArrayEquals(new int[]{9, 4, 5, 4, 5, 9}, arr.fix45(new int[]{5, 4, 9, 4, 9, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 1}, arr.fix45(new int[]{1, 4, 1, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 1, 1, 4, 5}, arr.fix45(new int[]{1, 4, 1, 5, 5, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 9, 9, 4, 5, 9}, arr.fix45(new int[]{4, 9, 4, 9, 5, 5, 4, 9, 5}));
        assertArrayEquals(new int[]{1, 1, 4, 5, 4, 5}, arr.fix45(new int[]{5, 5, 4, 1, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 2, 2}, arr.fix45(new int[]{4, 2, 2, 5}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 2, 2}, arr.fix45(new int[]{4, 2, 4, 2, 5, 5}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 2}, arr.fix45(new int[]{4, 2, 4, 5, 5}));
        assertArrayEquals(new int[]{1, 1, 1}, arr.fix45(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{4, 5}, arr.fix45(new int[]{4, 5}));
        assertArrayEquals(new int[]{1, 4, 5}, arr.fix45(new int[]{5, 4, 1}));
        assertArrayEquals(new int[]{}, arr.fix45(new int[]{}));
        assertArrayEquals(new int[]{1, 4, 5, 4, 5}, arr.fix45(new int[]{5, 4, 5, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 1}, arr.fix45(new int[]{4, 5, 4, 1, 5}));
        assertArrayEquals(new int[]{3, 4, 5}, arr.fix45(new int[]{3, 4, 5}));
        assertArrayEquals(new int[]{4, 5, 1}, arr.fix45(new int[]{4, 1, 5}));
        assertArrayEquals(new int[]{1, 4, 5}, arr.fix45(new int[]{5, 4, 1}));
        assertArrayEquals(new int[]{2, 4, 5, 2}, arr.fix45(new int[]{2, 4, 2, 5}));
    }

    @Test
    public void testCanBalance() {
        assertTrue(arr.canBalance(new int[]{1, 1, 1, 2, 1}));
        assertFalse(arr.canBalance(new int[]{2, 1, 1, 2, 1}));
        assertTrue(arr.canBalance(new int[]{10, 10}));
        assertTrue(arr.canBalance(new int[]{10, 0, 1, -1, 10}));
        assertTrue(arr.canBalance(new int[]{1, 1, 1, 1, 4}));
        assertFalse(arr.canBalance(new int[]{2, 1, 1, 1, 4}));
        assertFalse(arr.canBalance(new int[]{2, 3, 4, 1, 2}));
        assertTrue(arr.canBalance(new int[]{1, 2, 3, 1, 0, 2, 3}));
        assertFalse(arr.canBalance(new int[]{1, 2, 3, 1, 0, 1, 3}));
        assertFalse(arr.canBalance(new int[]{1}));
        assertTrue(arr.canBalance(new int[]{1, 1, 1, 2, 1}));
    }

    @Test
    public void testLinearIn() {
        assertTrue(arr.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        assertFalse(arr.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        assertTrue(arr.linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
        assertTrue(arr.linearIn(new int[]{2, 2, 4, 4, 6, 6}, new int[]{2, 4}));
        assertTrue(arr.linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 2}));
        assertFalse(arr.linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 4}));
        assertTrue(arr.linearIn(new int[]{2, 2, 2, 2, 4}, new int[]{2, 4}));
        assertTrue(arr.linearIn(new int[]{1, 2, 3}, new int[]{2}));
        assertFalse(arr.linearIn(new int[]{1, 2, 3}, new int[]{-1}));
        assertTrue(arr.linearIn(new int[]{1, 2, 3}, new int[]{}));
        assertTrue(arr.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 0, 3, 12}));
        assertFalse(arr.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{0, 3, 12, 14}));
        assertFalse(arr.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 10, 11}));
    }

    @Test
    public void testSquareUp() {
        assertArrayEquals(new int[]{0, 0, 1, 0, 2, 1, 3, 2, 1}, arr.squareUp(3));
        assertArrayEquals(new int[]{0, 1, 2, 1}, arr.squareUp(2));
        assertArrayEquals(new int[]{0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}, arr.squareUp(4));
        assertArrayEquals(new int[]{1}, arr.squareUp(1));
        assertArrayEquals(new int[]{}, arr.squareUp(0));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1}, arr.squareUp(6));
    }

    @Test
    public void testSeriesUp() {
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3}, arr.seriesUp(3));
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}, arr.seriesUp(4));
        assertArrayEquals(new int[]{1, 1, 2}, arr.seriesUp(2));
        assertArrayEquals(new int[]{1}, arr.seriesUp(1));
        assertArrayEquals(new int[]{}, arr.seriesUp(0));
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}, arr.seriesUp(6));
    }

    @Test
    public void testMaxMirror() {
        assertEquals(3, arr.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        assertEquals(3, arr.maxMirror(new int[]{1, 2, 1, 4}));
        assertEquals(2, arr.maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
        assertEquals(4, arr.maxMirror(new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}));
        assertEquals(4, arr.maxMirror(new int[]{1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}));
        assertEquals(5, arr.maxMirror(new int[]{1, 2, 3, 2, 1}));
        assertEquals(2, arr.maxMirror(new int[]{1, 2, 3, 3, 8}));
        assertEquals(2, arr.maxMirror(new int[]{1, 2, 7, 8, 1, 7, 2}));
        assertEquals(3, arr.maxMirror(new int[]{1, 1, 1}));
        assertEquals(1, arr.maxMirror(new int[]{1}));
        assertEquals(0, arr.maxMirror(new int[]{}));
        assertEquals(3, arr.maxMirror(new int[]{9, 1, 1, 4, 2, 1, 1, 1}));
        assertEquals(7, arr.maxMirror(new int[]{5, 9, 9, 4, 5, 4, 9, 9, 2}));
        assertEquals(2, arr.maxMirror(new int[]{5, 9, 9, 6, 5, 4, 9, 9, 2}));
        assertEquals(3, arr.maxMirror(new int[]{5, 9, 1, 6, 5, 4, 1, 9, 5}));
    }

    @Test
    public void testCountClumps() {
        assertEquals(2, arr.countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        assertEquals(2, arr.countClumps(new int[]{1, 1, 2, 1, 1}));
        assertEquals(1, arr.countClumps(new int[]{1, 1, 1, 1, 1}));
        assertEquals(0, arr.countClumps(new int[]{1, 2, 3}));
        assertEquals(4, arr.countClumps(new int[]{2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(4, arr.countClumps(new int[]{0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(5, arr.countClumps(new int[]{0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(5, arr.countClumps(new int[]{0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(0, arr.countClumps(new int[]{}));
    }

}