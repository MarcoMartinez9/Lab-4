
/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    
    public void fullConstructorTest() throws AssertException
    {
    	Animal ani1 = new Animal("Orange", "Tony", 200.1, 20);
    	
    	Assert.assertEquals("Orange", ani1.getColor());
    	Assert.assertEquals("Tony", ani1.getName());
    	Assert.assertEquals(200.1, ani1.getWeight(), 0.01);
    	Assert.assertEquals(20, ani1.getHeight(), 0.01);
    	
    }
    
    public void testToString() throws AssertException
	{
    	Animal ani = new Animal("Orange", "Tony", 200.1, 20);
    	Assert.assertEquals("Tony, a Orange-colored animal. 200.1 pounds, 20.0 inches\n",ani.toString());
	}
    
}

