package org.iniad.se.sample12.assignment2;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class OperatorTest {
    @Test
    public void testGetChild() {
        Operator op = new Operator("+");
        Number num1 = new Number(1.0f);
        op.add(num1);
        assertThat(op.getChild(0), is((Expression)num1));
    }

    @Test
    public void testAdd() {
        Operator op = new Operator("+");
        Number num1 = new Number(1.0f);
        Number num2 = new Number(2.0f);
        op.add(num1);
        op.add(num2);
        assertThat(op.eval(), is(3.0f));
    }

    @Test
    public void testMinus() {
        Operator op = new Operator("-");
        Number num1 = new Number(1.0f);
        Number num2 = new Number(2.0f);
        op.add(num1);
        op.add(num2);
        assertThat(op.eval(), is(-1.0f));
    }

    @Test
    public void testMul() {
        Operator op = new Operator("*");
        Number num1 = new Number(1.0f);
        Number num2 = new Number(2.0f);
        op.add(num1);
        op.add(num2);
        assertThat(op.eval(), is(2.0f));
    }

    @Test
    public void testDiv() {
        Operator op = new Operator("/");
        Number num1 = new Number(1.0f);
        Number num2 = new Number(2.0f);
        op.add(num1);
        op.add(num2);
        assertThat(op.eval(), is(0.5f));
    }

    @Test(expected=UnsupportedOperationException.class)
    public void testEval() {
        Operator op = new Operator("+");
        Number num1 = new Number(1.0f);
        op.add(num1);
        op.eval();
    }

    @Test(expected=UnsupportedOperationException.class)
    public void testUnknown() {
        Operator op = new Operator("?");
        Number num1 = new Number(1.0f);
        Number num2 = new Number(2.0f);
        op.add(num1);
        op.add(num2);
        op.eval();
    }
}