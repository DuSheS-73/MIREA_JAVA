package ru.mirea.praktika_4;

import javax.swing.*;
import java.awt.*;

public class MatchTable extends JFrame
{
    private String Team1;
    private String Team2;
    private int Score1;
    private int Score2;
    String winner;
    String lastScorer;

    // [ 0 ] [ 1 ] [ 2 ]
    // [ 3 ] [ 4 ] [ 5 ]
    // [ 6 ] [ 7 ] [ 8 ]
    private JPanel[] panels = new JPanel[9];

    public MatchTable(String Team1, String Team2)
    {
        super(Team1 + " - " + Team2);

        this.Team1 = Team1;
        this.Team2 = Team2;
        this.Score1 = 0;
        this.Score2 = 0;
        this.winner = "DRAW";
        this.lastScorer = "N/A";

        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            add(panels[i]);
        }

        panels[4].setLayout(new FlowLayout());
        panels[4].add(new JLabel("Winner: " + winner));
        panels[4].add(new JLabel("Result: " + Score1 + " X " + Score2));
        panels[4].add(new JLabel("Last Scorer: " + lastScorer));

        panels[6].setLayout(new FlowLayout());
        JButton Team1AddScore = new JButton(Team1);
        Team1AddScore.addActionListener(e -> { addScore(Team1); });
        panels[6].add(Team1AddScore);

        panels[8].setLayout(new FlowLayout());
        JButton Team2AddScore = new JButton(Team2);
        Team2AddScore.addActionListener(e -> { addScore(Team2); });
        panels[8].add(Team2AddScore);

        setSize(500, 400);
        setVisible(true);
    }

    private void addScore(String Team)
    {
        if(Team == Team1)
        {
            Score1++;
            lastScorer = Team1;
        }
        else
        {
            Score2++;
            lastScorer = Team2;
        }

        if(Score1 > Score2)
            winner = Team1;
        else if(Score1 < Score2)
            winner = Team2;
        else
            winner = "DRAW";

        // Refreshing Panel
        panels[4].removeAll();
        panels[4].add(new JLabel("Winner: " + winner));
        panels[4].add(new JLabel("Result: " + Score1 + " X " + Score2));
        panels[4].add(new JLabel("Last Scorer: " + lastScorer));

        // Refreshing Frame
        revalidate();
        repaint();
    }
}
