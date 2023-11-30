import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animals;

    public AnimalRegistry() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listCommands(int animalId) {
        for (Animal animal : animals) {
            if (animal.getAnimalId() == animalId) {
                if (animal instanceof Pet) {
                    System.out.println("Commands: " + ((Pet) animal).getCommands());
                } else {
                    System.out.println("Not a pet. No commands available.");
                }
                return;
            }
        }
        System.out.println("Animal not found with ID: " + animalId);
    }

    public void trainCommand(int animalId, String newCommand) {
    for (Animal animal : animals) {
        if (animal.getAnimalId() == animalId && animal instanceof Pet) {
            ((Pet) animal).setCommands(newCommand);
            System.out.println("Command trained successfully!");
            return;
        }
    }
    System.out.println("Animal with ID " + animalId + " not found or is not a Pet.");
}


    public void teachCommand(int animalId, String newCommand) {
        for (Animal animal : animals) {
            if (animal.getAnimalId() == animalId && animal instanceof Pet) {
                String currentCommands = ((Pet) animal).getCommands();
                currentCommands += ", " + newCommand;
                ((Pet) animal).setCommands(currentCommands);
                System.out.println("Command '" + newCommand + "' added to the animal with ID: " + animalId);
                return;
            }
        }
        System.out.println("Pet not found with ID: " + animalId);
    }

    public void listByBirthdate(LocalDate date) {
    for (Animal animal : animals) {
        if (animal.getBirthDate().isEqual(date)) {
            System.out.println("Animal: " + animal.getName() + ", Type: " + animal.getType());
        }
    }
}

}

