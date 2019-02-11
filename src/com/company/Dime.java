package com.company;

public class Dime extends Money
{
    public Dime(int count)
    {
        super(count);
        value = 0.10;
    }

    public Dime()
    {
        value = 0.10;
    }

    @Override
    public String toString()
    {
        return count + " Dime";
    }
}