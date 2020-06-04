package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    public int getCatWasteLevel;
    private Map<String, VirtualPet> virtualPets = new HashMap<>();

    public Map<String, VirtualPet> getInventory() {
        return virtualPets;
    }


    public void addVirtualPet(VirtualPet newPet) {
        virtualPets.put(newPet.getName(),newPet);
    }
    public Collection<VirtualPet> getAllVirtualPets() {
        return virtualPets.values();
    }
    public VirtualPet getPet(String name) {
        return virtualPets.get(name);
    }
    public void adoptPet(String name) {
        virtualPets.remove(name);
    }

    public void feedAllOrganicPets() {
        for (Map.Entry<String, VirtualPet> entry : virtualPets.entrySet()) {
            OrganicPet feedPets = (OrganicPet) entry.getValue();
            feedPets.eat();
        }
    }
    public void waterAllOrganicPets() {
        for (Map.Entry<String, VirtualPet> entry : virtualPets.entrySet()) {
            OrganicPet waterPets = (OrganicPet) entry.getValue();
            waterPets.drink();
        }
    }
    public void oilAllRobotPets() {
        for (Map.Entry<String, VirtualPet> entry : virtualPets.entrySet()) {
            RoboticPet oilPets = (RoboticPet) entry.getValue();
            oilPets.receivesOil();
        }
    }

    public void walkAllDogs() {
        for (Map.Entry<String, VirtualPet> entry : virtualPets.entrySet()) {
            WalkDogs walkDogs = (WalkDogs) entry.getValue();
            walkDogs.walks();
        }
    }
    private int catWasteLevel;

    public int getCatWasteLevel() {
        return catWasteLevel;
    }

    public void useBox(int amount) {
        catWasteLevel -= amount;
    }

    public void cleanBox() {
        catWasteLevel -= 5;
    }
    public boolean contains(String petName) {
        return virtualPets.containsKey(petName);
    }


}
