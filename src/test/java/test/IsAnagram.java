package test;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class IsAnagram {

	@Test
	public void test1() {
		String input1 = "hello";
		String input2 = "ehlol";
		Assert.assertTrue(isAnagram2(input1,input2));
	}
	@Test
	public void test2() {
		String input1 = "bibi";
		String input2 = "ehlol";
		Assert.assertFalse(isAnagram2(input1,input2));
	}

	public boolean isAnagram(String input1, String input2) {
	char[] arr1 = input1.toCharArray();
	char[] arr2 = input2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	return Arrays.equals(arr1, arr2);
	}

	public boolean isAnagram2(String input1, String input2)
	{
		ArrayList<Character> actualText = new ArrayList<>();
		for (char ch : input1.toCharArray())
		{actualText.add(ch);}
		actualText.sort(null);
				ArrayList<Character> expText = new ArrayList<>();
		for (char ch : input2.toCharArray())
		{expText.add(ch);}
		expText.sort(null);
		System.out.println(actualText);
		System.out.println(expText);
		if(actualText.equals(expText))
		{return true;}
		else
		{return false;}

			}

}