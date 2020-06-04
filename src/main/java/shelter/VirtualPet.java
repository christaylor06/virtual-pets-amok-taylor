package shelter;

public abstract class VirtualPet {


    private String name;
    private String type;
    private int health;
    private int happiness;
    private int boredom;


    public VirtualPet(String name, String type) {
        this.name = name;
        this.type = type;
        this.health = (int) getRandomStartingMeterLevelBetween2And8(2, 8);
        this.happiness = (int) getRandomStartingMeterLevelBetween2And8(2, 8);
        this.boredom = (int) getRandomStartingMeterLevelBetween2And8(2, 8);
    }

    public static double getRandomStartingMeterLevelBetween2And8(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }
    public VirtualPet(String name, String type, int localHealth, int localHappiness, int localBoredom) {
        this.name = name;
        this.type = type;
        this.health = localHealth;
        this.happiness = localHappiness;
        this.boredom = localBoredom;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public int getBoredom() {
        return boredom;
    }
    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public void receivesOil() {
        health += 3;
    }

    public void plays() {
        boredom -= 3;
    }


}
