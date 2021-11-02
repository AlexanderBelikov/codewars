package info.belikov.codewars.k3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RomanNumNumeralsTest {
    @Test
    public void testToRoman() throws Exception {
        assertThat("1 converts to 'I'", RomanNumerals.toRoman(9), is("IX"));
        assertThat("2 converts to 'II'", RomanNumerals.toRoman(2), is("II"));
    }

    @Test
    public void testFromRoman() throws Exception {
        assertThat("'I' converts to 1", RomanNumerals.fromRoman("IV"), is(4));
        assertThat("'II' converts to 2", RomanNumerals.fromRoman("MDCLXVI"), is(1666 ));
    }
}