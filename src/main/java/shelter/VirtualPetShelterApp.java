package shelter;

import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        VirtualPetShelter misfitPetShelter = new VirtualPetShelter();
        OrganicDog pet1 = new OrganicDog("Josie", "organic", 19, 10, 20, 7, 5);
        OrganicCat pet2 = new OrganicCat("Sabrina", "organic", 19, 10, 20, 7, 5);
        RoboticDog pet3 = new RoboticDog("Selina", "robot", 9, 21, 19);
        RoboticCat pet4 = new RoboticCat("Salem", "robot", 12, 8, 10);

        misfitPetShelter.addVirtualPet(pet1);
        misfitPetShelter.addVirtualPet(pet2);
        misfitPetShelter.addVirtualPet(pet3);
        misfitPetShelter.addVirtualPet(pet4);

        Scanner input = new Scanner(System.in);
        System.out.println("Thank you for volunteering at The Island of Misfit Pets.");
        System.out.println();
        System.out.println("Here's you daily update for the shelter: ");
        System.out.println();
        System.out.println("Here are the Robotic pets we have in-house: ");
        showRoboticPetStatuses(misfitPetShelter);
        System.out.println();
        System.out.println("Here is our list of Organic pets today:");
        showOrganicPetStatuses(misfitPetShelter);
        System.out.println("Be sure to check the litter box. Today it is at a level " + misfitPetShelter.getCatWasteLevel);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("1. Play with a Pet");
        System.out.println("2. Adopt a pet");
        System.out.println("3. Admit a pet");
        System.out.println("4. Water the organic pets");
        System.out.println("5. Feed the organic pets");
        System.out.println("6. Oil the robot pets");
        System.out.println("7. Clean the shelter litter box");
        System.out.println("8. Walk all dogs.");
        System.out.println("9. Quit");
        String menuOption = input.nextLine();

        while (!menuOption.equals("9")) {
            if (menuOption.equals("1")) {
                System.out.println("You'd like to play with a pet. Here's who is available: ");
                System.out.println();
                showPetNames(misfitPetShelter);
                System.out.println();
                System.out.println("Enter the name of the pet that you would like to play with: ");
                String name = input.nextLine();
                if (misfitPetShelter.contains(name)) {
                    VirtualPet playtime = misfitPetShelter.getPet(name);
                    playtime.plays();
                }
                System.out.println("You played with " + name);
            } else if (menuOption.equals("2")) {
                System.out.println("Someone is looking to adopt a pet. Here's who is available: ");
                System.out.println();
                showPetNamesAndTypes(misfitPetShelter);
                System.out.println();
                System.out.println("Enter the name of the pet to be adopted: ");
                String adoptedPetName = input.nextLine();
                misfitPetShelter.adoptPet(adoptedPetName);
                System.out.println(adoptedPetName + " was adopted");
            } else if (menuOption.equals("3")) {
                System.out.println("A new pet has arrived. Tells us the the pet's name:");
                String name = input.nextLine();
                System.out.println("What type of pet is this?");
                System.out.println("Press A for an organic cat, B for an organic dog, C for a robotic cat or D for robotic dog");
                String type = input.nextLine();
                if (type.contains("a".toLowerCase())) {
                    VirtualPet newArrival = new OrganicCat(name, type, 10, 10, 10, 10, 10);
                    misfitPetShelter.addVirtualPet(newArrival);
                } else if (type.contains("b".toLowerCase())) {
                    VirtualPet newArrival = new OrganicDog(name, type, 10, 10, 10, 10, 10);
                    misfitPetShelter.addVirtualPet(newArrival);
                } else if (type.contains("c".toLowerCase())) {
                    VirtualPet newArrival = new RoboticCat(name, type, 12, 3, 4);
                    misfitPetShelter.addVirtualPet(newArrival);
                } else if (type.contains("d".toLowerCase())) {
                    VirtualPet newArrival = new RoboticCat(name, type, 9, 9, 9);
                    misfitPetShelter.addVirtualPet(newArrival);
                }
                System.out.println(name + " has been admitted into the shelter");
            } else if (menuOption.equals("4")) {
                misfitPetShelter.feedAllOrganicPets();
                System.out.println("You fed all of the pets.");
            } else if (menuOption.equals("5")) {
                misfitPetShelter.waterAllOrganicPets();
                System.out.println("You gave all the pets water");
            } else if (menuOption.equals("6")) {
                misfitPetShelter.oilAllRobotPets();
                System.out.println("You've oiled all the robotic pets");
            } else if (menuOption.equals("7")) {
                misfitPetShelter.cleanBox();
                System.out.println("You've cleaned the shelter's litter box");
            } else if (menuOption.equals("8")) {
                misfitPetShelter.walkAllDogs();
                System.out.println("You've walked all the dogs.");
            } else {
                System.out.println("Please enter a number between 1 and 6");
            }
            misfitPetShelter.useBox(5);
            showRoboticPetStatuses(misfitPetShelter);
            System.out.println();
            System.out.println("What would you like to do next?");
            System.out.println();
            System.out.println("1. Play with a Pet");
            System.out.println("2. Adopt a pet");
            System.out.println("3. Admit a pet");
            System.out.println("4. Water the organic pets");
            System.out.println("5. Feed the organic pets");
            System.out.println("6. Oil the robot pets");
            System.out.println("7. Clean the shelter litter box");
            System.out.println("8. Walk all dogs.");
            menuOption = input.nextLine();
        }
        if (menuOption.equals("9")) {
            input.close();
        }

    }

    private static void showPetNames(VirtualPetShelter allPets) {
        Map<String, VirtualPet> shelter = allPets.getInventory();
        for (Map.Entry<String, VirtualPet> entry : shelter.entrySet()) {
            VirtualPet petVariable = entry.getValue();
            System.out.println(petVariable.getName());
        }
    }

    private static void showPetNamesAndTypes(VirtualPetShelter allPets) {
        Map<String, VirtualPet> shelter = allPets.getInventory();
        for (Map.Entry<String, VirtualPet> entry : shelter.entrySet()) {
            VirtualPet petVariable = entry.getValue();
            System.out.println(petVariable.getName() + ": " + petVariable.getType());
        }
    }

    private static void showOrganicPetStatuses(VirtualPetShelter virtualPets) {
        System.out.println("Pet Name\t| Type \t\t|Health\t| Happiness\t| Boredom");
        System.out.println("________\t|______\t\t|______\t|__________\t|________");
        Map<String, VirtualPet> shelter = virtualPets.getInventory();
        for (Map.Entry<String, VirtualPet> entry : shelter.entrySet()) {
            VirtualPet petVariable = entry.getValue();
            if (petVariable.getType() == "organic") {
                System.out.println(petVariable.getName() + "\t\t|" + petVariable.getType() + "\t\t|" + petVariable.getHealth() + "\t\t|" + petVariable.getHappiness() + "\t\t|" + petVariable.getBoredom()+ "\t\t|" + getHunger()+ "\t\t|" + getThirst());
            }
        }
    }


    private static void showRoboticPetStatuses(VirtualPetShelter virtualPets) {
        System.out.println("Pet Name\t| Type \t\t|Health\t| Happiness\t| Boredom");
        System.out.println("________\t|______\t\t|______\t|__________\t|________");
        Map<String, VirtualPet> shelter = virtualPets.getInventory();
        for (Map.Entry<String, VirtualPet> entry : shelter.entrySet()) {
            VirtualPet petVariable = entry.getValue();
            if (petVariable.getType() == "robotic") {
                System.out.println(petVariable.getName() + "\t\t|" + petVariable.getType() + "\t\t|" + petVariable.getHealth() + "\t\t|" + petVariable.getHappiness() + "\t\t|" + petVariable.getBoredom());
            }
        }
    }
}