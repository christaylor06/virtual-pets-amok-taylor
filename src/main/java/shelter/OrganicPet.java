package shelter;

public abstract class OrganicPet extends VirtualPet {
    //MAKE ABSTRACT
    private int hunger;
    private int thirst;


    public OrganicPet(String name, String type, int health, int happiness, int boredom) {
        super(name, type, health, happiness, boredom);
        this.hunger = (int) getRandomStartingMeterLevelBetween2And8(2, 8);
        this.thirst = (int) getRandomStartingMeterLevelBetween2And8(2, 8);
    }
    public static double getRandomStartingMeterLevelBetween2And8(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }
    public OrganicPet(String name, String type, int health, int happiness, int boredom, int hunger, int thirst) {
        super(name, type, health, happiness, boredom);

        this.hunger = hunger;
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void drink() {
        thirst -= 3;
    }
    public void eat() {
        hunger -= 3;
    }
}

