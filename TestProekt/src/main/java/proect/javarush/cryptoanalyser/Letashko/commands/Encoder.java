package proect.javarush.cryptoanalyser.Letashko.commands;

import proect.javarush.cryptoanalyser.Letashko.entity.Result;
import proect.javarush.cryptoanalyser.Letashko.entity.ResultCode;
import proect.javarush.cryptoanalyser.Letashko.exception.ApplicationException;
import proect.javarush.cryptoanalyser.Letashko.util.PathFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


import java.util.List;

import static proect.javarush.cryptoanalyser.Letashko.contants.Strings.ALPHABET;


public class Encoder implements Action {

            public static void main(String[] args) {
                List arr = Collections.singletonList(ALPHABET);
                String openText = "АПЕЛЬСИН";
                String lockedText = "ТВЧЮОДЫА";
                String test = "";
                List<String> openList = Arrays.asList(openText.split(""));  /*удаляем пробелы, если они есть, из исходной фразы*/
                int count = 0;
                for (int i = 0; i < arr.size(); i++) {
                    ListIterator<String> listIter = openList.listIterator();
                    while (listIter.hasNext()) {
                        String k = listIter.next();
                        if ((arr.indexOf(k.charAt(0)) + count) < arr.size()) {
                            test += arr.get(arr.indexOf(k.charAt(0)) + count);
                        } else {
                            test += arr.get((arr.indexOf(k.charAt(0)) + count) - arr.size());
                        }
                    }
                    if (test.equals(lockedText)) {
                        System.out.println(count);
                        break;
                    } else {
                        test ="";
                        count++;
                    }
                }

            }

    @Override
    public Result execute(String[] parameters) {
        return null;
    }
}
