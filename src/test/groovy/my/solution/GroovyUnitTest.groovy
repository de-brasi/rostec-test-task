package my.solution

import groovy.test.GroovyTestCase

class GroovyUnitTest extends GroovyTestCase{
    void testIntegerList() {
        final def expected = [1: 2, 3: 1, 4: 2, 5: 2]

        final def source = [1, 3, 4, 5, 1, 5, 4]
        final def actual = SolverGroovy.getFrequencyStatistics(source)

        assertEquals(expected, actual)
    }

    void testStringList() {
        final def expected = ["1": 2, "3": 1, "4": 2, "5": 2]

        final def source = ["1", "3", "4", "5", "1", "5", "4"]
        final def actual = SolverGroovy.getFrequencyStatistics(source)

        assertEquals(expected, actual)
    }

    void testEmptyList() {
        final def expected = [:]

        final def source = []
        final def actual = SolverGroovy.getFrequencyStatistics(source)

        assertEquals(expected, actual)
    }
}
