import java.time.LocalDate;

public class Cat extends Pet {
    public Cat(int animalId, String name, LocalDate birthDate, String commands) {
        super(animalId, name, "Cat", birthDate, commands);
    }
}
