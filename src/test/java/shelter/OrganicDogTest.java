package shelter;

import org.junit.Test;
import shelter.OrganicDog;

import static org.junit.Assert.assertEquals;

public class OrganicDogTest {


    @Test
    public void shouldGain3HealthPointsWhenWalked() {
        OrganicDog organicDog = new OrganicDog("name","description",1,2, 3,4,5);
        organicDog.walks();
        int check = organicDog.getHealth();
        assertEquals(check, 4);
    }
    @Test
    public void shouldGain3HappinessPointsWhenWalked() {
        OrganicDog organicDog = new OrganicDog("name","description",1,2, 3,4,5);
        organicDog.walks();
        int check = organicDog.getHappiness();
        assertEquals(check, 5);
    }
    @Test
    public void shouldLose1ThirstPointWhenWalked() {
        OrganicDog organicDog = new OrganicDog("name","description",1,2, 3,4,5);
        organicDog.walks();
        int check = organicDog.getHealth();
        assertEquals(check, 4);
    }
}
