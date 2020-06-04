package shelter;

public class OrganicDog  extends OrganicPet implements WalkDogs{
    private final String name;
    private final String type;
    private int happiness;
    private int health;
    private int thirst;
    private final int hunger;
    private final int boredom;


    public OrganicDog(String name, String type, int health, int happiness, int boredom, int hunger, int thirst) {
        super(name, type, health, happiness, boredom, hunger, thirst);
        this.name = name;
        this.type = type;
        this.health = (int) getRandomStartingMeterLevelBetween2And8(10, 20);
        this.happiness = (int) getRandomStartingMeterLevelBetween2And8(10, 20);
        this.boredom = (int) getRandomStartingMeterLevelBetween2And8(10, 20);
        this.hunger = (int) getRandomStartingMeterLevelBetween2And8(10, 20);
        this.thirst = (int) getRandomStartingMeterLevelBetween2And8(10, 20);
    }

    public static double getRandomStartingMeterLevelBetween2And8(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    @Override
    public void walks() {
        happiness += 3;
        health += 3;
        thirst -=1;
    }


    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }
    public int getHealth() {
        return health;
    }
    public int getHappiness() {
        return happiness;
    }
    public int getBoredom() {
        return boredom;
    }
}
