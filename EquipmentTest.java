
public class EquipmentTest {
	public void ConstructorTest() throws AssertException
    {
	 //Created Equipment object and tested constructor with Bomb example	
       Equipment bomb = new Equipment("Bomb/1,50.6,70.6,Something you sometimes just can't get rid of");
     // Tested the getters in the constructor
        Assert.assertEquals("Bomb", bomb.getName());
        Assert.assertEquals(1, bomb.getCount(), 0.01);
        Assert.assertEquals(50.6, bomb.getTotalWeight(), 0.01);
        Assert.assertEquals(70.6, bomb.getTotalPrice(), 0.01);
        Assert.assertEquals("Something you sometimes just can't get rid of", bomb.getDescription());
    
    }
	
	public void testToString() throws AssertException
	{
	 //Tested toString from Equipment
		Equipment bomb = new Equipment("Bomb/1,50.6,70.60,Something you sometimes just can't get rid of");
		Assert.assertEquals("Name: Bomb, Number: 1, Weight: 50.60 lbs, Price: $70.60 - Something you sometimes just can't get rid of",bomb.toString());
	}
}