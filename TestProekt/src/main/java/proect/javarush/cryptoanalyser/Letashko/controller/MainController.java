package proect.javarush.cryptoanalyser.Letashko.controller;

import proect.javarush.cryptoanalyser.Letashko.commands.Action;
import proect.javarush.cryptoanalyser.Letashko.entity.Result;
import proect.javarush.cryptoanalyser.Letashko.entity.ResultCode;
import proect.javarush.cryptoanalyser.Letashko.exception.ApplicationException;

public class MainController {
    public Result execute(String command, String[] parameters) {
        try {
            Action action=Actions.find(command);
            return action.execute(parameters);
        } catch (ApplicationException e){
            return new Result(ResultCode.ERROR,e.getMessage());
        }

    }
}
