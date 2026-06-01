package test.day2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class Day2Practice {
    @Test
    public void test1()
    {
        int[] input = {0,2,4,6,3,3,1,5};
        int target = 6;
        int expectedResult = day2Practice(input,target);
        int expectedResult01 = 4;
        Assert.assertEquals(expectedResult,expectedResult01);
    }
    @Test
    public void test2()
    {
        int[] input = {0,7,0,4,3,5,0,2,0};
        int target = 7;
        int actualResult02 = day2Practice(input, target);
        int expectedResult02 = 6;
        Assert.assertEquals(expectedResult02,actualResult02);
    }

    public int day2Practice(int[] input, int target)
    {
        Map<Integer,Integer> mapped = new Hashmap<>();
        int count = 0;
        for(int num: input)
        {
            int complement = target - num;
            if(mapped.containsKey(complement))
            {
                count+=mapped.get(complement);
            }
        }

    }
}
