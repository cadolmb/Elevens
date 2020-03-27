Buggy 1

method testEmpty thinks that the deck is empty even though it has one card, 

Buggy 2

method in DeckTester testOneCard thinks the variable size is zero when it should be 1

Buggy 3

the sequence of cards is the same when it should have shuffled.

Buggy 4

1st dealt card is null for a 1-card deck. So, probably removed the card or decremented the
size too early or trying to access the wrong index of the list

Buggy 5

index -1 out of bounds -- a very common error if there is a + 1 that isn't there or a - 1 that shouldn't be there, or if a variable is decremented too early. 