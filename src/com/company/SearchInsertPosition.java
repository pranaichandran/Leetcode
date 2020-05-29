package com.company;

public class SearchInsertPosition {
    public int searchInsert(int[] nums,int target)
    {
        if(nums.length!=0)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]<target)
                {
                    continue;
                }
                else if(nums[i]==target)
                {
                    return i;
                }
                else if(nums[i]>target)
                {
                    return (i);
                }
            }
            return nums.length;
        }
        return 0;
    }
}
