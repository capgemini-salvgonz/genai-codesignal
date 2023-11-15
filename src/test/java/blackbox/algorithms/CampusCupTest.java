package blackbox.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CampusCupTest {

    @Test
    public void testSolution() {
        String[] emails = {"john.doe@mit.edu", "admin@rain.ifmo.ru", "noname@mit.edu"};
        String[] expected = {"mit.edu", "rain.ifmo.ru"};
        assertArrayEquals(expected, CampusCup.solution(emails));

        emails = new String[]{"b@harvard.edu", "c@harvard.edu", "d@harvard.edu", "e@harvard.edu", "f@harvard.edu" , "a@student.spbu.ru", "b@student.spbu.ru", "c@student.spbu.ru", "d@student.spbu.ru", "e@student.spbu.ru", "f@student.spbu.ru", "g@student.spbu.ru"};
        expected = new String[]{"harvard.edu", "student.spbu.ru"};
        assertArrayEquals(expected, CampusCup.solution(emails));

        emails = new String[]{"a@rain.ifmo.ru", "b@rain.ifmo.ru", "c@rain.ifmo.ru", "d@rain.ifmo.ru", "e@rain.ifmo.ru", "noname@mit.edu"};
        expected = new String[]{"rain.ifmo.ru", "mit.edu"};
        assertArrayEquals(expected, CampusCup.solution(emails));
    }
}
    
    