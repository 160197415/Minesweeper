import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testTile {

    // Name of Class is : test___________

    Tile tile = new Tile();

    @Test
    public void testSetTIle() {

        tile.setiValue(2);
        Assertions.assertEquals(4, tile.getiValue(), "Incorrect i value");

    }
}
