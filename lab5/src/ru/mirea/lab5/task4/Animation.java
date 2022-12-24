package ru.mirea.lab5.task4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Animation {
    private int count;

    public Animation() {
        count = 1;
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(320, 320);
        frame.setVisible(true);

        final JLabel label = new JLabel();
        frame.add(label);

        ActionListener listener = new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                try {
                    label.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/homer/homer-" + count + ".jpg"))));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                label.repaint();
                count++;
                if (count == 11) count = 1;
            }
        };

        Timer timer = new Timer(100, listener);
        timer.start();
    }

    public static void main(String[] args) {
        new Animation();
    }
}
