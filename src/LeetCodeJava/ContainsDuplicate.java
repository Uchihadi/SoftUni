package LeetCodeJava;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) { // Array of Integers under the variable nums
        HashMap <Integer, Integer> x = new HashMap<>(); // HashMap creates a key value pair
        for (int i = 0; i < nums.length; i++) { // Creating a for-loop                                                          ing a for loop
            if(x.containsKey(nums[i]))
                return true;
            else
                x.put(nums[i],i);
        }
        return false;
    }

    // Map vs HashMap --> Common Map Implementations
    // Map is an interface, an abstract that can define how something can be used. HashMap is an implementation of that Interface
}
