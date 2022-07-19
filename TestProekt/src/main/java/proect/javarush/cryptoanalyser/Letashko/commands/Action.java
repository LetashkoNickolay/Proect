package proect.javarush.cryptoanalyser.Letashko.commands;

import proect.javarush.cryptoanalyser.Letashko.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
