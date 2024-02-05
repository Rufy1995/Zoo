import java.time.LocalDate;
import java.util.ArrayList;
public class Lion extends Animal {
    public final double tailLength;

    Lion(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, entryDate, weight, height);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }
    ArrayList<Lion> lions = new ArrayList<>();

    //
    //   METHODS BELOW
    //

    public static Lion calculateHeaviestLion(ArrayList<Lion> lions) {
        Lion heaviestLion = null;
        double maxWeight = Double.MIN_VALUE;

        for (Lion lion : lions) {
            if (lion.getWeight() > maxWeight) {
                maxWeight = lion.getWeight();
                heaviestLion = lion;
            }
        }

        return heaviestLion;
    }

    public static Lion calculateLightestLion(ArrayList<Lion> lions) {
        Lion lightestLion = null;
        double minWeight = Double.MAX_VALUE;

        for (Lion lion : lions) {
            if (lion.getWeight() < minWeight) {
                minWeight = lion.getWeight();
                lightestLion = lion;
            }
        }

        return lightestLion;
    }

    public static Lion calculateTallestLion(ArrayList<Lion> lions) {
        Lion tallestLion = null;
        double maxHeight = Double.MIN_VALUE;

        for (Lion lion : lions) {
            if (lion.getHeight() > maxHeight) {
                maxHeight = lion.getHeight();
                tallestLion = lion;
            }
        }

        return tallestLion;
    }

    public static Lion calculateShortestLion(ArrayList<Lion> lions) {
        Lion shortestLion = null;
        double minHeight = Double.MAX_VALUE;

        for (Lion lion : lions) {
            if (lion.getHeight() < minHeight) {
                minHeight = lion.getHeight();
                shortestLion = lion;
            }
        }

        return shortestLion;
    }

    public static Lion calculateMaxTailLengthLion(ArrayList<Lion> lions) {
        Lion maxTailLengthLion = null;
        double maxTailLength = Double.MIN_VALUE;

        for (Lion lion : lions) {
            if (lion.getTailLength() > maxTailLength) {
                maxTailLength = lion.getTailLength();
                maxTailLengthLion = lion;
            }
        }

        return maxTailLengthLion;
    }
}
