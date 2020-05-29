package com.company;

public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums)
    {
        if(nums.length!=0) {
            int length = 1;
            for (int i = 0; i < nums.length; i++) {
                try
                {
                    if (nums[i] == nums[(i + 1)]) {
                        continue;
                    } else {
                        //sum = sum + nums[i+1];
                        length = length+1;
                        nums[length-1] = nums[i+1];
                    }
                }catch (IndexOutOfBoundsException e)
                {
                    return length;
                }
            }
            return length;
        }
        else
        {
            return 0;
        }

    }
}
