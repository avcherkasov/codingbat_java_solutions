package com.codingbat.solution.task.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Recursion1Test
 * <p>
 * Basic recursion problems.
 * Recursion strategy: first test for one or two base cases that are so simple,
 * the answer can be returned immediately.
 * Otherwise, make a recursive a call for a smaller case
 * (that is, a case which is a step towards the base case).
 * Assume that the recursive call works correctly,
 * and fix up what it returns to make the answer.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Recursion-1
 */
public class Recursion1Test {

    private Recursion1 recursion;

    @Before
    public void setUp() {
        recursion = new Recursion1();
    }

    @Test
    public void testFactorial() {
        assertEquals("Recursion Factorial - 1", 1, recursion.factorial(1));
        assertEquals("Recursion Factorial - 2", 2, recursion.factorial(2));
        assertEquals("Recursion Factorial - 3", 6, recursion.factorial(3));
        assertEquals("Recursion Factorial - 4", 24, recursion.factorial(4));
        assertEquals("Recursion Factorial - 5", 120, recursion.factorial(5));
        assertEquals("Recursion Factorial - 6", 720, recursion.factorial(6));
        assertEquals("Recursion Factorial - 7", 5040, recursion.factorial(7));
        assertEquals("Recursion Factorial - 8", 40320, recursion.factorial(8));
        assertEquals("Recursion Factorial - 12", 479001600, recursion.factorial(12));
    }

