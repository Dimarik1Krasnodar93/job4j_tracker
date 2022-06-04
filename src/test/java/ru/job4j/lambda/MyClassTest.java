package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;
import org.junit.Assert;
import java.util.function.*;
import static org.hamcrest.core.Is.is;

public class MyClassTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {

        List<Double> result = MyClass.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenSquareResults() {
        List<Double> result = MyClass.diapason(5, 8, x -> Math.pow(x, 2) + 1);
        List<Double> expected = Arrays.asList(26D, 37D, 50D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenAXResults() {
        List<Double> result = MyClass.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expected));
    }
}