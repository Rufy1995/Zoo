import java.time.LocalDate;
import java.util.ArrayList;

<<<<<<< Updated upstream
=======
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
>>>>>>> Stashed changes

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
        ArrayList<Lion> lions = new ArrayList<>();
<<<<<<< Updated upstream
        lions.add(new Lion("Simba", "meat", 10, LocalDate.of(2023,12,20), 150, 150, 90));
        lions.add(new Lion("Loki", "meat", 13, LocalDate.of(2023,11,10), 135, 145, 60));
        lions.add(new Lion("Jessy", "meat", 6, LocalDate.of(2023,5,15), 160, 130, 50));

        ArrayList<Tiger> tigers = new ArrayList<>();
        tigers.add(new Tiger("Smokey","meat",5, LocalDate.of(2023,2,24),135,130,55));
        tigers.add(new Tiger("Vice","meat",7, LocalDate.of(2023,7,14),140,135,90));
        tigers.add(new Tiger("Nerone","meat",11, LocalDate.of(2022,9,15),155,150,45));
=======
        lions.add(new Lion("aaaa", "meat", 10, LocalDate.of(2023, 12, 20), 150, 150, 70));
        lions.add(new Lion("bbbb", "meat", 13, LocalDate.of(2023, 11, 10), 135, 145, 60));
        lions.add(new Lion("cccc", "meat", 6, LocalDate.of(2023, 5, 15), 160, 130, 100));

        ArrayList<Tiger> tigers = new ArrayList<>();
        tigers.add(new Tiger("ddddd", "meat", 5, LocalDate.of(2023, 2, 24), 135, 130, 100));
        tigers.add(new Tiger("eeeee", "meat", 7, LocalDate.of(2023, 7, 14), 140, 135, 65));
        tigers.add(new Tiger("fffff", "meat", 11, LocalDate.of(2022, 9, 15), 155, 150, 45));
>>>>>>> Stashed changes

        ArrayList<Eagle> eagles = new ArrayList<>();
        eagles.add(new Eagle("gggg", "meat", 3, LocalDate.of(2023, 1, 1), 7, 35, 220));
        eagles.add(new Eagle("hhhhh", "fish", 2, LocalDate.of(2023, 5, 8), 5, 30, 180));
        eagles.add(new Eagle("iiiii", "meat", 5, LocalDate.of(2022, 10, 18), 8, 45, 200));

// Calculation of the heaviest and lightest animals:
        // Calculation and printing of the heaviest lion
        Lion heaviestLion = findMax(lions, "weight");
        System.out.println("The heaviest lion is: " + heaviestLion.getName() + " with a weight of " + heaviestLion.getWeight());
<<<<<<< Updated upstream
        // Calculation and printing of the heaviest tiger
        Tiger heaviestTiger = findMax(tigers, "weight");
        System.out.println("The heaviest tiger is: " + heaviestTiger.getName() + " with a weight of " + heaviestTiger.getWeight());
        // Calculation and printing of the heaviest eagle
        Eagle heaviestEagle = findMax(eagles, "weight");
        System.out.println("The heaviest eagle is: " + heaviestEagle.getName() + " with a weight of " + heaviestEagle.getWeight());
=======
>>>>>>> Stashed changes

        // Calculation and printing of the lightest lion
        Lion lightestLion = findMin(lions, "weight");
        System.out.println("The lightest lion is: " + lightestLion.getName() + " with a weight of " + lightestLion.getWeight());
<<<<<<< Updated upstream
        // Calculation and printing of the lightest tiger
        Tiger lightestTiger = findMin(tigers, "weight");
        System.out.println("The lightest tiger is: " + lightestTiger.getName() + " with a weight of " + lightestTiger.getWeight());
        // Calculation and printing of the lightest eagle
        Eagle lightestEagle = findMin(eagles, "weight");
        System.out.println("The lightest eagle is: " + lightestEagle.getName() + " with a weight of " + lightestEagle.getWeight());


// Calculation of the tallest and shortest animals:
        // Calculation and printing of the tallest lion
        Lion tallestLion = findMax(lions, "height");
        System.out.println("The tallest lion is: " + tallestLion.getName() + " with a height of " + tallestLion.getHeight());
        // Calculation and printing of the tallest tiger
        Tiger tallestTiger = findMax(tigers, "height");
        System.out.println("The tallest tiger is: " + tallestTiger.getName() + " with a height of " + tallestTiger.getHeight());
        // Calculation and printing of the tallest eagle
        Eagle tallestEagle = findMax(eagles, "height");
        System.out.println("The tallest eagle is: " + tallestEagle.getName() + " with a height of " + tallestEagle.getHeight());
        // Calculation and printing of the shortest lion
        Lion shortestLion = findMin(lions, "height");
        System.out.println("The shortest lion is: " + shortestLion.getName() + " with a height of " + shortestLion.getHeight());
        // Calculation and printing of the shortest tiger
        Tiger shortestTiger = findMin(tigers, "height");
        System.out.println("The shortest tiger is: " + shortestTiger.getName() + " with a height of " + shortestTiger.getHeight());
        // Calculation and printing of the shortest eagle
        Eagle shortestEagle = findMin(eagles, "height");
        System.out.println("The shortest eagle is: " + shortestEagle.getName() + " with a height of " + shortestEagle.getHeight());

// Calculation of the animal with maximum wingspan
=======


        // Similar calculations for tigers and eagles...

        // Calculation and printing of the tallest lion
        Lion tallestLion = findMax(lions, "height");
        System.out.println("The tallest lion is: " + tallestLion.getName() + " with a height of " + tallestLion.getHeight());

>>>>>>> Stashed changes
        // Calculation and printing of the eagle with the maximum wingspan
        Eagle maxWingspanEagle = findMax(eagles, "wingspan");
        System.out.println("The eagle with the maximum wingspan is: " + maxWingspanEagle.getName() + " with a wingspan of " + maxWingspanEagle.getWingspan());

<<<<<<< Updated upstream
// Calculation of the animal with the longest tail
=======
>>>>>>> Stashed changes
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



