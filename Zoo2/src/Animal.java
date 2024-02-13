import java.time.LocalDate;

class Animal {
    private final String name;
    private final String favoriteFood;
    private final int age;
    private final LocalDate entryDate;
    private final double weight;
    private final double height;

    Animal(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double height) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.entryDate = entryDate;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

<<<<<<< Updated upstream
    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    double getWeight() {
=======
    public double getWeight() {
>>>>>>> Stashed changes
        return weight;
    }

    double getHeight() {
        return height;
    }

}