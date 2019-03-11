package core;

/**
 *
 * @author Thiago Rezende
 */
public class CoreUtils {
    
    /**
     * Random number between a range
     * @param min Minimum value
     * @param max Maximum value
     * @return A random integer number
     */
    public static int randomInt(int min, int max) {
        return (int) (min + Math.random() * ((max + 1) - min));
    }
    
    /**
     * Random number between a range
     * @param min Minimum value
     * @param max Maximum value
     * @return A random float number
     */
    public static float randomFloat(float min, float max) {
        return (float) (min + Math.random() * (max - min));
    }
}
