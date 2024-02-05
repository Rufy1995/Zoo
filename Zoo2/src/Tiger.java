import java.time.LocalDate;
import java.util.ArrayList;

public class Tiger extends Animal {
    public final double tailLength;

    Tiger(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, entryDate, weight, height);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }
    ArrayList<Tiger> tigers = new ArrayList<>();

    //
    //   METHODS BELOW
    //

    public static Tiger calculateHeaviestTiger(ArrayList<Tiger> tigers) {
        Tiger heaviestTiger = null;
        double maxWeight = Double.MIN_VALUE;

        for (Tiger tiger : tigers) {
            if (tiger.getWeight() > maxWeight) {
                maxWeight = tiger.getWeight();
                heaviestTiger = tiger;
            }
        }

        return heaviestTiger;
    }

    public static Tiger calculateLightestTiger(ArrayList<Tiger> tigers) {
        Tiger lightestTiger = null;
        double minWeight = Double.MAX_VALUE;

        for (Tiger tiger : tigers) {
            if (tiger.getWeight() < minWeight) {
                minWeight = tiger.getWeight();
                lightestTiger = tiger;
            }
        }

        return lightestTiger;
    }

    public static Tiger calculateTallestTiger(ArrayList<Tiger> tigers) {
        Tiger tallestTiger = null;
        double maxHeight = Double.MIN_VALUE;

        for (Tiger tiger : tigers) {
            if (tiger.getHeight() > maxHeight) {
                maxHeight = tiger.getHeight();
                tallestTiger = tiger;
            }
        }

        return tallestTiger;
    }

    public static Tiger calculateShortestTiger(ArrayList<Tiger> tigers) {
        Tiger shortestTiger = null;
        double minHeight = Double.MAX_VALUE;

        for (Tiger tiger : tigers) {
            if (tiger.getHeight() < minHeight) {
                minHeight = tiger.getHeight();
                shortestTiger = tiger;
            }
        }

        return shortestTiger;
    }

    public static Tiger calculateMaxTailLengthTiger(ArrayList<Tiger> tigers) {
        Tiger maxTailLengthTiger = null;
        double maxTailLength = Double.MIN_VALUE;

        for (Tiger tiger : tigers) {
            if (tiger.getTailLength() > maxTailLength) {
                maxTailLength = tiger.getTailLength();
                maxTailLengthTiger = tiger;
            }
        }

        return maxTailLengthTiger;
    }
}

//BLABLABLA