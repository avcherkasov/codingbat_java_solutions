package com.codingbat.solution.task.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Logic2Test
 * <p>
 * Medium boolean logic puzzles -- if else && || !
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Logic-2
 */
public class Logic2Test {

    private Logic2 logic;

    @Before
    public void setUp() {
        logic = new Logic2();
    }

    @Test
    public void testMakeBricks() {
        assertTrue(logic.makeBricks(3, 1, 8));
        assertFalse(logic.makeBricks(3, 1, 9));
        assertTrue(logic.makeBricks(3, 2, 10));
        assertTrue(logic.makeBricks(3, 2, 8));
        assertFalse(logic.makeBricks(3, 2, 9));
        assertTrue(logic.makeBricks(6, 1, 11));
        assertFalse(logic.makeBricks(6, 0, 11));
        assertTrue(logic.makeBricks(1, 4, 11));
        assertTrue(logic.makeBricks(0, 3, 10));
        assertFalse(logic.makeBricks(1, 4, 12));
        assertTrue(logic.makeBricks(3, 1, 7));
        assertFalse(logic.makeBricks(1, 1, 7));
        assertTrue(logic.makeBricks(2, 1, 7));
        assertTrue(logic.makeBricks(7, 1, 11));
        assertTrue(logic.makeBricks(7, 1, 8));
        assertFalse(logic.makeBricks(7, 1, 13));
        assertTrue(logic.makeBricks(43, 1, 46));
        assertFalse(logic.makeBricks(40, 1, 46));
        assertTrue(logic.makeBricks(40, 2, 47));
        assertTrue(logic.makeBricks(40, 2, 50));
        assertFalse(logic.makeBricks(40, 2, 52));
        assertFalse(logic.makeBricks(22, 2, 33));
        assertTrue(logic.makeBricks(0, 2, 10));
        assertTrue(logic.makeBricks(1000000, 1000, 1000100));
        assertFalse(logic.makeBricks(2, 1000000, 100003));
        assertTrue(logic.makeBricks(20, 0, 19));
        assertFalse(logic.makeBricks(20, 0, 21));
        assertFalse(logic.makeBricks(20, 4, 51));
        assertTrue(logic.makeBricks(20, 4, 39));
    }

    @Test
    public void testLoneSum() {
        assertEquals(6, logic.loneSum(1, 2, 3));
        assertEquals(2, logic.loneSum(3, 2, 3));
        assertEquals(0, logic.loneSum(3, 3, 3));
        assertEquals(9, logic.loneSum(9, 2, 2));
        assertEquals(9, logic.loneSum(2, 2, 9));
        assertEquals(9, logic.loneSum(2, 9, 2));
        assertEquals(14, logic.loneSum(2, 9, 3));
        assertEquals(9, logic.loneSum(4, 2, 3));
        assertEquals(3, logic.loneSum(1, 3, 1));
    }

    @Test
    public void testLuckySum() {
        assertEquals(6, logic.luckySum(1, 2, 3));
        assertEquals(3, logic.luckySum(1, 2, 13));
        assertEquals(1, logic.luckySum(1, 13, 3));
        assertEquals(1, logic.luckySum(1, 13, 13));
        assertEquals(13, logic.luckySum(6, 5, 2));
        assertEquals(0, logic.luckySum(13, 2, 3));
        assertEquals(0, logic.luckySum(13, 2, 13));
        assertEquals(0, logic.luckySum(13, 13, 2));
        assertEquals(13, logic.luckySum(9, 4, 13));
        assertEquals(8, logic.luckySum(8, 13, 2));
        assertEquals(10, logic.luckySum(7, 2, 1));
        assertEquals(6, logic.luckySum(3, 3, 13));
    }

    @Test
    public void testNoTeenSum() {
        assertEquals(6, logic.noTeenSum(1, 2, 3));
        assertEquals(3, logic.noTeenSum(2, 13, 1));
        assertEquals(3, logic.noTeenSum(2, 1, 14));
        assertEquals(18, logic.noTeenSum(2, 1, 15));
        assertEquals(19, logic.noTeenSum(2, 1, 16));
        assertEquals(3, logic.noTeenSum(2, 1, 17));
        assertEquals(3, logic.noTeenSum(17, 1, 2));
        assertEquals(19, logic.noTeenSum(2, 15, 2));
        assertEquals(16, logic.noTeenSum(16, 17, 18));
        assertEquals(0, logic.noTeenSum(17, 18, 19));
        assertEquals(32, logic.noTeenSum(15, 16, 1));
        assertEquals(30, logic.noTeenSum(15, 15, 19));
        assertEquals(31, logic.noTeenSum(15, 19, 16));
        assertEquals(5, logic.noTeenSum(5, 17, 18));
        assertEquals(16, logic.noTeenSum(17, 18, 16));
        assertEquals(0, logic.noTeenSum(17, 19, 18));
    }

