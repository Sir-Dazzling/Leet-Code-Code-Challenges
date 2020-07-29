package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args)
    {
	    // calling method
        int[] numArray = {2,7,11,15};

        //Outputting values of the returned integer array
        System.out.println(Arrays.toString(twoSum(numArray, 9)));
    }

    //Method for solution
    public static int[] twoSum(int[] nums, int target)
    {
        //Using a Hashmap to store values if complement is found or not
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement), i};
            }
            else
            {
                map.put(nums[i], i);
            };
        }

        return new int [] {};
    }
}
