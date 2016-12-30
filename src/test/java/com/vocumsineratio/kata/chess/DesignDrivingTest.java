package com.vocumsineratio.kata.chess;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DesignDrivingTest {
    /*
        "Generate a valid FischerFairyChessRow"

        That's actually a really good idea, but it's a bit underspecified.

        The first thing to recognize is the trap that generated a valid fairy chess row doesn't mean generate a
        row and test that it has all of the properties of a valid row in fairy chess.  You'd end up investing a
        bunch of work in a fairy chess specification class.  You need a row that satisfies those constraints, not
        a test that verifies those constraints -- at least, not explicitly

        The shortcut that we need: if we *match* a specific row, one that we know a priori would satisfy the specification,
        then our test can be that the implementation generates a match.  Once we're green, we can then start to
        explore alternative implementations that better express the model while still satisfying our constraint.

        So pick one -- any one will do, but if you want a choice that isn't completely arbitrary, realize that either
        of the standard arrangements of the pieces from standard chess will also satisfy the fairy chess constraints.

        It's still a coin flip - the black orientation mirrors the white orientation.  But white goes first.
     */

    @Test // STATUS: RED
    public void testThatWeCanGenerateOneUsefulRow () {
        Assert.assertEquals(generateFairyChessRow(), "RNBQKBRN");
    }

    private String generateFairyChessRow() {
        return null;  //TODO: To change body of created methods use File | Settings | File Templates.
    }
}
