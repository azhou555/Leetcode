import java.util.Arrays;

public class revealCardsInDeckIncreasing {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] res = new int[n];

        Arrays.sort(deck);

        return everyOther(deck, res, 0, 0, false);
    }

    public int[] everyOther(int[] deck, int[] res, int indexInDeck, int indexInResult, boolean skip) {
        int n = deck.length;

        if (indexInDeck == n) {
            return res;
        }

        while (indexInResult < n) {
            if (res[indexInResult] == 0) {
                if (!skip) {
                    res[indexInResult] = deck[indexInDeck];
                    indexInDeck++;
                }
                skip = !skip;
            }
            indexInResult++;
        }

        return everyOther(deck, res, indexInDeck, 0, skip);
    }
}
