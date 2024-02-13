import java.time.LocalDate;

class Tiger extends Animal {
    public final double tailLength;

    Tiger(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, entryDate, weight, height);
        this.tailLength = tailLength;
    }
    public double getTailLength() {
        return tailLength;
    }
<<<<<<< Updated upstream
    ArrayList<Tiger> tigers = new ArrayList<>();
=======
>>>>>>> Stashed changes
}
