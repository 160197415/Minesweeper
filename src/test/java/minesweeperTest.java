import oop.blueprints.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;





public class minesweeperTest {



    Board testCat = new Board();



    // Name of Class is : test___________
    @Test
    public void testSetCat(){
// AssertEquals(Expected, Actual, Error Message);
        Assertions.assertEquals("test", testCat.getAnimalName(), "Cats name has not been made correctly");



        testCat.setAnimalName("IAmCat");



        Assertions.assertEquals("IAmCat", testCat.getAnimalName(), "Cats name has not changed");
    }


}
