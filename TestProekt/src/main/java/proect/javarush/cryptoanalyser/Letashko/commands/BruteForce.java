package proect.javarush.cryptoanalyser.Letashko.commands;

import proect.javarush.cryptoanalyser.Letashko.contants.Strings;

import java.util.Collections;
import java.util.List;

abstract class ProtectedBox {
    public static boolean checkKey(String key) {
        return Boolean.parseBoolean(key);
    }

    public static String getSecretPhrase(String key) {
        return key;
    }
}

public class BruteForce {

    public static final int MAX_KEY_SIZE = 5;

    public static void main(String... args) {
String strings = String.valueOf(generateSymbols());



        Link link = initLinks(Collections.singletonList(strings), MAX_KEY_SIZE);


        StringBuilder key = new StringBuilder();
        while (!ProtectedBox.checkKey(key.toString())) {
            link.next();
            key.setLength(0);
            link.getKey(key);
        }


        System.out.println("Действительный ключ=" + key);
        System.out.println("Секретная фраза=" +
                ProtectedBox.getSecretPhrase(key.toString()));

    }


    private static Link initLinks(List symbols, int level) {
        if (level > 0) {
            return new Link(symbols, initLinks(symbols, level - 1));
        }
        return null;
    }

    private static Strings generateSymbols() {
        Strings strings = new Strings();
        return  strings;
    }

}

class Link {


    private int currentIndex = -1;
    private List<Character> symbols;
    private Link next;

    public Link(List<Character> symbols, Link link) {
        this.symbols = symbols;
        this.next = link;
    }


    public void next() {
        currentIndex++;
        if (currentIndex == symbols.size()) {
            currentIndex = 0;
            if (next != null) {
                next.next();
            }
        }
    }

    public void getKey(StringBuilder generateKey) {
        if (next != null) {
            next.getKey(generateKey);
        }
        if (currentIndex > -1) {
            generateKey.append(symbols.get(currentIndex));
        }
    }

}
