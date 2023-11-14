package blackbox.algorithms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PerfectCityTest {
	
	@Test
    void testSolution() {
        double[] departure = {0.4, 1};
        double[] destination = {0.9, 3};
        double expectedOutput = 2.7;
        double actualOutput = PerfectCity.solution(departure, destination);
        assertEquals(expectedOutput, actualOutput, 0.01, "The solution function should calculate the correct distance.");
        
        departure =  new double[]{0, 0.2};
        destination =  new double []{7, 0.5};
        expectedOutput = 7.7;
        assertEquals(expectedOutput, actualOutput, 0.01, "The solution function should calculate the correct second distance.");
    }
	
}

