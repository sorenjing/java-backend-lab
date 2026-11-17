package dev.sorenjing.lab.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public final class WordFrequencyDemo {
    private WordFrequencyDemo() {
    }

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            counts.merge(word, 1, Integer::sum);
        }
        return counts;
    }

    public static void main(String[] args) {
        String[] words = {"java", "spring", "java", "docker", "spring"};
        Map<String, Integer> result = countWords(words);

        if (!result.equals(Map.of("java", 2, "spring", 2, "docker", 1))) {
            throw new AssertionError("Unexpected word counts: " + result);
        }

        result.forEach((word, count) -> System.out.println(word + "=" + count));
    }
}
