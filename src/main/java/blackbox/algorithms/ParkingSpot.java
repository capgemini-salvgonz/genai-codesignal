package blackbox.algorithms;


public class ParkingSpot {

	public static boolean solution(int[] carDimensions, int[][] parkingLot, int[] luckySpot) {
		int rows = parkingLot.length;
		int cols = parkingLot[0].length;
		boolean[][] parkingMatrix = new boolean[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (parkingLot[i][j] == 1) {
					parkingMatrix[i][j] = true;
				}
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (parkingMatrix[i][j]) {
					int carRow = luckySpot[0] - i;
					int carCol = luckySpot[1] - j;

					if (carRow >= 0 && carRow + carDimensions[0] <= rows && carCol >= 0
							&& carCol + carDimensions[1] <= cols) {
						boolean canPark = true;
						for (int r = 0; r < carDimensions[0]; r++) {
							for (int c = 0; c < carDimensions[1]; c++) {
								if (parkingMatrix[carRow + r][carCol + c]) {
									canPark = false;
									break;
								}
							}
							if (!canPark) {
								break;
							}
						}
						if (canPark) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
