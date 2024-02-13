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
}
