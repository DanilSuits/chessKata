# Fischer Chess Positions in TDD

A re-examination of a TDD kata proposed long ago

https://groups.yahoo.com/neo/groups/testdrivendevelopment/conversations/topics/2648

## Introduction

> The original challenge was raised by Peter Siebel

> In a variant of chess called Fischer Random Chess, you start the
board in a (partially) random position according to the following
rules. You place the pawns in their normal starting positions. Then
you place the white pieces in the first rank in a random arrangement
excepting that:

> * The bishops are each on different colored squares.
> * The king is somewhere between the two rooks.

> Then the black pieces are placed in there corresponding places on the
other side of the board.

> Write a function (method, procedure, whatever) that returns a
randomly generated legal arrangement of the eight white pieces.

I then felt strongly that a number of people in the discussion got
themselves off to the wrong foot in terms of understanding that the
bootstrap position should start from delivery of some business value;
I used a different spelling at the time, but today I would say that
the steps are

1. (RED) Write a test that documents the _currently unrealized_ business value
2. (GREEN) Hack in an implementation that realizes that value
3. (REFACTOR) Incorporate that implementation into your design

At the time, Kent Beck tried to call my attention to the fact that I wasn't
paying enough attention to step #3; looking back on it, I don't think
any of us were.

None of us were doing any **design**; we were just jumping between tests
and implementations without, for example, making any of the code _reusable_
outside of the little test sandbox.

So we'll call that work we all did so many years ago a "spike", throw it
away, and start over, putting more attention on step #3.