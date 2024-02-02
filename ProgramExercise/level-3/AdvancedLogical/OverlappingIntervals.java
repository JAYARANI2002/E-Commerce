//Overlapping intervals
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}


public class OverlappingIntervals
{
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return new ArrayList<>();
        }

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        List<Interval> merged = new ArrayList<>();
        merged.add(intervals.get(0));

        for (Interval interval : intervals) {
            if (interval.start <= merged.get(merged.size() - 1).end) {
                merged.get(merged.size() - 1).end = Math.max(merged.get(merged.size() - 1).end, interval.end);
            } else {
                merged.add(interval);
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Interval> inputIntervals = new ArrayList<>();

        System.out.println("Enter the number of intervals:");
        int numIntervals = scanner.nextInt();

        for (int i = 0; i < numIntervals; i++) {
            System.out.println("Enter start and end for interval " + (i + 1) + ":");
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            inputIntervals.add(new Interval(start, end));
        }

	OverlappingIntervals merger= new OverlappingIntervals();
        List<Interval> outputIntervals = merger.merge(inputIntervals);

        System.out.println("Merged intervals:");
        for (Interval interval : outputIntervals) {
            System.out.println("(" + interval.start + ", " + interval.end + ")");
        }
    }
}
