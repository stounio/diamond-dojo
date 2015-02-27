package com.codingdojo.diamond;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DiamondTest {

    @Test
    public void shouldDisplaySimplestDiamondPossible() throws Exception {
        Diamond diamond = new Diamond();
        assertThat(diamond.print(), is("A"));
    }

    @Test
    public void shouldProduceAThreeLevelDiamond() throws Exception {
        Diamond diamond = new Diamond('B');
        assertThat(diamond.print(), is(" A\nB B\n A"));
    }

    @Test
    public void shouldProduceAFiveLevelDiamond() throws Exception {
        Diamond diamond = new Diamond('C');
        assertThat(diamond.print(), is("  A\nB B\nC   C\nB B\n  A"));
    }

    @Test
    public void shouldDisplayADiamondThatStartsAndEndWithALetterBiggerThanA() throws Exception {
        Diamond diamond = new Diamond('B');
        assertThat(diamond.print(), is(
                        " A\n" +
                        "B B\n" +
                        " A"));
    }
}
