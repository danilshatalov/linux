import java.time.LocalDate;
import java.util.Scanner;

public class AnimalRegistryApp {

    private static final AnimalRegistry registry = new AnimalRegistry();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new animal");
            System.out.println("2. List commands for an animal");
            System.out.println("3. Train new commands");
            System.out.println("4. List animals by birthdate");
            System.out.println("0. Exit");

            System.out.print("Choose an action: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewAnimal();
                    break;
                case 2:
                    listCommands();
                    break;
                case 3:
                    trainNewCommands();
                    break;
                case 4:
                    listByBirthdate();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Incorrect choice. Please try again.");
                    break;
            }

        } while (choice != 0);
    }

    private static void addNewAnimal() {
        System.out.print("Enter animal ID: ");
        int animalId = scanner.nextInt();
        System.out.print("Enter animal name: ");
        String name = scanner.next();
        System.out.print("Enter animal type: ");
        String type = scanner.next();
        System.out.print("Enter animal birthdate (yyyy-mm-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.next());

        Animal newAnimal;
        if (type.equalsIgnoreCase("Dog")) {
            System.out.print("Enter commands for the dog: ");
            String commands = scanner.next();
            newAnimal = new Dog(animalId, name, birthDate, commands);
        } else if (type.equalsIgnoreCase("Cat")) {
            System.out.print("Enter commands for the cat: ");
            String commands = scanner.next();
            newAnimal = new Cat(animalId, name, birthDate, commands);
        } else if (type.equalsIgnoreCase("Hamster")) {
            System.out.print("Enter commands for the hamster: ");
            String commands = scanner.next();
            newAnimal = new Hamster(animalId, name, birthDate, commands);
        } else if (type.equalsIgnoreCase("Horse")) {
            System.out.print("Enter behavior for the horse: ");
            String behavior = scanner.next();
            newAnimal = new Horse(animalId, name, birthDate, behavior);
        } else if (type.equalsIgnoreCase("Camel")) {
            System.out.print("Enter behavior for the camel: ");
            String behavior = scanner.next();
            newAnimal = new Camel(animalId, name, birthDate, behavior);
        } else if (type.equalsIgnoreCase("Donkey")) {
            System.out.print("Enter behavior for the donkey: ");
            String behavior = scanner.next();
            newAnimal = new Donkey(animalId, name, birthDate, behavior);
        } else {
            System.out.println("Incorrect animal type.");
            return;
        }

        registry.addAnimal(newAnimal);
        System.out.println("Animal successfully added to the registry.");
    }

    private static void listCommands() {
        System.out.print("Enter animal ID: ");
        int animalId = scanner.nextInt();
        registry.listCommands(animalId);
    }

    private static void trainNewCommands() {
        System.out.print("Enter animal ID: ");
        int animalId = scanner.nextInt();
        System.out.print("Enter a new command for training: ");
        String newCommand = scanner.next();
        registry.trainCommand(animalId, newCommand);
        System.out.println("Training completed successfully.");
    }

    private static void listByBirthdate() {
        System.out.print("Enter animal birthdate (yyyy-mm-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.next());
        registry.listByBirthdate(birthDate);
    }
}

