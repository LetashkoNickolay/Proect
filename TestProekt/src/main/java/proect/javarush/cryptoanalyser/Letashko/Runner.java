package proect.javarush.cryptoanalyser.Letashko;

import proect.javarush.cryptoanalyser.Letashko.toplevel.Application;
import proect.javarush.cryptoanalyser.Letashko.controller.MainController;
import proect.javarush.cryptoanalyser.Letashko.entity.Result;
import proect.javarush.cryptoanalyser.swing.SwingInter;

import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Result result=application.run(args);
        System.out.println(result);
    }

    public static class SwingRunner {

        public static void main(String[] args) {

            SwingInter swingInter = new SwingInter();
        }


}}
