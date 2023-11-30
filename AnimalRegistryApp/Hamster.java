import java.time.LocalDate;

public class Hamster extends Pet {
    public Hamster(int animalId, String name, LocalDate birthDate, String commands) {
        super(animalId, name, "Hamster", birthDate, commands);
    }
}
