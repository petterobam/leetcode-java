package github.petterobam.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * 两数之和单测
 *
 * @author 欧阳洁
 * @date 2021/7/7 23:49
 */
public class SumOfTwoNumsTest {
    @Test
    public void test() {
        Assert.assertNull(SumOfTwoNums.find(new int[]{1, 4, 5, 7, 8, 10}, 8));
        Assert.assertNull(SumOfTwoNums.find(new int[]{1, 4, 3, 6, 1, 5, 7, 8}, 9));
        Assert.assertNull(SumOfTwoNums.find(new int[]{1, 4, 5, 5, 7, 8}, 10));

        Assert.assertNotNull(SumOfTwoNums.find(new int[]{1, 4, 5, 5, 7, 8}, 16));
        Assert.assertNotNull(SumOfTwoNums.find(new int[]{1, 4, 5, 9, 5, 5, 7, 8}, 99));
    }
}
