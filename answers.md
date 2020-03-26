1. a deck is a class that contains a list of card objects and some methods that handle the cards

2. when I made the constructor I assumed that the arrays would all be the same length, so it would assume there are three cards because it looks at String[] ranks to determine the size of the deck, then it would give an out of bounds exception for suits[2]

3. ranks would be an array of four of every rank, suits would just repeat spades, clubs, hearts, diamonds 13 times, and point values would match whichever rank it is

4. yes