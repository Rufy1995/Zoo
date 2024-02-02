import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Populate the ArrayList
        ArrayList<Lion> lions = new ArrayList<>();
        lions.add(new Lion("Simba", "meat", 10, LocalDate.of(2023,12,20), 150, 150, 70));
        lions.add(new Lion("Loki", "meat", 13, LocalDate.of(2023,11,10), 135, 145, 60));
        lions.add(new Lion("Jessy", "meat", 6, LocalDate.of(2023,5,15), 160, 130, 50));

        ArrayList<Tiger> tigers = new ArrayList<>();
        tigers.add(new Tiger("Smokey","meat",5, LocalDate.of(2023,2,24),135,130,50));
        tigers.add(new Tiger("Vice","meat",7, LocalDate.of(2023,7,14),140,135,65));
        tigers.add(new Tiger("Nerone","meat",11, LocalDate.of(2022,9,15),155,150,45));

        ArrayList<Eagle> eagles = new ArrayList<>();
        eagles.add(new Eagle("Achille","meat",3, LocalDate.of(2023,1,1),7,35,220));
        eagles.add(new Eagle("Thiago","fish",2,LocalDate.of(2023,5,8),5,30,180));
        eagles.add(new Eagle("Draco","meat",5,LocalDate.of(2022,10,18),8,45,200));
        System.out.println();


        // Calculation and printing of the heaviest lion
        Lion heaviestLion = Lion.calculateHeaviestLion(lions);
        System.out.println("The heaviest lion is: " + heaviestLion.getName() + " with a weight of " + heaviestLion.getWeight());
// Calculation and printing of the lightest lion
        Lion lightestLion = Lion.calculateLightestLion(lions);
        System.out.println("The lightest lion is: " + lightestLion.getName() + " with a weight of " + lightestLion.getWeight());

// Calculation and printing of the heaviest tiger
        Tiger heaviestTiger = Tiger.calculateHeaviestTiger(tigers);
        System.out.println("The heaviest tiger is: " + heaviestTiger.getName() + " with a weight of " + heaviestTiger.getWeight());
// Calculation and printing of the lightest tiger
        Tiger lightestTiger = Tiger.calculateLightestTiger(tigers);
        System.out.println("The lightest tiger is: " + lightestTiger.getName() + " with a weight of " + lightestTiger.getWeight());

// Calculation and printing of the heaviest eagle
        Eagle heaviestEagle = Eagle.calculateHeaviestEagle(eagles);
        System.out.println("The heaviest eagle is: " + heaviestEagle.getName() + " with a weight of " + heaviestEagle.getWeight());
// Calculation and printing of the lightest eagle
        Eagle lightestEagle = Eagle.calculateLightestEagle(eagles);
        System.out.println("The lightest eagle is: " + lightestEagle.getName() + " with a weight of " + lightestEagle.getWeight());

// Calculation and printing of the tallest lion
        Lion tallestLion = Lion.calculateTallestLion(lions);
        System.out.println("The tallest lion is: " + tallestLion.getName() + " with a height of " + tallestLion.getHeight());
// Calculation and printing of the shortest lion
        Lion shortestLion = Lion.calculateShortestLion(lions);
        System.out.println("The shortest lion is: " + shortestLion.getName() + " with a height of " + shortestLion.getHeight());

// Similar calculations for tigers and eagles...

// Calculation and printing of the tallest tiger
        Tiger tallestTiger = Tiger.calculateTallestTiger(tigers);
        System.out.println("The tallest tiger is: " + tallestTiger.getName() + " with a height of " + tallestTiger.getHeight());
// Calculation and printing of the shortest tiger
        Tiger shortestTiger = Tiger.calculateShortestTiger(tigers);
        System.out.println("The shortest tiger is: " + shortestTiger.getName() + " with a height of " + shortestTiger.getHeight());

// Similar calculations for eagles...

// Calculation and printing of the tallest eagle
        Eagle tallestEagle = Eagle.calculateTallestEagle(eagles);
        System.out.println("The tallest eagle is: " + tallestEagle.getName() + " with a height of " + tallestEagle.getHeight());
// Calculation and printing of the shortest eagle
        Eagle shortestEagle = Eagle.calculateShortestEagle(eagles);
        System.out.println("The shortest eagle is: " + shortestEagle.getName() + " with a height of " + shortestEagle.getHeight());

// Calculation and printing of the eagle with the maximum wingspan
        Eagle maxWingspanEagle = Eagle.calculateMaxWingspanEagle(eagles);
        System.out.println("The eagle with the maximum wingspan is: " + maxWingspanEagle.getName() + " with a wingspan of " + maxWingspanEagle.getWingspan());

// Calculation and printing of the species with the longest tail
        Lion longestTailLion = Lion.calculateMaxTailLengthLion(lions);
        Tiger longestTailTiger = Tiger.calculateMaxTailLengthTiger(tigers);

        if (longestTailLion != null && longestTailTiger != null) {
            if (longestTailLion.getTailLength() > longestTailTiger.getTailLength()) {
                System.out.println("The species with the longest tail is a lion and has a length of " + longestTailLion.getTailLength());
            } else {
                System.out.println("The species with the longest tail is a tiger and has a length of " + longestTailTiger.getTailLength());
            }
        } else if (longestTailLion != null) {
            System.out.println("The lion with the longest tail has a length of " + longestTailLion.getTailLength());
        } else if (longestTailTiger != null) {
            System.out.println("The tiger with the longest tail has a length of " + longestTailTiger.getTailLength());
        } else {
            System.out.println("No animals present");
        }

    }

}
