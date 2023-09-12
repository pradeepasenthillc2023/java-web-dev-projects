package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void emptyStringShouldReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void singlePairOfBracketsShouldReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void multiplePairsOfBracketsShouldReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[()]{}"));
    }

    @Test
    public void nestedBracketsShouldReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[({})]"));
    }
    @Test
    public void bracketsWithOtherCharactersShouldReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[b(c)d]e{f}"));
    }

    @Test
    public void unbalancedBracketsShouldReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void unbalancedNestedBracketsShouldReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[({})"));
    }

    @Test
    public void unbalancedBracketsWithOtherCharactersShouldReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("a[b(c)d"));
    }
    /*@Test
    public void bracketsInWrongOrderShouldReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }*/

    /*@Test
    public void bracketsInWrongOrderWithOtherCharactersShouldReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("a]b[c"));
    }

    @Test
    public void mismatchedBracketsShouldReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[{]}"));
    }*/

    @Test
    public void extraClosingBracketsShouldReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[()]{}]"));
    }
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}