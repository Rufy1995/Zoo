import java.time.LocalDate;
import java.util.ArrayList;

public class Eagle extends Animal {
    public final double wingspan;

    Eagle(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double height, double wingspan) {
        super(name, favoriteFood, age, entryDate, weight, height);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    ArrayList<Eagle> eagles = new ArrayList<>();

    //
    //   METHODS BELOW
    //

    public static Eagle calculateHeaviestEagle(ArrayList<Eagle> eagles) {
        Eagle heaviestEagle = null;
        double maxWeight = Double.MIN_VALUE;

        for (Eagle eagle : eagles) {
            if (eagle.getWeight() > maxWeight) {
                maxWeight = eagle.getWeight();
                heaviestEagle = eagle;
            }
        }

        return heaviestEagle;
    }

    public static Eagle calculateLightestEagle(ArrayList<Eagle> eagles) {
        Eagle lightestEagle = null;
        double minWeight = Double.MAX_VALUE;

        for (Eagle eagle : eagles) {
            if (eagle.getWeight() < minWeight) {
                minWeight = eagle.getWeight();
                lightestEagle = eagle;
            }
        }

        return lightestEagle;
    }

    public static Eagle calculateTallestEagle(ArrayList<Eagle> eagles) {
        Eagle tallestEagle = null;
        double maxHeight = Double.MIN_VALUE;

        for (Eagle eagle : eagles) {
            if (eagle.getHeight() > maxHeight) {
                maxHeight = eagle.getHeight();
                tallestEagle = eagle;
            }
        }

        return tallestEagle;
    }

    public static Eagle calculateShortestEagle(ArrayList<Eagle> eagles) {
        Eagle shortestEagle = null;
        double minHeight = Double.MAX_VALUE;

        for (Eagle eagle : eagles) {
            if (eagle.getHeight() < minHeight) {
                minHeight = eagle.getHeight();
                shortestEagle = eagle;
            }
        }

        return shortestEagle;
    }

    public static Eagle calculateMaxWingspanEagle(ArrayList<Eagle> eagles) {
        Eagle maxWingspanEagle = null;
        double maxWingspan = Double.MIN_VALUE;

        for (Eagle eagle : eagles) {
            if (eagle.getWingspan() > maxWingspan) {
                maxWingspan = eagle.getWingspan();
                maxWingspanEagle = eagle;
            }
        }

        return maxWingspanEagle;
    }
}