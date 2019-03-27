package com.stackroute;
public class Palindrome {
    public boolean checkPalindrome(String str)
    {
        String rev_str= "";
        for(int i= str.length()-1;i>=0;i--)
        {
            rev_str+=str.charAt(i);
        }
        if(str.compareTo(rev_str)==0)
            return true;
        else
            return false;
    }
}
