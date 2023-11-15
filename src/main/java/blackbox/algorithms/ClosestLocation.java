package blackbox.algorithms;

import java.util.*;

class ClosestLocation {

    public String solution(String address, int[][] objects, String[] names) {
        int[] riderPosition = {0, 0};
        List<Result> results = new ArrayList<>();

        for (int i = 0; i < objects.length; i++) {
            int[] objectPosition = objects[i];
            String name = names[i];

            if (name.toLowerCase().startsWith(address.toLowerCase())) {
                int distance = calculateDistance(riderPosition, objectPosition);
                results.add(new Result(name, distance));
            }
        }

        results.sort(Comparator.comparingInt(result -> result.distance));

        if (results.isEmpty()) {
            return "";
        } else {
            return results.get(0).name;
        }
    }

    private int calculateDistance(int[] position1, int[] position2) {
        int deltaX = position1[0] - position2[0];
        int deltaY = position1[1] - position2[1];
        return (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    private static class Result {
        String name;
        int distance;

        Result(String name, int distance) {
            this.name = name;
            this.distance = distance;
        }
    }
}
