package my.solution

import groovy.transform.TypeChecked

class SolverGroovy {
    @TypeChecked
    public static Map<Object, Object> getFrequencyStatistics(Object[] source) {
        return getFrequencyStatistics(source as List);
    }

    @TypeChecked
    public static Map<Object, Object> getFrequencyStatistics(Collection<Object> source) {
        return source.groupBy { it }.collectEntries { [(it.key): it.value.size()] }
    }
}