    @Test
    public void testBunnyEars() {
        assertEquals(0, recursion.bunnyEars(0));
        assertEquals(2, recursion.bunnyEars(1));
        assertEquals(4, recursion.bunnyEars(2));
        assertEquals(6, recursion.bunnyEars(3));
        assertEquals(8, recursion.bunnyEars(4));
        assertEquals(10, recursion.bunnyEars(5));
        assertEquals(24, recursion.bunnyEars(12));
        assertEquals(100, recursion.bunnyEars(50));
        assertEquals(468, recursion.bunnyEars(234));
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, recursion.fibonacci(0));
        assertEquals(1, recursion.fibonacci(1));
        assertEquals(1, recursion.fibonacci(2));
        assertEquals(2, recursion.fibonacci(3));
        assertEquals(3, recursion.fibonacci(4));
        assertEquals(5, recursion.fibonacci(5));
        assertEquals(8, recursion.fibonacci(6));
        assertEquals(13, recursion.fibonacci(7));
    }

    @Test
    public void testBunnyEars2() {
        assertEquals(this.getClass() + " BunnyEars2 - 1", 0, recursion.bunnyEars2(0));
        assertEquals(this.getClass() + " BunnyEars2 - 2", 2, recursion.bunnyEars2(1));
        assertEquals(this.getClass() + " BunnyEars2 - 3", 5, recursion.bunnyEars2(2));
        assertEquals(this.getClass() + " BunnyEars2 - 4", 7, recursion.bunnyEars2(3));
        assertEquals(this.getClass() + " BunnyEars2 - 5", 10, recursion.bunnyEars2(4));
        assertEquals(this.getClass() + " BunnyEars2 - 6", 12, recursion.bunnyEars2(5));
        assertEquals(this.getClass() + " BunnyEars2 - 7", 15, recursion.bunnyEars2(6));
        assertEquals(this.getClass() + " BunnyEars2 - 8", 25, recursion.bunnyEars2(10));
    }

    @Test
    public void testTriangle() {
        assertEquals(0, recursion.triangle(0));
        assertEquals(1, recursion.triangle(1));
        assertEquals(3, recursion.triangle(2));
        assertEquals(6, recursion.triangle(3));
        assertEquals(10, recursion.triangle(4));
        assertEquals(15, recursion.triangle(5));
        assertEquals(21, recursion.triangle(6));
        assertEquals(28, recursion.triangle(7));
    }

    @Test
    public void testSumDigits() {
        assertEquals(9, recursion.sumDigits(126));
        assertEquals(13, recursion.sumDigits(49));
        assertEquals(3, recursion.sumDigits(12));
        assertEquals(1, recursion.sumDigits(10));
        assertEquals(1, recursion.sumDigits(1));
        assertEquals(0, recursion.sumDigits(0));
        assertEquals(10, recursion.sumDigits(730));
        assertEquals(4, recursion.sumDigits(1111));
        assertEquals(5, recursion.sumDigits(11111));
        assertEquals(3, recursion.sumDigits(10110));
        assertEquals(10, recursion.sumDigits(235));
    }

    @Test
    public void testCount7() {
        assertEquals(2, recursion.count7(717));
        assertEquals(1, recursion.count7(7));
        assertEquals(0, recursion.count7(123));
        assertEquals(2, recursion.count7(77));
        assertEquals(1, recursion.count7(7123));
        assertEquals(3, recursion.count7(771237));
        assertEquals(4, recursion.count7(771737));
        assertEquals(2, recursion.count7(47571));
        assertEquals(6, recursion.count7(777777));
        assertEquals(4, recursion.count7(70701277));
        assertEquals(5, recursion.count7(777576197));
        assertEquals(0, recursion.count7(99999));
        assertEquals(1, recursion.count7(99799));
    }

    @Test
    public void testCount8() {
        assertEquals(1, recursion.count8(8));
        assertEquals(2, recursion.count8(818));
        assertEquals(4, recursion.count8(8818));
        assertEquals(4, recursion.count8(8088));
        assertEquals(0, recursion.count8(123));
        assertEquals(2, recursion.count8(81238));
        assertEquals(6, recursion.count8(88788));
        assertEquals(1, recursion.count8(8234));
        assertEquals(1, recursion.count8(2348));
        assertEquals(3, recursion.count8(23884));
        assertEquals(0, recursion.count8(0));
        assertEquals(5, recursion.count8(1818188));
        assertEquals(5, recursion.count8(8818181));
        assertEquals(1, recursion.count8(1080));
        assertEquals(3, recursion.count8(188));
        assertEquals(9, recursion.count8(88888));
        assertEquals(2, recursion.count8(9898));
        assertEquals(1, recursion.count8(78));
    }

    @Test
    public void testPowerN() {
        assertEquals(3, recursion.powerN(3, 1));
        assertEquals(9, recursion.powerN(3, 2));
        assertEquals(27, recursion.powerN(3, 3));
        assertEquals(2, recursion.powerN(2, 1));
        assertEquals(4, recursion.powerN(2, 2));
        assertEquals(8, recursion.powerN(2, 3));
        assertEquals(16, recursion.powerN(2, 4));
        assertEquals(32, recursion.powerN(2, 5));
        assertEquals(10, recursion.powerN(10, 1));
        assertEquals(100, recursion.powerN(10, 2));
        assertEquals(1000, recursion.powerN(10, 3));
    }

    @Test
    public void testCountX() {
        assertEquals(4, recursion.countX("xxhixx"));
        assertEquals(3, recursion.countX("xhixhix"));
        assertEquals(0, recursion.countX("hi"));
        assertEquals(0, recursion.countX("h"));
        assertEquals(1, recursion.countX("x"));
        assertEquals(0, recursion.countX(""));
        assertEquals(0, recursion.countX("hihi"));
        assertEquals(0, recursion.countX("hiAAhi12hi"));
    }

    @Test
    public void testCountHi() {
        assertEquals(1, recursion.countHi("xxhixx"));
        assertEquals(2, recursion.countHi("xhixhix"));
        assertEquals(1, recursion.countHi("hi"));
        assertEquals(2, recursion.countHi("hihih"));
        assertEquals(0, recursion.countHi("h"));
        assertEquals(0, recursion.countHi(""));
        assertEquals(4, recursion.countHi("ihihihihih"));
        assertEquals(5, recursion.countHi("ihihihihihi"));
        assertEquals(3, recursion.countHi("hiAAhi12hi"));
        assertEquals(3, recursion.countHi("xhixhxihihhhih"));
        assertEquals(1, recursion.countHi("ship"));
    }

    @Test
    public void testChangeXY() {
        assertEquals("codey", recursion.changeXY("codex"));
        assertEquals("yyhiyy", recursion.changeXY("xxhixx"));
        assertEquals("yhiyhiy", recursion.changeXY("xhixhix"));
        assertEquals("hiy", recursion.changeXY("hiy"));
        assertEquals("h", recursion.changeXY("h"));
        assertEquals("y", recursion.changeXY("x"));
        assertEquals("", recursion.changeXY(""));
        assertEquals("yyy", recursion.changeXY("xxx"));
        assertEquals("yyhyyi", recursion.changeXY("yyhxyi"));
        assertEquals("hihi", recursion.changeXY("hihi"));
    }

    @Test
    public void testChangePi() {
        assertEquals("x3.14x", recursion.changePi("xpix"));
        assertEquals("3.143.14", recursion.changePi("pipi"));
        assertEquals("3.14p", recursion.changePi("pip"));
        assertEquals("3.14", recursion.changePi("pi"));
        assertEquals("hip", recursion.changePi("hip"));
        assertEquals("p", recursion.changePi("p"));
        assertEquals("x", recursion.changePi("x"));
        assertEquals("", recursion.changePi(""));
        assertEquals("3.14xx", recursion.changePi("pixx"));
        assertEquals("xyzzy", recursion.changePi("xyzzy"));
    }

    @Test
    public void testNoX() {
        assertEquals("ab", recursion.noX("xaxb"));
        assertEquals("abc", recursion.noX("abc"));
        assertEquals("", recursion.noX("xx"));
        assertEquals("", recursion.noX(""));
        assertEquals("ab", recursion.noX("axxbxx"));
        assertEquals("Hello", recursion.noX("Hellox"));
    }

    @Test
    public void testArray6() {
        assertTrue(recursion.array6(new int[]{1, 6, 4}, 0));
        assertFalse(recursion.array6(new int[]{1, 4}, 0));
        assertTrue(recursion.array6(new int[]{6}, 0));
        assertFalse(recursion.array6(new int[]{}, 0));
        assertTrue(recursion.array6(new int[]{6, 2, 2}, 0));
        assertFalse(recursion.array6(new int[]{2, 5}, 0));
        assertTrue(recursion.array6(new int[]{1, 9, 4, 6, 6}, 0));
        assertTrue(recursion.array6(new int[]{2, 5, 6}, 0));
    }

    @Test
    public void testArray11() {
        assertEquals(1, recursion.array11(new int[]{1, 2, 11}, 0));
        assertEquals(2, recursion.array11(new int[]{11, 11}, 0));
        assertEquals(0, recursion.array11(new int[]{1, 2, 3, 4}, 0));
        assertEquals(3, recursion.array11(new int[]{1, 11, 3, 11, 11}, 0));
        assertEquals(1, recursion.array11(new int[]{11}, 0));
        assertEquals(0, recursion.array11(new int[]{1}, 0));
        assertEquals(0, recursion.array11(new int[]{}, 0));
        assertEquals(2, recursion.array11(new int[]{11, 2, 3, 4, 11, 5}, 0));
        assertEquals(2, recursion.array11(new int[]{11, 5, 11}, 0));
    }

    @Test
    public void testArray220() {
        assertTrue(recursion.array220(new int[]{1, 2, 20}, 0));
        assertTrue(recursion.array220(new int[]{3, 30}, 0));
        assertFalse(recursion.array220(new int[]{3}, 0));
        assertFalse(recursion.array220(new int[]{}, 0));
        assertTrue(recursion.array220(new int[]{3, 3, 30, 4}, 0));
        assertFalse(recursion.array220(new int[]{2, 19, 4}, 0));
        assertFalse(recursion.array220(new int[]{20, 2, 21}, 0));
        assertTrue(recursion.array220(new int[]{20, 2, 21, 210}, 0));
        assertTrue(recursion.array220(new int[]{2, 200, 2000}, 0));
        assertTrue(recursion.array220(new int[]{0, 0}, 0));
        assertFalse(recursion.array220(new int[]{1, 2, 3, 4, 5, 6}, 0));
        assertTrue(recursion.array220(new int[]{1, 2, 3, 4, 5, 50, 6}, 0));
        assertFalse(recursion.array220(new int[]{1, 2, 3, 4, 5, 51, 6}, 0));
        assertTrue(recursion.array220(new int[]{1, 2, 3, 4, 4, 50, 500, 6}, 0));
    }

    @Test
    public void testAllStar() {
        assertEquals("h*e*l*l*o", recursion.allStar("hello"));
        assertEquals("a*b*c", recursion.allStar("abc"));
        assertEquals("a*b", recursion.allStar("ab"));
        assertEquals("a", recursion.allStar("a"));
        assertEquals("", recursion.allStar(""));
        assertEquals("3*.*1*4", recursion.allStar("3.14"));
        assertEquals("C*h*o*c*o*l*a*t*e", recursion.allStar("Chocolate"));
        assertEquals("1*2*3*4", recursion.allStar("1234"));
    }

    @Test
    public void testPairStar() {
        assertEquals("hel*lo", recursion.pairStar("hello"));
        assertEquals("x*xy*y", recursion.pairStar("xxyy"));
        assertEquals("a*a*a*a", recursion.pairStar("aaaa"));
        assertEquals("a*a*ab", recursion.pairStar("aaab"));
        assertEquals("a*a", recursion.pairStar("aa"));
        assertEquals("a", recursion.pairStar("a"));
        assertEquals("", recursion.pairStar(""));
        assertEquals("noadjacent", recursion.pairStar("noadjacent"));
        assertEquals("ab*ba", recursion.pairStar("abba"));
        assertEquals("ab*b*ba", recursion.pairStar("abbba"));
    }

    @Test
    public void testEndX() {
        assertEquals("rexx", recursion.endX("xxre"));
        assertEquals("hixxxx", recursion.endX("xxhixx"));
        assertEquals("hihixxx", recursion.endX("xhixhix"));
        assertEquals("hiy", recursion.endX("hiy"));
        assertEquals("h", recursion.endX("h"));
        assertEquals("x", recursion.endX("x"));
        assertEquals("xx", recursion.endX("xx"));
        assertEquals("", recursion.endX(""));
        assertEquals("bxx", recursion.endX("bxx"));
        assertEquals("baxx", recursion.endX("bxax"));
        assertEquals("aaaxxx", recursion.endX("axaxax"));
        assertEquals("hixxx", recursion.endX("xxhxi"));
    }

    @Test
    public void testCountPairs() {
        assertEquals(1, recursion.countPairs("axa"));
        assertEquals(2, recursion.countPairs("axax"));
        assertEquals(1, recursion.countPairs("axbx"));
        assertEquals(0, recursion.countPairs("hi"));
        assertEquals(3, recursion.countPairs("hihih"));
        assertEquals(3, recursion.countPairs("ihihhh"));
        assertEquals(0, recursion.countPairs("ihjxhh"));
        assertEquals(0, recursion.countPairs(""));
        assertEquals(0, recursion.countPairs("a"));
        assertEquals(0, recursion.countPairs("aa"));
        assertEquals(1, recursion.countPairs("aaa"));
    }

    @Test
    public void testCountAbc() {
        assertEquals(1, recursion.countAbc("abc"));
        assertEquals(2, recursion.countAbc("abcxxabc"));
        assertEquals(2, recursion.countAbc("abaxxaba"));
        assertEquals(2, recursion.countAbc("ababc"));
        assertEquals(0, recursion.countAbc("abxbc"));
        assertEquals(1, recursion.countAbc("aaabc"));
        assertEquals(0, recursion.countAbc("hello"));
        assertEquals(0, recursion.countAbc(""));
        assertEquals(0, recursion.countAbc("ab"));
        assertEquals(1, recursion.countAbc("aba"));
        assertEquals(0, recursion.countAbc("aca"));
        assertEquals(0, recursion.countAbc("aaa"));
    }

    @Test
    public void testCount11() {
        assertEquals(2, recursion.count11("11abc11"));
        assertEquals(3, recursion.count11("abc11x11x11"));
        assertEquals(1, recursion.count11("111"));
        assertEquals(2, recursion.count11("1111"));
        assertEquals(0, recursion.count11("1"));
        assertEquals(0, recursion.count11(""));
        assertEquals(0, recursion.count11("hi"));
        assertEquals(4, recursion.count11("11x111x1111"));
        assertEquals(1, recursion.count11("1x111"));
        assertEquals(0, recursion.count11("1Hello1"));
        assertEquals(0, recursion.count11("Hello"));
    }

    @Test
    public void testStringClean() {
        assertEquals("yza", recursion.stringClean("yyzzza"));
        assertEquals("abcd", recursion.stringClean("abbbcdd"));
        assertEquals("Helo", recursion.stringClean("Hello"));
        assertEquals("XabcY", recursion.stringClean("XXabcYY"));
        assertEquals("12ab45", recursion.stringClean("112ab445"));
        assertEquals("Helo Bokeper", recursion.stringClean("Hello Bookkeeper"));
    }

    @Test
    public void testCountHi2() {
        assertEquals(1, recursion.countHi2("ahixhi"));
        assertEquals(2, recursion.countHi2("ahibhi"));
        assertEquals(0, recursion.countHi2("xhixhi"));
        assertEquals(1, recursion.countHi2("hixhi"));
        assertEquals(2, recursion.countHi2("hixhhi"));
        assertEquals(3, recursion.countHi2("hihihi"));
        assertEquals(3, recursion.countHi2("hihihix"));
        assertEquals(2, recursion.countHi2("xhihihix"));
        assertEquals(0, recursion.countHi2("xxhi"));
        assertEquals(1, recursion.countHi2("hixxhi"));
        assertEquals(1, recursion.countHi2("hi"));
        assertEquals(0, recursion.countHi2("xxxx"));
        assertEquals(0, recursion.countHi2("h"));
        assertEquals(0, recursion.countHi2("x"));
        assertEquals(0, recursion.countHi2(""));
        assertEquals(1, recursion.countHi2("Hellohi"));
    }

    @Test
    public void testParenBit() {
        assertEquals("(abc)", recursion.parenBit("xyz(abc)123"));
        assertEquals("(hello)", recursion.parenBit("x(hello)"));
        assertEquals("(xy)", recursion.parenBit("(xy)1"));
        assertEquals("(possible)", recursion.parenBit("not really (possible)"));
        assertEquals("(abc)", recursion.parenBit("(abc)"));
        assertEquals("(abc)", recursion.parenBit("(abc)xyz"));
        assertEquals("(abc)", recursion.parenBit("(abc)x"));
        assertEquals("(x)", recursion.parenBit("(x)"));
        assertEquals("()", recursion.parenBit("()"));
        assertEquals("(ipsa)", recursion.parenBit("res (ipsa) loquitor"));
        assertEquals("(not really)", recursion.parenBit("hello(not really)there"));
        assertEquals("(ab)", recursion.parenBit("ab(ab)ab"));
    }

    @Test
    public void testNestParen() {
        assertTrue(recursion.nestParen("(())"));
        assertTrue(recursion.nestParen("((()))"));
        assertFalse(recursion.nestParen("(((x))"));
        assertFalse(recursion.nestParen("((())"));
        assertFalse(recursion.nestParen("((()()"));
        assertTrue(recursion.nestParen("()"));
        assertTrue(recursion.nestParen(""));
        assertFalse(recursion.nestParen("(yy)"));
        assertTrue(recursion.nestParen("(())"));
        assertFalse(recursion.nestParen("(((y))"));
        assertFalse(recursion.nestParen("((y)))"));
        assertTrue(recursion.nestParen("((()))"));
        assertFalse(recursion.nestParen("(())))"));
        assertFalse(recursion.nestParen("((yy())))"));
        assertTrue(recursion.nestParen("(((())))"));
    }

    @Test
    public void testStrCount() {
        assertEquals(2, recursion.strCount("catcowcat", "cat"));
        assertEquals(1, recursion.strCount("catcowcat", "cow"));
        assertEquals(0, recursion.strCount("catcowcat", "dog"));
        assertEquals(2, recursion.strCount("cacatcowcat", "cat"));
        assertEquals(2, recursion.strCount("xyx", "x"));
        assertEquals(4, recursion.strCount("iiiijj", "i"));
        assertEquals(2, recursion.strCount("iiiijj", "ii"));
        assertEquals(1, recursion.strCount("iiiijj", "iii"));
        assertEquals(2, recursion.strCount("iiiijj", "j"));
        assertEquals(1, recursion.strCount("iiiijj", "jj"));
        assertEquals(4, recursion.strCount("aaabababab", "ab"));
        assertEquals(1, recursion.strCount("aaabababab", "aa"));
        assertEquals(6, recursion.strCount("aaabababab", "a"));
        assertEquals(4, recursion.strCount("aaabababab", "b"));
    }

    @Test
    public void testStrCopies() {
        assertTrue(recursion.strCopies("catcowcat", "cat", 2));
        assertFalse(recursion.strCopies("catcowcat", "cow", 2));
        assertTrue(recursion.strCopies("catcowcat", "cow", 1));
        assertTrue(recursion.strCopies("iiijjj", "i", 3));
        assertFalse(recursion.strCopies("iiijjj", "i", 4));
        assertTrue(recursion.strCopies("iiijjj", "ii", 2));
        assertFalse(recursion.strCopies("iiijjj", "ii", 3));
        assertFalse(recursion.strCopies("iiijjj", "x", 3));
        assertTrue(recursion.strCopies("iiijjj", "x", 0));
        assertTrue(recursion.strCopies("iiiiij", "iii", 3));
        assertFalse(recursion.strCopies("iiiiij", "iii", 4));
        assertTrue(recursion.strCopies("ijiiiiij", "iiii", 2));
        assertFalse(recursion.strCopies("ijiiiiij", "iiii", 3));
        assertTrue(recursion.strCopies("dogcatdogcat", "dog", 2));
    }

    @Test
    public void testStrDist() {
        assertEquals(9, recursion.strDist("catcowcat", "cat"));
        assertEquals(3, recursion.strDist("catcowcat", "cow"));
        assertEquals(9, recursion.strDist("cccatcowcatxx", "cat"));
        assertEquals(12, recursion.strDist("abccatcowcatcatxyz", "cat"));
        assertEquals(3, recursion.strDist("xyx", "x"));
        assertEquals(1, recursion.strDist("xyx", "y"));
        assertEquals(0, recursion.strDist("xyx", "z"));
        assertEquals(1, recursion.strDist("z", "z"));
        assertEquals(0, recursion.strDist("x", "z"));
        assertEquals(0, recursion.strDist("", "z"));
        assertEquals(13, recursion.strDist("hiHellohihihi", "hi"));
        assertEquals(5, recursion.strDist("hiHellohihihi", "hih"));
        assertEquals(1, recursion.strDist("hiHellohihihi", "o"));
        assertEquals(2, recursion.strDist("hiHellohihihi", "ll"));
    }

}