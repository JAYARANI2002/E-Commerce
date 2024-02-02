import java.util.ArrayList;
import java.util.List;

public class ClimbStairs {
    public static List<List<Integer>> findWays(int n, int[] steps) {
        List<List<Integer>> waysList = new ArrayList<>();
        generateWays(n, steps, new ArrayList<>(), waysList);
        return waysList;
    }

    private static void generateWays(int remainingSteps, int[] steps, List<Integer> currentWay, List<List<Integer>> waysList) {
        if (remainingSteps == 0) {
            waysList.add(new ArrayList<>(currentWay));
            return;
        }
        for (int step : steps) {
            if (remainingSteps >= step) {
                currentWay.add(step);
                generateWays(remainingSteps - step, steps, currentWay, waysList);
                currentWay.remove(currentWay.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        
        int[] steps = {1, 3, 5};
        List<List<Integer>> waysList = findWays(n, steps);

        System.out.println("Number of Ways: " + waysList.size());
        System.out.println("Ways to climb:");
        for (List<Integer> way : waysList) {
            System.out.println(way);
        }
    }
}
