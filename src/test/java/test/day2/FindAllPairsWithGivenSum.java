package test.day2;

import org.testng.annotations.Test;

public class FindAllPairsWithGivenSum {
    @Test
    public void test02()
    {
        int[] input = {0,2,4,6,3,3,1,5};
        int target = 6;
        int[] output = findAllPairs(input, target);
    }

    private int[] findAllPairs(int[] input, int target) {
        for(int i = 0; i < input.length; i++)
        {
            for(int j = i+1; j < input.length; j++)
            {
                if(input[i] + input[j] == target)
                {
                   //System.out.println("This " + input[i] + " + " + input[j] + " = " + target);
                    System.out.println("("+input[i]+","+input[j]+")");
                }
            }
        }
        return null;
    }

}
