# Poker

## This was program made for a School project. Given all ranks and suits of a card you are tasked to find the best hand possible of the five cards. Doesn't include two pair and full house.

### Understanding the code:
1. Given the class 'Card' and enums 'Suit' and 'Rank', it makes a full deck of 52 'PokerCard' objects. Each containing a different suit and rank.
2. 5 random cards from the deck are selected and added to a hand object that holds all 5 cards. This hand is then sorted based on rank.
  *This is possible since 'PokerCard' implements the 'Compareable' and overrides to the 'CompareTo' method.
