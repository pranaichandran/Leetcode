package com.company;

public class RemoveElementArray {
    public int removeElement(int[] nums, int val)
    {
        if(nums.length!=0)
        {
            int replace = 0;
            int newIndex=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==val)
                {
                    continue;
                }
                else
                {
                    nums[replace] = nums[i];
                    replace = replace +1;
                }
            }
            return replace;
        }
        else
        {
            return 0;
        }
    }
}
