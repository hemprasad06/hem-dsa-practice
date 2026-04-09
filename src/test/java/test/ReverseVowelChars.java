package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseVowelChars
{
    @Test
    public void test1() {
        String input = "programming";
        String output = "prigrammong";
        Assert.assertEquals(checkReversingVowels(input), output);
    }
    @Test
    public void test2() {
        String input = "global";
        String output = "glabol";
        Assert.assertEquals(checkReversingVowels(input), output);
    }

    public String checkReversingVowels(String input) {
        char[] inputArray = input.toCharArray();
        int left = 0;
        int right = inputArray.length - 1;
        while (left < right) {
            if (!isVowel(inputArray[left])) {
                left++;
            } else if (!isVowel(inputArray[right])) {
                right--;
            } else {
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
            return new String(inputArray);
        }


        public boolean isVowel ( char ch)
        {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }

    }

