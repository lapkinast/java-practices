package ru.mirea.lab5.task1;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        AtomicInteger countMilan = new AtomicInteger();
        AtomicInteger countMadrid = new AtomicInteger();

        JFrame frame = new JFrame("AC Milan vs Real Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);
        JPanel panel= new JPanel();
        panel.setPreferredSize( new Dimension(250,150));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        buttonPanel.add(milanButton);
        buttonPanel.add(madridButton);

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(3,1));
        JLabel resultLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
        JLabel lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);
        labelPanel.add(resultLabel);
        labelPanel.add(lastScorerLabel);
        labelPanel.add(winnerLabel);

        panel.add(buttonPanel);
        panel.add(labelPanel);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        milanButton.addActionListener(e -> {
            countMilan.getAndIncrement();
            resultLabel.setText("Result: " + countMilan + " X " + countMadrid);
            lastScorerLabel.setText("Last Scorer: AC Milan");
            if (countMilan.get() > countMadrid.get()) winnerLabel.setText("Winner: AC Milan");
            if (countMilan.get() == countMadrid.get()) winnerLabel.setText("Winner: DRAW");
            if (countMilan.get() < countMadrid.get()) winnerLabel.setText("Winner: Real Madrid");
        });
        madridButton.addActionListener(e -> {
            countMadrid.getAndIncrement();
            resultLabel.setText("Result: " + countMilan + " X " + countMadrid);
            lastScorerLabel.setText("Last Scorer: Real Madrid");
            if (countMilan.get() > countMadrid.get()) winnerLabel.setText("Winner: AC Milan");
            if (countMilan.get() == countMadrid.get()) winnerLabel.setText("Winner: DRAW");
            if (countMilan.get() < countMadrid.get()) winnerLabel.setText("Winner: Real Madrid");
        });
    }
}
