package JavaCore.Module12.CardHashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Card card1 = new Card("6","chervi");// yeah, i could do like this from previous example,
//        Card cardN = new Card(...)// but i will try faster version

        Set<Card> cardSet = new HashSet<>();

        cardSet.add(new Card("6","chervi"));
        cardSet.add(new Card("7","chervi"));
        cardSet.add(new Card("8","chervi"));
        cardSet.add(new Card("9","chervi"));
        cardSet.add(new Card("10","chervi"));
        cardSet.add(new Card("valet","chervi"));
        cardSet.add(new Card("dama","chervi"));
        cardSet.add(new Card("korol","chervi"));
        cardSet.add(new Card("tuz","chervi"));

        cardSet.add(new Card("6","peeky"));
        cardSet.add(new Card("7","peeky"));
        cardSet.add(new Card("8","peeky"));
        cardSet.add(new Card("9","peeky"));
        cardSet.add(new Card("10","peeky"));
        cardSet.add(new Card("valet","peeky"));
        cardSet.add(new Card("dama","peeky"));
        cardSet.add(new Card("korol","peeky"));
        cardSet.add(new Card("tuz","peeky"));

        cardSet.add(new Card("6","cresti"));
        cardSet.add(new Card("7","cresti"));
        cardSet.add(new Card("8","cresti"));
        cardSet.add(new Card("9","cresti"));
        cardSet.add(new Card("10","cresti"));
        cardSet.add(new Card("valet","cresti"));
        cardSet.add(new Card("dama","cresti"));
        cardSet.add(new Card("korol","cresti"));
        cardSet.add(new Card("tuz","cresti"));

        cardSet.add(new Card("6","buby"));
        cardSet.add(new Card("7","buby"));
        cardSet.add(new Card("8","buby"));
        cardSet.add(new Card("9","buby"));
        cardSet.add(new Card("10","buby"));
        cardSet.add(new Card("valet","buby"));
        cardSet.add(new Card("dama","buby"));
        cardSet.add(new Card("korol","buby"));
        cardSet.add(new Card("tuz","buby"));

        for(Card card : cardSet) {
            System.out.println(card);
        }
    }
}
