package proect.javarush.cryptoanalyser.swing;

import proect.javarush.cryptoanalyser.Letashko.commands.Anylaiz;
import proect.javarush.cryptoanalyser.Letashko.commands.BruteForce;
import proect.javarush.cryptoanalyser.Letashko.commands.Decoder;
import proect.javarush.cryptoanalyser.Letashko.commands.Encoder;

import javax.swing.*;


public class SwingInter extends JFrame{
    private JButton Anylise;
    private JButton Decod;
    private JButton Encod;
    private JButton BruteForse;
    private JPanel Inter;

    private void createUIComponents() {
        this.add(Inter);
        Encod.addActionListener( e -> {
                Encoder encoder = new Encoder();
        });

        Anylise.addActionListener(e -> {
            Anylaiz anylaiz = new Anylaiz();
        });

        BruteForse.addActionListener( e -> {
            BruteForce bruteForce = new BruteForce();

        });

        Decod.addActionListener( e -> {
            Decoder decoder = new Decoder();
        });

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
}}
