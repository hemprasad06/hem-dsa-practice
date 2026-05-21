package test.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoSums
{
    @Test
    public void test1()
    {
    int[] input = {2,2,2,5,5};
    int target = 7;
    int[] result = twoSum(input, target);
    int[] expected = {0,3};
    Assert.assertTrue(Arrays.equals(expected,result));
    }
    public int[] twoSum(int[] input, int target) {
        for (int i = 0; i <= input.length; i++) {

            for (int j = i + 1; j < input.length; j++) {
                if ((input[i] + input[j]) == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }
}