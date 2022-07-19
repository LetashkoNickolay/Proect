package proect.javarush.cryptoanalyser.Letashko.controller;

import proect.javarush.cryptoanalyser.Letashko.commands.Action;
import proect.javarush.cryptoanalyser.Letashko.commands.Decoder;
import proect.javarush.cryptoanalyser.Letashko.commands.Encoder;

public enum Actions {

    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String command) {
        return Actions.valueOf(command.toUpperCase()).action;

    }
}
