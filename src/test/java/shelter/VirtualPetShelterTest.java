package shelter;

import org.junit.Test;

import java.util.Collection;

import org.junit.Assert;
import shelter.OrganicDog;
import shelter.RoboticDog;
import shelter.VirtualPet;
import shelter.VirtualPetShelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

//import org.junit.jupiter.api.Test;


public class VirtualPetShelterTest {
//
//
//    @Test
//    public void shouldBeAbleToAddARoboticPet() {
//        VirtualPetShelter shelter = new VirtualPetShelter();
//        RoboticDog roboticDog = new RoboticDog("rover", "roboticDog", 1, 1, 1);
//        shelter.addVirtualPet(roboticDog);
//        Collection<VirtualPet> check = shelter.getAllVirtualPets();
//        assertThat(check, contains(roboticDog));
//
//    }

//    @Test
//    public void shouldCallAllPets() {
//    .getInventory
//}

    //    @Test
//    public void shouldCallAllOrganicPets() {}

    //    @Test
//    public void shouldCallAllRobotsPets() {}

//    @Test
//    public void shouldBeAbleToAdd2Pets() {
//        shelter.VirtualPetShelter shelter = new shelter.VirtualPetShelter();
//        shelter.RoboticDog roboticDog = new shelter.RoboticDog("lady", "roboticDog", 1, 1, 1);
//        shelter.OrganicDog organicDog = new shelter.OrganicDog("spot", "organicDog", 1, 2, 3, 4, 6);
//        shelter.addVirtualPet(roboticDog);
//        shelter.addVirtualPet(organicDog);
//        Collection<shelter.VirtualPet> check = shelter.getAllVirtualPets ();
//        assertThat(check, contains(roboticDog, organicDog));
//    }

//    @Test
//    public void shouldReturnAPetGivenItsName() {
//        VirtualPetShelter shelter = new VirtualPetShelter();
//        RoboticDog roboticDog = new RoboticDog("lady", "roboticDog", 1, 1, 1);
//        OrganicDog organicDog = new OrganicDog("spot", "organicDog", 1, 2, 3, 4, 6);
//        shelter.addVirtualPet(roboticDog);
//        shelter.addVirtualPet(organicDog);
//        shelter.getPet("lady");
//        Assert.assertEquals(roboticDog, roboticDog);
//    }
//
//    @Test
//    public void shouldAllowAdoptionOfAPet() {
//        VirtualPetShelter shelter = new VirtualPetShelter();
//        RoboticDog roboticDog = new RoboticDog("lady", "roboticDog", 1, 1, 1);
//        OrganicDog organicDog = new OrganicDog("spot", "organicDog", 1, 2, 3, 4, 6);
//        shelter.addVirtualPet(roboticDog);
//        shelter.addVirtualPet(organicDog);
//        shelter.adoptPet("lady");
//        Assert.assertNotEquals("lady", "spot");
//    }
//
//    @Test
//    public void shouldFeedAllOrganicPets() {
//        VirtualPetShelter shelter = new VirtualPetShelter();
//        OrganicDog organicDog1 = new OrganicDog("spot", "Organic", 1, 2, 3, 10, 6);
//        OrganicDog organicDog2 = new OrganicDog("Timmy", "Organic", 1, 2, 3, 4, 6);
//        shelter.addVirtualPet(organicDog1);
//        shelter.addVirtualPet(organicDog2);
//        shelter.feedAllOrganicPets();
//        Assert.assertEquals(7, organicDog1.getHunger());
//        Assert.assertEquals(1, organicDog2.getHunger());
//    }
//    @Test
//    public void shouldWalkAllDogs() {
//        RoboticDog roboticDog = new RoboticDog("lady", "roboticDog", 1, 1, 1);
//        OrganicDog organicDog1 = new OrganicDog("spot", "Organic", 1, 2, 3, 10, 6);
//        roboticDog.walks();
//        organicDog1.walks();
//        Assert.assertEquals(4, roboticDog.getHappiness());
//        Assert.assertEquals(5, organicDog1.getHappiness());
//        Assert.assertEquals(4, organicDog1.getHealth());
//        Assert.assertEquals(5, organicDog1.getThirst());
//    }
//    @Test
//    public void shouldCleanLitterBox(){
//        VirtualPetShelter shelter = new VirtualPetShelter();
//        int boxBefore = shelter.getCatWasteLevel();
//        shelter.cleanBox();
//        int boxAfter = shelter.getCatWasteLevel();
//        assertThat(boxAfter-boxBefore, is(-5));
//    }

    //    @Test
//    public void shouldWaterAllOrganicPets() {
//        shelter.VirtualPetShelter shelter = new shelter.VirtualPetShelter();
//        shelter.OrganicDog organicDog1 = new shelter.OrganicDog("spot", "Organic", 1, 2, 3, 10, 6);
//        shelter.OrganicDog organicDog2 = new shelter.OrganicDog("Timmy", "Organic", 1, 2, 3, 4, 6);
//        shelter.addVirtualPet(organicDog1);
//        shelter.addVirtualPet(organicDog2);
//        shelter.waterAllOrganicPets();
//        Assert.assertEquals(3, organicDog1.getThirst());
//        Assert.assertEquals(3, organicDog2.getThirst());
//
//        organicDog1.drink();
//        organicDog2.drink();
//        int check = organicDog1.getThirst();
//        int check = organicDog1.getThirst();
//        assertEquals(check, 2);
//    }

}