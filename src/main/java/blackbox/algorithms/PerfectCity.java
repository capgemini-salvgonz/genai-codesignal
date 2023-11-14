package blackbox.algorithms;

public class PerfectCity {

	/**
	  Consider a city where the streets are perfectly laid out to form an infinite
	  square grid. In this city finding the shortest path between two given points
	  (an origin and a destination) is much easier than in other more complex
	  cities. 
	  Given user's departure and destination coordinates, each of them
	  located on some street, find the length of the shortest route between them
	  assuming that cars can only move along the streets. Each street can be
	  represented as a straight line defined by the x = n or y = n formula, where n
	  is an integer. 
	  Example 
	  For departure = [0.4, 1] and destination = [0.9, 3],
	  the output should be solution(departure, destination) = 0.6 + 2 + 0.1 = 2.7, which is the answer.
	 */
	public static double solution(double[] departure, double[] destination) {

		double distanceX = Math.abs(departure[0] - destination[0]);
        double distanceY = Math.abs(departure[1] - destination[1]);

        return distanceX + distanceY;
			
	}

}
