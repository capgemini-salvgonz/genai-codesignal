package blackbox.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LosslessDataCompressionTest {
	@Test
	void solutionTest() {
		String[] emails = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		String[] expected = new String[] { "ab(0,1)c(0,3)d(4,3)c(8,3)" };
		assertEquals(expected.length, LosslessDataCompression.solution(emails).length);
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], LosslessDataCompression.solution(emails)[i]);
		}
	}
}
