package ru.job4j;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.conditoin.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
}
