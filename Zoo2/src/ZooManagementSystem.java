import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class ZooManagementSystem {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Lion("Thor", "Meat", 5, "01/01/2020", 150, 1.2, 1.0));
        zoo.add(new Tiger("Arcan", "Meat", 6, "15/02/2019", 180, 1.3, 0.8));
        zoo.add(new Eagle("Brand", "Fish", 10, "10/03/2018", 14, 0.5, 2.5));
        zoo.add(new Lion("Rufy", "Meat", 8, "27/10/2020", 180, 1.7, 2.0));
        zoo.add(new Tiger("Chopper", "Meat", 9, "15/08/2017", 200, 1.8, 1.8));
        zoo.add(new Eagle("Olimpia", "Fish", 13, "10/03/2016", 20, 0.9, 3.5));
        zoo.add(new Lion("Sylas", "Meat", 4, "22/12/2020", 140, 1.4, 1.3));
        zoo.add(new Tiger("Kitty", "Meat", 11, "25/04/2017", 210, 1.2, 1.5));
        zoo.add(new Eagle("Rengar", "Fish", 2, "24/07/2022", 15, 1.9, 2.7));

        // Find the tallest and shortest animal for each species
        zoo.stream()
                .collect(Collectors.groupingBy(animal -> animal.getClass().getSimpleName()))
                .forEach((species, animals) -> {
                    Animal tallest = animals.stream().max(Comparator.comparingDouble(Animal::getHeight)).orElse(null);
                    Animal shortest = animals.stream().min(Comparator.comparingDouble(Animal::getHeight)).orElse(null);
                    System.out.println("Species: " + species);
                    System.out.println("Tallest: " + tallest.getName() + " (" + tallest.getHeight() + " meters)");
                    System.out.println("Shortest: " + shortest.getName() + " (" + shortest.getHeight() + " meters)\n");
                });

        // Find the heaviest and lightest animal for each species
        zoo.stream()
                .collect(Collectors.groupingBy(animal -> animal.getClass().getSimpleName()))
                .forEach((species, animals) -> {
                    Animal heaviest = animals.stream().max(Comparator.comparingDouble(Animal::getWeight)).orElse(null);
                    Animal lightest = animals.stream().min(Comparator.comparingDouble(Animal::getWeight)).orElse(null);
                    System.out.println("Species: " + species);
                    System.out.println("Heaviest: " + heaviest.getName() + " (" + heaviest.getWeight() + " kg)");
                    System.out.println("Lightest: " + lightest.getName() + " (" + lightest.getWeight() + " kg)\n");
                });

        // Find the animal with the longest tail
        String longestTailAnimal = zoo.stream()
                .filter(animal -> animal instanceof Lion || animal instanceof Tiger)
                .max(Comparator.comparingDouble(animal -> {
                    if (animal instanceof Lion) {
                        return ((Lion) animal).getTailLength();
                    } else if (animal instanceof Tiger) {
                        return ((Tiger) animal).getTailLength();
                    } else {
                        return 0;
                    }
                }))
                .map(animal -> animal.getName())
                .orElse("No animal has been found");

        System.out.println("Animal with the longest tail : " + longestTailAnimal);

        // Find the animal with the largest wingspan (for eagles)
        String largestWingspan = zoo.stream()
                .filter(animal -> animal instanceof Eagle)
                .max(Comparator.comparingDouble(animal -> ((Eagle) animal).getWingspan()))
                .map(animal -> animal.getName())
                .orElse("No eagle found");

        System.out.println("Animal with the largest wingspan: " + largestWingspan);
    }
}