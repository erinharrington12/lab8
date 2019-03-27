
import org.junit.Assert;
import org.junit.Test;

@Test
public class colorValueTest
{

    Color col = null;

    // Red:
    col = Color.RED;
    Assert.assertEquals("Incorrect rbg value in color " + col.name(), 255, col.getR());
    Assert.assertEquals("Incorrect rbg value in color " + col.name(), 0, col.getG());
    Assert.assertEquals("Incorrect rbg value in color " + col.name(), 0, col.getB());

    
    // Blue:
    col = Color.BLUE;
    Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
}
