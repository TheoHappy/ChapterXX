package Pair;

import java.util.ArrayList;
import java.util.List;

public class PairTest {
    public static void main(String[] args) {
        List<Pair<? extends Object, ? extends Object>> pairList = new ArrayList<>();
        Pair<String, Integer> stringIntegerPair = new Pair<String, Integer>("Andrew", 10);
        Pair<Character, Double> characterDoublePair = new Pair<Character, Double>('A', 12.5);
        Pair<String, Boolean> stringBooleanPair = new Pair<String, Boolean>("value", true);
        Pair<Integer, Boolean> integerBooleanPair = new Pair<Integer, Boolean>(1, false);

        pairList.add(stringIntegerPair);
        pairList.add(characterDoublePair);
        pairList.add(stringBooleanPair);
        pairList.add(integerBooleanPair);

        for (Pair element : pairList) {
            System.out.println(element);

        }
    }
}
