import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileTest {

    // Name of Class is : test___________

    Tile tile =new Tile();

    @Test
    public void testSetTile() {


        Assertions.assertEquals("x", tile.getDisplay(), "Incorrect item displayed");

    }
}
