package ru.mirea.praktika_7.ex3;

import java.util.ArrayDeque;

public class Source
{
    private static void addToDeck(ArrayDeque<Integer> deck, int ownCard, int opponentCard)
    {
        deck.offerLast(ownCard);
        deck.offerLast(opponentCard);
    }

    private static String gameExec(int[] firstPlayerCards, int[] secondPlayerCards)
    {
        int moves = 0;

        ArrayDeque<Integer> fCards = new ArrayDeque<>();
        ArrayDeque<Integer> sCards = new ArrayDeque<>();

        for (int i = 0; i < firstPlayerCards.length ; i++) {
            fCards.offerLast(firstPlayerCards[i]);
            sCards.offerLast(secondPlayerCards[i]);
        }

        while(fCards.isEmpty() == false && sCards.isEmpty() == false)
        {
            int fCard = fCards.pollFirst();
            int sCard = sCards.pollFirst();

            System.out.println(fCard + " " + sCard);

            if(fCard == 0 && sCard == 9)
            {
                addToDeck(fCards, fCard, sCard);
            }
            else if(sCard == 0 && fCard == 9)
            {
                addToDeck(sCards, sCard, fCard);
            }
            else if(fCard > sCard)
            {
                addToDeck(fCards, fCard, sCard);
            }
            else if(fCard < sCard)
            {
                addToDeck(sCards, sCard, fCard);
            }

            moves++;

            if(moves == 106)
                return "botva";
        }

        if(fCards.isEmpty())
            return "second " + moves;
        else
            return "first " + moves;
    }
    public static void main(String[] args)
    {
        System.out.println(gameExec(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8, 0}));
    }
}
