package shelter;

import org.junit.Test;
import shelter.RoboticDog;

import static org.junit.Assert.assertEquals;

public class RoboticDogTest {


    @Test
    public void shouldGain3HealthPointsWhenOiled() {
        RoboticDog roboticDog = new RoboticDog("name", "description", 1, 2, 3);
        roboticDog.receivesOil();
        int check = roboticDog.getHealth();
        assertEquals(check, 4);
    }

    @Test
    public void shouldDecreaseBoredomBy3WhenPlayedWith() {
        RoboticDog roboticDog = new RoboticDog("name", "description", 1, 2, 3);
        roboticDog.plays();
        int check = roboticDog.getBoredom();
        assertEquals(check, 0);
    }
    @Test
    public void shouldIncreaseHappinessBy3WhenWalked() {
        RoboticDog roboticDog = new RoboticDog("name", "description", 1, 2, 3);
        roboticDog.walks();
        int check = roboticDog.getHappiness();
        assertEquals(check, 5);
    }

}