    @Test
    public void testRoundSum() {
        assertEquals(60, logic.roundSum(16, 17, 18));
        assertEquals(30, logic.roundSum(12, 13, 14));
        assertEquals(10, logic.roundSum(6, 4, 4));
        assertEquals(20, logic.roundSum(4, 6, 5));
        assertEquals(10, logic.roundSum(4, 4, 6));
        assertEquals(10, logic.roundSum(9, 4, 4));
        assertEquals(0, logic.roundSum(0, 0, 1));
        assertEquals(10, logic.roundSum(0, 9, 0));
        assertEquals(40, logic.roundSum(10, 10, 19));
        assertEquals(90, logic.roundSum(20, 30, 40));
        assertEquals(100, logic.roundSum(45, 21, 30));
        assertEquals(60, logic.roundSum(23, 11, 26));
        assertEquals(70, logic.roundSum(23, 24, 25));
        assertEquals(80, logic.roundSum(25, 24, 25));
        assertEquals(70, logic.roundSum(23, 24, 29));
        assertEquals(70, logic.roundSum(11, 24, 36));
        assertEquals(90, logic.roundSum(24, 36, 32));
        assertEquals(50, logic.roundSum(14, 12, 26));
        assertEquals(40, logic.roundSum(12, 10, 24));
    }

    @Test
    public void testCloseFar() {
        assertTrue(logic.closeFar(1, 2, 10));
        assertFalse(logic.closeFar(1, 2, 3));
        assertTrue(logic.closeFar(4, 1, 3));
        assertFalse(logic.closeFar(4, 5, 3));
        assertFalse(logic.closeFar(4, 3, 5));
        assertTrue(logic.closeFar(-1, 10, 0));
        assertTrue(logic.closeFar(0, -1, 10));
        assertTrue(logic.closeFar(10, 10, 8));
        assertFalse(logic.closeFar(10, 8, 9));
        assertFalse(logic.closeFar(8, 9, 10));
        assertFalse(logic.closeFar(8, 9, 7));
        assertTrue(logic.closeFar(8, 6, 9));
    }

    @Test
    public void testBlackjack() {
        assertEquals(21, logic.blackjack(19, 21));
        assertEquals(21, logic.blackjack(21, 19));
        assertEquals(19, logic.blackjack(19, 22));
        assertEquals(19, logic.blackjack(22, 19));
        assertEquals(0, logic.blackjack(22, 50));
        assertEquals(0, logic.blackjack(22, 22));
        assertEquals(1, logic.blackjack(33, 1));
        assertEquals(2, logic.blackjack(1, 2));
        assertEquals(0, logic.blackjack(34, 33));
        assertEquals(19, logic.blackjack(17, 19));
        assertEquals(18, logic.blackjack(18, 17));
        assertEquals(16, logic.blackjack(16, 23));
        assertEquals(4, logic.blackjack(3, 4));
        assertEquals(3, logic.blackjack(3, 2));
        assertEquals(21, logic.blackjack(21, 20));
    }

    @Test
    public void testEvenlySpaced() {
        assertTrue(logic.evenlySpaced(2, 4, 6));
        assertTrue(logic.evenlySpaced(4, 6, 2));
        assertFalse(logic.evenlySpaced(4, 6, 3));
        assertTrue(logic.evenlySpaced(6, 2, 4));
        assertFalse(logic.evenlySpaced(6, 2, 8));
        assertTrue(logic.evenlySpaced(2, 2, 2));
        assertFalse(logic.evenlySpaced(2, 2, 3));
        assertTrue(logic.evenlySpaced(9, 10, 11));
        assertTrue(logic.evenlySpaced(10, 9, 11));
        assertFalse(logic.evenlySpaced(10, 9, 9));
        assertFalse(logic.evenlySpaced(2, 4, 4));
        assertFalse(logic.evenlySpaced(2, 2, 4));
        assertFalse(logic.evenlySpaced(3, 6, 12));
        assertFalse(logic.evenlySpaced(12, 3, 6));
    }

    @Test
    public void testMakeChocolate() {
        assertEquals(4, logic.makeChocolate(4, 1, 9));
        assertEquals(-1, logic.makeChocolate(4, 1, 10));
        assertEquals(2, logic.makeChocolate(4, 1, 7));
        assertEquals(2, logic.makeChocolate(6, 2, 7));
        assertEquals(0, logic.makeChocolate(4, 1, 5));
        assertEquals(4, logic.makeChocolate(4, 1, 4));
        assertEquals(4, logic.makeChocolate(5, 4, 9));
        assertEquals(3, logic.makeChocolate(9, 3, 18));
        assertEquals(-1, logic.makeChocolate(3, 1, 9));
        assertEquals(-1, logic.makeChocolate(1, 2, 7));
        assertEquals(1, logic.makeChocolate(1, 2, 6));
        assertEquals(0, logic.makeChocolate(1, 2, 5));
        assertEquals(5, logic.makeChocolate(6, 1, 10));
        assertEquals(6, logic.makeChocolate(6, 1, 11));
        assertEquals(-1, logic.makeChocolate(6, 1, 12));
        assertEquals(-1, logic.makeChocolate(6, 1, 13));
        assertEquals(0, logic.makeChocolate(6, 2, 10));
        assertEquals(1, logic.makeChocolate(6, 2, 11));
        assertEquals(2, logic.makeChocolate(6, 2, 12));
        assertEquals(50, logic.makeChocolate(60, 100, 550));
        assertEquals(6, logic.makeChocolate(1000, 1000000, 5000006));
        assertEquals(7, logic.makeChocolate(7, 1, 12));
        assertEquals(-1, logic.makeChocolate(7, 1, 13));
        assertEquals(3, logic.makeChocolate(7, 2, 13));
    }

}