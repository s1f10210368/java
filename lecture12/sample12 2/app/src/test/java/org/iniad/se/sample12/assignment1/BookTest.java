package org.iniad.se.sample12.assignment1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class BookTest {
    private Book instance;
    @Before
    public void init() {
        instance = new Book("Hello", 1000);
    }
    @Test
    public void testGetName() {
        assertThat(instance.getName(), is("Hello"));
    }
    @Test
    public void testGetTaxPrice() {
        assertThat(instance.getTaxPrice(), is(1100));
    }
}