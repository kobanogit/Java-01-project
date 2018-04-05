package fr.wildcodeschool.idetest;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class Start {
    public static void main(String... args) throws IOException {
        System.out.println(ProcessHandle.current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(new ImageIcon(new URL("http://tumalo.redmond.k12.or.us/files/2013/08/apple-touch-icon-precomposed.png"))));
        jf.pack();
        jf.setVisible(true);
    }
}
