import java.time.LocalDate;
import java.util.ArrayList;

public class Animal {
    public final String name;
    public final String favoriteFood;
    public final int age;
    public final LocalDate entryDate;
    public double weight;
    public final double height;

    // Initialization of the array for entering data about animals in the registry
    public Animal (String name, String favoriteFood, int age, LocalDate entryDate, double weight, double height) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.entryDate = entryDate;
        this.weight = weight;
        this.height = height;
    }

    // Getter methods for retrieving data
    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}