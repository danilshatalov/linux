import java.time.LocalDate;

public class Animal {
    protected int animalId;
    protected String name;
    protected String type;
    protected LocalDate birthDate;

    public Animal(int animalId, String name, String type, LocalDate birthDate) {
        this.animalId = animalId;
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
    }

    public int getAnimalId() {
    return animalId;
}

public LocalDate getBirthDate() {
    return birthDate;
}

public String getName() {
    return name;
}

public String getType() {
    return type;
}

}


