# Poker

## This was program made for a School project. Given all ranks and suits of a card you are tasked to find the best hand possible of the five cards. Doesn't include two pair and full house.

### Understanding the code:
1. Given the class ['Card'](https://github.com/TheFosh/Poker/blob/main/Poker/src/poker/Card.java) and enums ['Suit'](https://github.com/TheFosh/Poker/blob/main/Poker/src/poker/Suit.java) and ['Rank'](https://github.com/TheFosh/Poker/blob/main/Poker/src/poker/Rank.java), a full deck of 52 ['PokerCard'](Poker/src/poker/PokerCard.java) objects. Each containing a different suit and rank.
2. 5 random cards from the deck are selected and added to a ['Hand'](https://github.com/TheFosh/Poker/blob/main/Poker/src/poker/Hand.java) object that holds all 5 cards. This hand is then sorted based on rank.
   * This is possible since 'PokerCard' implements the 'Compareable' and overrides the 'CompareTo' method.
3. All cards are then checked to see what score the hand has. Starts from highest possible score to least.
   * Project didn't include the hands for two pairs and full house.
