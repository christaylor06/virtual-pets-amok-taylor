package shelter;

import org.junit.Test;
import shelter.OrganicCat;
import shelter.VirtualPetShelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class OrganicCatTest {

    @Test
    public void shouldIncreaseWasteInShelterBy1AfterUsingLitterBox() {
        OrganicCat organicCat = new OrganicCat("name","description",1,2, 3,4,5);
        VirtualPetShelter shelter = new VirtualPetShelter();
        int wasteBefore = shelter.getCatWasteLevel();
        organicCat.usesLiterBox(shelter);
        int wasteAfter = shelter.getCatWasteLevel();
        assertThat(wasteBefore - wasteAfter, is(2));
    }
}
