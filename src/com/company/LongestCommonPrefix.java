package com.company;

public class LongestCommonPrefix {
    public String CommonPrefix(String[] strs)
    {
        String retstring = "";
        if(strs.length!=0)
        {
            char[] charArr = strs[0].toCharArray();
            for(int j=0;j<charArr.length;j++)
            {
                for(int i = 1; i<strs.length;i++)
                {
                    char[] temparr = strs[i].toCharArray();
                    try{
                        if(temparr[j] == charArr[j])
                        {
                            continue;
                        }
                        else
                        {
                            return retstring;
                        }
                    }
                    catch(IndexOutOfBoundsException e)
                    {
                        return retstring;
                    }
                }
                retstring = retstring+charArr[j];
            }
            return retstring;
        }
        else{
            return "";
        }

    }
}
