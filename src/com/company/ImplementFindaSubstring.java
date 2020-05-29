package com.company;

public class ImplementFindaSubstring {
    public int strStr(String haystack, String needle)
    {
        if(needle.length()!=0)
        {
            if(haystack.indexOf(needle)!=-1) {
                return haystack.indexOf(needle);
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return 0;
        }
    }
}
