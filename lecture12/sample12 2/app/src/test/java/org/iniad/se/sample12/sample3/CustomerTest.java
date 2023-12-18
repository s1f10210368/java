package org.iniad.se.sample12.sample3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerTest {
    private Customer customer;
    @Before
    public void setUp() {
        customer = new Customer("Taro");
        customer.charge(100);
    }
    @Test
    public void testGetBalance() {
        assertThat(customer.getBalance(), is(100));
    }
    @Test
    public void testWithdraw() {
        customer.withdraw(60);
        assertThat(customer.getBalance(), is(40));
    }
    @Test
    public void testGetName() {
        assertThat(customer.getName(), is("Taro"));
    }
}
