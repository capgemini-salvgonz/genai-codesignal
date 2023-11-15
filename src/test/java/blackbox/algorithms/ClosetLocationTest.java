package blackbox.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClosestLocationTest {

    @Test
    void testSolution() {
        ClosestLocation closestLocation = new ClosestLocation();

        // Scenario 1
        String address = "Cat";
        int[][] objects = {{-2,0}, {1,2}, {2,1,2,4}, {-3,-1,4,-1}};
        String[] names = {"Bat building", "Cast exhibition", "At street", "Cat avenue"};
        String expected = "Cat avenue";
        String actual = closestLocation.solution(address, objects, names);
        assertEquals(expected, actual);

        // Scenario 2
        address = "Cat";
        objects = new int[][]{{-3,0}, {1,3}, {2,1,2,4}, {-4,-3,6,-3}};
        names = new String[]{"Bat building", "Cats exhibition", "At street", "Cat avenue"};
        expected = "At street";
        actual = closestLocation.solution(address, objects, names);
        assertEquals(expected, actual);
    }
}