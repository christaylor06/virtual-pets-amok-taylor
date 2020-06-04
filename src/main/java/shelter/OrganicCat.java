package shelter;

public class OrganicCat extends OrganicPet {

    private final String name;
    private final String type;
    private final int hunger;
    private final int thirst;
    private final int health;
    private final int happiness;
    private final int boredom;


    public OrganicCat(String name, String type, int health, int happiness, int boredom, int hunger, int thirst) {
        super(name, type, health, happiness, boredom);
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

    //    public OrganicCat(String name, String type, int health, int hunger, int happiness, int thirst, int boredom) {
//        super();
//        this.name = name;
//        this.type = type;
//        this.hunger = hunger;
//        this.thirst = thirst;
//        this.health = health;
//        this.happiness = happiness;
//        this.boredom = boredom;
//    }
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
    public void usesLiterBox(VirtualPetShelter misfitPetShelter) {
        misfitPetShelter.useBox(5);
    }
}
