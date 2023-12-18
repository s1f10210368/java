package org.iniad.se.sample12.sample1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import java.time.LocalDate;

public class UserTest {
    private User user;
    @Before
    public void setUp() {
        user = new User("Enryo", "Inoue", LocalDate.of(2000, 3, 18));
    }
    @Test
    public void testConstructor() {
        assertThat(user.getFirstName(), is("Enryo"));
        assertThat(user.getFamilyName(), is("Inoue"));
    }
    @Test
    public void testGetName(){
        assertThat(user.getName(), is("Enryo Inoue"));
    }
    @Test
    public void testGetAge() {
        assertThat(user.getAge(LocalDate.of(2017, 4, 1)), is(17));
    }
}
