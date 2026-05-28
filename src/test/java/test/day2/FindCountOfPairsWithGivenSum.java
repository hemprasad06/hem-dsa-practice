package test.day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindCountOfPairsWithGivenSum {
    @Test
    public void test1()
    {
        int[] input = {0,2,4,6,3,3,1,5};
        int target = 6;
        int actualResult01 = findAllPairs(input, target);
        int expectedResult01 = 4;
        Assert.assertEquals(actualResult01, expectedResult01);
    }
    @Test
    public void test2()
    {
        int[] input = {0,7,0,4,3,5,0,2,0};
        int target = 7;
        int actualResult02 = findAllPairs(input, target);
        int expectedResult02 = 6;
        Assert.assertEquals(actualResult02, expectedResult02);
    }

    private int findAllPairs(int[] input, int target)
    {
        int count = 0;
    for(int i = 0; i < input.length; i++)
        {
            for(int j = i+1; j<input.length; j++)
            {
                if(input[i]+input[j]==target)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
