package blackbox.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoverDebtsTest {

	/**
	 * For s = 40, debts = [2, 2, 5], and interests = [75, 25, 25], the output should be solution(s, debts, interests) = 10.8125.
	 */
	@Test
    public void testSolution() {
        CoverDebts cd = new CoverDebts(); 

        int s = 40;
        int[] debts = {2, 2, 5};
        int[] interests = {75, 25, 25};

        double result = cd.solution(s, debts, interests);
        double expected = 10.8125;

        assertEquals(expected, result, 0.0001);
    }
}
