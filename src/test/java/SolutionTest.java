import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minEatingSpeedTest1() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int expected = 4;
        int actual = new Solution().minEatingSpeed(piles, h);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minEatingSpeedTest2() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
        int expected = 30;
        int actual = new Solution().minEatingSpeed(piles, h);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minEatingSpeedTest3() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;
        int expected = 23;
        int actual = new Solution().minEatingSpeed(piles, h);

        Assert.assertEquals(expected, actual);
    }


}
