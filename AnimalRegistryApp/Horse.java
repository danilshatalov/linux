import java.time.LocalDate;

public class Horse extends PackAnimal {
    public Horse(int animalId, String name, LocalDate birthDate, String packBehavior) {
        super(animalId, name, "Horse", birthDate, packBehavior);
    }
}
