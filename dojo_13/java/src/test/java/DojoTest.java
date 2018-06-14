import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the dojo.
 */
public class DojoTest {
	
	@Before
	public void setup() {

	}

    @Test
    public void test_dummy() {
        Assert.assertEquals(new DummyClass(),new DummyClass());
    }
}
