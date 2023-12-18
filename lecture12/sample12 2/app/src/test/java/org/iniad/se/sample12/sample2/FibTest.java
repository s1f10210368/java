package org.iniad.se.sample12.sample2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FibTest {
    @Test
    public void testFib() {
        assertThat(Fib.fib(10), is(55));
    }
    @Test(expected = UnsupportedOperationException.class)
    public void testFib2() {
        Fib.fib(-1);
    }
    @Test(timeout = 100)
    public void testFib3() {
        Fib.fib(40);
    }
}