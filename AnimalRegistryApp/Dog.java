import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(int animalId, String name, LocalDate birthDate, String commands) {
        super(animalId, name, "Dog", birthDate, commands);
    }
}
