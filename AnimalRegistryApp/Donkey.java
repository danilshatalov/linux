import java.time.LocalDate;

public class Donkey extends PackAnimal {
    public Donkey(int animalId, String name, LocalDate birthDate, String packBehavior) {
        super(animalId, name, "Donkey", birthDate, packBehavior);
    }
}
