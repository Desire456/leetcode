package org.example.strings.reversestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void reverseString() {
        var solution = new Solution();

        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        char[] reversedHello = {'o', 'l', 'l', 'e', 'h'};

        solution.reverseString(hello);
        assertArrayEquals(reversedHello, hello);

        char[] hannah = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] reversedHannah = {'h', 'a', 'n', 'n', 'a', 'H'};

        solution.reverseString(hannah);
        assertArrayEquals(reversedHannah, hannah);
    }
}
