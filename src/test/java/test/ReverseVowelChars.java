package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseVowelChars
{
    @Test
    public void test1()
    {
        String inputText = "programming";
        String outputText = "prigrammong";
        Assert.assertEquals(reversedString(inputText),outputText);
    }

    @Test
    public void test2()
    {
        String inputText = "fantastic";
        String outputText = "fintastac";
        Assert.assertEquals(reversedString(inputText),outputText);
    }

public String reversedString(String inputText)
{
    char[] charArray = inputText.toCharArray();
    int left = 0;
    int right = charArray.length - 1;
    while(left<right)
    {
        if(isVowel(charArray[left]) && isVowel(charArray[right]))
        {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        else
        {
            left++;
            right--;
        }
        }
    return new String(charArray);
    }
    public boolean isVowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||  ch == 'u';
    }

}