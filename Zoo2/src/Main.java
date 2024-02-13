import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    private static <T extends Animal> T findMin(ArrayList<T> animals, String attribute) {
        T minAnimal = null;
        double minValue = Double.MAX_VALUE;

        for (T animal : animals) {
            double value;
            switch (attribute) {
                case "weight":
                    value = animal.getWeight();
                    break;
                case "height":
                    value = animal.getHeight();
                    break;
                case "tailLength":
                    value = (animal instanceof Tiger) ? ((Tiger) animal).getTailLength() : 0;
                    break;
                case "tailLength2":
                    value = (animal instanceof Lion) ? ((Lion) animal).getTailLength() : 0;
                    break;
                case "wingspan":
                    value = (animal instanceof Eagle) ? ((Eagle) animal).getWingspan() : 0;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid attribute");
            }

            if (value < minValue) {
                minValue = value;
                minAnimal = animal;
            }
        }

        return minAnimal;
    }


    private static <T extends Animal> T findMax(ArrayList<T> animals, String attribute) {
        T maxAnimal = null;
        double maxValue = Double.MIN_VALUE;

        for (T animal : animals) {
            double value;
            switch (attribute) {
                case "weight":
                    value = animal.getWeight();
                    break;
                case "height":
                    value = animal.getHeight();
                    break;
                case "tailLength":
                    value = (animal instanceof Tiger) ? ((Tiger) animal).getTailLength() : 0;
                    break;
                case "tailLength2":
                    value = (animal instanceof Lion) ? ((Lion) animal).getTailLength() : 0;
                    break;
                case "wingspan":
                    value = (animal instanceof Eagle) ? ((Eagle) animal).getWingspan() : 0;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid attribute");
            }

            if (value > maxValue) {
                maxValue = value;
                maxAnimal = animal;
            }
        }

        return maxAnimal;
    }

    public static void main(String[] args) {
        // Populate the ArrayLists
        ArrayList<Lion> lions = new ArrayList();
        lions.add(new Lion("Simba", "meat", 10, LocalDate.of(2023, 12, 20), 150.0, 150.0, 90.0));
        lions.add(new Lion("Loki", "meat", 13, LocalDate.of(2023, 11, 10), 135.0, 145.0, 60.0));
        lions.add(new Lion("Jessy", "meat", 6, LocalDate.of(2023, 5, 15), 160.0, 130.0, 50.0));
        ArrayList<Tiger> tigers = new ArrayList();
        tigers.add(new Tiger("Smokey", "meat", 5, LocalDate.of(2023, 2, 24), 135.0, 130.0, 55.0));
        tigers.add(new Tiger("Vice", "meat", 7, LocalDate.of(2023, 7, 14), 140.0, 135.0, 90.0));
        tigers.add(new Tiger("Nerone", "meat", 11, LocalDate.of(2022, 9, 15), 155.0, 150.0, 45.0));
        ArrayList<Eagle> eagles = new ArrayList();
        eagles.add(new Eagle("Achille", "meat", 3, LocalDate.of(2023, 1, 1), 7.0, 35.0, 220.0));
        eagles.add(new Eagle("Thiago", "fish", 2, LocalDate.of(2023, 5, 8), 5.0, 30.0, 180.0));
        eagles.add(new Eagle("Draco", "meat", 5, LocalDate.of(2022, 10, 18), 8.0, 45.0, 200.0));

        // Calculation and printing of the heaviest lion
        Lion heaviestLion = findMax(lions, "weight");
        System.out.println("The heaviest lion is: " + heaviestLion.getName() + " with a weight of " + heaviestLion.getWeight());

        // Calculation and printing of the lightest lion
        Lion lightestLion = findMin(lions, "weight");
        System.out.println("The lightest lion is: " + lightestLion.getName() + " with a weight of " + lightestLion.getWeight());


        // Similar calculations for tigers and eagles...

        // Calculation and printing of the tallest lion
        Lion tallestLion = findMax(lions, "height");
        System.out.println("The tallest lion is: " + tallestLion.getName() + " with a height of " + tallestLion.getHeight());

        // Calculation and printing of the eagle with the maximum wingspan
        Eagle maxWingspanEagle = findMax(eagles, "wingspan");
        System.out.println("The eagle with the maximum wingspan is: " + maxWingspanEagle.getName() + " with a wingspan of " + maxWingspanEagle.getWingspan());

        // Calculation and printing of the species with the longest tail
        Lion longestTailLion = findMax(lions, "tailLength2");
        Tiger longestTailTiger = findMax(tigers, "tailLength");

        if (longestTailLion != null && longestTailTiger != null) {
            if (longestTailLion.getTailLength() > longestTailTiger.getTailLength()) {
                System.out.println("The species with the longest tail is a lion and has a length of " + longestTailLion.getTailLength());
            } else if (longestTailLion.getTailLength() < longestTailTiger.getTailLength()) {
                System.out.println("The species with the longest tail is a tiger and has a length of " + longestTailTiger.getTailLength());
            } else {
                System.out.println("Both lion and tiger have the same longest tail length of " + longestTailLion.getTailLength());
            }
        }

    }
}