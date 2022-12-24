package ru.mirea.lab5.task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final BufferedImage image = ImageIO.read(new File(args[0]));
        JFrame frame = new JFrame("Draw image");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(image.getWidth(), image.getHeight());
        frame.setVisible(true);

        final JLabel label = new JLabel();
        label.setIcon(new ImageIcon(image));
        frame.add(label);
        label.updateUI();
    }
}
