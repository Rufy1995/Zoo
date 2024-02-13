import java.time.LocalDate;
<<<<<<< Updated upstream
import java.util.ArrayList;

public class Lion extends Animal{
=======

class Lion extends Animal {
>>>>>>> Stashed changes
    public final double tailLength;

    Lion(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, entryDate, weight, height);
        this.tailLength = tailLength;
    }
    public double getTailLength() {
        return tailLength;
    }
<<<<<<< Updated upstream
    ArrayList<Lion> lions = new ArrayList<>();
=======
>>>>>>> Stashed changes
}

