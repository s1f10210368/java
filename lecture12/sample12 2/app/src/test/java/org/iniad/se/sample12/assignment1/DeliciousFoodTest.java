package org.iniad.se.sample12.assignment1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeliciousFoodTest {
    private DeliciousFood instance;
    @Before
    public void init() {
        instance = new DeliciousFood("Apple Pie", 1000);
    }
    @Test
    public void testGetName() {
        assertThat(instance.getName(), is("Apple Pie"));
    }
    @Test
    public void testGetTaxPrice() {
        assertThat(instance.getTaxPrice(), is(1080));
    }
    @Test
    public void testGetTaste() {
        assertThat(instance.getTaste(), is("Delicious"));
    }
}
