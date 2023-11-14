package blackbox.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingSpotTest {
	@Test
    public void testSolutionCase1() {
        int[] carDimensions = {3, 2};
        int[][] parkingLot = {{1,0,1,0,1,0}, {1,0,0,0,1,0}, {0,0,0,0,0,1}, {1,0,0,0,1,1}};
        int[] luckySpot = {1, 1, 2, 3};

        boolean result = ParkingSpot.solution(carDimensions, parkingLot, luckySpot);
        assertEquals(false, result);
    }

    @Test
    public void testSolutionCase2() {
        int[] carDimensions = {4, 2};
        int[][] parkingLot = {{0,0,0,1}, {0,0,0,0}, {0,0,1,1}};
        int[] luckySpot = {0, 0, 1, 3};

        boolean result = ParkingSpot.solution(carDimensions, parkingLot, luckySpot);
        assertEquals(false, result);
    }
}
