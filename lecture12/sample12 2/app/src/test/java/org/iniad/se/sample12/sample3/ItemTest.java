package org.iniad.se.sample12.sample3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItemTest {
    private Item item;
    private Seller seller;
    @Before
    public void setUp() {
        seller = new Seller("Tanaka", "Tocho");
        item = new Item(seller, "Ramen", 400);
    }
    @Test
    public void testGetSeller() {
        assertThat(item.getSeller(), is(seller));
    }
    @Test
    public void testGetName() {
        assertThat(item.getName(), is("Ramen"));
    }
    @Test
    public void testGetPrice() {
        assertThat(item.getPrice(), is(400));
    }
}
