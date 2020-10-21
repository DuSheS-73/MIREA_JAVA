package ru.mirea.praktika_7.ex1;

import java.util.Stack;

public class Source
{
    private static void reverse(Stack<Integer> stack)
    {
        Stack<Integer> tempStack = new Stack<>();
        while(stack.isEmpty() == false)
            tempStack.push(stack.pop());

        for(var i : tempStack)
            stack.push(i);
    }

    private static void addToDeck(Stack<Integer> deck, int ownCard, int opponentCard)
    {
        reverse(deck);
        deck.push(ownCard);
        deck.push(opponentCard);
        reverse(deck);
    }


    private static String gameExec(int[] firstPlayerCards, int[] secondPlayerCards)
    {
        int moves = 0;

        Stack<Integer> fCards = new Stack<>();
        Stack<Integer> sCards = new Stack<>();

        for (int i = firstPlayerCards.length - 1; i >= 0 ; i--) {
            fCards.push(firstPlayerCards[i]);
            sCards.push(secondPlayerCards[i]);
        }

        while(fCards.isEmpty() == false && sCards.isEmpty() == false)
        {
            int fCard = fCards.pop();
            int sCard = sCards.pop();

            System.out.println(fCard + " " + sCard);

            if(fCard == 0 && sCard == 9)
                addToDeck(fCards, fCard, sCard);
            else if(sCard == 0 && fCard == 9)
                addToDeck(sCards, sCard, fCard);
            else if(fCard > sCard)
                addToDeck(fCards, fCard, sCard);
            else if(fCard < sCard)
                addToDeck(sCards, sCard, fCard);

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
