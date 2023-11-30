import java.time.LocalDate;

public class PackAnimal extends Animal {
    protected String packBehavior;

    public PackAnimal(int animalId, String name, String type, LocalDate birthDate, String packBehavior) {
        super(animalId, name, type, birthDate);
        this.packBehavior = packBehavior;
    }

    public String getPackBehavior() {
        return packBehavior;
    }
}



