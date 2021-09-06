/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import java.util.*;
import java.util.HashMap;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static String repeatedWord(String allText) {
        String[] wordsArray = allText.toLowerCase().replace(",", "").split(" ");
        Set<String> wordMap = new HashSet<>();
        for (String word : wordsArray) {
            if (wordMap.contains(word)) {
                return word;

            } else {
                wordMap.add(word);
            }
        }
        return "nothing repeted";

    }

    public static void main(String[] args) {
        String test1 = "Once upon a time, there was a brave princess who...";
        String test2="It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String test3="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        System.out.println(repeatedWord(test1));
        System.out.println(repeatedWord(test2));
        System.out.println(repeatedWord(test3));
    }
}
