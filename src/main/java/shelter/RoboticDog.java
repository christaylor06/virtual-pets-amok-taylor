package shelter;

public class RoboticDog extends RoboticPet implements WalkDogs {

    private int happiness;

    public RoboticDog(String name, String type, int health, int happiness, int boredom) {
        super(name, type, health, happiness, boredom);
        this.happiness = happiness;
    }

    @Override
    public void walks() {
        happiness += 3;
    }
    @Override
    public int getHappiness() {
        return happiness;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
