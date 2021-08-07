package JavaCore.Module12.CardHashSet;

import java.util.Objects;

public class Card {
    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        if(rank == null || suit == null) {
            throw new IllegalArgumentException();
        }

        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank.equals(card.rank) && suit.equals(card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
