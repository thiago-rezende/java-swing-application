package core;

import org.junit.Test;

/**
 *
 * @author Thiago Rezende
 */
public class CoreUtilsTest {

    /**
     * Test the randomInt method of CoreUtils class
     */
    @Test
    public void randomIntTest() {
        int value = CoreUtils.randomInt(0, 100);
        assert(value >= 0 && value <= 100);
    }
    
    /**
     * Test the randomFloat method of CoreUtils class
     */
    @Test
    public void randomFloatTest() {
        float value = CoreUtils.randomFloat(0.0f, 100.0f);
        assert(value >= 0.0f && value <= 100.0f);
    }
}
