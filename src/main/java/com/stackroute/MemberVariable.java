package com.stackroute;

public class MemberVariable{
    Member member =new Member();

    public String Name(String name)
    {
        this.member.name=name;
        return this.member.name;
    }
    public int Age(int age)
    {
        this.member.age=age;
        return this.member.age;
    }
    public double Salary(double salary){
        this.member.salary=salary;
        return this.member.salary;
    }

}
