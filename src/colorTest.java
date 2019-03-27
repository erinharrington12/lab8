import org.junit.Assert;

public class colorTest
{

    /**
     * Basic color testing
     */
    @Test
    public void testColorValues()
    {
        Color col = null;

        // Red:
        col = Color.RED;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());

        // Green:
        col = Color.GREEN;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());

        // Blue:
        col = Color.BLUE;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());

        // Yellow:
        col = Color.YELLOW;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());

        // Cyan:
        col = Color.CYAN;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());

        // Magenta:
        col = Color.MAGENTA;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());

    }

    public void colorConstructorTest()
    {
        Color 
    }
}
