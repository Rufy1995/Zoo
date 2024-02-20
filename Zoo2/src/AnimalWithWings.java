import java.time.LocalDate;
import java.util.Objects;

public abstract class AnimalWithWings extends Animal {
    private double wingspan;

    protected AnimalWithWings(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double height, double wingspan) {
        super(name, favoriteFood, age, entryDate, weight, height);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}