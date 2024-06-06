package my.solution;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolverJava<Key> {
    public Map<Key, Integer> getFrequencyStatistics(Collection<Key> source) {
        final HashMap<Key, Integer> statistics = new HashMap<>();

        for (var item: source) {
            if (!statistics.containsKey(item)) {
                statistics.put(item, 0);
            }

            statistics.put(item, statistics.get(item) + 1);
        }

        return statistics;
    }

    public Map<Key, Integer> getFrequencyStatistics(Key[] source) {
        return getFrequencyStatistics(List.of(source));
    }
}