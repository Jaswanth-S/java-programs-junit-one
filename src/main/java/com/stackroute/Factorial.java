package com.stackroute;

public class Factorial {
    public int checkFactorialInt(int number)
    {
        if(number<13)
        {
            int fact=1;
            int i=1;
            while(i<=number)
            {
                fact=fact*i;
                i++;
            }
            return fact;
        }
        else
            return 0;
    }

    public long checkFactorialLong(long number)
    {
        if(number<22)
        {
            long i=1;
            long fact=1;
            while(i<=number)
            {
                fact=fact*i;
                i++;
            }
            return fact;
        }
        else
            return 0;

    }
}
