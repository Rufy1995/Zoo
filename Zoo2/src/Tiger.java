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
}

