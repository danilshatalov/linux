import java.time.LocalDate;

public class Pet extends Animal {
    protected String commands;

    public Pet(int animalId, String name, String type, LocalDate birthDate, String commands) {
        super(animalId, name, type, birthDate);
        this.commands = commands;
    }

    public String getCommands() {
    return commands;
}

public void setCommands(String commands) {
    this.commands = commands;
}
}



