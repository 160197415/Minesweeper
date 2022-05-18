import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileTest {

    // Name of Class is : test___________

    Tile tile = new Tile();

    @Test
    public void testSetTile() {

        tile.setiValue(2);
        Assertions.assertEquals(2, tile.getiValue(), "Incorrect i value");

    }
}
