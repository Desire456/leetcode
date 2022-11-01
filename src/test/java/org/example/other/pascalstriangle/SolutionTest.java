package org.example.other.pascalstriangle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void generate() {
        var solution = new Solution();

        assertEquals(
                List.of(
                        List.of(1),
                        List.of(1, 1),
                        List.of(1, 2, 1),
                        List.of(1, 3, 3, 1),
                        List.of(1, 4, 6, 4, 1)),
                solution.generate(5));

        assertEquals(
                List.of(
                        List.of(1)
                ),
                solution.generate(1)
        );
    }
}
