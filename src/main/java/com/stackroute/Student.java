package com.stackroute;

public class Student {

    public double calculateAverage(int marks[])
    {
        if(marks.length==1)
        {
            return marks[0];
        }
        int sum=0;
        for (int elem: marks) {
            sum+=elem;
        }
        return (double)sum/marks.length;

    }
    public int minMarks(int marks[])
    {
        if(marks.length==1)
        {
            return marks[0];
        }
        int min = marks[0];
        for (int i=1;i<=marks.length-1;i++)
        {
            if(marks[i]<min)
            {
                min=marks[i];
            }
        }
        return min;
    }
    public int maxMarks(int marks[])
    {
        if(marks.length==1)
        {
            return marks[0];
        }
        int max =marks[0];
        for (int i=1;i<=marks.length-1;i++)
        {
            if(marks[i]>max)
            {
                max=marks[i];
            }
        }
        return max;
    }
}
