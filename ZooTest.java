public class ZooTest {
	
	public void fullConstructorTest() throws AssertException
	{
		Animal ani = new Animal("Brown", "Monkey", 10.1, 3.1);
		Zoo zoo = new Zoo(1);
		zoo.addAnimal(ani);
		
		Assert.assertEquals(10.1, zoo.getAverageWeight(),0.1);
		Assert.assertEquals(3.1, zoo.getTotalHeight(), 0.1);
		Assert.assertEquals(1, zoo.getCapacity(), 0.1);
		Assert.assertEquals(10.1, zoo.getAverageWeight("Brown"),0.1);
		
	}
	
	public void testToString() throws AssertException
	{
		Animal ani = new Animal("Brown", "Monkey", 10.1, 3.1);
		Zoo zoo = new Zoo(1);
		zoo.addAnimal(ani);
		Assert.assertEquals("These animals live in the zoo: \nMonkey, a Brown-colored animal. 10.1 pounds, 3.1 inches\n",zoo.toString());
	}
	
}