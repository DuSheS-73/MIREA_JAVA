package ru.mirea.praktika_7.ex2;

import java.util.LinkedList;
import java.util.Queue;

public class Source
{
    private static void addToDeck(Queue<Integer> deck, int ownCard, int opponentCard)
    {
        deck.offer(ownCard);
        deck.offer(opponentCard);
    }

    private static String gameExec(int[] firstPlayerCards, int[] secondPlayerCards)
    {
        int moves = 0;

        Queue<Integer> fCards = new LinkedList<>();
        Queue<Integer> sCards = new LinkedList<>();

        for (int i = 0; i < firstPlayerCards.length ; i++) {
            fCards.offer(firstPlayerCards[i]);
            sCards.offer(secondPlayerCards[i]);
        }

        while(fCards.isEmpty() == false && sCards.isEmpty() == false)
        {
            int fCard = fCards.poll();
            int sCard = sCards.poll();

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
